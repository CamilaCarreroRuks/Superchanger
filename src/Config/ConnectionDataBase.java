package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Camila Carrero
 */
public class ConnectionDataBase {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/SuperchargerDB?serverTimezone=UTC";
    private String user = "root";
    private String password = "belinda";

    private static Connection conn = null;
    
    private Connection connectionDataBase() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexión establecida.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: no se pudo conectar a la base de datos: " + e);
        }
        return conn;
    };
    
    public Connection getInstance() {
        if(conn == null) {
            conn = connectionDataBase();
        }        
        return conn;
    };
}
