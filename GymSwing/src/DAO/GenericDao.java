package DAO;

import Persistencia.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Classe com Generis (T), para ser utilizada por qualquer objeto MODELO para
 * operações de banco de dados. Faz  consultas com named Queries
 *
 *
 * @author Igor Corona
 */
public class GenericDao {

    private EntityManager em = new HibernateUtil().getEntityManager();

    public EntityManager getEmf() {
        return em;
    }

    public <T> void persist(T g) {
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }

    public <T> void merge(T g) {
        em.getTransaction().begin();
        em.merge(g);
        em.getTransaction().commit();
    }

    public <T> void remove(T g) {
        em.getTransaction().begin();
        em.remove(g);
        em.getTransaction().commit();
    }

    // Listar empresas
    public <T> List<T> getList(Class<T> Obj) {
        return em.createNamedQuery(findAll(Obj)).getResultList();
    }

    public <T> Object getObjById(int id) {
        T Obj = null;
        String classType = Obj.getClass().toString();
        String findById = classType + "." + "findById" + classType;
        return em.createNamedQuery(findById).setParameter("id" + classType, id).getSingleResult();
    }
    
    public <T> String findAll (Class<T> Obj){
        String classType = Obj.getClass().toString();
        return  classType + "." + "findById" + classType;        
       
    }

}
