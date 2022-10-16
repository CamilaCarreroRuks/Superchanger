package Controllers;

import Models.DAO.ReportDAO;
import Models.ReportModel;
import Views.formReport;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class ReportController implements ActionListener{
    
    private formReport view = formReport.getInstance();
    private ReportModel model = ReportModel.getInstance();
    private ReportDAO dao;

    public ReportController() {
        start(view);
    }
    
     private void start (formReport view) {
        this.view = view;
    };
     
    public formReport show() {
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
