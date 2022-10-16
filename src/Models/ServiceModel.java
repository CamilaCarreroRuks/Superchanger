package Models;

import java.lang.reflect.Array;
import java.util.Date;

/**
 *
 * @author Camila Carrero
 */
public class ServiceModel {
    private int id;
    private int id_client;
    private Date date;
    private Array activities;
    private Array supplies;

    private static ServiceModel service = null;
       
    private ServiceModel() {
    }

    public static ServiceModel getInstance() {
        if(service == null) {
            service = new ServiceModel();
        }        
        return service;
    };
    
    public ServiceModel(int id_client, Date date, Array activities, Array supplies) {
        this.id_client = id_client;
        this.date = date;
        this.activities = activities;
        this.supplies = supplies;
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

    public Array getActivities() {
        return activities;
    }

    public void setActivities(Array activities) {
        this.activities = activities;
    }

    public Array getSupplies() {
        return supplies;
    }

    public void setSupplies(Array supplies) {
        this.supplies = supplies;
    }    
}