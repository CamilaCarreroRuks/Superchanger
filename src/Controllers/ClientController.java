package Controllers;

import Models.ClientModel;
import Models.DAO.ClientDAO;
import Views.formClient;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class ClientController implements ActionListener{
    private formClient view = formClient.getInstance();
    private ClientModel model = ClientModel.getInstance();
    private ClientDAO dao;

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
           addClient();
        }
    };
    
    private void addClient() {
        model.setName(view.tfName.getText());
        model.setSurname(view.tfSurname.getText());
        model.setIdentification(Integer.parseInt(view.tfIdentification.getText()));
        dao.addClient(model);
    };
}