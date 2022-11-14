package Models.DAO;

import Config.DataBaseQuery;
import Models.DAO.exceptions.NonexistentEntityException;
import Models.UserModel;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.ResultSet;

/**
 *
 * @author Camila Carrero
 */
@SuppressWarnings("serial")
public class UserDAO implements Serializable {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperchargerPU");
    
    public UserDAO() {
    }

    public UserDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UserModel userModel) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(userModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UserModel userModel) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            userModel = em.merge(userModel);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = userModel.getId();
                if (findUserModel(id) == null) {
                    throw new NonexistentEntityException("The userModel with id " + id + " no longer exists.");
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
            UserModel userModel;
            try {
                userModel = em.getReference(UserModel.class, id);
                userModel.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The userModel with id " + id + " no longer exists.", enfe);
            }
            em.remove(userModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UserModel> findUserModelEntities() {
        return findUserModelEntities(true, -1, -1);
    }

    public List<UserModel> findUserModelEntities(int maxResults, int firstResult) {
        return findUserModelEntities(false, maxResults, firstResult);
    }

    private List<UserModel> findUserModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(UserModel.class));
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

    public UserModel findUserModel(int id) {
        System.out.println("id: " + id);
        EntityManager em = getEntityManager();
        try {
            return em.find(UserModel.class, id);
        } finally {
            em.close();
        }
    }

    public int getUserModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<UserModel> rt = cq.from(UserModel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

        public UserModel getUser(String name) {
        String sql = "SELECT * FROM users WHERE user = '"+name+"'";
        UserModel user = null;
         try {
             DataBaseQuery consulta = new DataBaseQuery();
             ResultSet resultSet = consulta.ConsultData(sql);
             while (resultSet.next()) {
                user = new UserModel(resultSet.getInt("id"),resultSet.getString("user"), resultSet.getString("password"));
             } 
         } catch (Exception e) {
             System.err.println("Error \n" + e);
         }
         return user;  
    }   
}
