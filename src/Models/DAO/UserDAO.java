package Models.DAO;

import Config.DataBaseQuery;
import Models.Interfaces.UserInterface;
import Models.UserModel;
import java.sql.ResultSet;

/**
 *
 * @author Camila Carrero
 */
public class UserDAO implements UserInterface{

    @Override
    public UserModel getUser(String name) {
        String sql = "SELECT * FROM users WHERE user = '"+name+"'";
        UserModel user = null;
         try {
             DataBaseQuery consulta = new DataBaseQuery();
             ResultSet resultSet = consulta.ConsultData(sql);
             while (resultSet.next()) {
                user = new UserModel(resultSet.getString("user"), resultSet.getString("password"));
             } 
         } catch (Exception e) {
             System.err.println("Error \n" + e);
         }
         return user;  
    }   
}