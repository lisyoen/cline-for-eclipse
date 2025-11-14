# Cline for Eclipse 아키텍처 설계

**작성일**: 2024-11-15  
**Phase**: 2 - 코어 모듈 분석 및 포팅

## 전체 아키텍처

```
┌─────────────────────────────────────────────────────────────┐
│                     Eclipse IDE                              │
│  ┌───────────────────────────────────────────────────────┐  │
│  │         Eclipse Plugin (Java)                         │  │
│  │  ┌─────────────────────────────────────────────────┐  │  │
│  │  │  EclipseHostProvider                            │  │  │
│  │  │  - WebviewProvider (SWT Browser)                │  │  │
│  │  │  - DiffViewProvider (CompareUI)                 │  │  │
│  │  │  - HostBridge Client (gRPC)                     │  │  │
│  │  └─────────────────────────────────────────────────┘  │  │
│  │                          ↕ gRPC                       │  │
│  └───────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────┘
                              ↕
┌─────────────────────────────────────────────────────────────┐
│              Cline Core (TypeScript/Node.js)                │
│  ┌───────────────────────────────────────────────────────┐  │
│  │         Core Logic (Platform Independent)             │  │
│  │  ┌─────────────────────────────────────────────────┐  │  │
│  │  │  Controller                                     │  │  │
│  │  │  - Task Management                              │  │  │
│  │  │  - AI Agent Logic                               │  │  │
│  │  │  - Tool Execution                               │  │  │
│  │  └─────────────────────────────────────────────────┘  │  │
│  │  ┌─────────────────────────────────────────────────┐  │  │
│  │  │  HostBridge Server (gRPC)                       │  │  │
│  │  │  - WorkspaceService                             │  │  │
│  │  │  - WindowService                                │  │  │
│  │  │  - EnvService                                   │  │  │
│  │  │  - DiffService                                  │  │  │
│  │  └─────────────────────────────────────────────────┘  │  │
│  └───────────────────────────────────────────────────────┘  │
└─────────────────────────────────────────────────────────────┘
```

## 핵심 컴포넌트

### 1. Eclipse Plugin (Java)

Eclipse 플랫폼과의 통합을 담당하는 Java 플러그인.

```
eclipse-plugin/
├── src/com/cline/eclipse/
│   ├── ClineActivator.java              # 플러그인 활성화
│   ├── ClineStartup.java                # 조기 시작
│   ├── host/                            # Host Provider 구현
│   │   ├── EclipseHostProvider.java     # HostProvider 구현
│   │   ├── EclipseWebviewProvider.java  # SWT Browser 기반
│   │   ├── EclipseDiffViewProvider.java # CompareUI 기반
│   │   └── grpc/                        # gRPC 클라이언트
│   │       ├── GrpcClient.java          # gRPC 연결 관리
│   │       ├── WorkspaceClient.java     # Workspace 서비스
│   │       ├── WindowClient.java        # Window 서비스
│   │       ├── EnvClient.java           # Environment 서비스
│   │       └── DiffClient.java          # Diff 서비스
│   ├── ui/                              # Eclipse UI 컴포넌트
│   │   ├── views/                       # View 구현
│   │   │   └── ClineView.java           # 메인 Cline 뷰
│   │   └── dialogs/                     # 다이얼로그
│   ├── commands/                        # Eclipse 명령
│   │   └── ClineCommandHandler.java     # 명령 핸들러
│   └── handlers/                        # 이벤트 핸들러
│       └── TestHandler.java             # 테스트 핸들러
├── META-INF/MANIFEST.MF                 # OSGi 매니페스트
└── plugin.xml                           # Eclipse 확장 포인트
```

### 2. Cline Core (TypeScript)

플랫폼 독립적인 코어 로직 (기존 cline-core 서브모듈 사용).

