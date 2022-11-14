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
@Table (name = "users")
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (length = 10)
    private String user;
    @Column (length = 10)
    private String password;

    private static UserModel userModel = null;
    
    private UserModel() {
    }
    
    public static UserModel getInstance() {
        if(userModel == null) {
            userModel = new UserModel();
        }        
        return userModel;
    };

    public UserModel(int id, String user, String password) {
        this.id = id;
        this.user = user;
        this.password = password;
    }

    public UserModel(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
