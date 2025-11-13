# 프로젝트 목표

## 프로젝트 개요

**Cline for Eclipse** - Eclipse IDE용 자율 코딩 에이전트

이 프로젝트는 Cline 자율 코딩 에이전트를 Eclipse IDE용으로 포팅하는 개인 오픈소스 프로젝트입니다.

업스트림 Cline 프로젝트([Cline/cline](https://github.com/cline/cline), Apache 2.0 라이선스)를 기준으로 하며, 코어 코드는 Git 서브모듈(`cline-core`)로 포함합니다.

핵심 구조와 기능을 최대한 유지하면서, VS Code/JetBrains API를 Eclipse 플랫폼 API(IWorkbench, ICommands, IProgressService 등)로 대체하여 Eclipse 환경에서 동일한 자율 코딩 경험을 제공하는 것이 목적입니다.

## 주요 목표

1. **업스트림 Cline 코어 로직의 재사용**
   - Cline의 핵심 AI 에이전트 로직을 가능한 한 그대로 재사용
   - 코드 수정을 최소화하여 업스트림과의 동기화 유지

2. **Eclipse 플랫폼 API 통합**
   - VS Code/JetBrains 전용 API를 Eclipse 플랫폼 API로 치환
   - Eclipse의 워크벤치, 에디터, 명령, 진행 상황 서비스 등 활용

3. **핵심 기능 구현**
   - 파일 생성/수정 (IFile, IDocument API)
   - 명령 실행 (ICommandService)
   - 작업 오케스트레이션 (IProgressService)
   - AI 에이전트 기능 (대화형 코딩 지원)

4. **모듈화된 구조 유지**
   - Eclipse 전용 코드는 별도 모듈(`eclipse-plugin`)에 구성
   - 플랫폼 독립적 코드와 Eclipse 의존 코드 명확히 분리
   - 구조를 단순하게 유지하여 유지보수성 향상

5. **장기적 호환성 확보**
   - 업스트림 변경 사항을 쉽게 통합할 수 있는 설계
   - 서브모듈 업데이트를 통한 지속적인 동기화
   - 확장 가능한 아키텍처

## 개발 단계

### Phase 1: 프로젝트 기반 구축 ✅ 완료!
**목표**: 개발 환경 및 기본 구조 설정

**체크리스트**:
- [x] Eclipse 플러그인 프로젝트 생성
- [x] 업스트림 Cline을 Git 서브모듈로 추가
- [x] 빌드 시스템 구성 (Eclipse PDE)
- [x] 기본 플러그인 구조 및 매니페스트 설정
- [x] 개발 환경 문서화
- [x] 자동 활성화 설정
- [x] 테스트 명령 구현 및 검증

### Phase 2: 코어 모듈 분석 및 포팅
**목표**: Cline 코어 로직 분석 및 Eclipse 어댑터 설계

**체크리스트**:
- [ ] Cline 코어 아키텍처 분석
- [ ] VS Code API 의존성 파악
- [ ] Eclipse API 매핑 설계
- [ ] 플랫폼 추상화 레이어 구현
- [ ] 기본 어댑터 클래스 작성

### Phase 3: 핵심 기능 구현
**목표**: 파일 작업, 명령 실행 등 핵심 기능 구현

**체크리스트**:
- [ ] 파일 시스템 작업 (생성, 읽기, 쓰기, 삭제)
- [ ] 에디터 통합 (문서 열기, 수정, 저장)
- [ ] 명령 실행 시스템
- [ ] 진행 상황 표시 및 취소 처리
- [ ] 워크스페이스 관리

### Phase 4: UI 통합
**목표**: Eclipse UI에 Cline 인터페이스 통합

**체크리스트**:
- [ ] Cline 뷰(View) 구현
- [ ] 대화형 채팅 UI
- [ ] 명령 팔레트 통합
- [ ] 설정 페이지 구현
- [ ] 아이콘 및 테마 적용

### Phase 5: AI 에이전트 기능
**목표**: AI 기반 자율 코딩 기능 구현

**체크리스트**:
- [ ] AI 모델 통합 (Claude API 등)
- [ ] 프롬프트 처리 및 응답 파싱
- [ ] 컨텍스트 수집 및 전달
- [ ] 도구(Tool) 실행 엔진
- [ ] 다단계 작업 오케스트레이션

### Phase 6: 테스트 및 안정화
**목표**: 품질 보증 및 사용자 피드백 반영

**체크리스트**:
- [ ] 단위 테스트 작성
- [ ] 통합 테스트 구현
- [ ] 성능 최적화
- [ ] 버그 수정 및 안정화
- [ ] 문서화 완성

### Phase 7: 배포 및 유지보수
**목표**: 릴리스 및 지속적인 업데이트

**체크리스트**:
- [ ] Eclipse Marketplace 등록
- [ ] 업데이트 사이트 구성
- [ ] 릴리스 노트 작성
- [ ] 업스트림 동기화 프로세스 확립
- [ ] 커뮤니티 지원

## 기술 스택

- **언어**: Java 17+ (Eclipse 플러그인), TypeScript/JavaScript (Cline 코어)
- **프레임워크**: Eclipse RCP (Rich Client Platform), Eclipse Plug-in Development
- **빌드 도구**: Maven + Tycho 또는 Gradle
- **AI/LLM**: Claude API, OpenAI API 등
- **버전 관리**: Git (서브모듈 활용)
- **테스트**: JUnit 5, Eclipse SWTBot (UI 테스트)
- **문서화**: Markdown, JavaDoc

## 아키텍처 설계

```
cline-for-eclipse/
├── cline-core/              # Git 서브모듈 (업스트림 Cline)
│   └── src/                 # Cline 원본 코드 (수정 최소화)
│
├── eclipse-plugin/          # Eclipse 플러그인 구현
│   ├── src/
│   │   ├── adapters/        # Eclipse API 어댑터
│   │   ├── ui/              # Eclipse UI 구현
│   │   ├── commands/        # 명령 핸들러
│   │   ├── services/        # Eclipse 서비스 통합
│   │   └── core/            # 플랫폼 추상화 레이어
│   ├── plugin.xml           # Eclipse 플러그인 매니페스트
│   └── META-INF/MANIFEST.MF # OSGi 번들 정보
│
├── docs/                    # 프로젝트 문서
│   ├── architecture.md      # 아키텍처 문서
│   ├── api-mapping.md       # API 매핑 문서
│   └── development.md       # 개발 가이드
│
└── .github/                 # 프로젝트 관리
    ├── copilot-instructions.md
    └── sessions/
```

**핵심 설계 원칙**:
- **분리(Separation)**: 플랫폼 독립 코드와 Eclipse 의존 코드 분리
- **추상화(Abstraction)**: 플랫폼 API를 추상화하여 포팅 용이성 확보
- **최소 수정(Minimal Changes)**: 업스트림 코드 수정 최소화
- **모듈화(Modularity)**: 기능별 모듈 분리로 유지보수성 향상

## 성공 기준

1. **기능적 동등성**
   - VS Code용 Cline의 핵심 기능이 Eclipse에서도 동작
   - 파일 작업, AI 대화, 코드 생성 등 주요 워크플로우 지원

2. **성능**
   - Eclipse IDE 반응성에 영향 없는 성능
   - AI 응답 시간 합리적 범위 유지

3. **안정성**
   - 크래시나 데이터 손실 없는 안정적 동작
   - 에러 처리 및 복구 메커니즘 구현

4. **유지보수성**
   - 업스트림 업데이트를 1주일 내 통합 가능
   - 코드 구조가 명확하고 문서화가 충분

5. **사용자 경험**
   - Eclipse 사용자에게 자연스러운 UI/UX
   - 직관적인 명령어 및 단축키

## 제약사항

1. **라이선스 준수**
   - Apache 2.0 라이선스 조건 준수
   - 업스트림 저작권 및 크레딧 표시

2. **Eclipse 플랫폼 의존성**
   - Eclipse 2023-09 (4.29) 이상 지원
   - Java 17 이상 필요

3. **API 차이**
   - Eclipse API와 VS Code API의 패러다임 차이
   - 일부 기능은 Eclipse 방식으로 재해석 필요

4. **개인 프로젝트 범위**
   - 회사 업무와 무관한 개인 시간 개발
   - 리소스 제한을 고려한 점진적 개발

5. **업스트림 의존성**
   - Cline의 아키텍처 변경에 영향받을 수 있음
   - 호환성 유지를 위한 지속적인 모니터링 필요

## 참고 자료

- **업스트림 프로젝트**: [Cline/cline](https://github.com/cline/cline)
- **Eclipse Platform**: [Eclipse Platform Documentation](https://eclipse.dev/eclipse/platform-core/)
- **Eclipse Plug-in Development**: [Eclipse PDE Guide](https://www.eclipse.org/pde/)
- **Apache 2.0 License**: [LICENSE](../LICENSE)
