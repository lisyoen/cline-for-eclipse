package com.cline.eclipse.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

import com.cline.eclipse.host.EclipseHostProvider;
import com.cline.eclipse.host.EclipseWebviewProvider;

/**
 * Cline main view.
 * 
 * This view displays the Cline AI assistant interface using an embedded browser.
 */
public class ClineView extends ViewPart {
    
    public static final String ID = "com.cline.eclipse.ui.views.ClineView";
    
    private Composite parent;
    private EclipseWebviewProvider webviewProvider;
    
    @Override
    public void createPartControl(Composite parent) {
        this.parent = parent;
        
        // Set layout
        parent.setLayout(new GridLayout(1, false));
        
        // Check if HostProvider is initialized
        if (!EclipseHostProvider.isInitialized()) {
            showErrorMessage("Cline is not initialized. Please restart Eclipse.");
            return;
        }
        
        // Get WebviewProvider
        try {
            webviewProvider = EclipseHostProvider.getInstance().getWebviewProvider();
            
            if (webviewProvider == null) {
                showPlaceholder();
            } else {
                createWebview();
            }
        } catch (Exception e) {
            showErrorMessage("Failed to initialize Cline view: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Create the webview browser.
     */
    private void createWebview() {
        // TODO: Implement actual webview once Cline Core is running
        showPlaceholder();
        
        // Future implementation:
        // Browser browser = webviewProvider.createBrowser(parent, SWT.NONE);
        // browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        // webviewProvider.loadWebview();
    }
    
    /**
     * Show a placeholder message.
     */
    private void showPlaceholder() {
        Label label = new Label(parent, SWT.WRAP | SWT.CENTER);
        label.setText("Cline for Eclipse\n\n" +
                     "Phase 3: Host Provider Implementation\n\n" +
                     "WebView integration coming soon...\n\n" +
                     "Status: HostProvider initialized ✓");
        label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    }
    
    /**
     * Show an error message.
     */
    private void showErrorMessage(String message) {
        Label label = new Label(parent, SWT.WRAP);
        label.setText("Error: " + message);
        label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        label.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_RED));
    }
    
    @Override
    public void setFocus() {
        if (parent != null && !parent.isDisposed()) {
            parent.setFocus();
        }
    }
    
    @Override
    public void dispose() {
        super.dispose();
        
        // Cleanup
        if (webviewProvider != null) {
            webviewProvider.dispose();
        }
    }
}
