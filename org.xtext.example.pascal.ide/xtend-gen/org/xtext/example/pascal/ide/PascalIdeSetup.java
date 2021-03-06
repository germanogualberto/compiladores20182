/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.pascal.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.pascal.PascalRuntimeModule;
import org.xtext.example.pascal.PascalStandaloneSetup;
import org.xtext.example.pascal.ide.PascalIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PascalIdeSetup extends PascalStandaloneSetup {
  @Override
  public Injector createInjector() {
    PascalRuntimeModule _pascalRuntimeModule = new PascalRuntimeModule();
    PascalIdeModule _pascalIdeModule = new PascalIdeModule();
    return Guice.createInjector(Modules2.mixin(_pascalRuntimeModule, _pascalIdeModule));
  }
}
