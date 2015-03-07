package io.pivotal.pcf.haash.model;

import com.fasterxml.jackson.annotation.*;

@JsonAutoDetect
public class DashboardClient {

	private final String id = "foo";
	private final String redirectURI = "http://example.com";
	private final String secret = "secret";

	@JsonProperty("redirect_uri")
	public String getRedirectURI() {
		return redirectURI;
	}

	public String getId() {
		return id;
	}

	public String getSecret() {
		return secret;
	}

}
