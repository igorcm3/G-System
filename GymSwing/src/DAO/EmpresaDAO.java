/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Models.Empresa;
import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author coron
 */
public class EmpresaDAO {
    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }
  
    public void persist(Empresa pss) {
        em.getTransaction().begin();
        em.persist(pss);
        em.getTransaction().commit();
    }

    public void merge(Empresa pss) {

        em.getTransaction().begin();
        em.merge(pss);
        em.getTransaction().commit();
    }

    public void remove(Empresa empresa) {
        em.getTransaction().begin();
        em.remove(empresa);
        em.getTransaction().commit();
    }
    
    // Listar empresas
        public List<Empresa> listarEmpresas() {
        List<Empresa> lista = null;
        lista = em.createQuery("from Empresa u ").getResultList();
        return lista;
    }
        
    public Empresa getEmpresaPorId(int id) {
        
        Empresa emp =(Empresa) em.createQuery("from Empresa u where idEmpresa = "+String.valueOf(id)+"").getSingleResult();
        return emp;
    }
   
}
