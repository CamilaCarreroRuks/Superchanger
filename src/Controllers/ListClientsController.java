package Controllers;

import Models.ClientModel;
import Views.listClients;

/**
 *
 * @author Camila Carrero
 */
public class ListClientsController {
    private listClients view = listClients.getInstance();
    private ClientModel model = ClientModel.getInstance();

    public ListClientsController() {
        start(view);
    }
    
     private void start (listClients view) {
        this.view = view;
    };
     
    public listClients show() {
        view.setVisible(true);
        view.setSize(500, 450);
        view.setLocation(0, 0);
        return view;
    };
}
