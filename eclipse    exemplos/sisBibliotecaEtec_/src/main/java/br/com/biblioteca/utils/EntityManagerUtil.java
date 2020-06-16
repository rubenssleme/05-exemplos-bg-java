/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.biblioteca.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Caio
 */
public class EntityManagerUtil {
 
    private static EntityManagerFactory emf;
    
    public static EntityManager getEntityManager(){
        if (emf == null){
            emf = Persistence.createEntityManagerFactory("TesteConexao");
        }
        return emf.createEntityManager();
    }
}
