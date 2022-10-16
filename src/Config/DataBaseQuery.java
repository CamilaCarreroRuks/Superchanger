package Config;

import Notifications.NotificationService;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camila Carrero
 */
public class DataBaseQuery {

    ConnectionDataBase conn = new ConnectionDataBase();
    Connection connection = conn.getInstance();
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public ResultSet ConsultData(String sql) {
        ResultSet result = null;
        try {
            st = connection.createStatement();
            result = st.executeQuery(sql);
            return result;  
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseQuery.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR EN CLASE SQLOPERACIONES");       
        }
        return result;
    }

    public boolean InsertData(String sql) {
        boolean result = false;
        int UNIQUE_CONSTRAINT_VIOLATED = 1062;
        try {
            st = connection.createStatement();
            st.execute(sql);
            result = true;
        } catch (SQLIntegrityConstraintViolationException ex) {
            if (UNIQUE_CONSTRAINT_VIOLATED == ex.getErrorCode()) {
                String msg = "El registro ya se encuentra en la base de datos";
                NotificationService notification = new NotificationService(msg,"negative");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseQuery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return result;
    }

    public boolean UpdateData(String sql) {
        boolean result = false;
        try {
            pst = connection.prepareStatement(sql);
            pst.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseQuery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return result;
    }

    public boolean DeleteData(String sql) {
        boolean result = false;
        try {
            st = connection.createStatement();
            st.execute(sql);
            result = true;
        } catch (SQLIntegrityConstraintViolationException e) {
            NotificationService notification = new NotificationService("No puede eliminarse.\nEl mismo está siendo utilizado.","negative");
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseQuery.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex);
            }
        }
        return result;
    }
}
