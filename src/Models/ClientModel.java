package Models;

import java.io.Serializable;
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
@Table (name = "clients")
public class ClientModel implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (length = 25)
    private String name;
    @Column (length = 25)
    private String surname;
    @Column (length = 10)
    private int identification;
    
    private static ClientModel client = null;
    
    private ClientModel() {
    }

    public static ClientModel getInstance() {
        if(client == null) {
            client = new ClientModel();
        }        
        return client;
    };
    
    public ClientModel(int id, String nombre, String apellido) {
        this.id = id;
        this.name = nombre;
        this.surname = apellido;
    }

    public ClientModel(String name, String surname, String identification) {
        this.name = name;
        this.surname = surname;
        this.identification = Integer.parseInt(identification);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ClientModel{" + "name=" + name + ", surname=" + surname + ", identification=" + identification + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String apellido) {
        this.surname = apellido;
    }
     
    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }
    
}