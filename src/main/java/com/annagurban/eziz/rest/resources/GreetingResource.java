package com.annagurban.eziz.rest.resources;

import com.annagurban.eziz.rest.models.Greeting;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.stereotype.Component;

@Component
@Path("/greeting")
public class GreetingResource {

    private static final String template = "Hello, %s!";

    @GET
    @Produces("application/json")
    @Path("/{name}")
    public Greeting greeting(@PathParam("name") String name) {
        return new Greeting(String.format(template, name));
    }
}
