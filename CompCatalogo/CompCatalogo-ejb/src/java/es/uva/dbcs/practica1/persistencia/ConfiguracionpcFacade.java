/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uva.dbcs.practica1.persistencia;

import es.uva.dbcs.practica1.dominio.Configuracionpc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Javier Gatón Herguedas y Javier Moro García
 */
@Stateless
public class ConfiguracionpcFacade extends AbstractFacade<Configuracionpc> implements ConfiguracionpcFacadeLocal {
    @PersistenceContext(unitName = "CompCatalogo-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConfiguracionpcFacade() {
        super(Configuracionpc.class);
    }
    
}
