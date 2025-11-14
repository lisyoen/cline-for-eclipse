# VS Code API → Eclipse API 매핑 문서

**작성일**: 2024-11-15  
**Phase**: 2 - 코어 모듈 분석 및 포팅

## 개요

Cline은 플랫폼 독립적 아키텍처를 사용하며, `HostProvider` 패턴을 통해 플랫폼별 구현을 추상화합니다. 이 문서는 VS Code API를 Eclipse 플랫폼 API로 매핑하는 전략을 정의합니다.

## Cline 아키텍처 분석

### HostProvider 패턴

Cline은 **HostProvider** 싱글톤 클래스를 사용하여 플랫폼 의존성을 관리합니다:

```typescript
export class HostProvider {
    createWebviewProvider: WebviewProviderCreator
    createDiffViewProvider: DiffViewProviderCreator
    hostBridge: HostBridgeClientProvider
    logToChannel: LogToChannel
    getCallbackUrl: () => Promise<string>
    getBinaryLocation: (name: string) => Promise<string>
    extensionFsPath: string
    globalStorageFsPath: string
}
```

### HostBridge 인터페이스

플랫폼 서비스는 gRPC 기반의 `HostBridge`를 통해 추상화됩니다:

```typescript
export interface HostBridgeClientProvider {
    workspaceClient: WorkspaceServiceClientInterface
    envClient: EnvServiceClientInterface
    windowClient: WindowServiceClientInterface
    diffClient: DiffServiceClientInterface
}
```

### 디렉토리 구조

```
cline-core/
├── src/
│   ├── core/                    # 플랫폼 독립적 코어 로직
│   │   ├── controller/          # 주요 컨트롤러 로직
│   │   ├── task/                # 작업 관리
│   │   ├── prompts/             # AI 프롬프트
│   │   └── webview/             # 웹뷰 UI
│   ├── hosts/                   # 플랫폼별 구현
│   │   ├── host-provider.ts     # HostProvider 싱글톤
│   │   ├── vscode/              # VS Code 구현
│   │   └── external/            # 외부 플랫폼 지원
│   ├── integrations/            # 에디터 통합
│   │   └── editor/
│   │       ├── DiffViewProvider.ts      # 추상 인터페이스
│   │       └── FileEditProvider.ts      # 파일 기반 구현
│   └── services/                # 공통 서비스
```

## 핵심 API 매핑

### 1. Workspace 서비스

#### VS Code API
```typescript
// 워크스페이스 경로
vscode.workspace.workspaceFolders
vscode.workspace.getWorkspaceFolder(uri)

// 파일 시스템 감시
vscode.workspace.createFileSystemWatcher(pattern)

// 문서 작업
vscode.workspace.openTextDocument(uri)
vscode.workspace.applyEdit(workspaceEdit)
```

#### Eclipse API 매핑
```java
// 워크스페이스 경로
IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
IProject[] projects = root.getProjects();
IPath workspaceLocation = root.getLocation();

// 파일 시스템 감시
IResourceChangeListener listener = new IResourceChangeListener() {
    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        // 변경 처리
    }
};
ResourcesPlugin.getWorkspace().addResourceChangeListener(listener);

// 문서 작업
IFile file = project.getFile("path/to/file");
IDocument document = new Document(readFile(file));
IWorkspaceRoot.applyChanges(...)
```

### 2. Window 서비스

#### VS Code API
```typescript
// 메시지 표시
vscode.window.showInformationMessage(message)
vscode.window.showWarningMessage(message)
vscode.window.showErrorMessage(message)

// 에디터 작업
vscode.window.activeTextEditor
vscode.window.showTextDocument(document)
```

#### Eclipse API 매핑
```java
// 메시지 표시
MessageDialog.openInformation(shell, title, message);
MessageDialog.openWarning(shell, title, message);
MessageDialog.openError(shell, title, message);

// 에디터 작업
IWorkbenchPage page = PlatformUI.getWorkbench()
    .getActiveWorkbenchWindow()
    .getActivePage();
IEditorPart editor = page.getActiveEditor();
IDE.openEditor(page, file, editorId);
```

### 3. Environment 서비스

#### VS Code API
```typescript
// 환경 변수
process.env

// 클립보드
vscode.env.clipboard.writeText(text)
vscode.env.clipboard.readText()

// 시스템 정보
vscode.env.appName
vscode.env.appRoot
vscode.env.language
```

#### Eclipse API 매핑
```java
// 환경 변수
System.getenv()

// 클립보드
Clipboard clipboard = new Clipboard(display);
TextTransfer textTransfer = TextTransfer.getInstance();
clipboard.setContents(
    new Object[] { text },
    new Transfer[] { textTransfer }
);
String clipText = (String) clipboard.getContents(textTransfer);

// 시스템 정보
Platform.getProduct().getName()
Platform.getInstallLocation().getURL()
Locale.getDefault().getLanguage()
```

