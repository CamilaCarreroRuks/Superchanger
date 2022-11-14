package Supercharger;

import Controllers.LoginController;
import Views.home;


/**
 *
 * @author Camila Carrero
 */
public class Supercharger{

    public static void main(String[] args) {      
//        launch(args);
        LoginController login = new LoginController();
        login.show();
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//
//        LoginController login = new LoginController();
//        login.show();
//        
//        //home home = new home();
//        //home.setVisible(true);
// 
//        //login login = new login();
//        //login.setVisible(true); 
//    }   
}