package Controllers;

import Models.DAO.DiaryDAO;
import Models.DiaryModel;
import Views.home;
import Views.viewProofTurn;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class ProofTurnController implements ActionListener{
    
    private home viewHome = home.getInstance();
    public viewProofTurn view = new viewProofTurn(viewHome, true);
    private DiaryModel model;
    private DiaryDAO dao;
   

    public ProofTurnController() {
        start(view);
    };
    
    private void start (viewProofTurn view) {
        this.view = view;
        this.view.btnPrint.addActionListener(this);
    };
     
    public viewProofTurn show() {
        view.setVisible(true);
        return view;
    };

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnPrint){
            view.setVisible(false);
        }
    }
}
