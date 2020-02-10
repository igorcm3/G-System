/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Treino;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class TreinoDAO {

    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public void persist(Treino p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public void merge(Treino p) {

        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    public void remove(Treino p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    // Listar empresas
    public List<Treino> listarTreinos() {
        List<Treino> lista = null;
        lista = em.createQuery("from Treino u ").getResultList();
        return lista;
    }

    public Treino getTreinoPorId(int id) {

        Treino emp = (Treino) em.createQuery("from Treino u where idTreino = " + String.valueOf(id) + "").getSingleResult();
        return emp;
    }

    public Treino getTreinoPorCod(String cod) {
        try {
            Treino emp = (Treino) em.createQuery("from Treino u where codigo like '%" + cod + "%'").getSingleResult();
            return emp;
        } catch (Exception e) {
            return null;
        }
    }

}
