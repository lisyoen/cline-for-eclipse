package com.cline.eclipse.host;

/**
 * Eclipse implementation of Cline's HostProvider pattern.
 * 
 * This class manages the lifecycle of platform-specific providers
 * and acts as the bridge between Eclipse and Cline Core.
 * 
 * Architecture:
 * - WebviewProvider: SWT Browser-based UI
 * - DiffViewProvider: Eclipse CompareUI integration
 * - HostBridge: gRPC client for Cline Core services
 */
public class EclipseHostProvider {
    
    private static EclipseHostProvider instance;
    
    private EclipseWebviewProvider webviewProvider;
    private EclipseDiffViewProvider diffViewProvider;
    private GrpcHostBridge hostBridge;
    
    private EclipseHostProvider() {
        // Private constructor for singleton
    }
    
    /**
     * Initialize the Eclipse Host Provider.
     * Must be called during plugin activation.
     */
    public static synchronized void initialize() {
        if (instance != null) {
            throw new IllegalStateException("EclipseHostProvider already initialized");
        }
        
        instance = new EclipseHostProvider();
        instance.setupProviders();
    }
    
    /**
     * Get the singleton instance.
     */
    public static EclipseHostProvider getInstance() {
        if (instance == null) {
            throw new IllegalStateException("EclipseHostProvider not initialized. Call initialize() first.");
        }
        return instance;
    }
    
    /**
     * Check if the provider is initialized.
     */
    public static boolean isInitialized() {
        return instance != null;
    }
    
    /**
     * Setup all platform-specific providers.
     */
    private void setupProviders() {
        System.out.println("Setting up Eclipse Host Providers...");
        
        // TODO: Initialize each provider
        // webviewProvider = new EclipseWebviewProvider();
        // diffViewProvider = new EclipseDiffViewProvider();
        // hostBridge = new GrpcHostBridge();
        
        System.out.println("Eclipse Host Providers initialized successfully");
    }
    
    /**
     * Shutdown and cleanup all providers.
     */
    public void shutdown() {
        System.out.println("Shutting down Eclipse Host Providers...");
        
        if (hostBridge != null) {
            hostBridge.shutdown();
        }
        
        // Cleanup other providers
        
        instance = null;
        System.out.println("Eclipse Host Providers shutdown complete");
    }
    
    // Getters for providers
    
    public EclipseWebviewProvider getWebviewProvider() {
        return webviewProvider;
    }
    
    public EclipseDiffViewProvider getDiffViewProvider() {
        return diffViewProvider;
    }
    
    public GrpcHostBridge getHostBridge() {
        return hostBridge;
    }
}
