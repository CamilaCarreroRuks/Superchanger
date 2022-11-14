package Models.DAO;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.DiaryModel;
import Models.Interfaces.DiaryInterface;
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
public class DiaryDAO implements Serializable, DiaryInterface {

    public DiaryDAO() {
    }
    
    public DiaryDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperchargerPU");;;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(DiaryModel diaryModel) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(diaryModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(DiaryModel diaryModel) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            diaryModel = em.merge(diaryModel);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = diaryModel.getId();
                if (findDiaryModel(id) == null) {
                    throw new NonexistentEntityException("The diaryModel with id " + id + " no longer exists.");
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
            DiaryModel diaryModel;
            try {
                diaryModel = em.getReference(DiaryModel.class, id);
                diaryModel.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The diaryModel with id " + id + " no longer exists.", enfe);
            }
            em.remove(diaryModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<DiaryModel> findDiaryModelEntities() {
        return findDiaryModelEntities(true, -1, -1);
    }

    public List<DiaryModel> findDiaryModelEntities(int maxResults, int firstResult) {
        return findDiaryModelEntities(false, maxResults, firstResult);
    }

    private List<DiaryModel> findDiaryModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(DiaryModel.class));
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

    public DiaryModel findDiaryModel(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(DiaryModel.class, id);
        } finally {
            em.close();
        }
    }

    public int getDiaryModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<DiaryModel> rt = cq.from(DiaryModel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public boolean existsDiary(DiaryModel diary) {
        return true;
    }
}
