package bot.cline.host.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides methods for working with IDE windows and editors.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: host/window.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WindowServiceGrpc {

  private WindowServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "host.WindowService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ShowTextDocumentRequest,
      bot.cline.host.proto.TextEditorInfo> getShowTextDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showTextDocument",
      requestType = bot.cline.host.proto.ShowTextDocumentRequest.class,
      responseType = bot.cline.host.proto.TextEditorInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ShowTextDocumentRequest,
      bot.cline.host.proto.TextEditorInfo> getShowTextDocumentMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ShowTextDocumentRequest, bot.cline.host.proto.TextEditorInfo> getShowTextDocumentMethod;
    if ((getShowTextDocumentMethod = WindowServiceGrpc.getShowTextDocumentMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getShowTextDocumentMethod = WindowServiceGrpc.getShowTextDocumentMethod) == null) {
          WindowServiceGrpc.getShowTextDocumentMethod = getShowTextDocumentMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ShowTextDocumentRequest, bot.cline.host.proto.TextEditorInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showTextDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowTextDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.TextEditorInfo.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("showTextDocument"))
              .build();
        }
      }
    }
    return getShowTextDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ShowOpenDialogueRequest,
      bot.cline.host.proto.SelectedResources> getShowOpenDialogueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showOpenDialogue",
      requestType = bot.cline.host.proto.ShowOpenDialogueRequest.class,
      responseType = bot.cline.host.proto.SelectedResources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ShowOpenDialogueRequest,
      bot.cline.host.proto.SelectedResources> getShowOpenDialogueMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ShowOpenDialogueRequest, bot.cline.host.proto.SelectedResources> getShowOpenDialogueMethod;
    if ((getShowOpenDialogueMethod = WindowServiceGrpc.getShowOpenDialogueMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getShowOpenDialogueMethod = WindowServiceGrpc.getShowOpenDialogueMethod) == null) {
          WindowServiceGrpc.getShowOpenDialogueMethod = getShowOpenDialogueMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ShowOpenDialogueRequest, bot.cline.host.proto.SelectedResources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showOpenDialogue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowOpenDialogueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SelectedResources.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("showOpenDialogue"))
              .build();
        }
      }
    }
    return getShowOpenDialogueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ShowMessageRequest,
      bot.cline.host.proto.SelectedResponse> getShowMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showMessage",
      requestType = bot.cline.host.proto.ShowMessageRequest.class,
      responseType = bot.cline.host.proto.SelectedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ShowMessageRequest,
      bot.cline.host.proto.SelectedResponse> getShowMessageMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ShowMessageRequest, bot.cline.host.proto.SelectedResponse> getShowMessageMethod;
    if ((getShowMessageMethod = WindowServiceGrpc.getShowMessageMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getShowMessageMethod = WindowServiceGrpc.getShowMessageMethod) == null) {
          WindowServiceGrpc.getShowMessageMethod = getShowMessageMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ShowMessageRequest, bot.cline.host.proto.SelectedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SelectedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("showMessage"))
              .build();
        }
      }
    }
    return getShowMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ShowInputBoxRequest,
      bot.cline.host.proto.ShowInputBoxResponse> getShowInputBoxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showInputBox",
      requestType = bot.cline.host.proto.ShowInputBoxRequest.class,
      responseType = bot.cline.host.proto.ShowInputBoxResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ShowInputBoxRequest,
      bot.cline.host.proto.ShowInputBoxResponse> getShowInputBoxMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ShowInputBoxRequest, bot.cline.host.proto.ShowInputBoxResponse> getShowInputBoxMethod;
    if ((getShowInputBoxMethod = WindowServiceGrpc.getShowInputBoxMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getShowInputBoxMethod = WindowServiceGrpc.getShowInputBoxMethod) == null) {
          WindowServiceGrpc.getShowInputBoxMethod = getShowInputBoxMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ShowInputBoxRequest, bot.cline.host.proto.ShowInputBoxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showInputBox"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowInputBoxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowInputBoxResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("showInputBox"))
              .build();
        }
      }
    }
    return getShowInputBoxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ShowSaveDialogRequest,
      bot.cline.host.proto.ShowSaveDialogResponse> getShowSaveDialogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "showSaveDialog",
      requestType = bot.cline.host.proto.ShowSaveDialogRequest.class,
      responseType = bot.cline.host.proto.ShowSaveDialogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ShowSaveDialogRequest,
      bot.cline.host.proto.ShowSaveDialogResponse> getShowSaveDialogMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ShowSaveDialogRequest, bot.cline.host.proto.ShowSaveDialogResponse> getShowSaveDialogMethod;
    if ((getShowSaveDialogMethod = WindowServiceGrpc.getShowSaveDialogMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getShowSaveDialogMethod = WindowServiceGrpc.getShowSaveDialogMethod) == null) {
          WindowServiceGrpc.getShowSaveDialogMethod = getShowSaveDialogMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ShowSaveDialogRequest, bot.cline.host.proto.ShowSaveDialogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "showSaveDialog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowSaveDialogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ShowSaveDialogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("showSaveDialog"))
              .build();
        }
      }
    }
    return getShowSaveDialogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenFileRequest,
      bot.cline.host.proto.OpenFileResponse> getOpenFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openFile",
      requestType = bot.cline.host.proto.OpenFileRequest.class,
      responseType = bot.cline.host.proto.OpenFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenFileRequest,
      bot.cline.host.proto.OpenFileResponse> getOpenFileMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenFileRequest, bot.cline.host.proto.OpenFileResponse> getOpenFileMethod;
    if ((getOpenFileMethod = WindowServiceGrpc.getOpenFileMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getOpenFileMethod = WindowServiceGrpc.getOpenFileMethod) == null) {
          WindowServiceGrpc.getOpenFileMethod = getOpenFileMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenFileRequest, bot.cline.host.proto.OpenFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("openFile"))
              .build();
        }
      }
    }
    return getOpenFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenSettingsRequest,
      bot.cline.host.proto.OpenSettingsResponse> getOpenSettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openSettings",
      requestType = bot.cline.host.proto.OpenSettingsRequest.class,
      responseType = bot.cline.host.proto.OpenSettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenSettingsRequest,
      bot.cline.host.proto.OpenSettingsResponse> getOpenSettingsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenSettingsRequest, bot.cline.host.proto.OpenSettingsResponse> getOpenSettingsMethod;
    if ((getOpenSettingsMethod = WindowServiceGrpc.getOpenSettingsMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getOpenSettingsMethod = WindowServiceGrpc.getOpenSettingsMethod) == null) {
          WindowServiceGrpc.getOpenSettingsMethod = getOpenSettingsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenSettingsRequest, bot.cline.host.proto.OpenSettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openSettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenSettingsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenSettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("openSettings"))
              .build();
        }
      }
    }
    return getOpenSettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetOpenTabsRequest,
      bot.cline.host.proto.GetOpenTabsResponse> getGetOpenTabsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getOpenTabs",
      requestType = bot.cline.host.proto.GetOpenTabsRequest.class,
      responseType = bot.cline.host.proto.GetOpenTabsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetOpenTabsRequest,
      bot.cline.host.proto.GetOpenTabsResponse> getGetOpenTabsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetOpenTabsRequest, bot.cline.host.proto.GetOpenTabsResponse> getGetOpenTabsMethod;
    if ((getGetOpenTabsMethod = WindowServiceGrpc.getGetOpenTabsMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getGetOpenTabsMethod = WindowServiceGrpc.getGetOpenTabsMethod) == null) {
          WindowServiceGrpc.getGetOpenTabsMethod = getGetOpenTabsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetOpenTabsRequest, bot.cline.host.proto.GetOpenTabsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getOpenTabs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetOpenTabsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetOpenTabsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("getOpenTabs"))
              .build();
        }
      }
    }
    return getGetOpenTabsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetVisibleTabsRequest,
      bot.cline.host.proto.GetVisibleTabsResponse> getGetVisibleTabsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVisibleTabs",
      requestType = bot.cline.host.proto.GetVisibleTabsRequest.class,
      responseType = bot.cline.host.proto.GetVisibleTabsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetVisibleTabsRequest,
      bot.cline.host.proto.GetVisibleTabsResponse> getGetVisibleTabsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetVisibleTabsRequest, bot.cline.host.proto.GetVisibleTabsResponse> getGetVisibleTabsMethod;
    if ((getGetVisibleTabsMethod = WindowServiceGrpc.getGetVisibleTabsMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getGetVisibleTabsMethod = WindowServiceGrpc.getGetVisibleTabsMethod) == null) {
          WindowServiceGrpc.getGetVisibleTabsMethod = getGetVisibleTabsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetVisibleTabsRequest, bot.cline.host.proto.GetVisibleTabsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getVisibleTabs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetVisibleTabsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetVisibleTabsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("getVisibleTabs"))
              .build();
        }
      }
    }
    return getGetVisibleTabsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetActiveEditorRequest,
      bot.cline.host.proto.GetActiveEditorResponse> getGetActiveEditorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getActiveEditor",
      requestType = bot.cline.host.proto.GetActiveEditorRequest.class,
      responseType = bot.cline.host.proto.GetActiveEditorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetActiveEditorRequest,
      bot.cline.host.proto.GetActiveEditorResponse> getGetActiveEditorMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetActiveEditorRequest, bot.cline.host.proto.GetActiveEditorResponse> getGetActiveEditorMethod;
    if ((getGetActiveEditorMethod = WindowServiceGrpc.getGetActiveEditorMethod) == null) {
      synchronized (WindowServiceGrpc.class) {
        if ((getGetActiveEditorMethod = WindowServiceGrpc.getGetActiveEditorMethod) == null) {
          WindowServiceGrpc.getGetActiveEditorMethod = getGetActiveEditorMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetActiveEditorRequest, bot.cline.host.proto.GetActiveEditorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getActiveEditor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetActiveEditorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetActiveEditorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WindowServiceMethodDescriptorSupplier("getActiveEditor"))
              .build();
        }
      }
    }
    return getGetActiveEditorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WindowServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceStub>() {
        @java.lang.Override
        public WindowServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceStub(channel, callOptions);
        }
      };
    return WindowServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WindowServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceBlockingStub>() {
        @java.lang.Override
        public WindowServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceBlockingStub(channel, callOptions);
        }
      };
    return WindowServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WindowServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WindowServiceFutureStub>() {
        @java.lang.Override
        public WindowServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WindowServiceFutureStub(channel, callOptions);
        }
      };
    return WindowServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides methods for working with IDE windows and editors.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Opens a text document in the IDE editor and returns editor information.
     * </pre>
     */
    default void showTextDocument(bot.cline.host.proto.ShowTextDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TextEditorInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowTextDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shows the open file dialogue / file picker.
     * </pre>
     */
    default void showOpenDialogue(bot.cline.host.proto.ShowOpenDialogueRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResources> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowOpenDialogueMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shows a notification.
     * </pre>
     */
    default void showMessage(bot.cline.host.proto.ShowMessageRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowMessageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Prompts the user for input and returns the response.
     * </pre>
     */
    default void showInputBox(bot.cline.host.proto.ShowInputBoxRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowInputBoxResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowInputBoxMethod(), responseObserver);
    }

    /**
     * <pre>
     * Shows the file save dialogue / file picker.
     * </pre>
     */
    default void showSaveDialog(bot.cline.host.proto.ShowSaveDialogRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowSaveDialogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShowSaveDialogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens a file in the IDE.
     * </pre>
     */
    default void openFile(bot.cline.host.proto.OpenFileRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Opens the host settings UI, optionally focusing a specific query/section.
     * </pre>
     */
    default void openSettings(bot.cline.host.proto.OpenSettingsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenSettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenSettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the open tabs.
     * </pre>
     */
    default void getOpenTabs(bot.cline.host.proto.GetOpenTabsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetOpenTabsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOpenTabsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the visible tabs.
     * </pre>
     */
    default void getVisibleTabs(bot.cline.host.proto.GetVisibleTabsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetVisibleTabsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVisibleTabsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns information about the current editor
     * </pre>
     */
    default void getActiveEditor(bot.cline.host.proto.GetActiveEditorRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetActiveEditorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetActiveEditorMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WindowService.
   * <pre>
   * Provides methods for working with IDE windows and editors.
   * </pre>
   */
  public static abstract class WindowServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WindowServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WindowService.
   * <pre>
   * Provides methods for working with IDE windows and editors.
   * </pre>
   */
  public static final class WindowServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WindowServiceStub> {
    private WindowServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a text document in the IDE editor and returns editor information.
     * </pre>
     */
    public void showTextDocument(bot.cline.host.proto.ShowTextDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TextEditorInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowTextDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shows the open file dialogue / file picker.
     * </pre>
     */
    public void showOpenDialogue(bot.cline.host.proto.ShowOpenDialogueRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResources> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowOpenDialogueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shows a notification.
     * </pre>
     */
    public void showMessage(bot.cline.host.proto.ShowMessageRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Prompts the user for input and returns the response.
     * </pre>
     */
    public void showInputBox(bot.cline.host.proto.ShowInputBoxRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowInputBoxResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowInputBoxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Shows the file save dialogue / file picker.
     * </pre>
     */
    public void showSaveDialog(bot.cline.host.proto.ShowSaveDialogRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowSaveDialogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShowSaveDialogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens a file in the IDE.
     * </pre>
     */
    public void openFile(bot.cline.host.proto.OpenFileRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Opens the host settings UI, optionally focusing a specific query/section.
     * </pre>
     */
    public void openSettings(bot.cline.host.proto.OpenSettingsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenSettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenSettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the open tabs.
     * </pre>
     */
    public void getOpenTabs(bot.cline.host.proto.GetOpenTabsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetOpenTabsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOpenTabsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the visible tabs.
     * </pre>
     */
    public void getVisibleTabs(bot.cline.host.proto.GetVisibleTabsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetVisibleTabsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVisibleTabsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns information about the current editor
     * </pre>
     */
    public void getActiveEditor(bot.cline.host.proto.GetActiveEditorRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetActiveEditorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetActiveEditorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WindowService.
   * <pre>
   * Provides methods for working with IDE windows and editors.
   * </pre>
   */
  public static final class WindowServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WindowServiceBlockingStub> {
    private WindowServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a text document in the IDE editor and returns editor information.
     * </pre>
     */
    public bot.cline.host.proto.TextEditorInfo showTextDocument(bot.cline.host.proto.ShowTextDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowTextDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shows the open file dialogue / file picker.
     * </pre>
     */
    public bot.cline.host.proto.SelectedResources showOpenDialogue(bot.cline.host.proto.ShowOpenDialogueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowOpenDialogueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shows a notification.
     * </pre>
     */
    public bot.cline.host.proto.SelectedResponse showMessage(bot.cline.host.proto.ShowMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowMessageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Prompts the user for input and returns the response.
     * </pre>
     */
    public bot.cline.host.proto.ShowInputBoxResponse showInputBox(bot.cline.host.proto.ShowInputBoxRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowInputBoxMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Shows the file save dialogue / file picker.
     * </pre>
     */
    public bot.cline.host.proto.ShowSaveDialogResponse showSaveDialog(bot.cline.host.proto.ShowSaveDialogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShowSaveDialogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens a file in the IDE.
     * </pre>
     */
    public bot.cline.host.proto.OpenFileResponse openFile(bot.cline.host.proto.OpenFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Opens the host settings UI, optionally focusing a specific query/section.
     * </pre>
     */
    public bot.cline.host.proto.OpenSettingsResponse openSettings(bot.cline.host.proto.OpenSettingsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenSettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the open tabs.
     * </pre>
     */
    public bot.cline.host.proto.GetOpenTabsResponse getOpenTabs(bot.cline.host.proto.GetOpenTabsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOpenTabsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the visible tabs.
     * </pre>
     */
    public bot.cline.host.proto.GetVisibleTabsResponse getVisibleTabs(bot.cline.host.proto.GetVisibleTabsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVisibleTabsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns information about the current editor
     * </pre>
     */
    public bot.cline.host.proto.GetActiveEditorResponse getActiveEditor(bot.cline.host.proto.GetActiveEditorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetActiveEditorMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WindowService.
   * <pre>
   * Provides methods for working with IDE windows and editors.
   * </pre>
   */
  public static final class WindowServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WindowServiceFutureStub> {
    private WindowServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WindowServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WindowServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Opens a text document in the IDE editor and returns editor information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.TextEditorInfo> showTextDocument(
        bot.cline.host.proto.ShowTextDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowTextDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shows the open file dialogue / file picker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.SelectedResources> showOpenDialogue(
        bot.cline.host.proto.ShowOpenDialogueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowOpenDialogueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shows a notification.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.SelectedResponse> showMessage(
        bot.cline.host.proto.ShowMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowMessageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Prompts the user for input and returns the response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.ShowInputBoxResponse> showInputBox(
        bot.cline.host.proto.ShowInputBoxRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowInputBoxMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Shows the file save dialogue / file picker.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.ShowSaveDialogResponse> showSaveDialog(
        bot.cline.host.proto.ShowSaveDialogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShowSaveDialogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens a file in the IDE.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenFileResponse> openFile(
        bot.cline.host.proto.OpenFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Opens the host settings UI, optionally focusing a specific query/section.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenSettingsResponse> openSettings(
        bot.cline.host.proto.OpenSettingsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenSettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the open tabs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetOpenTabsResponse> getOpenTabs(
        bot.cline.host.proto.GetOpenTabsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOpenTabsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the visible tabs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetVisibleTabsResponse> getVisibleTabs(
        bot.cline.host.proto.GetVisibleTabsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVisibleTabsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns information about the current editor
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetActiveEditorResponse> getActiveEditor(
        bot.cline.host.proto.GetActiveEditorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetActiveEditorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SHOW_TEXT_DOCUMENT = 0;
  private static final int METHODID_SHOW_OPEN_DIALOGUE = 1;
  private static final int METHODID_SHOW_MESSAGE = 2;
  private static final int METHODID_SHOW_INPUT_BOX = 3;
  private static final int METHODID_SHOW_SAVE_DIALOG = 4;
  private static final int METHODID_OPEN_FILE = 5;
  private static final int METHODID_OPEN_SETTINGS = 6;
  private static final int METHODID_GET_OPEN_TABS = 7;
  private static final int METHODID_GET_VISIBLE_TABS = 8;
  private static final int METHODID_GET_ACTIVE_EDITOR = 9;

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
        case METHODID_SHOW_TEXT_DOCUMENT:
          serviceImpl.showTextDocument((bot.cline.host.proto.ShowTextDocumentRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.TextEditorInfo>) responseObserver);
          break;
        case METHODID_SHOW_OPEN_DIALOGUE:
          serviceImpl.showOpenDialogue((bot.cline.host.proto.ShowOpenDialogueRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResources>) responseObserver);
          break;
        case METHODID_SHOW_MESSAGE:
          serviceImpl.showMessage((bot.cline.host.proto.ShowMessageRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.SelectedResponse>) responseObserver);
          break;
        case METHODID_SHOW_INPUT_BOX:
          serviceImpl.showInputBox((bot.cline.host.proto.ShowInputBoxRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowInputBoxResponse>) responseObserver);
          break;
        case METHODID_SHOW_SAVE_DIALOG:
          serviceImpl.showSaveDialog((bot.cline.host.proto.ShowSaveDialogRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.ShowSaveDialogResponse>) responseObserver);
          break;
        case METHODID_OPEN_FILE:
          serviceImpl.openFile((bot.cline.host.proto.OpenFileRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenFileResponse>) responseObserver);
          break;
        case METHODID_OPEN_SETTINGS:
          serviceImpl.openSettings((bot.cline.host.proto.OpenSettingsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenSettingsResponse>) responseObserver);
          break;
        case METHODID_GET_OPEN_TABS:
          serviceImpl.getOpenTabs((bot.cline.host.proto.GetOpenTabsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetOpenTabsResponse>) responseObserver);
          break;
        case METHODID_GET_VISIBLE_TABS:
          serviceImpl.getVisibleTabs((bot.cline.host.proto.GetVisibleTabsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetVisibleTabsResponse>) responseObserver);
          break;
        case METHODID_GET_ACTIVE_EDITOR:
          serviceImpl.getActiveEditor((bot.cline.host.proto.GetActiveEditorRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetActiveEditorResponse>) responseObserver);
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
          getShowTextDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ShowTextDocumentRequest,
              bot.cline.host.proto.TextEditorInfo>(
                service, METHODID_SHOW_TEXT_DOCUMENT)))
        .addMethod(
          getShowOpenDialogueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ShowOpenDialogueRequest,
              bot.cline.host.proto.SelectedResources>(
                service, METHODID_SHOW_OPEN_DIALOGUE)))
        .addMethod(
          getShowMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ShowMessageRequest,
              bot.cline.host.proto.SelectedResponse>(
                service, METHODID_SHOW_MESSAGE)))
        .addMethod(
          getShowInputBoxMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ShowInputBoxRequest,
              bot.cline.host.proto.ShowInputBoxResponse>(
                service, METHODID_SHOW_INPUT_BOX)))
        .addMethod(
          getShowSaveDialogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ShowSaveDialogRequest,
              bot.cline.host.proto.ShowSaveDialogResponse>(
                service, METHODID_SHOW_SAVE_DIALOG)))
        .addMethod(
          getOpenFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenFileRequest,
              bot.cline.host.proto.OpenFileResponse>(
                service, METHODID_OPEN_FILE)))
        .addMethod(
          getOpenSettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenSettingsRequest,
              bot.cline.host.proto.OpenSettingsResponse>(
                service, METHODID_OPEN_SETTINGS)))
        .addMethod(
          getGetOpenTabsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetOpenTabsRequest,
              bot.cline.host.proto.GetOpenTabsResponse>(
                service, METHODID_GET_OPEN_TABS)))
        .addMethod(
          getGetVisibleTabsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetVisibleTabsRequest,
              bot.cline.host.proto.GetVisibleTabsResponse>(
                service, METHODID_GET_VISIBLE_TABS)))
        .addMethod(
          getGetActiveEditorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetActiveEditorRequest,
              bot.cline.host.proto.GetActiveEditorResponse>(
                service, METHODID_GET_ACTIVE_EDITOR)))
        .build();
  }

  private static abstract class WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WindowServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bot.cline.host.proto.Window.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WindowService");
    }
  }

  private static final class WindowServiceFileDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier {
    WindowServiceFileDescriptorSupplier() {}
  }

  private static final class WindowServiceMethodDescriptorSupplier
      extends WindowServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WindowServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WindowServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WindowServiceFileDescriptorSupplier())
              .addMethod(getShowTextDocumentMethod())
              .addMethod(getShowOpenDialogueMethod())
              .addMethod(getShowMessageMethod())
              .addMethod(getShowInputBoxMethod())
              .addMethod(getShowSaveDialogMethod())
              .addMethod(getOpenFileMethod())
              .addMethod(getOpenSettingsMethod())
              .addMethod(getGetOpenTabsMethod())
              .addMethod(getGetVisibleTabsMethod())
              .addMethod(getGetActiveEditorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
