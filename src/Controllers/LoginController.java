package Controllers;

import Models.DAO.UserDAO;
import Models.DAO.UserDAO;
import Models.UserModel;
import Notifications.NotificationService;
import Views.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camila Carrero
 */
public class LoginController implements ActionListener{
    
    private UserModel user = UserModel.getInstance();
    private UserDAO userDAO = new UserDAO();
    public login login = new login();
    public LoginController() {
        start(login);
    }
    
    private void start (login login) {
        this.login = login;
        this.login.btnLogin.addActionListener(this);
    }
    
    public void show() {
        login.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)  {
        if (e.getSource() == login.btnLogin) {
            try {
                user.setUser(login.tfName.getText());
                user.setPassword(login.tfPassword.getText());
                login(user);
            } catch (Exception ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void login(UserModel user) throws Exception{
            if (!user.getUser().isEmpty() && !user.getPassword().isEmpty()) {
                  UserModel use = userDAO.getUser(user.getUser());
                   System.out.println("use: " + use.getId());
                if (use != null) {
                    UserModel us = userDAO.findUserModel(use.getId());
                    System.out.println("user: " + us);
                    if (us.getPassword().equals(user.getPassword())) {
                        HomeController home = new HomeController();
                        home.show();
                        login.setVisible(false);
                    } else {
                        NotificationService notification = new NotificationService("Los datos ingresados son Incorrectos","negative");
                        throw new Exception("Los datos ingresados son Incorrectos");
                    }
                } else{
                    NotificationService notification = new NotificationService("El usuario ingresado no existe","negative");
                    throw new Exception("El usuario ingresado no existe");
                }   
            } else {
                NotificationService notification = new NotificationService("Debe completar todos los campos","alert");
                throw new Error("Debe completar todos los campos");
            }
    };
}