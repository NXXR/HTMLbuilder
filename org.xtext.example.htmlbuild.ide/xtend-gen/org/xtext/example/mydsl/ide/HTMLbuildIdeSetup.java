/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.HTMLbuildRuntimeModule;
import org.xtext.example.mydsl.HTMLbuildStandaloneSetup;
import org.xtext.example.mydsl.ide.HTMLbuildIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class HTMLbuildIdeSetup extends HTMLbuildStandaloneSetup {
  @Override
  public Injector createInjector() {
    HTMLbuildRuntimeModule _hTMLbuildRuntimeModule = new HTMLbuildRuntimeModule();
    HTMLbuildIdeModule _hTMLbuildIdeModule = new HTMLbuildIdeModule();
    return Guice.createInjector(Modules2.mixin(_hTMLbuildRuntimeModule, _hTMLbuildIdeModule));
  }
}
