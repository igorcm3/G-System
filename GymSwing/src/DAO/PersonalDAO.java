/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Personal;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class PersonalDAO {

    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public void persist(Personal p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public void merge(Personal p) {

        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    public void remove(Personal p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    // Listar empresas
    public List<Personal> listarPersonals() {
        List<Personal> lista = null;
        lista = em.createQuery("from Personal u ").getResultList();
        return lista;
    }

    public Personal getPersonalPorId(int id) {

        Personal emp = (Personal) em.createQuery("from Personal u where idPersonal = " + String.valueOf(id) + "").getSingleResult();
        return emp;
    }

}
