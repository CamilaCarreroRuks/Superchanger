package Controllers;

import Models.ClientModel;
import Models.DAO.ClientDAO;
import Notifications.NotificationService;
import Views.formClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Camila Carrero
 */
public class ClientController implements ActionListener{
    public formClient view = formClient.getInstance();
    private ClientModel model = ClientModel.getInstance();
    public ClientDAO dao = new ClientDAO();
    public ClientController() {
        start(view);
    };
    
    private void start (formClient view) {
        this.view = view;
        this.view.btnAddClient.addActionListener(this);
    };
     
    public formClient show() {
        view.setVisible(true);
        view.setSize(500, 500);
        view.setLocation(0, 0);
        return view;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnAddClient) {
            try {
                addClient();
            } catch (Exception ex) {
                Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
    private void addClient() throws Exception {
        if (validate() == true){
            model.setName(view.tfName.getText());
            model.setSurname(view.tfSurname.getText());
            model.setIdentification(Integer.parseInt(view.tfIdentification.getText()));
            dao.create(model);
        } else {
            NotificationService notification = new NotificationService("Debe completar todos los campos","alert");
            throw new Exception("datos vacios");
        }
    };
    
    public boolean validate(){
        if (!"".equals(view.tfName.getText()) && !"".equals(view.tfSurname.getText())
                && !"".equals(view.tfIdentification.getText())){
            return true;
        } else {
            return false;
        }
    };
}