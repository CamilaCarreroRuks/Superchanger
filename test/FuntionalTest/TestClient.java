package FuntionalTest;

import Controllers.ClientController;
import Controllers.ListClientsController;
import Models.ClientModel;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Camila Carrero
 */
public class TestClient {
    
    private ClientController client;
    private ListClientsController listClients; 
    
    public TestClient() {
    }
    
    @BeforeClass
    public static void setUpOnce() {
    }
    
    @Before
    public void setUp() {
        client = new ClientController();
        listClients = new ListClientsController();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void addClient() throws Exception {
        ClientModel model = ClientModel.getInstance();
        model.setName("Marcos");
        model.setSurname("Villegas");
        model.setIdentification(40318947);
        client.view.tfName.setText(model.getName());
        client.view.tfSurname.setText(model.getSurname());
        client.view.tfIdentification.setText(String.valueOf(model.getIdentification()));
        client.view.btnAddClient.doClick();
        ClientModel dataBase =  client.dao.existsClient(model);
        Assert.assertEquals(model.toString(), dataBase.toString());
    }
    
    @Test
    public void listClients() {
        listClients.view.btnBuscar.doClick();
        Assert.assertTrue(listClients.view.table.getRowCount() > 0);
    }
}