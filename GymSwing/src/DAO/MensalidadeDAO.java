/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Mensalidade;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class MensalidadeDAO {

    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public void persist(Mensalidade p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public void merge(Mensalidade p) {

        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    public void remove(Mensalidade p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    // Listar empresas
    public List<Mensalidade> listarMensalidade() {
        List<Mensalidade> lista = null;
        lista = em.createQuery("from Mensalidade u ").getResultList();
        return lista;
    }

    public Mensalidade getPersonalPorId(int id) {

        Mensalidade emp = (Mensalidade) em.createQuery("from Mensalidade u where idMensalidade = " + String.valueOf(id) + "").getSingleResult();
        return emp;
    }

}
