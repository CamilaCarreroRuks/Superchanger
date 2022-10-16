package Models.Interfaces;

import Models.ServiceModel;

/**
 *
 * @author Camila Carrero
 */
public interface ServiceInterface {
    
    public boolean addService(ServiceModel service);
    public ServiceModel[] getAllServces();
    public ServiceModel getService(int id);
    public boolean updateService(ServiceModel service);
    public boolean deleteService(ServiceModel service);
    public boolean existsService(ServiceModel service);
}
