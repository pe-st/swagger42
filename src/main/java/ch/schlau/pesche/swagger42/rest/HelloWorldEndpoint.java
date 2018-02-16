package ch.schlau.pesche.swagger42.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@Path("/hello")
public class HelloWorldEndpoint {

    @ApiOperation("Get the response")
    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }
}