package UnitTest;

import Controllers.ClientController;
import Views.formClient;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Camila Carrero
 */
public class TestClient {
    private ClientController client;
    
    public TestClient() {
    }
    
    @BeforeClass
    public static void setUpOnce() {
    }
    
    @Before
    public void setUp() {
        client = new ClientController();
    }
    
    @After
    public void tearDown() {
    }
    
   @Test
    public void validate() { 
        formClient view = formClient.getInstance();
        view.tfName.setText("Maria");
        view.tfSurname.setText("Perez");
        view.tfIdentification.setText("36418635");
        assertEquals(true,client.validate());
    }
}