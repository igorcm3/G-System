/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Medidas;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class MedidasDAO {
    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }
  
    public void persist(Medidas med) {
        em.getTransaction().begin();
        em.persist(med);
        em.getTransaction().commit();
    }

    public void merge(Medidas med) {

        em.getTransaction().begin();
        em.merge(med);
        em.getTransaction().commit();
    }

    public void remove(Medidas med) {
        em.getTransaction().begin();
        em.remove(med);
        em.getTransaction().commit();
    }
    
    // Listar Medidas
        public List<Medidas> listarMedidas() {
        List<Medidas> lista = null;
        lista = em.createQuery("from Medidas u ").getResultList();
        return lista;
    }
   
}
