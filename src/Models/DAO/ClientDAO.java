package Models.DAO;

import Config.DataBaseQuery;
import Models.ClientModel;
import Models.Interfaces.ClientInterface;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila Carrero
 */
public class ClientDAO implements ClientInterface{
    
    @Override
    public boolean addClient(ClientModel client) {
        String sql = "INSERT INTO cliente (name, surname, dni) "
                + "VALUES '" + client.getName() + "', '"+ client.getSurname() +"', '" + client.getIdentification()+ "' ";
        boolean result = false;
        try {
            DataBaseQuery consult = new DataBaseQuery();
            result = consult.InsertData(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro \n" + e);
        }
        return result;
    }
    
    @Override
    public ClientModel[] getAllClients() {
        String sql = "SELECT * FROM client";
        ClientModel client = null;
        ClientModel[] listClients = null;
        try {
            DataBaseQuery consulta = new DataBaseQuery();
            ResultSet resultSet = consulta.ConsultData(sql);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int count = 0;
            while (resultSet.next()) {              
               client = new ClientModel(resultSet.getInt(0), resultSet.getString(1), resultSet.getString(2));
               listClients[count] = client;
               count++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error \n" + e);
        }
        return listClients;  
    }

    @Override
    public ClientModel getClient(int id) {
        String sql = "SELECT * FROM client WHERE idClient = '"+id+"'";
        ClientModel client = null;
         try {
             DataBaseQuery consulta = new DataBaseQuery();
             ResultSet resultSet = consulta.ConsultData(sql);
             client = new ClientModel(resultSet.getInt(0), resultSet.getString(1), resultSet.getString(2));
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error \n" + e);
         }
         return client;  
    }

    @Override
    public boolean updateClient(ClientModel client) {
        String sql = "UPDATE cliente SET dni= '" + client.getIdentification()+ "'"
                + "where idCliente= '" + client.getId()+ "';";
        boolean result = true;
        try {
            DataBaseQuery consulta = new DataBaseQuery();
            result = consulta.UpdateData(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de modificación \n" + e);
        }
        return result;
    }

    @Override
    public boolean deleteClient(ClientModel client) {
        String sql = "DELETE FROM cliente WHERE dni='" + client.getIdentification()+ "'";
        boolean result = true;
        try {
            DataBaseQuery consulta = new DataBaseQuery();
            result = consulta.DeleteData(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la eliminación \n" + e);

        }
        return result;
    }

    @Override
    public boolean existsClient(ClientModel client) {
        boolean result = false;
        String sql = "SELECT dni FROM cliente WHERE dni='" + client.getIdentification()+ "'";
        ResultSet resultSet = null;
        try {
            DataBaseQuery consulta = new DataBaseQuery();
            resultSet = consulta.ConsultData(sql);
            while (resultSet.next()) {
                result = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return result;
    }  
}