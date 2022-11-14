package Models.Interfaces;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.ClientModel;
import java.util.List;

/**
 *
 * @author Camila Carrero
 */
public interface ClientInterface {
    
    public void create(ClientModel client);
    public List<ClientModel> findClientModelEntities();
    public ClientModel findClientModel(int id);
    public void edit(ClientModel client) throws NonexistentEntityException, Exception;
    public void destroy(int id) throws NonexistentEntityException;
}
