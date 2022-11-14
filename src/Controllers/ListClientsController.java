package Controllers;

import Models.ClientModel;
import Models.DAO.ClientDAO;
import Views.listClients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Camila Carrero
 */
public class ListClientsController implements ActionListener{
    public listClients view = listClients.getInstance();
    private ClientModel model = ClientModel.getInstance();
    private ClientDAO dao = new ClientDAO();

    public ListClientsController() {
        start(view);
    }
    
     private void start (listClients view) {
        this.view = view;
        this.view.btnBuscar.addActionListener(this);
        
    };
     
    public listClients show() {
        view.setVisible(true);
        view.setSize(500, 450);
        view.setLocation(0, 0);
        return view;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnBuscar) {          
             view.table.setModel(listClients());
        }
    }
    
    public TableModel listClients(){
        List<ClientModel> list = dao.findClientModelEntities();
             DefaultTableModel modelo = new DefaultTableModel();
              modelo.addColumn("Nombre");
                  modelo.addColumn("Apellido");
                  modelo.addColumn("Documento");
                  int column = modelo.getColumnCount();                
             for (int i=0; i < list.size(); i ++) {
                String[] row = new String[column];
                row[0] = list.get(i).getName();
                row[1] = list.get(i).getSurname();
                row[2] = String.valueOf(list.get(i).getIdentification());
                modelo.addRow(row);              
             }  
             return modelo;
    }
}
