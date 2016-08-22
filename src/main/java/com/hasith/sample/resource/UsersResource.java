package com.hasith.sample.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("users")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class UsersResource {

    @GET
    public String getName() {
        return "Hello World";
    }

}
