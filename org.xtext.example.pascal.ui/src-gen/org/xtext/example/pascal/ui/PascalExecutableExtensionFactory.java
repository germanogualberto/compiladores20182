/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.example.pascal.ui.internal.PascalActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PascalExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(PascalActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		PascalActivator activator = PascalActivator.getInstance();
		return activator != null ? activator.getInjector(PascalActivator.ORG_XTEXT_EXAMPLE_PASCAL_PASCAL) : null;
	}

}
