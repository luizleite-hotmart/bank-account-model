package org.luizleiteoliveira.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/models")
public class ModelController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getModelFromCountry() {
        return Response.ok().build();
    }
}
