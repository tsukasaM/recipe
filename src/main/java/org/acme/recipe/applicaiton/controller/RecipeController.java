package org.acme.recipe.applicaiton.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class RecipeController {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello Tsukasa joined";
    }
}