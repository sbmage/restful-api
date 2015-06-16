package com.sbmage.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "helloworld" path)
 */
@Path("rest")
public class RestController {

	/**
	 * Method handling HTTP GET requests. The returned object will be sent to
	 * the client as "text/plain" media type.
	 *
	 * @return String that will be returned as a text/plain response.
	 */
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Hey, This is Jersey JAX-RS !";
	}

	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public PojoSample simplejson() {
		PojoSample welcome = new PojoSample();
		welcome.setDomain("sbmage.com");
		welcome.setMessage("JSON Example");
		return welcome;
	}

}