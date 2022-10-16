package Controllers;

import Models.DAO.UserDAO;
import Models.UserModel;
import Notifications.NotificationService;
import Views.login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class LoginController implements ActionListener{
    
    private UserModel user = UserModel.getInstance();
    private UserDAO userDAO = new UserDAO();
    private login login = new login();

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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login.btnLogin) {
            user.setUser(login.tfName.getText());
            user.setPassword(login.tfPassword.getText());
            if (!user.getUser().isEmpty() && !user.getPassword().isEmpty()) {
                UserModel us = userDAO.getUser(user.getUser());
                if (us.getPassword().equals(user.getPassword())) {
                    HomeController home = new HomeController();
                    home.show();
                    login.setVisible(false);
                } else {
                    NotificationService notification = new NotificationService("Los datos ingresados son Incorrectos","negative");
                }
            } else {
                NotificationService notification = new NotificationService("Debe completar todos los campos","alert");
            }
        }
    }
}