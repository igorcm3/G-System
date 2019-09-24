/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Models.Endereco;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class EnderecoDAO {
        private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }
  
    public void persist(Endereco end) {
        em.getTransaction().begin();
        em.persist(end);
        em.getTransaction().commit();
    }

    public void merge(Endereco end) {

        em.getTransaction().begin();
        em.merge(end);
        em.getTransaction().commit();
    }

    public void remove(Endereco end) {
        em.getTransaction().begin();
        em.remove(end);
        em.getTransaction().commit();
    }
    
    // Listar empresas
        public List<Endereco> listarEnderecos() {
        List<Endereco> lista = null;
        lista = em.createQuery("from Enderecos u ").getResultList();
        return lista;
    }
        
    public Endereco getEmpresaPorId(int id) {
        Endereco end =(Endereco) em.createQuery("from Enderecos u where idEnderecos = "+String.valueOf(id)+"").getSingleResult();
        return end;
    }
    
}
