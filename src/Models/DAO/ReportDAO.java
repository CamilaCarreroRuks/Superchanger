package Models.DAO;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.Interfaces.ReportInterface;
import Models.ReportModel;
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
public class ReportDAO implements Serializable, ReportInterface {

    public ReportDAO() {
    }

    public ReportDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperchargerPU");;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ReportModel reportModel) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(reportModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ReportModel reportModel) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            reportModel = em.merge(reportModel);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = reportModel.getId();
                if (findReportModel(id) == null) {
                    throw new NonexistentEntityException("The reportModel with id " + id + " no longer exists.");
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
            ReportModel reportModel;
            try {
                reportModel = em.getReference(ReportModel.class, id);
                reportModel.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The reportModel with id " + id + " no longer exists.", enfe);
            }
            em.remove(reportModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ReportModel> findReportModelEntities() {
        return findReportModelEntities(true, -1, -1);
    }

    public List<ReportModel> findReportModelEntities(int maxResults, int firstResult) {
        return findReportModelEntities(false, maxResults, firstResult);
    }

    private List<ReportModel> findReportModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ReportModel.class));
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

    public ReportModel findReportModel(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ReportModel.class, id);
        } finally {
            em.close();
        }
    }

    public int getReportModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ReportModel> rt = cq.from(ReportModel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
   
}
