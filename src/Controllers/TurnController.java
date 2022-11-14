package Controllers;

import Models.DAO.DiaryDAO;
import Models.DiaryModel;
import Views.formTurn;
import Views.home;
import Views.listClients;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

/**
 *
 * @author Camila Carrero
 */
public class TurnController implements ActionListener{
    
    private home viewHome = home.getInstance();
    public formTurn view = new formTurn(viewHome, true);
    public DiaryModel model = DiaryModel.getInstance();
    private DiaryDAO dao = new DiaryDAO();
   

    public TurnController() {
        start(view);
    };
    
    private void start (formTurn view) {
        this.view = view;
        this.view.btnAddClient.addActionListener(this);
        this.view.btnAddTurn.addActionListener(this);
        this.view.btnModifyClient.addActionListener(this);
        this.view.btnSearchClient.addActionListener(this);
    };
     
    public formTurn show() {
        view.setVisible(true);
        return view;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSearchClient) {
            JDialog dialog = new JDialog(view);
            ListClientsController list = new ListClientsController();
            
            dialog.add(list.view);
             dialog.setSize(550, 500);
            dialog.setLocationRelativeTo(view); 
            dialog.show();
        }
    }
}
