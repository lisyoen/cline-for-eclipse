package com.cline.eclipse.host;

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
    
    // Service clients
    // private WorkspaceServiceClient workspaceClient;
    // private WindowServiceClient windowClient;
    // private EnvServiceClient envClient;
    // private DiffServiceClient diffClient;
    
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
        
        // TODO: Create gRPC channel and initialize service clients
        // ManagedChannel channel = ManagedChannelBuilder
        //     .forAddress(host, port)
        //     .usePlaintext()
        //     .build();
        
        // workspaceClient = new WorkspaceServiceClient(channel);
        // windowClient = new WindowServiceClient(channel);
        // envClient = new EnvServiceClient(channel);
        // diffClient = new DiffServiceClient(channel);
        
        connected = true;
        System.out.println("Connected to Cline Core");
    }
    
    /**
     * Shutdown the gRPC connection.
     */
    public void shutdown() {
        if (!connected) {
            return;
        }
        
        System.out.println("Shutting down gRPC connection...");
        
        // TODO: Shutdown channel
        // channel.shutdown();
        
        connected = false;
        System.out.println("gRPC connection closed");
    }
    
    /**
     * Check if connected to Cline Core.
     */
    public boolean isConnected() {
        return connected;
    }
    
    // Service client getters (to be implemented)
    
    // public WorkspaceServiceClient getWorkspaceClient() {
    //     return workspaceClient;
    // }
    
    // public WindowServiceClient getWindowClient() {
    //     return windowClient;
    // }
    
    // public EnvServiceClient getEnvClient() {
    //     return envClient;
    // }
    
    // public DiffServiceClient getDiffClient() {
    //     return diffClient;
    // }
}
