# GitHub Copilot 지시사항 및 세션 관리 시스템

이 폴더는 다른 프로젝트에서 복사하여 사용할 수 있는 GitHub Copilot 지시사항 템플릿과 세션 관리 시스템을 제공합니다.

## 📁 폴더 구조

```
.github/
├── copilot-instructions.md    # GitHub Copilot 지시사항 (메인)
├── .prompt.txt                 # 프로젝트별 간단한 지시사항
├── README.md                   # 이 파일
├── current-session.md          # 현재 활성 세션 (간략)
├── session-manager.md          # 최근 10개 세션 목록
├── project-goal.md             # 프로젝트 목표 및 로드맵
├── project-context.md          # 프로젝트 전체 맥락
├── work-history.md             # 완료된 세션 아카이브
└── sessions/                   # 세션 상세 파일들
    ├── .gitkeep
    ├── session-template.md     # 세션 템플릿
    └── session-YYYYMMDD-XXX-description.md  # 각 세션 파일
```

## 🚀 다른 프로젝트에서 사용하기

### 1. 기본 설치

프로젝트 루트에서 이 폴더를 복사:

```bash
# 새 프로젝트 폴더로 이동
cd your-new-project

# .github 폴더 생성 및 복사
mkdir -p .github
cp -r /path/to/this/.github/* .github/
```

### 2. 프로젝트별 설정

다음 파일들을 프로젝트에 맞게 수정:

#### 필수 수정 파일
- ✅ **`project-goal.md`** - 프로젝트 목표, 기술 스택, 개발 단계
- ✅ **`project-context.md`** - 프로젝트 구조, 주요 컴포넌트
- ✅ **`.prompt.txt`** - 프로젝트별 간단한 개발 지침
- ✅ **`copilot-instructions.md`** - 프로젝트별 특수 규칙 추가 (선택)

#### 그대로 사용 가능한 파일
- ✅ **`session-manager.md`** - 템플릿 그대로 사용
- ✅ **`current-session.md`** - 템플릿 그대로 사용
- ✅ **`work-history.md`** - 템플릿 그대로 사용
- ✅ **`sessions/session-template.md`** - 템플릿 그대로 사용

### 3. Git 설정

`.gitignore`에 추가 (선택):

```gitignore
# 세션 파일은 프로젝트에 따라 선택
.github/sessions/*.md
!.github/sessions/session-template.md
!.github/sessions/.gitkeep
```

## 📖 사용 방법

### 작업 시작 시

1. **Git 동기화**
   ```bash
   git pull
   ```

2. **현재 세션 확인**
   - `.github/current-session.md` 읽기 → 현재 세션 ID 확인
   - `.github/sessions/session-ID.md` 읽기 → 상세 정보 로드
   - `.github/project-goal.md` 읽기 → 프로젝트 목표 확인

3. **새 세션 시작**
   - 새 세션 ID 생성: `session-YYYYMMDD-XXX-description`
   - `sessions/session-template.md` 복사하여 새 세션 파일 생성
   - `current-session.md` 업데이트 (새 세션 ID로 변경)
   - `session-manager.md`에 새 세션 추가

### 작업 중

- **세션 파일만 업데이트**: `.github/sessions/session-ID.md`
- 진행 상황, 결정사항, 문제점 등을 지속적으로 기록
- `current-session.md`와 `session-manager.md`는 필요 시에만 간단히 업데이트

### 작업 완료 시

1. **세션 파일 완료 처리**
   - `.github/sessions/session-ID.md`: 상태 "완료", 결과 작성
   - 테스트 방법 제시

2. **관리 파일 업데이트**
   - `.github/session-manager.md`: 상태 "완료"로 변경
   - `.github/current-session.md`: 다음 세션 준비 (또는 비우기)

3. **Git 동기화**
   ```bash
   git add .github/
   git commit -m "세션 session-ID 완료: [작업 요약]"
   git push
   ```

## 🔑 핵심 원칙

### 1. 세션 관리
- **상세 정보는 세션 파일 하나에만 기록** (`.github/sessions/session-ID.md`)
- **관리 파일들은 참조용으로만 사용** (최소한의 정보만)
- **중복 기록 금지**

### 2. 세션 ID 형식
```
session-YYYYMMDD-XXX-description
```
- `YYYYMMDD`: 날짜 (예: 20251113)
- `XXX`: 일자별 순차 번호 (001부터)
- `description`: 간단한 작업 설명 (kebab-case)

**예시**: `session-20251113-001-initial-setup`

### 3. 버전 관리
- 빌드할 때마다 버전 번호 업데이트
- 형식: `YYYY.MM.DD.X-description`
- 새 빌드 확인을 위한 필수 작업

## 📚 주요 기능

### 1. GitHub Copilot 지시사항
- 코드 품질 관리 및 에러 검증
- 버전 관리 규칙
- MCP Tools 사용 규칙
- 파일 작업 도구 우선순위

### 2. 세션 관리 시스템
- 작업 연속성 유지
- 진행 상황 추적
- 결정사항 기록
- 문제 해결 과정 문서화

### 3. 프로젝트 컨텍스트
- 프로젝트 목표 명확화
- 기술 스택 문서화
- 개발 단계 체크리스트
- 아키텍처 설계 기록

## 🛠️ 커스터마이징

### 프로젝트별 특수 규칙 추가

`copilot-instructions.md`에 섹션 추가:

```markdown
## [프로젝트명] 특수 규칙

### 1. [규칙 제목]
[규칙 설명]

### 2. [규칙 제목]
[규칙 설명]
```

### MCP 서버 추가

`copilot-instructions.md`의 "MCP Tools 사용 규칙" 섹션에 추가:

```markdown
3. **[서버명]** - [설명]
   - Repository: [Git 주소]
   - `mcp_[서버명]_[도구명]` - [도구 설명]
```

## 📝 라이선스

이 템플릿은 자유롭게 복사, 수정, 배포할 수 있습니다.

## 🤝 기여

개선 제안이나 버그 리포트는 원본 프로젝트의 이슈 트래커를 이용해주세요.

---

**참고**: 이 시스템은 GitHub Copilot과 함께 사용할 때 최적화되어 있으며, 다른 AI 코딩 어시스턴트에서도 사용할 수 있습니다.
