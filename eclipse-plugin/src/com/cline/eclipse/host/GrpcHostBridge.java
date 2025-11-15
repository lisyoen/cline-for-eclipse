package com.cline.eclipse.host;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import bot.cline.host.proto.WorkspaceServiceGrpc;
import bot.cline.host.proto.WindowServiceGrpc;
import bot.cline.host.proto.EnvServiceGrpc;
import bot.cline.host.proto.DiffServiceGrpc;

/**
 * gRPC client bridge for communicating with Cline Core.
 * 
 * This class manages the gRPC channel and provides access to
 * all Cline Core services (Workspace, Window, Env, Diff).
 * 
 * Architecture:
 * Eclipse Plugin (Java) ←gRPC→ Cline Core (TypeScript/Node.js)
 */
public class GrpcHostBridge {
    
    private static final String DEFAULT_HOST = "localhost";
    private static final int DEFAULT_PORT = 50051;
    
    private String host;
    private int port;
    private boolean connected;
    
    // gRPC channel
    private ManagedChannel channel;
    
    // Service stubs (blocking)
    private WorkspaceServiceGrpc.WorkspaceServiceBlockingStub workspaceService;
    private WindowServiceGrpc.WindowServiceBlockingStub windowService;
    private EnvServiceGrpc.EnvServiceBlockingStub envService;
    private DiffServiceGrpc.DiffServiceBlockingStub diffService;
    
    public GrpcHostBridge() {
        this(DEFAULT_HOST, DEFAULT_PORT);
    }
    
    public GrpcHostBridge(String host, int port) {
        this.host = host;
        this.port = port;
        this.connected = false;
    }
    
    /**
     * Connect to Cline Core gRPC server.
     */
    public void connect() {
        if (connected) {
            return;
        }
        
        System.out.println("Connecting to Cline Core at " + host + ":" + port);
        
        try {
            // Create gRPC channel
            channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();
            
            // Initialize service stubs
            workspaceService = WorkspaceServiceGrpc.newBlockingStub(channel);
            windowService = WindowServiceGrpc.newBlockingStub(channel);
            envService = EnvServiceGrpc.newBlockingStub(channel);
            diffService = DiffServiceGrpc.newBlockingStub(channel);
            
            connected = true;
            System.out.println("✓ Connected to Cline Core gRPC services");
            
        } catch (Exception e) {
            System.err.println("✗ Failed to connect to Cline Core: " + e.getMessage());
            connected = false;
        }
    }
    
    /**
     * Shutdown the gRPC connection.
     */
    public void shutdown() {
        if (!connected) {
            return;
        }
        
        System.out.println("Shutting down gRPC connection...");
        
        try {
            if (channel != null && !channel.isShutdown()) {
                channel.shutdown();
                // Wait for channel to terminate
                java.util.concurrent.TimeUnit.SECONDS.sleep(1);
                if (!channel.isTerminated()) {
                    channel.shutdownNow();
                }
            }
            
            connected = false;
            System.out.println("✓ gRPC connection closed");
            
        } catch (Exception e) {
            System.err.println("✗ Error shutting down gRPC: " + e.getMessage());
        }
    }
    
    /**
     * Check if connected to Cline Core.
     */
    public boolean isConnected() {
        return connected && channel != null && !channel.isShutdown();
    }
    
    // Service stub getters
    
    public WorkspaceServiceGrpc.WorkspaceServiceBlockingStub getWorkspaceService() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected to Cline Core");
        }
        return workspaceService;
    }
    
    public WindowServiceGrpc.WindowServiceBlockingStub getWindowService() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected to Cline Core");
        }
        return windowService;
    }
    
    public EnvServiceGrpc.EnvServiceBlockingStub getEnvService() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected to Cline Core");
        }
        return envService;
    }
    
    public DiffServiceGrpc.DiffServiceBlockingStub getDiffService() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected to Cline Core");
        }
        return diffService;
    }
}

