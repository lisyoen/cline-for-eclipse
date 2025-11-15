package bot.cline.host.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Provides methods for working with the user's environment.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: host/env.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnvServiceGrpc {

  private EnvServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "host.EnvService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.StringRequest,
      bot.cline.proto.Empty> getClipboardWriteTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clipboardWriteText",
      requestType = bot.cline.proto.StringRequest.class,
      responseType = bot.cline.proto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.StringRequest,
      bot.cline.proto.Empty> getClipboardWriteTextMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.StringRequest, bot.cline.proto.Empty> getClipboardWriteTextMethod;
    if ((getClipboardWriteTextMethod = EnvServiceGrpc.getClipboardWriteTextMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getClipboardWriteTextMethod = EnvServiceGrpc.getClipboardWriteTextMethod) == null) {
          EnvServiceGrpc.getClipboardWriteTextMethod = getClipboardWriteTextMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.StringRequest, bot.cline.proto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clipboardWriteText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("clipboardWriteText"))
              .build();
        }
      }
    }
    return getClipboardWriteTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.String> getClipboardReadTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clipboardReadText",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.proto.String.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.String> getClipboardReadTextMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.proto.String> getClipboardReadTextMethod;
    if ((getClipboardReadTextMethod = EnvServiceGrpc.getClipboardReadTextMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getClipboardReadTextMethod = EnvServiceGrpc.getClipboardReadTextMethod) == null) {
          EnvServiceGrpc.getClipboardReadTextMethod = getClipboardReadTextMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.proto.String>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clipboardReadText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.String.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("clipboardReadText"))
              .build();
        }
      }
    }
    return getClipboardReadTextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.GetHostVersionResponse> getGetHostVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHostVersion",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.host.proto.GetHostVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.GetHostVersionResponse> getGetHostVersionMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.host.proto.GetHostVersionResponse> getGetHostVersionMethod;
    if ((getGetHostVersionMethod = EnvServiceGrpc.getGetHostVersionMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getGetHostVersionMethod = EnvServiceGrpc.getGetHostVersionMethod) == null) {
          EnvServiceGrpc.getGetHostVersionMethod = getGetHostVersionMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.host.proto.GetHostVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHostVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetHostVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("getHostVersion"))
              .build();
        }
      }
    }
    return getGetHostVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.String> getGetIdeRedirectUriMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIdeRedirectUri",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.proto.String.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.String> getGetIdeRedirectUriMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.proto.String> getGetIdeRedirectUriMethod;
    if ((getGetIdeRedirectUriMethod = EnvServiceGrpc.getGetIdeRedirectUriMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getGetIdeRedirectUriMethod = EnvServiceGrpc.getGetIdeRedirectUriMethod) == null) {
          EnvServiceGrpc.getGetIdeRedirectUriMethod = getGetIdeRedirectUriMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.proto.String>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIdeRedirectUri"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.String.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("getIdeRedirectUri"))
              .build();
        }
      }
    }
    return getGetIdeRedirectUriMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.GetTelemetrySettingsResponse> getGetTelemetrySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTelemetrySettings",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.host.proto.GetTelemetrySettingsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.GetTelemetrySettingsResponse> getGetTelemetrySettingsMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.host.proto.GetTelemetrySettingsResponse> getGetTelemetrySettingsMethod;
    if ((getGetTelemetrySettingsMethod = EnvServiceGrpc.getGetTelemetrySettingsMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getGetTelemetrySettingsMethod = EnvServiceGrpc.getGetTelemetrySettingsMethod) == null) {
          EnvServiceGrpc.getGetTelemetrySettingsMethod = getGetTelemetrySettingsMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.host.proto.GetTelemetrySettingsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTelemetrySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.GetTelemetrySettingsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("getTelemetrySettings"))
              .build();
        }
      }
    }
    return getGetTelemetrySettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.TelemetrySettingsEvent> getSubscribeToTelemetrySettingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "subscribeToTelemetrySettings",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.host.proto.TelemetrySettingsEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.host.proto.TelemetrySettingsEvent> getSubscribeToTelemetrySettingsMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.host.proto.TelemetrySettingsEvent> getSubscribeToTelemetrySettingsMethod;
    if ((getSubscribeToTelemetrySettingsMethod = EnvServiceGrpc.getSubscribeToTelemetrySettingsMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getSubscribeToTelemetrySettingsMethod = EnvServiceGrpc.getSubscribeToTelemetrySettingsMethod) == null) {
          EnvServiceGrpc.getSubscribeToTelemetrySettingsMethod = getSubscribeToTelemetrySettingsMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.host.proto.TelemetrySettingsEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "subscribeToTelemetrySettings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.host.proto.TelemetrySettingsEvent.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("subscribeToTelemetrySettings"))
              .build();
        }
      }
    }
    return getSubscribeToTelemetrySettingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.Empty> getShutdownMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "shutdown",
      requestType = bot.cline.proto.EmptyRequest.class,
      responseType = bot.cline.proto.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest,
      bot.cline.proto.Empty> getShutdownMethod() {
    io.grpc.MethodDescriptor<bot.cline.proto.EmptyRequest, bot.cline.proto.Empty> getShutdownMethod;
    if ((getShutdownMethod = EnvServiceGrpc.getShutdownMethod) == null) {
      synchronized (EnvServiceGrpc.class) {
        if ((getShutdownMethod = EnvServiceGrpc.getShutdownMethod) == null) {
          EnvServiceGrpc.getShutdownMethod = getShutdownMethod =
              io.grpc.MethodDescriptor.<bot.cline.proto.EmptyRequest, bot.cline.proto.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "shutdown"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  bot.cline.proto.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EnvServiceMethodDescriptorSupplier("shutdown"))
              .build();
        }
      }
    }
    return getShutdownMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvServiceStub>() {
        @java.lang.Override
        public EnvServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvServiceStub(channel, callOptions);
        }
      };
    return EnvServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvServiceBlockingStub>() {
        @java.lang.Override
        public EnvServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvServiceBlockingStub(channel, callOptions);
        }
      };
    return EnvServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnvServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnvServiceFutureStub>() {
        @java.lang.Override
        public EnvServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnvServiceFutureStub(channel, callOptions);
        }
      };
    return EnvServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Provides methods for working with the user's environment.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Writes text to the system clipboard.
     * </pre>
     */
    default void clipboardWriteText(bot.cline.proto.StringRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClipboardWriteTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reads text from the system clipboard.
     * </pre>
     */
    default void clipboardReadText(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.String> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClipboardReadTextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the name and version of the host IDE or environment.
     * </pre>
     */
    default void getHostVersion(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetHostVersionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHostVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a URI that will redirect to the host environment.
     * e.g. vscode://saoudrizwan.claude-dev, idea://, pycharm://, etc.
     * If the host does not support URIs it should return empty.
     * </pre>
     */
    default void getIdeRedirectUri(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.String> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdeRedirectUriMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns the telemetry settings of the host environment. This may return UNSUPPORTED
     * if the host does not specify telemetry settings for the plugin.
     * </pre>
     */
    default void getTelemetrySettings(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetTelemetrySettingsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTelemetrySettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns events when the telemetry settings change.
     * </pre>
     */
    default void subscribeToTelemetrySettings(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TelemetrySettingsEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubscribeToTelemetrySettingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initiates a graceful shutdown of the host bridge service.
     * </pre>
     */
    default void shutdown(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getShutdownMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EnvService.
   * <pre>
   * Provides methods for working with the user's environment.
   * </pre>
   */
  public static abstract class EnvServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EnvServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EnvService.
   * <pre>
   * Provides methods for working with the user's environment.
   * </pre>
   */
  public static final class EnvServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EnvServiceStub> {
    private EnvServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes text to the system clipboard.
     * </pre>
     */
    public void clipboardWriteText(bot.cline.proto.StringRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClipboardWriteTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reads text from the system clipboard.
     * </pre>
     */
    public void clipboardReadText(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.String> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClipboardReadTextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the name and version of the host IDE or environment.
     * </pre>
     */
    public void getHostVersion(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetHostVersionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHostVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a URI that will redirect to the host environment.
     * e.g. vscode://saoudrizwan.claude-dev, idea://, pycharm://, etc.
     * If the host does not support URIs it should return empty.
     * </pre>
     */
    public void getIdeRedirectUri(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.String> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdeRedirectUriMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns the telemetry settings of the host environment. This may return UNSUPPORTED
     * if the host does not specify telemetry settings for the plugin.
     * </pre>
     */
    public void getTelemetrySettings(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.GetTelemetrySettingsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTelemetrySettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns events when the telemetry settings change.
     * </pre>
     */
    public void subscribeToTelemetrySettings(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.host.proto.TelemetrySettingsEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSubscribeToTelemetrySettingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Initiates a graceful shutdown of the host bridge service.
     * </pre>
     */
    public void shutdown(bot.cline.proto.EmptyRequest request,
        io.grpc.stub.StreamObserver<bot.cline.proto.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EnvService.
   * <pre>
   * Provides methods for working with the user's environment.
   * </pre>
   */
  public static final class EnvServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EnvServiceBlockingStub> {
    private EnvServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes text to the system clipboard.
     * </pre>
     */
    public bot.cline.proto.Empty clipboardWriteText(bot.cline.proto.StringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClipboardWriteTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reads text from the system clipboard.
     * </pre>
     */
    public bot.cline.proto.String clipboardReadText(bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClipboardReadTextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the name and version of the host IDE or environment.
     * </pre>
     */
    public bot.cline.host.proto.GetHostVersionResponse getHostVersion(bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHostVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a URI that will redirect to the host environment.
     * e.g. vscode://saoudrizwan.claude-dev, idea://, pycharm://, etc.
     * If the host does not support URIs it should return empty.
     * </pre>
     */
    public bot.cline.proto.String getIdeRedirectUri(bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdeRedirectUriMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns the telemetry settings of the host environment. This may return UNSUPPORTED
     * if the host does not specify telemetry settings for the plugin.
     * </pre>
     */
    public bot.cline.host.proto.GetTelemetrySettingsResponse getTelemetrySettings(bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTelemetrySettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns events when the telemetry settings change.
     * </pre>
     */
    public java.util.Iterator<bot.cline.host.proto.TelemetrySettingsEvent> subscribeToTelemetrySettings(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSubscribeToTelemetrySettingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Initiates a graceful shutdown of the host bridge service.
     * </pre>
     */
    public bot.cline.proto.Empty shutdown(bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getShutdownMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EnvService.
   * <pre>
   * Provides methods for working with the user's environment.
   * </pre>
   */
  public static final class EnvServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EnvServiceFutureStub> {
    private EnvServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnvServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes text to the system clipboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.proto.Empty> clipboardWriteText(
        bot.cline.proto.StringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClipboardWriteTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reads text from the system clipboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.proto.String> clipboardReadText(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClipboardReadTextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the name and version of the host IDE or environment.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetHostVersionResponse> getHostVersion(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHostVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a URI that will redirect to the host environment.
     * e.g. vscode://saoudrizwan.claude-dev, idea://, pycharm://, etc.
     * If the host does not support URIs it should return empty.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.proto.String> getIdeRedirectUri(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdeRedirectUriMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns the telemetry settings of the host environment. This may return UNSUPPORTED
     * if the host does not specify telemetry settings for the plugin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.host.proto.GetTelemetrySettingsResponse> getTelemetrySettings(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTelemetrySettingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Initiates a graceful shutdown of the host bridge service.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<bot.cline.proto.Empty> shutdown(
        bot.cline.proto.EmptyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getShutdownMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLIPBOARD_WRITE_TEXT = 0;
  private static final int METHODID_CLIPBOARD_READ_TEXT = 1;
  private static final int METHODID_GET_HOST_VERSION = 2;
  private static final int METHODID_GET_IDE_REDIRECT_URI = 3;
  private static final int METHODID_GET_TELEMETRY_SETTINGS = 4;
  private static final int METHODID_SUBSCRIBE_TO_TELEMETRY_SETTINGS = 5;
  private static final int METHODID_SHUTDOWN = 6;

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
        case METHODID_CLIPBOARD_WRITE_TEXT:
          serviceImpl.clipboardWriteText((bot.cline.proto.StringRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.proto.Empty>) responseObserver);
          break;
        case METHODID_CLIPBOARD_READ_TEXT:
          serviceImpl.clipboardReadText((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.proto.String>) responseObserver);
          break;
        case METHODID_GET_HOST_VERSION:
          serviceImpl.getHostVersion((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetHostVersionResponse>) responseObserver);
          break;
        case METHODID_GET_IDE_REDIRECT_URI:
          serviceImpl.getIdeRedirectUri((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.proto.String>) responseObserver);
          break;
        case METHODID_GET_TELEMETRY_SETTINGS:
          serviceImpl.getTelemetrySettings((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.GetTelemetrySettingsResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_TELEMETRY_SETTINGS:
          serviceImpl.subscribeToTelemetrySettings((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.host.proto.TelemetrySettingsEvent>) responseObserver);
          break;
        case METHODID_SHUTDOWN:
          serviceImpl.shutdown((bot.cline.proto.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<bot.cline.proto.Empty>) responseObserver);
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
          getClipboardWriteTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.StringRequest,
              bot.cline.proto.Empty>(
                service, METHODID_CLIPBOARD_WRITE_TEXT)))
        .addMethod(
          getClipboardReadTextMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.proto.String>(
                service, METHODID_CLIPBOARD_READ_TEXT)))
        .addMethod(
          getGetHostVersionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.host.proto.GetHostVersionResponse>(
                service, METHODID_GET_HOST_VERSION)))
        .addMethod(
          getGetIdeRedirectUriMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.proto.String>(
                service, METHODID_GET_IDE_REDIRECT_URI)))
        .addMethod(
          getGetTelemetrySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.host.proto.GetTelemetrySettingsResponse>(
                service, METHODID_GET_TELEMETRY_SETTINGS)))
        .addMethod(
          getSubscribeToTelemetrySettingsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.host.proto.TelemetrySettingsEvent>(
                service, METHODID_SUBSCRIBE_TO_TELEMETRY_SETTINGS)))
        .addMethod(
          getShutdownMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              bot.cline.proto.EmptyRequest,
              bot.cline.proto.Empty>(
                service, METHODID_SHUTDOWN)))
        .build();
  }

  private static abstract class EnvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return bot.cline.host.proto.Env.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvService");
    }
  }

  private static final class EnvServiceFileDescriptorSupplier
      extends EnvServiceBaseDescriptorSupplier {
    EnvServiceFileDescriptorSupplier() {}
  }

  private static final class EnvServiceMethodDescriptorSupplier
      extends EnvServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EnvServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EnvServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvServiceFileDescriptorSupplier())
              .addMethod(getClipboardWriteTextMethod())
              .addMethod(getClipboardReadTextMethod())
              .addMethod(getGetHostVersionMethod())
              .addMethod(getGetIdeRedirectUriMethod())
              .addMethod(getGetTelemetrySettingsMethod())
              .addMethod(getSubscribeToTelemetrySettingsMethod())
              .addMethod(getShutdownMethod())
              .build();
        }
      }
    }
    return result;
  }
}
