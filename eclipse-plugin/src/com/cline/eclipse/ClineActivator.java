package com.cline.eclipse;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.cline.eclipse.host.EclipseHostProvider;

/**
 * The activator class controls the plug-in life cycle
 */
public class ClineActivator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "cline-for-eclipse"; //$NON-NLS-1$

	// The shared instance
	private static ClineActivator plugin;
	
	/**
	 * The constructor
	 */
	public ClineActivator() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		System.out.println("Cline for Eclipse plugin started!");
		
		// Initialize Eclipse Host Provider
		try {
			EclipseHostProvider.initialize();
			System.out.println("EclipseHostProvider initialized successfully");
		} catch (Exception e) {
			System.err.println("Failed to initialize EclipseHostProvider: " + e.getMessage());
			e.printStackTrace();
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// Shutdown Eclipse Host Provider
		if (EclipseHostProvider.isInitialized()) {
			EclipseHostProvider.getInstance().shutdown();
		}
		
		plugin = null;
		super.stop(context);
		System.out.println("Cline for Eclipse plugin stopped.");
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ClineActivator getDefault() {
		return plugin;
	}

}
