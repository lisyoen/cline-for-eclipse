# S-Core 프록시 자동 설정 스크립트
# 이 스크립트는 S-Core 회사 네트워크 환경에서 Git을 사용하기 위한 프록시 및 인증서를 설정합니다.

Write-Host "========================================" -ForegroundColor Cyan
Write-Host "S-Core 프록시 및 인증서 설정 시작" -ForegroundColor Cyan
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""

# 프로젝트 루트 확인
$projectRoot = Split-Path -Parent (Split-Path -Parent $PSScriptRoot)
$certPath = Join-Path $projectRoot ".github\certs\new_S-Core.Proxy.crt"

if (-not (Test-Path $certPath)) {
    Write-Host "❌ 오류: 인증서 파일을 찾을 수 없습니다: $certPath" -ForegroundColor Red
    exit 1
}

Write-Host "✓ 인증서 파일 확인: $certPath" -ForegroundColor Green

# 1. 인증서 설치 (관리자 권한 필요)
Write-Host ""
Write-Host "1. 인증서 설치 중..." -ForegroundColor Yellow

try {
    $cert = New-Object System.Security.Cryptography.X509Certificates.X509Certificate2
    $cert.Import($certPath)
    
    $store = New-Object System.Security.Cryptography.X509Certificates.X509Store("Root", "CurrentUser")
    $store.Open("ReadWrite")
    
    # 이미 설치된 인증서인지 확인
    $existingCert = $store.Certificates | Where-Object { $_.Thumbprint -eq $cert.Thumbprint }
    
    if ($existingCert) {
        Write-Host "  ℹ 인증서가 이미 설치되어 있습니다." -ForegroundColor Yellow
    } else {
        $store.Add($cert)
        Write-Host "  ✓ 인증서가 신뢰할 수 있는 루트 인증 기관에 설치되었습니다." -ForegroundColor Green
    }
    
    $store.Close()
} catch {
    Write-Host "  ❌ 인증서 설치 실패: $_" -ForegroundColor Red
    Write-Host "  ℹ 관리자 권한이 필요할 수 있습니다. PowerShell을 관리자로 실행하세요." -ForegroundColor Yellow
}

# 2. Git SSL 인증서 설정
Write-Host ""
Write-Host "2. Git SSL 인증서 경로 설정 중..." -ForegroundColor Yellow

$absoluteCertPath = (Resolve-Path $certPath).Path

try {
    git config --global http.sslCAInfo $absoluteCertPath
    git config --global http.sslVerify true
    Write-Host "  ✓ Git SSL 인증서 경로 설정 완료" -ForegroundColor Green
    Write-Host "    경로: $absoluteCertPath" -ForegroundColor Gray
} catch {
    Write-Host "  ❌ Git SSL 설정 실패: $_" -ForegroundColor Red
}

# 3. 프록시 설정 안내
Write-Host ""
Write-Host "3. 프록시 설정 안내" -ForegroundColor Yellow
Write-Host "  ⚠ PAC 스크립트 (http://pac.score/score.pac)는 Git에서 직접 사용할 수 없습니다." -ForegroundColor Yellow
Write-Host ""
Write-Host "  다음 방법 중 하나를 선택하세요:" -ForegroundColor White
Write-Host ""

# 방법 A: 실제 프록시 확인 시도
Write-Host "  방법 A: Windows 프록시 설정 확인" -ForegroundColor Cyan
try {
    $proxyInfo = netsh winhttp show proxy 2>&1
    Write-Host "    $proxyInfo" -ForegroundColor Gray
    
    if ($proxyInfo -match "프록시 서버\(들\)\s*:\s*(.+)") {
        $proxyServer = $matches[1].Trim()
        Write-Host ""
        Write-Host "    실제 프록시 주소: $proxyServer" -ForegroundColor Green
        Write-Host ""
        Write-Host "    Git 프록시 설정 명령:" -ForegroundColor White
        Write-Host "    git config --global http.proxy http://$proxyServer" -ForegroundColor Gray
        Write-Host "    git config --global https.proxy http://$proxyServer" -ForegroundColor Gray
    } else {
        Write-Host "    ℹ Windows 프록시가 설정되어 있지 않습니다." -ForegroundColor Yellow
    }
} catch {
    Write-Host "    ℹ Windows 프록시 정보를 가져올 수 없습니다." -ForegroundColor Yellow
}

Write-Host ""
Write-Host "  방법 B: PAC 스크립트에서 프록시 확인" -ForegroundColor Cyan
Write-Host "    1. 브라우저에서 http://pac.score/score.pac 열기" -ForegroundColor Gray
Write-Host "    2. 'PROXY' 키워드 뒤의 주소 확인 (예: proxy.score.com:8080)" -ForegroundColor Gray
Write-Host "    3. 해당 주소로 Git 프록시 설정:" -ForegroundColor Gray
Write-Host "       git config --global http.proxy http://[프록시주소]:[포트]" -ForegroundColor Gray
Write-Host "       git config --global https.proxy http://[프록시주소]:[포트]" -ForegroundColor Gray

Write-Host ""
Write-Host "  방법 C: 프록시 없이 인증서만 사용 (회사 내부망에서 직접 연결)" -ForegroundColor Cyan
Write-Host "    이미 설정 완료! Git pull을 바로 시도하세요." -ForegroundColor Gray

Write-Host ""
Write-Host "  방법 D: SSL 검증 비활성화 (임시, 보안상 권장하지 않음)" -ForegroundColor Cyan
Write-Host "    git config --global http.sslVerify false" -ForegroundColor Gray

# 4. 현재 Git 설정 확인
Write-Host ""
Write-Host "4. 현재 Git 설정 확인" -ForegroundColor Yellow

$httpProxy = git config --global --get http.proxy 2>$null
$httpsProxy = git config --global --get https.proxy 2>$null
$sslCAInfo = git config --global --get http.sslCAInfo 2>$null
$sslVerify = git config --global --get http.sslVerify 2>$null

Write-Host "  http.proxy:     $httpProxy" -ForegroundColor Gray
Write-Host "  https.proxy:    $httpsProxy" -ForegroundColor Gray
Write-Host "  http.sslCAInfo: $sslCAInfo" -ForegroundColor Gray
Write-Host "  http.sslVerify: $sslVerify" -ForegroundColor Gray

# 5. 테스트 안내
Write-Host ""
Write-Host "========================================" -ForegroundColor Cyan
Write-Host "설정 완료!" -ForegroundColor Green
Write-Host "========================================" -ForegroundColor Cyan
Write-Host ""
Write-Host "다음 단계:" -ForegroundColor White
Write-Host "1. 위의 방법 중 하나로 프록시를 설정하세요 (필요한 경우)" -ForegroundColor Gray
Write-Host "2. Git 연결 테스트:" -ForegroundColor Gray
Write-Host "   git -C `"d:/git/cline-for-eclipse`" pull" -ForegroundColor Gray
Write-Host ""
Write-Host "문제가 발생하면 .github/proxy-setup.md 문서를 참고하세요." -ForegroundColor Yellow
Write-Host ""
