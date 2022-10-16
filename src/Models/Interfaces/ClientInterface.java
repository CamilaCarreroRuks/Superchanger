package Models.Interfaces;

import Models.ClientModel;

/**
 *
 * @author Camila Carrero
 */
public interface ClientInterface {
    
    public boolean addClient(ClientModel client);
    public ClientModel[] getAllClients();
    public ClientModel getClient(int id);
    public boolean updateClient(ClientModel client);
    public boolean deleteClient(ClientModel client);
    public boolean existsClient(ClientModel client);
}
