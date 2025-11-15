# Cline for Eclipse - gRPC 아키텍처 이해

## 버전
- 날짜: 2024.11.15
- 버전: 2024.11.15.2-grpc-architecture

## gRPC 통신 구조

### 1. 양방향 gRPC 통신

```
┌─────────────────────┐         gRPC          ┌──────────────────────┐
│  Eclipse Plugin     │◄────────────────────►│   Cline Core         │
│  (Java)             │                       │   (TypeScript)       │
└─────────────────────┘                       └──────────────────────┘
         │                                              │
         │ Host Bridge Server                          │ ProtoBus Server
         │ (Eclipse 제공)                              │ (Cline Core 제공)
         │                                              │
         ▼                                              ▼
  포트: 26041                                    포트: 50051 (설정 가능)
  WorkspaceService                               (우리가 호출)
  WindowService
  EnvService  
  DiffService
```

### 2. 서버 역할

#### Eclipse Plugin (Host Bridge Server)
- **포트**: 26041 (기본값)
- **역할**: IDE 기능 제공
- **서비스들**:
  - `WorkspaceService`: 프로젝트 파일/폴더 관리
  - `WindowService`: 에디터, 대화상자, 메시지
  - `EnvService`: 클립보드, 환경 정보
  - `DiffService`: 파일 비교/수정 뷰

#### Cline Core (ProtoBus Server)
- **포트**: 50051 (설정 가능, 기본값 26040)
- **역할**: Cline AI 로직 실행
- **사용**: Eclipse에서 AI 기능 호출 시 사용

### 3. 실행 순서

```
1. Eclipse Plugin 시작
   └─> Host Bridge gRPC Server 시작 (포트 26041)

2. Cline Core 시작
   ├─> Host Bridge에 연결 시도
   └─> ProtoBus gRPC Server 시작 (포트 50051)

3. 양방향 통신 준비 완료
```

### 4. Phase 4 구현 계획

#### 4.1 Host Bridge Server 구현 (Eclipse)
```java
// eclipse-plugin/src/com/cline/eclipse/host/HostBridgeServer.java
public class HostBridgeServer {
    private Server server;
    private int port = 26041;
    
    public void start() {
        server = ServerBuilder.forPort(port)
            .addService(new WorkspaceServiceImpl())
            .addService(new WindowServiceImpl())
            .addService(new EnvServiceImpl())
            .addService(new DiffServiceImpl())
            .build()
            .start();
    }
}
```

#### 4.2 서비스 구현체
- `WorkspaceServiceImpl`: IWorkspace API 래핑
- `WindowServiceImpl`: MessageDialog, FileDialog 등
- `EnvServiceImpl`: Clipboard, System 정보
- `DiffServiceImpl`: CompareUI 통합

#### 4.3 Cline Core 연결
- Eclipse 시작 시 Host Bridge Server 시작
- Cline Core 프로세스 실행
- ProtoBus 클라이언트로 AI 기능 호출

### 5. 테스트 시나리오

1. **Host Bridge 단독 테스트**
   - Eclipse에서 Host Bridge 시작
   - gRPC 클라이언트로 직접 호출 테스트

2. **통합 테스트**
   - Host Bridge 시작 → Cline Core 시작
   - 양방향 통신 확인
   - Workspace 정보 교환 테스트

### 6. 다음 단계

- [ ] HostBridgeServer 클래스 생성
- [ ] WorkspaceServiceImpl 구현
- [ ] WindowServiceImpl 구현
- [ ] EnvServiceImpl 구현
- [ ] DiffServiceImpl 구현
- [ ] ClineActivator에 서버 시작 로직 추가
- [ ] Cline Core 프로세스 관리자 구현
- [ ] 통합 테스트

### 7. 참고사항

- Host Bridge proto 파일 위치: `cline-core/proto/host/*.proto`
- Java 생성 파일: `eclipse-plugin/src-gen/java/bot/cline/host/proto/`
- Cline Core 빌드: `npm run compile-standalone`
- Cline Core 실행: `node cline-core.js --port 50051`
