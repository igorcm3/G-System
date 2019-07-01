/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author coron
 */
public class HibernateUtil {
    private static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("GymFXPU");
    public  EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
