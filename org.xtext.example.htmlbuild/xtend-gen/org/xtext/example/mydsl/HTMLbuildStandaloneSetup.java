/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.HTMLbuildStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class HTMLbuildStandaloneSetup extends HTMLbuildStandaloneSetupGenerated {
  public static void doSetup() {
    new HTMLbuildStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
