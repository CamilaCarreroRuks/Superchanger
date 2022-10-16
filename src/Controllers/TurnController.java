package Controllers;

import Models.DAO.DiaryDAO;
import Models.DiaryModel;
import Views.formTurn;
import Views.home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class TurnController implements ActionListener{
    
    private home viewHome = home.getInstance();
    private formTurn view = new formTurn(viewHome, true);
    private DiaryModel model;
    private DiaryDAO dao;
   

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
