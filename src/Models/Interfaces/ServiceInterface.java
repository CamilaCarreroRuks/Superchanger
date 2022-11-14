package Models.Interfaces;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.ServiceModel;
import java.util.List;

/**
 *
 * @author Camila Carrero
 */
public interface ServiceInterface {
    
    public void create(ServiceModel service);
    public List<ServiceModel> findServiceModelEntities();
    public ServiceModel findServiceModel(int id);
    public void edit(ServiceModel service) throws NonexistentEntityException, Exception;
    public void destroy(int id) throws NonexistentEntityException;
}
