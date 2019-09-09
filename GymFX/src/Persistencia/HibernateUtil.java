package Persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author coron
s */
public class HibernateUtil {
    private static EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("GymFXPU");
    public  EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
