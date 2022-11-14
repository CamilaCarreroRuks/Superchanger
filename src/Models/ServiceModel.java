package Models;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Camila Carrero
 */
@Entity
@Table (name = "services")
public class ServiceModel implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (length = 10)
    private int id_client;
    @Column (length = 6)
    private Date date;
    @Column (length = 10)
    private int idActivities;
    @Column (length = 10)
    private int idSupplies;

    private static ServiceModel service = null;
       
    private ServiceModel() {
    }

    public static ServiceModel getInstance() {
        if(service == null) {
            service = new ServiceModel();
        }        
        return service;
    };
    
    public ServiceModel(int id_client, Date date, int idActivities, int idSupplies) {
        this.id_client = id_client;
        this.date = date;
        this.idActivities = idActivities;
        this.idSupplies = idSupplies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdActivities() {
        return idActivities;
    }

    public void setIdActivities(int idActivities) {
        this.idActivities = idActivities;
    }

    public int getIdSupplies() {
        return idSupplies;
    }

    public void setIdSupplies(int idSupplies) {
        this.idSupplies = idSupplies;
    }    
}