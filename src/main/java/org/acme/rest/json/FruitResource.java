package org.acme.rest.json;

import model.Fruit;
import service.FruitService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Set;

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FruitResource {

    @Inject
    FruitService service;

    @GET
    public Set<Fruit> list(){
        return service.list();
    }

    @POST
    public Set<Fruit> add(Fruit fruit){
        return service.add(fruit);
    }

    @DELETE
    public Set<Fruit> delete(Fruit fruit){
        return  service.delete(fruit);
    }
}