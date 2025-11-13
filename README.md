# Cline for Eclipse

Eclipse IDE용 자율 코딩 에이전트 - [Cline](https://github.com/cline/cline)의 Eclipse 포팅 프로젝트

## 프로젝트 개요

이 프로젝트는 VS Code용 AI 코딩 에이전트인 Cline을 Eclipse IDE로 포팅하는 오픈소스 프로젝트입니다.

업스트림 Cline의 코어 로직을 최대한 재사용하면서, Eclipse 플랫폼 API와 통합하여 Eclipse 사용자들도 동일한 자율 코딩 경험을 누릴 수 있도록 합니다.

## 프로젝트 구조

```
cline-for-eclipse/
├── README.md              # 프로젝트 소개
├── cline-core/            # Git 서브모듈 (업스트림 Cline 코어)
├── eclipse-plugin/        # Eclipse 플러그인 구현
└── test-workspace/        # 테스트용 워크스페이스
```

## 주요 목표

1. **업스트림 코어 재사용** - Cline의 핵심 AI 로직을 그대로 활용
2. **Eclipse 플랫폼 통합** - Eclipse API로 완벽하게 통합
3. **모듈화된 구조** - 유지보수와 업데이트가 쉬운 설계
4. **장기적 호환성** - 업스트림 변경사항을 쉽게 반영

## 개발 상태

🚧 **현재 Phase 1 진행 중** - 프로젝트 기반 구축 단계

- [x] 프로젝트 저장소 생성
- [x] 업스트림 Cline 서브모듈 추가
- [x] 기본 디렉토리 구조 설정
- [ ] Eclipse 플러그인 프로젝트 생성
- [ ] 빌드 시스템 구성

자세한 개발 로드맵은 [`.github/project-goal.md`](.github/project-goal.md)를 참조하세요.

## 기술 스택

- **언어**: Java 17+, TypeScript/JavaScript
- **프레임워크**: Eclipse RCP, Eclipse Plug-in Development
- **빌드 도구**: Maven + Tycho (또는 Gradle)
- **AI/LLM**: Claude API, OpenAI API 등
- **버전 관리**: Git (서브모듈 활용)

## 개발 환경 요구사항

- Eclipse IDE 2023-09 (4.29) 이상
- Java Development Kit (JDK) 17 이상
- Eclipse PDE (Plug-in Development Environment)
- Git
- Maven 또는 Gradle

## 라이선스

이 프로젝트는 업스트림 Cline과 동일하게 [Apache License 2.0](LICENSE)을 따릅니다.

## 관련 링크

- **업스트림 프로젝트**: [Cline/cline](https://github.com/cline/cline)
- **프로젝트 목표**: [.github/project-goal.md](.github/project-goal.md)
- **개발 문서**: [.github/copilot-instructions.md](.github/copilot-instructions.md)

## 기여하기

이 프로젝트는 개인 오픈소스 프로젝트이며, 기여를 환영합니다.

- Issue를 통한 버그 리포트 및 기능 제안
- Pull Request를 통한 코드 기여
- 문서 개선 및 번역

## 문의

- GitHub Issues: [프로젝트 이슈 페이지](https://github.com/lisyoen/cline-for-eclipse/issues)
