/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Aluno;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class AlunoDAO {

    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public Boolean persist(Aluno a) {
        Boolean result = true;
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            return result; // tratamento para erros de gravação no banco
        }
        return result;
    }

    public void merge(Aluno a) {

        em.getTransaction().begin();
        em.merge(a);
        em.getTransaction().commit();
    }

    public void remove(Aluno a) {
        em.getTransaction().begin();
        em.remove(a);
        em.getTransaction().commit();
    }

   
    public List<Aluno> listarAlunos() {
        List<Aluno> lista = null;
        lista = em.createQuery("from Aluno u ").getResultList();
        return lista;
    }

    public Aluno getAlunoPorId(int id) {
        Aluno a = (Aluno) em.createQuery("from Aluno u where idAluno = " + String.valueOf(id) + "").getSingleResult();
        return a;
    }

    public String getUltimoCodAluno() {
        if (em.createQuery("select max(u.codigo) from Aluno u").getSingleResult().toString() == "") {
            return "1"; // Caso não tenha nenhum aluno cadastrado
        } else {
            return em.createQuery("select max(u.codigo) from Aluno u").getSingleResult().toString();
        }
    }

}
