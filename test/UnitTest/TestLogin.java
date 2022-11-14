package UnitTest;

import Controllers.LoginController;
import Models.UserModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Carrero
 */
public class TestLogin {
    private LoginController login;
    
    public TestLogin() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        login = new LoginController();
    }
    
    @After
    public void tearDown() {
    }

    @Test(expected = Exception.class)  
    public void loginFail() throws Exception{
        UserModel user = UserModel.getInstance();
        user.setUser("cami");
        user.setPassword("1233");
        login.login(user);
    }
    
    @Test
    public void login() throws Exception{
        UserModel user = UserModel.getInstance();
        user.setUser("cami");
        user.setPassword("123");
        login.login(user);
    }
}
