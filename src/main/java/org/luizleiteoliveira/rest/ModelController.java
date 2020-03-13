package org.luizleiteoliveira.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.luizleiteoliveira.entity.AccountModel;
import org.luizleiteoliveira.repository.AccountModelRepository;

@Path("/models")
@RequestScoped
public class ModelController {

    private final AccountModelRepository accountModelRepository;

    @Inject
    public ModelController(AccountModelRepository accountModelRepository) {
        this.accountModelRepository = accountModelRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getModelFromCountry(@NotNull @QueryParam("country") String country) {
        AccountModel countryModel = accountModelRepository.findByCountry(country);
        return Response.ok(countryModel).build();
    }
}
