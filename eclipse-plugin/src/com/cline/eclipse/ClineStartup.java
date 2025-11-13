package com.cline.eclipse;

import org.eclipse.ui.IStartup;

/**
 * This class is responsible for executing code when the plugin starts.
 * It ensures the plugin activator is triggered at IDE startup.
 */
public class ClineStartup implements IStartup {

	@Override
	public void earlyStartup() {
		// Force the activator to start
		ClineActivator.getDefault();
		System.out.println("Cline for Eclipse early startup executed!");
	}
}
