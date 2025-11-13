# S-Core 프록시 설정 가이드

## 개요
이 문서는 S-Core 회사 네트워크 환경에서 Git과 개발 도구를 사용하기 위한 프록시 설정 방법을 설명합니다.

## 프록시 정보
- **PAC 스크립트 주소**: `http://pac.score/score.pac`
- **인증서 파일**: `.github/certs/new_S-Core.Proxy.crt`
- **인증서 만료일**: 2040-12-15

## 자동 설정 (권장)

### Windows PowerShell 스크립트 사용
프로젝트 루트에서 다음 명령을 실행하세요:

```powershell
.\.github\scripts\setup-proxy.ps1
```

이 스크립트는 다음 작업을 자동으로 수행합니다:
1. 인증서를 Windows 신뢰할 수 있는 루트 인증 기관에 설치
2. Git 전역 프록시 설정 (PAC 스크립트는 Git에서 직접 지원 불가하므로 수동 설정 필요)
3. Git SSL 인증서 경로 설정

## 수동 설정

### 1. 인증서 설치

#### Windows (관리자 권한 필요)
```powershell
# 인증서를 신뢰할 수 있는 루트 인증 기관에 추가
$cert = New-Object System.Security.Cryptography.X509Certificates.X509Certificate2
$cert.Import("$PWD\.github\certs\new_S-Core.Proxy.crt")
$store = New-Object System.Security.Cryptography.X509Certificates.X509Store("Root", "CurrentUser")
$store.Open("ReadWrite")
$store.Add($cert)
$store.Close()
Write-Host "인증서가 설치되었습니다."
```

#### 또는 GUI로 설치
1. `.github/certs/new_S-Core.Proxy.crt` 파일을 더블클릭
2. "인증서 설치" 클릭
3. "현재 사용자" 선택
4. "모든 인증서를 다음 저장소에 저장" 선택
5. "신뢰할 수 있는 루트 인증 기관" 선택
6. "마침" 클릭

### 2. Git 프록시 설정

**중요**: PAC 스크립트 URL은 Git에서 직접 지원하지 않습니다. 실제 프록시 서버 주소를 확인해야 합니다.

#### 방법 A: 프록시 서버 주소 확인 후 설정
1. Windows에서 실제 프록시 주소 확인:
   ```powershell
   # IE 설정에서 실제 프록시 확인
   netsh winhttp show proxy
   ```

2. Git 전역 프록시 설정 (실제 프록시 주소 사용):
   ```powershell
   # 예: 프록시가 proxy.score.com:8080 인 경우
   git config --global http.proxy http://proxy.score.com:8080
   git config --global https.proxy http://proxy.score.com:8080
   ```

#### 방법 B: Git에서 인증서만 설정 (프록시 없이)
회사 네트워크에서 직접 연결이 가능한 경우:
```powershell
# 인증서 경로 설정 (절대 경로 사용)
$certPath = (Resolve-Path ".\.github\certs\new_S-Core.Proxy.crt").Path
git config --global http.sslCAInfo $certPath
git config --global http.sslVerify true
```

#### 방법 C: SSL 검증 비활성화 (보안상 권장하지 않음)
```powershell
# 임시로 SSL 검증 비활성화 (개발 환경에서만)
git config --global http.sslVerify false
```

### 3. 환경 변수 설정 (선택사항)

시스템 전체에 프록시를 적용하려면:

```powershell
# PowerShell 프로파일에 추가
$env:HTTP_PROXY = "http://proxy.score.com:8080"
$env:HTTPS_PROXY = "http://proxy.score.com:8080"
$env:NO_PROXY = "localhost,127.0.0.1,.local"
```

영구 설정:
```powershell
[Environment]::SetEnvironmentVariable("HTTP_PROXY", "http://proxy.score.com:8080", "User")
[Environment]::SetEnvironmentVariable("HTTPS_PROXY", "http://proxy.score.com:8080", "User")
[Environment]::SetEnvironmentVariable("NO_PROXY", "localhost,127.0.0.1,.local", "User")
```

## Git 설정 확인

```powershell
# 현재 Git 프록시 설정 확인
git config --global --get http.proxy
git config --global --get https.proxy
git config --global --get http.sslCAInfo
git config --global --get http.sslVerify

# 모든 전역 설정 보기
git config --global --list | Select-String "proxy|ssl"
```

## 테스트

```powershell
# Git 연결 테스트
git ls-remote https://github.com/lisyoen/cline-for-eclipse.git

# 또는
git -C "d:/git/cline-for-eclipse" pull
```

## 문제 해결

### "Invalid proxy URL" 오류
- PAC 스크립트 URL은 Git에서 직접 사용할 수 없습니다.
- 실제 프록시 서버 주소(호스트:포트)를 확인하여 설정해야 합니다.
- IT 부서나 네트워크 관리자에게 실제 프록시 주소를 문의하세요.

### SSL 인증서 오류
```powershell
# 인증서 경로 확인
git config --global --get http.sslCAInfo

# 인증서 파일이 존재하는지 확인
Test-Path (git config --global --get http.sslCAInfo)

# 또는 임시로 SSL 검증 비활성화
git config --global http.sslVerify false
```

### 프록시 설정 제거
```powershell
# Git 프록시 설정 제거
git config --global --unset http.proxy
git config --global --unset https.proxy
git config --global --unset http.sslCAInfo
git config --global --unset http.sslVerify
```

## 추가 정보

### PAC 스크립트에서 실제 프록시 추출
PAC 스크립트는 JavaScript 함수로 되어 있어 URL에 따라 다른 프록시를 반환합니다.

1. 브라우저에서 `http://pac.score/score.pac` 접속
2. 스크립트 내용 확인
3. `PROXY` 키워드 뒤의 주소 확인 (예: `PROXY proxy.score.com:8080`)
4. 해당 주소를 Git 설정에 사용

### 프로젝트별 설정
전역 설정 대신 프로젝트별로 설정하려면 `--global` 제거:

```powershell
cd d:\git\cline-for-eclipse
git config --local http.proxy http://proxy.score.com:8080
git config --local https.proxy http://proxy.score.com:8080
```

## 참고 자료
- [Git 프록시 설정 공식 문서](https://git-scm.com/docs/git-config#Documentation/git-config.txt-httpproxy)
- [Git SSL 설정](https://git-scm.com/docs/git-config#Documentation/git-config.txt-httpsslVerify)
