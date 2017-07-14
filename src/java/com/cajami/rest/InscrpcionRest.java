/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajami.rest;

import com.cajami.entidades.Concursante;
import com.cajami.negocio.Inscripciones;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Usuario
 */
@Path("inscripcion")
public class InscrpcionRest {

    @EJB
    private Inscripciones inscripciones;

    public InscrpcionRest() {
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String insertEmpresa(Concursante concursante) {
        String Rpsta = inscripciones.registrarConcursante(concursante);
        return Rpsta;
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Concursante> getConcursante() {
        return inscripciones.listarConcursantes();
    }

}
