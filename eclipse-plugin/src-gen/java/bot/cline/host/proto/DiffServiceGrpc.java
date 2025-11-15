package bot.cline.host.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides methods for diff views.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: host/diff.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiffServiceGrpc {

  private DiffServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "host.DiffService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenDiffRequest,
      bot.cline.host.proto.OpenDiffResponse> getOpenDiffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openDiff",
      requestType = bot.cline.host.proto.OpenDiffRequest.class,
      responseType = bot.cline.host.proto.OpenDiffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenDiffRequest,
      bot.cline.host.proto.OpenDiffResponse> getOpenDiffMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenDiffRequest, bot.cline.host.proto.OpenDiffResponse> getOpenDiffMethod;
    if ((getOpenDiffMethod = DiffServiceGrpc.getOpenDiffMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getOpenDiffMethod = DiffServiceGrpc.getOpenDiffMethod) == null) {
          DiffServiceGrpc.getOpenDiffMethod = getOpenDiffMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenDiffRequest, bot.cline.host.proto.OpenDiffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openDiff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenDiffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenDiffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("openDiff"))
              .build();
        }
      }
    }
    return getOpenDiffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.GetDocumentTextRequest,
      bot.cline.host.proto.GetDocumentTextResponse> getGetDocumentTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDocumentText",
      requestType = bot.cline.host.proto.GetDocumentTextRequest.class,
      responseType = bot.cline.host.proto.GetDocumentTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.GetDocumentTextRequest,
      bot.cline.host.proto.GetDocumentTextResponse> getGetDocumentTextMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.GetDocumentTextRequest, bot.cline.host.proto.GetDocumentTextResponse> getGetDocumentTextMethod;
    if ((getGetDocumentTextMethod = DiffServiceGrpc.getGetDocumentTextMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getGetDocumentTextMethod = DiffServiceGrpc.getGetDocumentTextMethod) == null) {
          DiffServiceGrpc.getGetDocumentTextMethod = getGetDocumentTextMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.GetDocumentTextRequest, bot.cline.host.proto.GetDocumentTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDocumentText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetDocumentTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetDocumentTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("getDocumentText"))
              .build();
        }
      }
    }
    return getGetDocumentTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ReplaceTextRequest,
      bot.cline.host.proto.ReplaceTextResponse> getReplaceTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "replaceText",
      requestType = bot.cline.host.proto.ReplaceTextRequest.class,
      responseType = bot.cline.host.proto.ReplaceTextResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ReplaceTextRequest,
      bot.cline.host.proto.ReplaceTextResponse> getReplaceTextMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ReplaceTextRequest, bot.cline.host.proto.ReplaceTextResponse> getReplaceTextMethod;
    if ((getReplaceTextMethod = DiffServiceGrpc.getReplaceTextMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getReplaceTextMethod = DiffServiceGrpc.getReplaceTextMethod) == null) {
          DiffServiceGrpc.getReplaceTextMethod = getReplaceTextMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ReplaceTextRequest, bot.cline.host.proto.ReplaceTextResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "replaceText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ReplaceTextRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ReplaceTextResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("replaceText"))
              .build();
        }
      }
    }
    return getReplaceTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.ScrollDiffRequest,
      bot.cline.host.proto.ScrollDiffResponse> getScrollDiffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scrollDiff",
      requestType = bot.cline.host.proto.ScrollDiffRequest.class,
      responseType = bot.cline.host.proto.ScrollDiffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.ScrollDiffRequest,
      bot.cline.host.proto.ScrollDiffResponse> getScrollDiffMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.ScrollDiffRequest, bot.cline.host.proto.ScrollDiffResponse> getScrollDiffMethod;
    if ((getScrollDiffMethod = DiffServiceGrpc.getScrollDiffMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getScrollDiffMethod = DiffServiceGrpc.getScrollDiffMethod) == null) {
          DiffServiceGrpc.getScrollDiffMethod = getScrollDiffMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.ScrollDiffRequest, bot.cline.host.proto.ScrollDiffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "scrollDiff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ScrollDiffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.ScrollDiffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("scrollDiff"))
              .build();
        }
      }
    }
    return getScrollDiffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.TruncateDocumentRequest,
      bot.cline.host.proto.TruncateDocumentResponse> getTruncateDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "truncateDocument",
      requestType = bot.cline.host.proto.TruncateDocumentRequest.class,
      responseType = bot.cline.host.proto.TruncateDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.TruncateDocumentRequest,
      bot.cline.host.proto.TruncateDocumentResponse> getTruncateDocumentMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.TruncateDocumentRequest, bot.cline.host.proto.TruncateDocumentResponse> getTruncateDocumentMethod;
    if ((getTruncateDocumentMethod = DiffServiceGrpc.getTruncateDocumentMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getTruncateDocumentMethod = DiffServiceGrpc.getTruncateDocumentMethod) == null) {
          DiffServiceGrpc.getTruncateDocumentMethod = getTruncateDocumentMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.TruncateDocumentRequest, bot.cline.host.proto.TruncateDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "truncateDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.TruncateDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.TruncateDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("truncateDocument"))
              .build();
        }
      }
    }
    return getTruncateDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.SaveDocumentRequest,
      bot.cline.host.proto.SaveDocumentResponse> getSaveDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveDocument",
      requestType = bot.cline.host.proto.SaveDocumentRequest.class,
      responseType = bot.cline.host.proto.SaveDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.SaveDocumentRequest,
      bot.cline.host.proto.SaveDocumentResponse> getSaveDocumentMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.SaveDocumentRequest, bot.cline.host.proto.SaveDocumentResponse> getSaveDocumentMethod;
    if ((getSaveDocumentMethod = DiffServiceGrpc.getSaveDocumentMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getSaveDocumentMethod = DiffServiceGrpc.getSaveDocumentMethod) == null) {
          DiffServiceGrpc.getSaveDocumentMethod = getSaveDocumentMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.SaveDocumentRequest, bot.cline.host.proto.SaveDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SaveDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.SaveDocumentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("saveDocument"))
              .build();
        }
      }
    }
    return getSaveDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.CloseAllDiffsRequest,
      bot.cline.host.proto.CloseAllDiffsResponse> getCloseAllDiffsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "closeAllDiffs",
      requestType = bot.cline.host.proto.CloseAllDiffsRequest.class,
      responseType = bot.cline.host.proto.CloseAllDiffsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.CloseAllDiffsRequest,
      bot.cline.host.proto.CloseAllDiffsResponse> getCloseAllDiffsMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.CloseAllDiffsRequest, bot.cline.host.proto.CloseAllDiffsResponse> getCloseAllDiffsMethod;
    if ((getCloseAllDiffsMethod = DiffServiceGrpc.getCloseAllDiffsMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getCloseAllDiffsMethod = DiffServiceGrpc.getCloseAllDiffsMethod) == null) {
          DiffServiceGrpc.getCloseAllDiffsMethod = getCloseAllDiffsMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.CloseAllDiffsRequest, bot.cline.host.proto.CloseAllDiffsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "closeAllDiffs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.CloseAllDiffsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.CloseAllDiffsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("closeAllDiffs"))
              .build();
        }
      }
    }
    return getCloseAllDiffsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.host.proto.OpenMultiFileDiffRequest,
      bot.cline.host.proto.OpenMultiFileDiffResponse> getOpenMultiFileDiffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "openMultiFileDiff",
      requestType = bot.cline.host.proto.OpenMultiFileDiffRequest.class,
      responseType = bot.cline.host.proto.OpenMultiFileDiffResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.host.proto.OpenMultiFileDiffRequest,
      bot.cline.host.proto.OpenMultiFileDiffResponse> getOpenMultiFileDiffMethod() {
    io.grpc.MethodDescriptor<bot.cline.host.proto.OpenMultiFileDiffRequest, bot.cline.host.proto.OpenMultiFileDiffResponse> getOpenMultiFileDiffMethod;
    if ((getOpenMultiFileDiffMethod = DiffServiceGrpc.getOpenMultiFileDiffMethod) == null) {
      synchronized (DiffServiceGrpc.class) {
        if ((getOpenMultiFileDiffMethod = DiffServiceGrpc.getOpenMultiFileDiffMethod) == null) {
          DiffServiceGrpc.getOpenMultiFileDiffMethod = getOpenMultiFileDiffMethod =
              io.grpc.MethodDescriptor.<bot.cline.host.proto.OpenMultiFileDiffRequest, bot.cline.host.proto.OpenMultiFileDiffResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "openMultiFileDiff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenMultiFileDiffRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.OpenMultiFileDiffResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiffServiceMethodDescriptorSupplier("openMultiFileDiff"))
              .build();
        }
      }
    }
    return getOpenMultiFileDiffMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiffServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiffServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiffServiceStub>() {
        @java.lang.Override
        public DiffServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiffServiceStub(channel, callOptions);
        }
      };
    return DiffServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiffServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiffServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiffServiceBlockingStub>() {
        @java.lang.Override
        public DiffServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiffServiceBlockingStub(channel, callOptions);
        }
      };
    return DiffServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiffServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiffServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiffServiceFutureStub>() {
        @java.lang.Override
        public DiffServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiffServiceFutureStub(channel, callOptions);
        }
      };
    return DiffServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides methods for diff views.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Open the diff view/editor.
     * </pre>
     */
    default void openDiff(bot.cline.host.proto.OpenDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenDiffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenDiffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the contents of the diff view.
     * </pre>
     */
    default void getDocumentText(bot.cline.host.proto.GetDocumentTextRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDocumentTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDocumentTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Replace a text selection in the diff.
     * </pre>
     */
    default void replaceText(bot.cline.host.proto.ReplaceTextRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ReplaceTextResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplaceTextMethod(), responseObserver);
    }

    /**
     */
    default void scrollDiff(bot.cline.host.proto.ScrollDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ScrollDiffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScrollDiffMethod(), responseObserver);
    }

    /**
     * <pre>
     * Truncate the diff document.
     * </pre>
     */
    default void truncateDocument(bot.cline.host.proto.TruncateDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TruncateDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTruncateDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Save the diff document.
     * </pre>
     */
    default void saveDocument(bot.cline.host.proto.SaveDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveDocumentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveDocumentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close all the diff editor windows/tabs.
     * Any diff editors with unsaved content should not be closed.
     * </pre>
     */
    default void closeAllDiffs(bot.cline.host.proto.CloseAllDiffsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.CloseAllDiffsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCloseAllDiffsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Display a diff view comparing before/after states for multiple files.
     * Content is passed as in-memory data, not read from the file system.
     * </pre>
     */
    default void openMultiFileDiff(bot.cline.host.proto.OpenMultiFileDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenMultiFileDiffResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOpenMultiFileDiffMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DiffService.
   * <pre>
   * Provides methods for diff views.
   * </pre>
   */
  public static abstract class DiffServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DiffServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DiffService.
   * <pre>
   * Provides methods for diff views.
   * </pre>
   */
  public static final class DiffServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DiffServiceStub> {
    private DiffServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiffServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiffServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open the diff view/editor.
     * </pre>
     */
    public void openDiff(bot.cline.host.proto.OpenDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenDiffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenDiffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the contents of the diff view.
     * </pre>
     */
    public void getDocumentText(bot.cline.host.proto.GetDocumentTextRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDocumentTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDocumentTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Replace a text selection in the diff.
     * </pre>
     */
    public void replaceText(bot.cline.host.proto.ReplaceTextRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ReplaceTextResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplaceTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void scrollDiff(bot.cline.host.proto.ScrollDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.ScrollDiffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScrollDiffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Truncate the diff document.
     * </pre>
     */
    public void truncateDocument(bot.cline.host.proto.TruncateDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TruncateDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTruncateDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Save the diff document.
     * </pre>
     */
    public void saveDocument(bot.cline.host.proto.SaveDocumentRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveDocumentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close all the diff editor windows/tabs.
     * Any diff editors with unsaved content should not be closed.
     * </pre>
     */
    public void closeAllDiffs(bot.cline.host.proto.CloseAllDiffsRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.CloseAllDiffsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCloseAllDiffsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Display a diff view comparing before/after states for multiple files.
     * Content is passed as in-memory data, not read from the file system.
     * </pre>
     */
    public void openMultiFileDiff(bot.cline.host.proto.OpenMultiFileDiffRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenMultiFileDiffResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOpenMultiFileDiffMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DiffService.
   * <pre>
   * Provides methods for diff views.
   * </pre>
   */
  public static final class DiffServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DiffServiceBlockingStub> {
    private DiffServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiffServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiffServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open the diff view/editor.
     * </pre>
     */
    public bot.cline.host.proto.OpenDiffResponse openDiff(bot.cline.host.proto.OpenDiffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenDiffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the contents of the diff view.
     * </pre>
     */
    public bot.cline.host.proto.GetDocumentTextResponse getDocumentText(bot.cline.host.proto.GetDocumentTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDocumentTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Replace a text selection in the diff.
     * </pre>
     */
    public bot.cline.host.proto.ReplaceTextResponse replaceText(bot.cline.host.proto.ReplaceTextRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplaceTextMethod(), getCallOptions(), request);
    }

    /**
     */
    public bot.cline.host.proto.ScrollDiffResponse scrollDiff(bot.cline.host.proto.ScrollDiffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScrollDiffMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Truncate the diff document.
     * </pre>
     */
    public bot.cline.host.proto.TruncateDocumentResponse truncateDocument(bot.cline.host.proto.TruncateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTruncateDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Save the diff document.
     * </pre>
     */
    public bot.cline.host.proto.SaveDocumentResponse saveDocument(bot.cline.host.proto.SaveDocumentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveDocumentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close all the diff editor windows/tabs.
     * Any diff editors with unsaved content should not be closed.
     * </pre>
     */
    public bot.cline.host.proto.CloseAllDiffsResponse closeAllDiffs(bot.cline.host.proto.CloseAllDiffsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCloseAllDiffsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Display a diff view comparing before/after states for multiple files.
     * Content is passed as in-memory data, not read from the file system.
     * </pre>
     */
    public bot.cline.host.proto.OpenMultiFileDiffResponse openMultiFileDiff(bot.cline.host.proto.OpenMultiFileDiffRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOpenMultiFileDiffMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DiffService.
   * <pre>
   * Provides methods for diff views.
   * </pre>
   */
  public static final class DiffServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DiffServiceFutureStub> {
    private DiffServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiffServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiffServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Open the diff view/editor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenDiffResponse> openDiff(
        bot.cline.host.proto.OpenDiffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenDiffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the contents of the diff view.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetDocumentTextResponse> getDocumentText(
        bot.cline.host.proto.GetDocumentTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDocumentTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Replace a text selection in the diff.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.ReplaceTextResponse> replaceText(
        bot.cline.host.proto.ReplaceTextRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplaceTextMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.ScrollDiffResponse> scrollDiff(
        bot.cline.host.proto.ScrollDiffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScrollDiffMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Truncate the diff document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.TruncateDocumentResponse> truncateDocument(
        bot.cline.host.proto.TruncateDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTruncateDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Save the diff document.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.SaveDocumentResponse> saveDocument(
        bot.cline.host.proto.SaveDocumentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveDocumentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close all the diff editor windows/tabs.
     * Any diff editors with unsaved content should not be closed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.CloseAllDiffsResponse> closeAllDiffs(
        bot.cline.host.proto.CloseAllDiffsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCloseAllDiffsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Display a diff view comparing before/after states for multiple files.
     * Content is passed as in-memory data, not read from the file system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.OpenMultiFileDiffResponse> openMultiFileDiff(
        bot.cline.host.proto.OpenMultiFileDiffRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOpenMultiFileDiffMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OPEN_DIFF = 0;
  private static final int METHODID_GET_DOCUMENT_TEXT = 1;
  private static final int METHODID_REPLACE_TEXT = 2;
  private static final int METHODID_SCROLL_DIFF = 3;
  private static final int METHODID_TRUNCATE_DOCUMENT = 4;
  private static final int METHODID_SAVE_DOCUMENT = 5;
  private static final int METHODID_CLOSE_ALL_DIFFS = 6;
  private static final int METHODID_OPEN_MULTI_FILE_DIFF = 7;

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
        case METHODID_OPEN_DIFF:
          serviceImpl.openDiff((bot.cline.host.proto.OpenDiffRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenDiffResponse>) responseObserver);
          break;
        case METHODID_GET_DOCUMENT_TEXT:
          serviceImpl.getDocumentText((bot.cline.host.proto.GetDocumentTextRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetDocumentTextResponse>) responseObserver);
          break;
        case METHODID_REPLACE_TEXT:
          serviceImpl.replaceText((bot.cline.host.proto.ReplaceTextRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.ReplaceTextResponse>) responseObserver);
          break;
        case METHODID_SCROLL_DIFF:
          serviceImpl.scrollDiff((bot.cline.host.proto.ScrollDiffRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.ScrollDiffResponse>) responseObserver);
          break;
        case METHODID_TRUNCATE_DOCUMENT:
          serviceImpl.truncateDocument((bot.cline.host.proto.TruncateDocumentRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.TruncateDocumentResponse>) responseObserver);
          break;
        case METHODID_SAVE_DOCUMENT:
          serviceImpl.saveDocument((bot.cline.host.proto.SaveDocumentRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.SaveDocumentResponse>) responseObserver);
          break;
        case METHODID_CLOSE_ALL_DIFFS:
          serviceImpl.closeAllDiffs((bot.cline.host.proto.CloseAllDiffsRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.CloseAllDiffsResponse>) responseObserver);
          break;
        case METHODID_OPEN_MULTI_FILE_DIFF:
          serviceImpl.openMultiFileDiff((bot.cline.host.proto.OpenMultiFileDiffRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.OpenMultiFileDiffResponse>) responseObserver);
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
          getOpenDiffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenDiffRequest,
              bot.cline.host.proto.OpenDiffResponse>(
                service, METHODID_OPEN_DIFF)))
        .addMethod(
          getGetDocumentTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.GetDocumentTextRequest,
              bot.cline.host.proto.GetDocumentTextResponse>(
                service, METHODID_GET_DOCUMENT_TEXT)))
        .addMethod(
          getReplaceTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ReplaceTextRequest,
              bot.cline.host.proto.ReplaceTextResponse>(
                service, METHODID_REPLACE_TEXT)))
        .addMethod(
          getScrollDiffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.ScrollDiffRequest,
              bot.cline.host.proto.ScrollDiffResponse>(
                service, METHODID_SCROLL_DIFF)))
        .addMethod(
          getTruncateDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.TruncateDocumentRequest,
              bot.cline.host.proto.TruncateDocumentResponse>(
                service, METHODID_TRUNCATE_DOCUMENT)))
        .addMethod(
          getSaveDocumentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.SaveDocumentRequest,
              bot.cline.host.proto.SaveDocumentResponse>(
                service, METHODID_SAVE_DOCUMENT)))
        .addMethod(
          getCloseAllDiffsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.CloseAllDiffsRequest,
              bot.cline.host.proto.CloseAllDiffsResponse>(
                service, METHODID_CLOSE_ALL_DIFFS)))
        .addMethod(
          getOpenMultiFileDiffMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.host.proto.OpenMultiFileDiffRequest,
              bot.cline.host.proto.OpenMultiFileDiffResponse>(
                service, METHODID_OPEN_MULTI_FILE_DIFF)))
        .build();
  }

  private static abstract class DiffServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiffServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bot.cline.host.proto.Diff.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiffService");
    }
  }

  private static final class DiffServiceFileDescriptorSupplier
      extends DiffServiceBaseDescriptorSupplier {
    DiffServiceFileDescriptorSupplier() {}
  }

  private static final class DiffServiceMethodDescriptorSupplier
      extends DiffServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DiffServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DiffServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiffServiceFileDescriptorSupplier())
              .addMethod(getOpenDiffMethod())
              .addMethod(getGetDocumentTextMethod())
              .addMethod(getReplaceTextMethod())
              .addMethod(getScrollDiffMethod())
              .addMethod(getTruncateDocumentMethod())
              .addMethod(getSaveDocumentMethod())
              .addMethod(getCloseAllDiffsMethod())
              .addMethod(getOpenMultiFileDiffMethod())
              .build();
        }
      }
    }
    return result;
  }
}
