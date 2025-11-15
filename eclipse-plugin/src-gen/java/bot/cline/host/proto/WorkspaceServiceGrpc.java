package bot.cline.host.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides methods for working with workspaces/projects.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: host/workspace.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkspaceServiceGrpc {

  private WorkspaceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "host.WorkspaceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetWorkspacePathsRequest,
      bot.cline.host.proto.GetWorkspacePathsResponse> getGetWorkspacePathsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWorkspacePaths",
      requestType = bot.cline.host.proto.GetWorkspacePathsRequest.class,
      responseType = bot.cline.host.proto.GetWorkspacePathsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetWorkspacePathsRequest,
      bot.cline.host.proto.GetWorkspacePathsResponse> getGetWorkspacePathsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetWorkspacePathsRequest, bot.cline.host.proto.GetWorkspacePathsResponse> getGetWorkspacePathsMethod;
    if ((getGetWorkspacePathsMethod = WorkspaceServiceGrpc.getGetWorkspacePathsMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetWorkspacePathsMethod = WorkspaceServiceGrpc.getGetWorkspacePathsMethod) == null) {
          WorkspaceServiceGrpc.getGetWorkspacePathsMethod = getGetWorkspacePathsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetWorkspacePathsRequest, bot.cline.host.proto.GetWorkspacePathsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getWorkspacePaths"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetWorkspacePathsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetWorkspacePathsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("getWorkspacePaths"))
              .build();
        }
      }
    }
    return getGetWorkspacePathsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest,
      bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> getSaveOpenDocumentIfDirtyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveOpenDocumentIfDirty",
      requestType = bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest.class,
      responseType = bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest,
      bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> getSaveOpenDocumentIfDirtyMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest, bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> getSaveOpenDocumentIfDirtyMethod;
    if ((getSaveOpenDocumentIfDirtyMethod = WorkspaceServiceGrpc.getSaveOpenDocumentIfDirtyMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getSaveOpenDocumentIfDirtyMethod = WorkspaceServiceGrpc.getSaveOpenDocumentIfDirtyMethod) == null) {
          WorkspaceServiceGrpc.getSaveOpenDocumentIfDirtyMethod = getSaveOpenDocumentIfDirtyMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest, bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveOpenDocumentIfDirty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("saveOpenDocumentIfDirty"))
              .build();
        }
      }
    }
    return getSaveOpenDocumentIfDirtyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetDiagnosticsRequest,
      bot.cline.host.proto.GetDiagnosticsResponse> getGetDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDiagnostics",
      requestType = bot.cline.host.proto.GetDiagnosticsRequest.class,
      responseType = bot.cline.host.proto.GetDiagnosticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetDiagnosticsRequest,
      bot.cline.host.proto.GetDiagnosticsResponse> getGetDiagnosticsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetDiagnosticsRequest, bot.cline.host.proto.GetDiagnosticsResponse> getGetDiagnosticsMethod;
    if ((getGetDiagnosticsMethod = WorkspaceServiceGrpc.getGetDiagnosticsMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getGetDiagnosticsMethod = WorkspaceServiceGrpc.getGetDiagnosticsMethod) == null) {
          WorkspaceServiceGrpc.getGetDiagnosticsMethod = getGetDiagnosticsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetDiagnosticsRequest, bot.cline.host.proto.GetDiagnosticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetDiagnosticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetDiagnosticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("getDiagnostics"))
              .build();
        }
      }
    }
    return getGetDiagnosticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenProblemsPanelRequest,
      bot.cline.host.proto.OpenProblemsPanelResponse> getOpenProblemsPanelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openProblemsPanel",
      requestType = bot.cline.host.proto.OpenProblemsPanelRequest.class,
      responseType = bot.cline.host.proto.OpenProblemsPanelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenProblemsPanelRequest,
      bot.cline.host.proto.OpenProblemsPanelResponse> getOpenProblemsPanelMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenProblemsPanelRequest, bot.cline.host.proto.OpenProblemsPanelResponse> getOpenProblemsPanelMethod;
    if ((getOpenProblemsPanelMethod = WorkspaceServiceGrpc.getOpenProblemsPanelMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getOpenProblemsPanelMethod = WorkspaceServiceGrpc.getOpenProblemsPanelMethod) == null) {
          WorkspaceServiceGrpc.getOpenProblemsPanelMethod = getOpenProblemsPanelMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenProblemsPanelRequest, bot.cline.host.proto.OpenProblemsPanelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openProblemsPanel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenProblemsPanelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenProblemsPanelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("openProblemsPanel"))
              .build();
        }
      }
    }
    return getOpenProblemsPanelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenInFileExplorerPanelRequest,
      bot.cline.host.proto.OpenInFileExplorerPanelResponse> getOpenInFileExplorerPanelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openInFileExplorerPanel",
      requestType = bot.cline.host.proto.OpenInFileExplorerPanelRequest.class,
      responseType = bot.cline.host.proto.OpenInFileExplorerPanelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenInFileExplorerPanelRequest,
      bot.cline.host.proto.OpenInFileExplorerPanelResponse> getOpenInFileExplorerPanelMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenInFileExplorerPanelRequest, bot.cline.host.proto.OpenInFileExplorerPanelResponse> getOpenInFileExplorerPanelMethod;
    if ((getOpenInFileExplorerPanelMethod = WorkspaceServiceGrpc.getOpenInFileExplorerPanelMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getOpenInFileExplorerPanelMethod = WorkspaceServiceGrpc.getOpenInFileExplorerPanelMethod) == null) {
          WorkspaceServiceGrpc.getOpenInFileExplorerPanelMethod = getOpenInFileExplorerPanelMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenInFileExplorerPanelRequest, bot.cline.host.proto.OpenInFileExplorerPanelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openInFileExplorerPanel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenInFileExplorerPanelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenInFileExplorerPanelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("openInFileExplorerPanel"))
              .build();
        }
      }
    }
    return getOpenInFileExplorerPanelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenClineSidebarPanelRequest,
      bot.cline.host.proto.OpenClineSidebarPanelResponse> getOpenClineSidebarPanelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openClineSidebarPanel",
      requestType = bot.cline.host.proto.OpenClineSidebarPanelRequest.class,
      responseType = bot.cline.host.proto.OpenClineSidebarPanelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenClineSidebarPanelRequest,
      bot.cline.host.proto.OpenClineSidebarPanelResponse> getOpenClineSidebarPanelMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenClineSidebarPanelRequest, bot.cline.host.proto.OpenClineSidebarPanelResponse> getOpenClineSidebarPanelMethod;
    if ((getOpenClineSidebarPanelMethod = WorkspaceServiceGrpc.getOpenClineSidebarPanelMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getOpenClineSidebarPanelMethod = WorkspaceServiceGrpc.getOpenClineSidebarPanelMethod) == null) {
          WorkspaceServiceGrpc.getOpenClineSidebarPanelMethod = getOpenClineSidebarPanelMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenClineSidebarPanelRequest, bot.cline.host.proto.OpenClineSidebarPanelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openClineSidebarPanel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenClineSidebarPanelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenClineSidebarPanelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("openClineSidebarPanel"))
              .build();
        }
      }
    }
    return getOpenClineSidebarPanelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenTerminalRequest,
      bot.cline.host.proto.OpenTerminalResponse> getOpenTerminalPanelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openTerminalPanel",
      requestType = bot.cline.host.proto.OpenTerminalRequest.class,
      responseType = bot.cline.host.proto.OpenTerminalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenTerminalRequest,
      bot.cline.host.proto.OpenTerminalResponse> getOpenTerminalPanelMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenTerminalRequest, bot.cline.host.proto.OpenTerminalResponse> getOpenTerminalPanelMethod;
    if ((getOpenTerminalPanelMethod = WorkspaceServiceGrpc.getOpenTerminalPanelMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getOpenTerminalPanelMethod = WorkspaceServiceGrpc.getOpenTerminalPanelMethod) == null) {
          WorkspaceServiceGrpc.getOpenTerminalPanelMethod = getOpenTerminalPanelMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenTerminalRequest, bot.cline.host.proto.OpenTerminalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openTerminalPanel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenTerminalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenTerminalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("openTerminalPanel"))
              .build();
        }
      }
    }
    return getOpenTerminalPanelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ExecuteCommandInTerminalRequest,
      bot.cline.host.proto.ExecuteCommandInTerminalResponse> getExecuteCommandInTerminalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "executeCommandInTerminal",
      requestType = bot.cline.host.proto.ExecuteCommandInTerminalRequest.class,
      responseType = bot.cline.host.proto.ExecuteCommandInTerminalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ExecuteCommandInTerminalRequest,
      bot.cline.host.proto.ExecuteCommandInTerminalResponse> getExecuteCommandInTerminalMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ExecuteCommandInTerminalRequest, bot.cline.host.proto.ExecuteCommandInTerminalResponse> getExecuteCommandInTerminalMethod;
    if ((getExecuteCommandInTerminalMethod = WorkspaceServiceGrpc.getExecuteCommandInTerminalMethod) == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        if ((getExecuteCommandInTerminalMethod = WorkspaceServiceGrpc.getExecuteCommandInTerminalMethod) == null) {
          WorkspaceServiceGrpc.getExecuteCommandInTerminalMethod = getExecuteCommandInTerminalMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ExecuteCommandInTerminalRequest, bot.cline.host.proto.ExecuteCommandInTerminalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "executeCommandInTerminal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ExecuteCommandInTerminalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ExecuteCommandInTerminalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceServiceMethodDescriptorSupplier("executeCommandInTerminal"))
              .build();
        }
      }
    }
    return getExecuteCommandInTerminalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkspaceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceStub>() {
        @java.lang.Override
        public WorkspaceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceStub(channel, callOptions);
        }
      };
    return WorkspaceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkspaceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceBlockingStub>() {
        @java.lang.Override
        public WorkspaceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkspaceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkspaceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceServiceFutureStub>() {
        @java.lang.Override
        public WorkspaceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceServiceFutureStub(channel, callOptions);
        }
      };
    return WorkspaceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides methods for working with workspaces/projects.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Returns a list of the top level directories of the workspace.
     * </pre>
     */
    default void getWorkspacePaths(bot.cline.host.proto.GetWorkspacePathsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetWorkspacePathsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetWorkspacePathsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Saves an open document if it's open in the editor and has unsaved changes.
     * Returns true if the document was saved, returns false if the document was not found, or did not
     * need to be saved.
     * </pre>
     */
    default void saveOpenDocumentIfDirty(bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveOpenDocumentIfDirtyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get diagnostics from the workspace.
     * </pre>
     */
    default void getDiagnostics(bot.cline.host.proto.GetDiagnosticsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDiagnosticsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDiagnosticsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Makes the problems panel/pane visible in the IDE and focuses it.
     * </pre>
     */
    default void openProblemsPanel(bot.cline.host.proto.OpenProblemsPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenProblemsPanelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenProblemsPanelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens the IDE file explorer panel and selects a file or directory.
     * </pre>
     */
    default void openInFileExplorerPanel(bot.cline.host.proto.OpenInFileExplorerPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenInFileExplorerPanelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenInFileExplorerPanelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens and focuses the Cline sidebar panel in the host IDE.
     * </pre>
     */
    default void openClineSidebarPanel(bot.cline.host.proto.OpenClineSidebarPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenClineSidebarPanelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenClineSidebarPanelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens and focuses the terminal panel.
     * </pre>
     */
    default void openTerminalPanel(bot.cline.host.proto.OpenTerminalRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenTerminalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenTerminalPanelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Executes a command in a new terminal
     * </pre>
     */
    default void executeCommandInTerminal(bot.cline.host.proto.ExecuteCommandInTerminalRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ExecuteCommandInTerminalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteCommandInTerminalMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkspaceService.
   * <pre>
   * Provides methods for working with workspaces/projects.
   * </pre>
   */
  public static abstract class WorkspaceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkspaceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkspaceService.
   * <pre>
   * Provides methods for working with workspaces/projects.
   * </pre>
   */
  public static final class WorkspaceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkspaceServiceStub> {
    private WorkspaceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of the top level directories of the workspace.
     * </pre>
     */
    public void getWorkspacePaths(bot.cline.host.proto.GetWorkspacePathsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetWorkspacePathsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetWorkspacePathsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Saves an open document if it's open in the editor and has unsaved changes.
     * Returns true if the document was saved, returns false if the document was not found, or did not
     * need to be saved.
     * </pre>
     */
    public void saveOpenDocumentIfDirty(bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveOpenDocumentIfDirtyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get diagnostics from the workspace.
     * </pre>
     */
    public void getDiagnostics(bot.cline.host.proto.GetDiagnosticsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDiagnosticsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Makes the problems panel/pane visible in the IDE and focuses it.
     * </pre>
     */
    public void openProblemsPanel(bot.cline.host.proto.OpenProblemsPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenProblemsPanelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenProblemsPanelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens the IDE file explorer panel and selects a file or directory.
     * </pre>
     */
    public void openInFileExplorerPanel(bot.cline.host.proto.OpenInFileExplorerPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenInFileExplorerPanelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenInFileExplorerPanelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens and focuses the Cline sidebar panel in the host IDE.
     * </pre>
     */
    public void openClineSidebarPanel(bot.cline.host.proto.OpenClineSidebarPanelRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenClineSidebarPanelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenClineSidebarPanelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens and focuses the terminal panel.
     * </pre>
     */
    public void openTerminalPanel(bot.cline.host.proto.OpenTerminalRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenTerminalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenTerminalPanelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Executes a command in a new terminal
     * </pre>
     */
    public void executeCommandInTerminal(bot.cline.host.proto.ExecuteCommandInTerminalRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ExecuteCommandInTerminalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteCommandInTerminalMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkspaceService.
   * <pre>
   * Provides methods for working with workspaces/projects.
   * </pre>
   */
  public static final class WorkspaceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkspaceServiceBlockingStub> {
    private WorkspaceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of the top level directories of the workspace.
     * </pre>
     */
    public bot.cline.host.proto.GetWorkspacePathsResponse getWorkspacePaths(bot.cline.host.proto.GetWorkspacePathsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetWorkspacePathsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Saves an open document if it's open in the editor and has unsaved changes.
     * Returns true if the document was saved, returns false if the document was not found, or did not
     * need to be saved.
     * </pre>
     */
    public bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse saveOpenDocumentIfDirty(bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveOpenDocumentIfDirtyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get diagnostics from the workspace.
     * </pre>
     */
    public bot.cline.host.proto.GetDiagnosticsResponse getDiagnostics(bot.cline.host.proto.GetDiagnosticsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDiagnosticsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Makes the problems panel/pane visible in the IDE and focuses it.
     * </pre>
     */
    public bot.cline.host.proto.OpenProblemsPanelResponse openProblemsPanel(bot.cline.host.proto.OpenProblemsPanelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenProblemsPanelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens the IDE file explorer panel and selects a file or directory.
     * </pre>
     */
    public bot.cline.host.proto.OpenInFileExplorerPanelResponse openInFileExplorerPanel(bot.cline.host.proto.OpenInFileExplorerPanelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenInFileExplorerPanelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens and focuses the Cline sidebar panel in the host IDE.
     * </pre>
     */
    public bot.cline.host.proto.OpenClineSidebarPanelResponse openClineSidebarPanel(bot.cline.host.proto.OpenClineSidebarPanelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenClineSidebarPanelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens and focuses the terminal panel.
     * </pre>
     */
    public bot.cline.host.proto.OpenTerminalResponse openTerminalPanel(bot.cline.host.proto.OpenTerminalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenTerminalPanelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Executes a command in a new terminal
     * </pre>
     */
    public bot.cline.host.proto.ExecuteCommandInTerminalResponse executeCommandInTerminal(bot.cline.host.proto.ExecuteCommandInTerminalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteCommandInTerminalMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkspaceService.
   * <pre>
   * Provides methods for working with workspaces/projects.
   * </pre>
   */
  public static final class WorkspaceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkspaceServiceFutureStub> {
    private WorkspaceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns a list of the top level directories of the workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetWorkspacePathsResponse> getWorkspacePaths(
        bot.cline.host.proto.GetWorkspacePathsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetWorkspacePathsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Saves an open document if it's open in the editor and has unsaved changes.
     * Returns true if the document was saved, returns false if the document was not found, or did not
     * need to be saved.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse> saveOpenDocumentIfDirty(
        bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveOpenDocumentIfDirtyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get diagnostics from the workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetDiagnosticsResponse> getDiagnostics(
        bot.cline.host.proto.GetDiagnosticsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDiagnosticsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Makes the problems panel/pane visible in the IDE and focuses it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenProblemsPanelResponse> openProblemsPanel(
        bot.cline.host.proto.OpenProblemsPanelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenProblemsPanelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens the IDE file explorer panel and selects a file or directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenInFileExplorerPanelResponse> openInFileExplorerPanel(
        bot.cline.host.proto.OpenInFileExplorerPanelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenInFileExplorerPanelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens and focuses the Cline sidebar panel in the host IDE.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenClineSidebarPanelResponse> openClineSidebarPanel(
        bot.cline.host.proto.OpenClineSidebarPanelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenClineSidebarPanelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens and focuses the terminal panel.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenTerminalResponse> openTerminalPanel(
        bot.cline.host.proto.OpenTerminalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenTerminalPanelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Executes a command in a new terminal
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.ExecuteCommandInTerminalResponse> executeCommandInTerminal(
        bot.cline.host.proto.ExecuteCommandInTerminalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteCommandInTerminalMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WORKSPACE_PATHS = 0;
  private static final int METHODID_SAVE_OPEN_DOCUMENT_IF_DIRTY = 1;
  private static final int METHODID_GET_DIAGNOSTICS = 2;
  private static final int METHODID_OPEN_PROBLEMS_PANEL = 3;
  private static final int METHODID_OPEN_IN_FILE_EXPLORER_PANEL = 4;
  private static final int METHODID_OPEN_CLINE_SIDEBAR_PANEL = 5;
  private static final int METHODID_OPEN_TERMINAL_PANEL = 6;
  private static final int METHODID_EXECUTE_COMMAND_IN_TERMINAL = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WORKSPACE_PATHS:
          serviceImpl.getWorkspacePaths((bot.cline.host.proto.GetWorkspacePathsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetWorkspacePathsResponse>) responseObserver);
          break;
        case METHODID_SAVE_OPEN_DOCUMENT_IF_DIRTY:
          serviceImpl.saveOpenDocumentIfDirty((bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse>) responseObserver);
          break;
        case METHODID_GET_DIAGNOSTICS:
          serviceImpl.getDiagnostics((bot.cline.host.proto.GetDiagnosticsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDiagnosticsResponse>) responseObserver);
          break;
        case METHODID_OPEN_PROBLEMS_PANEL:
          serviceImpl.openProblemsPanel((bot.cline.host.proto.OpenProblemsPanelRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenProblemsPanelResponse>) responseObserver);
          break;
        case METHODID_OPEN_IN_FILE_EXPLORER_PANEL:
          serviceImpl.openInFileExplorerPanel((bot.cline.host.proto.OpenInFileExplorerPanelRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenInFileExplorerPanelResponse>) responseObserver);
          break;
        case METHODID_OPEN_CLINE_SIDEBAR_PANEL:
          serviceImpl.openClineSidebarPanel((bot.cline.host.proto.OpenClineSidebarPanelRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenClineSidebarPanelResponse>) responseObserver);
          break;
        case METHODID_OPEN_TERMINAL_PANEL:
          serviceImpl.openTerminalPanel((bot.cline.host.proto.OpenTerminalRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenTerminalResponse>) responseObserver);
          break;
        case METHODID_EXECUTE_COMMAND_IN_TERMINAL:
          serviceImpl.executeCommandInTerminal((bot.cline.host.proto.ExecuteCommandInTerminalRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.ExecuteCommandInTerminalResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetWorkspacePathsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetWorkspacePathsRequest,
              bot.cline.host.proto.GetWorkspacePathsResponse>(
                service, METHODID_GET_WORKSPACE_PATHS)))
        .addMethod(
          getSaveOpenDocumentIfDirtyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.SaveOpenDocumentIfDirtyRequest,
              bot.cline.host.proto.SaveOpenDocumentIfDirtyResponse>(
                service, METHODID_SAVE_OPEN_DOCUMENT_IF_DIRTY)))
        .addMethod(
          getGetDiagnosticsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetDiagnosticsRequest,
              bot.cline.host.proto.GetDiagnosticsResponse>(
                service, METHODID_GET_DIAGNOSTICS)))
        .addMethod(
          getOpenProblemsPanelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenProblemsPanelRequest,
              bot.cline.host.proto.OpenProblemsPanelResponse>(
                service, METHODID_OPEN_PROBLEMS_PANEL)))
        .addMethod(
          getOpenInFileExplorerPanelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenInFileExplorerPanelRequest,
              bot.cline.host.proto.OpenInFileExplorerPanelResponse>(
                service, METHODID_OPEN_IN_FILE_EXPLORER_PANEL)))
        .addMethod(
          getOpenClineSidebarPanelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenClineSidebarPanelRequest,
              bot.cline.host.proto.OpenClineSidebarPanelResponse>(
                service, METHODID_OPEN_CLINE_SIDEBAR_PANEL)))
        .addMethod(
          getOpenTerminalPanelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenTerminalRequest,
              bot.cline.host.proto.OpenTerminalResponse>(
                service, METHODID_OPEN_TERMINAL_PANEL)))
        .addMethod(
          getExecuteCommandInTerminalMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ExecuteCommandInTerminalRequest,
              bot.cline.host.proto.ExecuteCommandInTerminalResponse>(
                service, METHODID_EXECUTE_COMMAND_IN_TERMINAL)))
        .build();
  }

  private static abstract class WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkspaceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bot.cline.host.proto.Workspace.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkspaceService");
    }
  }

  private static final class WorkspaceServiceFileDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier {
    WorkspaceServiceFileDescriptorSupplier() {}
  }

  private static final class WorkspaceServiceMethodDescriptorSupplier
      extends WorkspaceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WorkspaceServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WorkspaceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkspaceServiceFileDescriptorSupplier())
              .addMethod(getGetWorkspacePathsMethod())
              .addMethod(getSaveOpenDocumentIfDirtyMethod())
              .addMethod(getGetDiagnosticsMethod())
              .addMethod(getOpenProblemsPanelMethod())
              .addMethod(getOpenInFileExplorerPanelMethod())
              .addMethod(getOpenClineSidebarPanelMethod())
              .addMethod(getOpenTerminalPanelMethod())
              .addMethod(getExecuteCommandInTerminalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
