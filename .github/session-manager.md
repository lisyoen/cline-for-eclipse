# Session Manager

최근 10개 세션 목록 (최신순):

## 활성/최근 세션

### session-YYYYMMDD-001-description
- **날짜**: YYYY-MM-DD
- **상태**: 진행 중 🚧 / 완료 ✅ / 대기 중 ⏸️
- **작업**: [작업 제목]
- **설명**: [작업 상세 설명]
- **우선순위**: HIGH 🔥 / MEDIUM 🟡 / LOW 🟢
- **파일**: [session-YYYYMMDD-001-description.md](sessions/session-YYYYMMDD-001-description.md)
- **관련 세션**: [이전 관련 세션 ID들]
- **예상 소요**: [예상 시간]

---

## 세션 추가 가이드

새 세션 추가 시:
1. 세션 ID 생성: `session-YYYYMMDD-XXX-description`
2. 위 템플릿 복사하여 정보 입력
3. `.github/sessions/` 폴더에 상세 파일 생성
4. `current-session.md` 업데이트

## 세션 상태 표시

- 🚧 진행 중
- ✅ 완료
- ⏸️ 대기 중
- ❌ 취소됨
- 🔥 긴급
- 🟡 보통
- 🟢 낮음