```
cline-core/
├── src/
│   ├── core/                            # 코어 로직
│   │   ├── controller/                  # 메인 컨트롤러
│   │   ├── task/                        # 작업 관리
│   │   │   └── tools/                   # AI 도구
│   │   │       └── handlers/            # 도구 핸들러
│   │   │           ├── ReadFileToolHandler.ts
│   │   │           ├── WriteToFileToolHandler.ts
│   │   │           └── ...
│   │   ├── prompts/                     # AI 프롬프트
│   │   └── webview/                     # 웹뷰 UI
│   ├── hosts/                           # 플랫폼별 구현
│   │   ├── host-provider.ts             # HostProvider 싱글톤
│   │   ├── host-provider-types.ts       # 타입 정의
│   │   ├── vscode/                      # VS Code 구현
│   │   └── eclipse/                     # ⭐ Eclipse 구현 (새로 추가)
│   │       └── hostbridge/              # gRPC 서버
│   │           ├── server.ts            # gRPC 서버 시작
│   │           ├── workspace/           # Workspace 서비스
│   │           ├── window/              # Window 서비스
│   │           ├── env/                 # Env 서비스
│   │           └── diff/                # Diff 서비스
│   └── integrations/                    # 통합
│       └── editor/
│           ├── DiffViewProvider.ts      # 추상 인터페이스
│           └── FileEditProvider.ts      # 파일 기반 구현
```

## 통신 프로토콜

### gRPC 기반 통신

Eclipse Plugin과 Cline Core 간의 통신은 gRPC를 사용합니다.

**장점**:
- 타입 안전성
- 양방향 스트리밍 지원
- 플랫폼 독립적
- 높은 성능

**구조**:
```
Eclipse Plugin (Java)  ←→  gRPC  ←→  Cline Core (TypeScript)
    [Client]                           [Server]
```

### 프로토콜 버퍼 정의

```protobuf
// workspace.proto
service WorkspaceService {
    rpc GetWorkspacePaths(Empty) returns (WorkspacePaths);
    rpc SaveOpenDocument(DocumentPath) returns (SaveResult);
    rpc GetDiagnostics(DocumentPath) returns (Diagnostics);
}

// window.proto
service WindowService {
    rpc ShowMessage(MessageRequest) returns (Empty);
    rpc ShowInputBox(InputBoxRequest) returns (InputBoxResponse);
}

// env.proto
service EnvService {
    rpc GetEnvironment(Empty) returns (Environment);
    rpc ReadClipboard(Empty) returns (ClipboardContent);
    rpc WriteClipboard(ClipboardContent) returns (Empty);
}

// diff.proto
service DiffService {
    rpc ShowDiff(DiffRequest) returns (Empty);
    rpc ApplyDiff(DiffContent) returns (DiffResult);
}
```

## 데이터 흐름

### 1. 사용자 요청 플로우

```
사용자 입력 (Eclipse UI)
    ↓
Eclipse Plugin (ClineView)
    ↓ gRPC Call
Cline Core (Controller)
    ↓
AI 모델 (Claude/GPT)
    ↓
Tool Execution (FileHandler, etc.)
    ↓ gRPC Call Back
Eclipse Plugin (HostBridge Client)
    ↓
Eclipse Platform API (IWorkspace, IFile, etc.)
    ↓
파일 시스템 / UI 업데이트
```

### 2. 파일 작업 플로우

```
AI: write_to_file 요청
    ↓
WriteToFileToolHandler (Cline Core)
    ↓
gRPC: WorkspaceService.WriteFile()
    ↓
WorkspaceClient (Eclipse Plugin)
    ↓
IFile.setContents() (Eclipse API)
    ↓
파일 시스템 업데이트
    ↓
IResourceChangeListener 트리거
    ↓
UI 자동 갱신
```

## 플랫폼 추상화 레이어

### HostProvider 패턴

```typescript
// Cline Core
export class HostProvider {
    static initialize(
        webviewProviderCreator,
        diffViewProviderCreator,
        hostBridgeProvider,
        ...
    ) { ... }
}
```

```java
// Eclipse Plugin
public class EclipseHostProvider {
    public static void initialize() {
        // WebView: SWT Browser
        WebviewProvider webview = new EclipseWebviewProvider();
        
        // Diff: CompareUI
        DiffViewProvider diff = new EclipseDiffViewProvider();
        
        // HostBridge: gRPC Client
        HostBridgeProvider bridge = new GrpcHostBridge();
        
        // Cline Core에 전달
        startClineCore(webview, diff, bridge);
    }
}
```

## 초기화 시퀀스

```
1. Eclipse 시작
    ↓
2. ClineActivator.start()
    ↓
3. ClineStartup.earlyStartup()
    ↓
4. EclipseHostProvider.initialize()
    ↓
5. gRPC Server 시작 (Cline Core)
    ↓
6. gRPC Client 연결 (Eclipse Plugin)
    ↓
7. ClineView 생성 및 표시
    ↓
8. 준비 완료!
```

