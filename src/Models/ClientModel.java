package Models;

/**
 *
 * @author Camila Carrero
 */
public class ClientModel {
    private int id;
    private String name;
    private String surname;
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

    public int getId() {
        return id;
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