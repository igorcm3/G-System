/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Receber;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Igor Corona
 */
public class ReceberDAO {
    
    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public void persist(Receber r) {
        em.getTransaction().begin();
        em.persist(r);
        em.getTransaction().commit();
    }

    public void merge(Receber r) {

        em.getTransaction().begin();
        em.merge(r);
        em.getTransaction().commit();
    }

    public void remove(Receber p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    // Listar empresas
    public List<Receber> listarReceber() {
        List<Receber> lista = null;
        lista = em.createQuery("from Receber u ").getResultList();
        return lista;
    }

    public Receber getReceberPorId(int id) {

        Receber emp = (Receber) em.createQuery("from Receber u where idReceber = " + String.valueOf(id) + "").getSingleResult();
        return emp;
    }    
    
}
