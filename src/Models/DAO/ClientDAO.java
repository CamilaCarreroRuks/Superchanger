package Models.DAO;

import Config.DataBaseQuery;
import Models.DAO.exceptions.NonexistentEntityException;
import Models.ClientModel;
import Models.Interfaces.ClientInterface;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Camila Carrero
 */
@SuppressWarnings("serial")
public class ClientDAO implements Serializable, ClientInterface{
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SuperchargerPU");;
    
    public ClientDAO() {

    }
    
    public ClientDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ClientModel clientModel) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clientModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ClientModel clientModel) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clientModel = em.merge(clientModel);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = clientModel.getId();
                if (findClientModel(id) == null) {
                    throw new NonexistentEntityException("The clientModel with id " + id + " no longer exists.");
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
            ClientModel clientModel;
            try {
                clientModel = em.getReference(ClientModel.class, id);
                clientModel.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clientModel with id " + id + " no longer exists.", enfe);
            }
            em.remove(clientModel);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ClientModel> findClientModelEntities() {
        return findClientModelEntities(true, -1, -1);
    }

    public List<ClientModel> findClientModelEntities(int maxResults, int firstResult) {
        return findClientModelEntities(false, maxResults, firstResult);
    }

    private List<ClientModel> findClientModelEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ClientModel.class));
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

    public ClientModel findClientModel(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ClientModel.class, id);
        } finally {
            em.close();
        }
    }

    public int getClientModelCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ClientModel> rt = cq.from(ClientModel.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public ClientModel existsClient(ClientModel client) {
        String sql = "SELECT * FROM clients WHERE identification='" + client.getIdentification()+ "'";
        ResultSet resultSet = null;
        ClientModel model = null;
        try {
            DataBaseQuery consulta = new DataBaseQuery();
            resultSet = consulta.ConsultData(sql);
            while (resultSet.next()) {
                model = new ClientModel(resultSet.getString("name"), resultSet.getString("surname"), resultSet.getString("identification"));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        return model;
    } 
}
