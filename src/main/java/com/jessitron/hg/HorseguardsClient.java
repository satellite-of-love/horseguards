package com.jessitron.hg;

import java.io.IOException;

public class HorseguardsClient {

	public HorseguardsConnection get(String url) throws IOException {
		return new HorseguardsConnection();
	}

}

class HorseguardsConnection {

	public HorseguardsResponse execute() {
		return new HorseguardsResponse(4);
	}

}