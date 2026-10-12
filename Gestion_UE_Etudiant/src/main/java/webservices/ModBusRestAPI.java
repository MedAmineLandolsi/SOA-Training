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
    @Path("/list")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getListMB(){
        return Response.status(200).entity(helper.getAllModules()).build();
    }
    @Path("/addmod")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response addmodule(Module mod){
        if(helper.addModule(mod)){
            return Response.status(201).entity("added successfully").build();}
        else return Response.status(400).entity("didn't get added").build();

        }
    }


