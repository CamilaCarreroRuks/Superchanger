package Controllers;

import Models.DAO.ServiceDAO;
import Models.ServiceModel;
import Views.formRegisterService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class ServiceController implements ActionListener{
    
    private formRegisterService view = formRegisterService.getInstance();
    private ServiceModel model = ServiceModel.getInstance();
    private ServiceDAO dao;

    public ServiceController() {
        start(view);
    }
    
     private void start (formRegisterService view) {
        this.view = view;
    };
     
    public formRegisterService show() {
        view.setVisible(true);
        view.setSize(500, 450);
        view.setLocation(0, 0);
        return view;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}