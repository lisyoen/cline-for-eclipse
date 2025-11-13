# Eclipse Plugin

Eclipse IDE용 Cline 포팅 코드를 작성하는 디렉토리입니다.

## 구조 (예정)

```
eclipse-plugin/
├── src/
│   ├── adapters/        # Eclipse API 어댑터
│   ├── ui/              # Eclipse UI 구현
│   ├── commands/        # 명령 핸들러
│   ├── services/        # Eclipse 서비스 통합
│   └── core/            # 플랫폼 추상화 레이어
├── plugin.xml           # Eclipse 플러그인 매니페스트
└── META-INF/MANIFEST.MF # OSGi 번들 정보
```

## 개발 시작 전 준비사항

1. Eclipse IDE 설치 (2023-09 이상 권장)
2. Eclipse PDE (Plug-in Development Environment) 설치
3. Java 17 이상 설치
4. Maven 또는 Gradle 빌드 도구 설정