### 4. Diff/Editor 서비스

#### VS Code API
```typescript
// Diff 뷰
vscode.commands.executeCommand('vscode.diff', left, right, title)

// 텍스트 편집
TextEditor.edit(editBuilder => {
    editBuilder.insert(position, text)
    editBuilder.replace(range, text)
    editBuilder.delete(range)
})
```

#### Eclipse API 매핑
```java
// Diff 뷰
CompareConfiguration config = new CompareConfiguration();
CompareEditorInput input = new CompareEditorInput(config) {
    @Override
    protected Object prepareInput(IProgressMonitor monitor) {
        // Diff 준비
        return new DiffNode(left, right);
    }
};
CompareUI.openCompareEditor(input);

// 텍스트 편집
IDocument doc = editor.getDocumentProvider()
    .getDocument(editor.getEditorInput());
doc.replace(offset, length, text);
```

## 포팅 전략

### Phase 2A: HostProvider 구현

Eclipse용 `EclipseHostProvider` 구현:

```java
public class EclipseHostProvider {
    // VS Code: createWebviewProvider
    // Eclipse: Browser 위젯 또는 SWT Browser 사용
    private WebviewProvider createWebviewProvider();
    
    // VS Code: createDiffViewProvider
    // Eclipse: CompareUI 사용
    private DiffViewProvider createDiffViewProvider();
    
    // VS Code: hostBridge (gRPC)
    // Eclipse: 직접 메서드 호출 또는 OSGi 서비스
    private HostBridgeProvider createHostBridge();
}
```

### Phase 2B: HostBridge 서비스 구현

각 서비스별 Eclipse 구현:

1. **WorkspaceService**
   - `IWorkspace`, `IProject`, `IFile` API 사용
   - 파일 변경 감시: `IResourceChangeListener`

2. **WindowService**
   - `IWorkbenchWindow`, `IWorkbenchPage` 사용
   - 다이얼로그: `MessageDialog`, `InputDialog`

3. **EnvService**
   - Java 표준 API: `System.getenv()`, `System.getProperty()`
   - Eclipse Platform API: `Platform` 클래스

4. **DiffService**
   - `CompareUI`, `CompareEditorInput` 사용
   - 텍스트 비교: `TextMergeViewer`

### Phase 2C: 파일 시스템 통합

Cline의 파일 작업은 다음 툴들을 사용합니다:

1. **read_file**: 파일 읽기
   - Eclipse: `IFile.getContents()` 또는 Java `Files.readString()`

2. **write_to_file**: 파일 쓰기
   - Eclipse: `IFile.setContents()` 또는 Java `Files.writeString()`

3. **replace_in_file**: 부분 수정
   - Eclipse: `IDocument.replace()` 사용

4. **delete_file**: 파일 삭제
   - Eclipse: `IFile.delete()`

## 구현 우선순위

### High Priority (Phase 2)
1. ✅ 아키텍처 분석 완료
2. 🔄 HostProvider 인터페이스 정의
3. ⏳ WorkspaceService 구현
4. ⏳ WindowService 구현

### Medium Priority (Phase 3)
- FileSystemWatcher 구현
- DiffViewProvider 구현
- 에디터 통합

### Low Priority (Phase 4+)
- 고급 UI 기능
- 최적화
- 테스트 자동화

## 제약사항 및 대안

### 1. WebView 구현
**제약**: VS Code의 Webview API는 매우 강력하지만 Eclipse의 Browser 위젯은 제한적
**대안**: 
- SWT Browser 위젯 사용
- 필요시 Eclipse RAP (Remote Application Platform) 고려
- 또는 간단한 네이티브 UI로 대체

### 2. gRPC 통신
**제약**: Cline은 gRPC를 사용하지만 Eclipse는 OSGi 기반
**대안**:
- gRPC 서버/클라이언트 그대로 사용 (권장)
- 또는 직접 메서드 호출로 단순화

### 3. TypeScript → Java 변환
**제약**: Cline 코어는 TypeScript, Eclipse는 Java
**대안**:
- 핵심 로직은 TypeScript 그대로 유지 (Node.js 런타임)
- Eclipse 플러그인은 브리지 역할만 수행
- gRPC로 통신

## 다음 단계

1. **Phase 2D**: EclipseHostProvider 스켈레톤 코드 작성
2. **Phase 2E**: WorkspaceService 기본 구현
3. **Phase 2F**: 간단한 파일 읽기/쓰기 테스트
4. **Phase 3**: 본격적인 통합 작업

## 참고 자료

- [Cline GitHub](https://github.com/cline/cline)
- [Eclipse Platform API](https://help.eclipse.org/latest/index.jsp)
- [Eclipse RCP Guide](https://www.eclipse.org/articles/)
- [gRPC Java](https://grpc.io/docs/languages/java/)
