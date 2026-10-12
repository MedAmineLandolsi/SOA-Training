package webservices;

import entities.Module;
import entities.UniteEnseignement;
import metiers.ModuleBusiness;
import metiers.UniteEnseignementBusiness;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/mb")
public class ModBusRestAPI {
    ModuleBusiness helper = new ModuleBusiness();
    @Path("/addmod")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addmodule(Module mod){
        if(helper.addModule(mod)){
            return Response.status(201).entity("added successfully").build();}
        else return Response.status(400).entity("didn't get added").build();

        }
    }