## UI 통합

### 1. Main View (SWT Browser)

```java
public class ClineView extends ViewPart {
    private Browser browser;
    
    @Override
    public void createPartControl(Composite parent) {
        browser = new Browser(parent, SWT.NONE);
        browser.setUrl("http://localhost:PORT/webview");
    }
}
```

### 2. Diff View (CompareUI)

```java
public class EclipseDiffViewProvider {
    public void showDiff(String leftPath, String rightPath) {
        CompareConfiguration config = new CompareConfiguration();
        CompareEditorInput input = new DiffInput(config, left, right);
        CompareUI.openCompareEditor(input);
    }
}
```

## 확장 가능성

### 1. 추가 도구 지원

Cline의 도구 시스템은 확장 가능:
- `ReadFileToolHandler`
- `WriteToFileToolHandler`
- `ExecuteCommandToolHandler`
- ... 커스텀 도구 추가 가능

### 2. MCP (Model Context Protocol) 통합

Cline은 MCP를 지원하므로 Eclipse에서도 동일하게 사용 가능:
- 데이터베이스 연결
- 외부 API 호출
- 기타 확장 기능

### 3. 다중 워크스페이스

Eclipse의 다중 프로젝트 환경을 Cline의 워크스페이스 개념과 매핑:
```
Eclipse Project ←→ Cline Workspace
```

## 보안 고려사항

### 1. 파일 접근 제어

```java
// Eclipse Plugin에서 파일 접근 전 검증
public boolean isPathAllowed(String path) {
    IPath workspacePath = workspace.getRoot().getLocation();
    IPath filePath = new Path(path);
    return workspacePath.isPrefixOf(filePath);
}
```

### 2. 명령 실행 제한

```java
// 허용된 명령만 실행
private static final Set<String> ALLOWED_COMMANDS = Set.of(
    "git", "npm", "mvn", "gradle"
);
```

### 3. AI API 키 보안

```java
// Eclipse Secure Storage 사용
ISecurePreferences secure = SecurePreferencesFactory.getDefault();
ISecurePreferences node = secure.node("com.cline.eclipse");
node.put("api_key", apiKey, true); // encrypted
```

## 성능 최적화

### 1. 비동기 처리

```java
// Eclipse Jobs API 사용
Job job = new Job("Cline Task") {
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        // 긴 작업 수행
        return Status.OK_STATUS;
    }
};
job.schedule();
```

### 2. 캐싱

```typescript
// Cline Core에서 파일 내용 캐싱
class FileCache {
    private cache = new Map<string, CachedFile>();
    
    get(path: string): string | undefined {
        const cached = this.cache.get(path);
        if (cached && !cached.isExpired()) {
            return cached.content;
        }
    }
}
```

### 3. 리소스 관리

```java
// Eclipse 리소스 정리
@Override
public void dispose() {
    if (grpcClient != null) {
        grpcClient.shutdown();
    }
    super.dispose();
}
```

## 테스트 전략

### 1. 단위 테스트

```java
// JUnit 5
@Test
public void testWorkspaceService() {
    WorkspaceClient client = new WorkspaceClient(channel);
    WorkspacePaths paths = client.getWorkspacePaths();
    assertNotNull(paths);
}
```

### 2. 통합 테스트

```typescript
// Mocha
describe('Eclipse Integration', () => {
    it('should write file via gRPC', async () => {
        const result = await workspaceClient.writeFile(path, content);
        expect(result.success).to.be.true;
    });
});
```

### 3. UI 테스트

```java
// SWTBot
@Test
public void testClineView() {
    bot.viewByTitle("Cline").show();
    assertTrue(bot.browser().isVisible());
}
```

## 다음 단계

1. **Phase 2D**: EclipseHostProvider 스켈레톤 구현
2. **Phase 2E**: gRPC 서버/클라이언트 연결 테스트
3. **Phase 2F**: WorkspaceService 기본 구현
4. **Phase 3**: 파일 작업 도구 통합

## 참고 문서

- [API 매핑 문서](./api-mapping.md)
- [프로젝트 목표](../.github/project-goal.md)
- [Cline 원본 아키텍처](https://github.com/cline/cline)
