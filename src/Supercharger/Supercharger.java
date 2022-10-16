package Supercharger;

import Controllers.LoginController;
import Views.home;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Camila Carrero
 */
public class Supercharger extends Application{

    public static void main(String[] args) {      
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        LoginController login = new LoginController();
        login.show();
        
        //home home = new home();
        //home.setVisible(true);
 
        //login login = new login();
        //login.setVisible(true); 
    }   
}