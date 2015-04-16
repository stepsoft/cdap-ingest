package co.cask.cdap.client.rest;

import co.cask.cdap.security.authentication.client.AuthenticationClient;

/**
 * Tests the rest stream writer for API v2.
 */
public class RestStreamWriterTestV2 extends RestStreamWriterTest {

  protected RestStreamClient buildClient(AuthenticationClient authClient) {
    return RestStreamClient.builder(testServerHost, testServerPort).version("v2").authClient(authClient).build();
  }
}