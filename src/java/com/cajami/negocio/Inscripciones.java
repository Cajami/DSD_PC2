/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cajami.negocio;

import com.cajami.entidades.Concursante;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Usuario
 */
@Stateless
public class Inscripciones {

    @PersistenceContext(unitName = "DSD_PC2_U201600210PU")
    private EntityManager em;

    /*LISTAMOS TODOS LOS CONCURSANTE*/
    public List<Concursante> listarConcursantes() {
        Query q = em.createQuery("SELECT e FROM Concursante e");
        return q.getResultList();
    }
    
     /*REGISTRAMOS UN CONCURSANTE*/
    public String registrarConcursante(Concursante concursante) {
        em.persist(concursante);
        return "Se registró Empleado";
}
}
