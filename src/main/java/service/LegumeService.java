package service;

import model.Legume;

import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LegumeService {

    private Set<Legume> legumes = Collections.synchronizedSet(new LinkedHashSet<>());

    public LegumeService(){
        legumes.add(new Legume("Carrot","Root vegetable, usually orange"));
        legumes.add(new Legume("Zucchini","Summer squash"));
    }

    public Response list(){
        return Response.ok(legumes).build();
    }

}
