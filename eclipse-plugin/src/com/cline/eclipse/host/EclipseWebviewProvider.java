package com.cline.eclipse.host;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

/**
 * Eclipse implementation of Webview Provider using SWT Browser.
 * 
 * This provider creates and manages the web-based UI for Cline
 * using Eclipse's SWT Browser widget.
 */
public class EclipseWebviewProvider {
    
    private Browser browser;
    private String webviewUrl;
    
    public EclipseWebviewProvider() {
        // TODO: Get webview URL from Cline Core
        this.webviewUrl = "http://localhost:3000"; // placeholder
    }
    
    /**
     * Create the browser widget.
     */
    public Browser createBrowser(Composite parent, int style) {
        this.browser = new Browser(parent, style);
        return browser;
    }
    
    /**
     * Load the Cline webview.
     */
    public void loadWebview() {
        if (browser != null && !browser.isDisposed()) {
            browser.setUrl(webviewUrl);
        }
    }
    
    /**
     * Send message to webview.
     */
    public void postMessage(String message) {
        if (browser != null && !browser.isDisposed()) {
            String script = String.format("window.postMessage(%s, '*')", message);
            browser.execute(script);
        }
    }
    
    /**
     * Dispose resources.
     */
    public void dispose() {
        if (browser != null && !browser.isDisposed()) {
            browser.dispose();
        }
    }
}
