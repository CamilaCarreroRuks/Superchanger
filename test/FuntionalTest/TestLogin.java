package FuntionalTest;

import Controllers.LoginController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Camila Carrero
 */
public class TestLogin {

    public LoginController loginc;
    
    public TestLogin() {
    }
    
    @BeforeClass
    public static void setUpOnce() {
    }
    
    @Before
    public void setUp() {
        loginc = new LoginController();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test 
    public void login() throws Exception {  
        loginc.login.tfName.setText("cami");
        loginc.login.tfPassword.setText("123");
        loginc.login.btnLogin.doClick();
        Assert.assertEquals(false, loginc.login.isVisible());
    }
}