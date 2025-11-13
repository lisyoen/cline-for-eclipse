# 프로젝트 컨텍스트

## 프로젝트 개요
- **이름**: Cline for Eclipse
- **목표**: Eclipse IDE용 자율 코딩 에이전트 (Cline 포팅)
- **타입**: Eclipse RCP 플러그인 / 오픈소스 프로젝트
- **언어**: Java 17+, TypeScript/JavaScript
- **위치**: `d:\git\cline-for-eclipse`
- **업스트림**: [Cline/cline](https://github.com/cline/cline) (Apache 2.0)

## 기술 스택
- **언어**: Java 17+ (Eclipse 플러그인), TypeScript/JavaScript (Cline 코어)
- **프레임워크**: Eclipse RCP, Eclipse Plug-in Development Environment (PDE)
- **빌드 도구**: Maven + Tycho (또는 Gradle)
- **의존성 관리**: Maven Central, Eclipse P2 Repository
- **AI/LLM**: Claude API, OpenAI API 등
- **테스트**: JUnit 5, Eclipse SWTBot (UI 테스트)
- **버전 관리**: Git (서브모듈 활용)

## 프로젝트 구조
```
cline-for-eclipse/
├── README.md                      # 프로젝트 소개
├── LICENSE                        # Apache 2.0 라이선스
├── .gitignore                     # Git 무시 파일
├── .gitmodules                    # Git 서브모듈 설정
│
├── .github/                       # GitHub 프로젝트 관리
│   ├── copilot-instructions.md    # Copilot 작업 지침
│   ├── project-goal.md            # 프로젝트 목표 및 로드맵
│   ├── project-context.md         # 이 파일
│   ├── current-session.md         # 현재 작업 세션
│   ├── session-manager.md         # 세션 관리
│   ├── work-history.md            # 완료된 작업 아카이브
│   └── sessions/                  # 세션 상세 기록
│
├── cline-core/                    # Git 서브모듈 (업스트림 Cline)
│   ├── src/                       # Cline 원본 소스 코드
│   ├── webview-ui/                # Cline UI 코드
│   ├── package.json               # Node.js 의존성
│   └── ...                        # 기타 Cline 파일들
│
├── eclipse-plugin/                # Eclipse 플러그인 구현 (개발 예정)
│   ├── src/                       # Java 소스 코드
│   │   ├── adapters/              # Eclipse API 어댑터
│   │   ├── ui/                    # Eclipse UI 구현
│   │   ├── commands/              # 명령 핸들러
│   │   ├── services/              # Eclipse 서비스 통합
│   │   └── core/                  # 플랫폼 추상화 레이어
│   ├── resources/                 # 리소스 파일 (아이콘 등)
│   ├── plugin.xml                 # Eclipse 플러그인 매니페스트
│   ├── META-INF/MANIFEST.MF       # OSGi 번들 정보
│   ├── pom.xml                    # Maven 빌드 설정
│   └── README.md                  # 플러그인 개발 가이드
│
└── test-workspace/                # 테스트용 워크스페이스
    ├── sample-java-project/       # 테스트용 Java 프로젝트 (생성 예정)
    └── README.md                  # 테스트 워크스페이스 가이드
```

## 주요 컴포넌트

### 1. Cline Core (서브모듈)
- **역할**: 업스트림 Cline의 핵심 AI 로직 및 기능
- **위치**: `cline-core/`
- **주요 기능**: 
  - AI 모델 통합 (Claude, OpenAI 등)
  - 프롬프트 처리 및 응답 파싱
  - 파일 작업 로직
  - 도구(Tool) 실행 엔진
- **수정 방침**: 최소한으로만 수정 (포크 대신 어댑터 패턴 사용)

### 2. Eclipse Plugin (개발 예정)
- **역할**: Eclipse IDE와 Cline Core를 연결하는 어댑터 및 UI
- **위치**: `eclipse-plugin/`
- **주요 클래스** (예정):
  - `ClinePlugin`: 플러그인 진입점 (Activator)
  - `FileSystemAdapter`: Eclipse IFile/IDocument API 래핑
  - `CommandAdapter`: Eclipse ICommandService 통합
  - `ClineView`: Eclipse View 구현 (채팅 UI)
  - `ProgressAdapter`: Eclipse IProgressService 통합

### 3. Platform Abstraction Layer
- **역할**: 플랫폼 독립적 인터페이스 정의
- **위치**: `eclipse-plugin/src/core/`
- **목적**: 
  - VS Code API와 Eclipse API 차이 추상화
  - 향후 다른 IDE 포팅 가능성 열어두기
  - 테스트 용이성 향상

### 4. Test Workspace
- **역할**: 개발된 플러그인을 실제 프로젝트에서 테스트
- **위치**: `test-workspace/`
- **포함 예정**:
  - 간단한 Java 애플리케이션
  - Maven 기반 프로젝트
  - Spring Boot 프로젝트 (선택적)

## 개발 환경

### 로컬 개발
- **IDE**: Eclipse IDE for RCP and RAP Developers (2023-09 이상 권장)
- **필수 도구**:
  - JDK 17 이상
  - Maven 3.8+
  - Git
  - Node.js 18+ (Cline Core 빌드용)
- **선택적 도구**:
  - Eclipse PDE (Plug-in Development Environment) - 대부분 기본 포함
  - Docker (컨테이너 환경 테스트용)

### 빌드 및 실행

```bash
# 1. 저장소 클론 (서브모듈 포함)
git clone --recurse-submodules https://github.com/lisyoen/cline-for-eclipse.git
cd cline-for-eclipse

# 2. Cline Core 빌드 (필요 시)
cd cline-core
npm install
npm run build
cd ..

# 3. Eclipse 플러그인 빌드 (Maven 사용 시, 개발 예정)
cd eclipse-plugin
mvn clean install
cd ..

# 4. Eclipse에서 플러그인 실행
# - Eclipse IDE에서 eclipse-plugin 프로젝트 import
# - Run As > Eclipse Application

# 5. 테스트 실행
mvn test
```

### 서브모듈 업데이트
```bash
# 업스트림 Cline 최신 버전으로 업데이트
git submodule update --remote cline-core

# 특정 버전으로 체크아웃
cd cline-core
git checkout v2.x.x
cd ..
git add cline-core
git commit -m "업데이트: Cline Core v2.x.x"
```

## 코딩 규칙

### Java 코드 스타일
- **컨벤션**: Eclipse 기본 Java 코딩 스타일
- **포맷터**: Eclipse Built-in Formatter 사용
- **인덴트**: Tab (4 spaces)
- **줄 길이**: 120자 권장

### 네이밍 컨벤션
- **클래스**: PascalCase (예: `FileSystemAdapter`)
- **인터페이스**: IPascalCase (예: `IFileAdapter`) - Eclipse 스타일
- **메서드/변수**: camelCase (예: `getFilePath()`)
- **상수**: UPPER_SNAKE_CASE (예: `MAX_BUFFER_SIZE`)
- **패키지**: 소문자, 점으로 구분 (예: `com.cline.eclipse.adapters`)

### 주석 규칙
- **JavaDoc**: 모든 public 클래스/메서드에 필수
- **인라인 주석**: 복잡한 로직에만 간결하게 작성
- **TODO**: `// TODO: 설명` 형식으로 작성
- **FIXME**: `// FIXME: 문제 설명` 형식으로 작성

### 코드 구조 원칙
1. **분리(Separation)**: 플랫폼 의존 코드와 독립 코드 분리
2. **추상화(Abstraction)**: 인터페이스를 통한 느슨한 결합
3. **최소 수정(Minimal Changes)**: 업스트림 코드는 가능한 한 수정하지 않음
4. **모듈화(Modularity)**: 기능별로 명확히 모듈 분리
5. **테스트 가능성**: 테스트하기 쉬운 구조 유지

## 알려진 제약사항

### 기술적 제약사항
1. **Eclipse Platform API 의존성**
   - Eclipse 2023-09 (4.29) 이상 필요
   - 하위 버전 호환성 제한적

2. **Java 버전 요구사항**
   - Java 17 이상 필수
   - 일부 최신 언어 기능 사용 제한 가능

3. **AI API 의존성**
   - 인터넷 연결 필수
   - API 키 관리 필요
   - 비용 발생 가능

4. **메모리 사용량**
   - Eclipse JVM 힙 메모리 충분히 할당 필요 (권장: 2GB 이상)

### 프로젝트 범위 제약
1. **개인 프로젝트**
   - 개인 시간에만 개발
   - 리소스 제한적

2. **업스트림 의존성**
   - Cline의 아키텍처 변경에 영향받음
   - 주요 업데이트 시 대응 필요

3. **초기 단계**
   - Phase 1 진행 중
   - 모든 기능이 완성되지 않음

### 라이선스 제약
- Apache 2.0 라이선스 준수 필수
- 업스트림 저작권 및 크레딧 표시 필요
- 파생 저작물도 Apache 2.0 또는 호환 라이선스 사용

## 참고 자료

### 공식 문서
- [Eclipse Platform Documentation](https://eclipse.dev/eclipse/platform-core/)
- [Eclipse Plug-in Development Guide](https://www.eclipse.org/pde/)
- [Eclipse API Reference](https://help.eclipse.org/latest/index.jsp)
- [Tycho Build Tool](https://eclipse.dev/tycho/)

### 업스트림 프로젝트
- [Cline GitHub Repository](https://github.com/cline/cline)
- [Cline Documentation](https://github.com/cline/cline/wiki) (있다면)

### AI/LLM 관련
- [Anthropic Claude API](https://docs.anthropic.com/)
- [OpenAI API](https://platform.openai.com/docs/)

### 개발 가이드
- [프로젝트 목표](.github/project-goal.md)
- [Copilot 작업 지침](.github/copilot-instructions.md)
- [Eclipse Plugin README](../eclipse-plugin/README.md)

### 커뮤니티
- [Eclipse Community Forums](https://www.eclipse.org/forums/)
- [Stack Overflow - Eclipse Tag](https://stackoverflow.com/questions/tagged/eclipse)
