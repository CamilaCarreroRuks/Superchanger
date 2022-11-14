package Models.DAO;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.Interfaces.ServiceInterface;
import Models.ServiceModel;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Camila Carrero
 */
public class ServiceDAO implements Serializable, ServiceInterface {

    public ServiceDAO() {
    }
    
    public ServiceDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperchargerPU");;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ServiceModel serviceModel) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(serviceModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ServiceModel serviceModel) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            serviceModel = em.merge(serviceModel);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = serviceModel.getId();
                if (findServiceModel(id) == null) {
                    throw new NonexistentEntityException("The serviceModel with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ServiceModel serviceModel;
            try {
                serviceModel = em.getReference(ServiceModel.class, id);
                serviceModel.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The serviceModel with id " + id + " no longer exists.", enfe);
            }
            em.remove(serviceModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ServiceModel> findServiceModelEntities() {
        return findServiceModelEntities(true, -1, -1);
    }

    public List<ServiceModel> findServiceModelEntities(int maxResults, int firstResult) {
        return findServiceModelEntities(false, maxResults, firstResult);
    }

    private List<ServiceModel> findServiceModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ServiceModel.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public ServiceModel findServiceModel(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ServiceModel.class, id);
        } finally {
            em.close();
        }
    }

    public int getServiceModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ServiceModel> rt = cq.from(ServiceModel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
