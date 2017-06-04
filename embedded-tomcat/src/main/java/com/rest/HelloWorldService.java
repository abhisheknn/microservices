package com.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import servlet.HelloServlet;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		Logger logger = Logger.getLogger(HelloWorldService.class);
   	 logger.debug("Hello service");
		String output = "Jersey say : " + msg;

		return Response.status(200).entity(output).build();

	}

}