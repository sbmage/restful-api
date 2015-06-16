package com.sbmage.rest.server;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.glassfish.grizzly.http.server.HttpServer;

import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;

public class SimpleHttpServer {
	
	public static void main(String[] args) throws IOException {
		
		// HttpServer server = HttpServer.createSimpleServer();
		// create jersey-grizzly server
		ResourceConfig rc = new PackagesResourceConfig("com.sbmage.rest");
		HttpServer server = GrizzlyServerFactory.createHttpServer(
				"http://localhost:8080", rc);
		try {
			server.start();
			Log logger = LogFactory.getLog(SimpleHttpServer.class);
			logger.info("Press any key to stop the server...");
			System.in.read();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
