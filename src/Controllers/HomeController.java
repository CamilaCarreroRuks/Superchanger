package Controllers;

import Views.home;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Camila Carrero
 */
public class HomeController implements ActionListener{
    
    public home view = home.getInstance();

    public HomeController() {
        start(view);
    }
    
    private void start(home view){
        this.view = view;
        this.view.btnExit.addActionListener(this);
        this.view.btnAddClient.addActionListener(this);
        this.view.btnSearchClient.addActionListener(this);
        this.view.btnDiary.addActionListener(this);
        this.view.btnAddService.addActionListener(this);
        this.view.btnGenerateReport.addActionListener(this);
    }
    
    public void show() {
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnExit) {
            System.out.println("exit " + e);
           System.exit(0);
        }
        if (e.getSource() == view.btnAddClient) {
            ClientController cc = new ClientController();            
            changePanel(cc.show());    
        }
        if (e.getSource() == view.btnSearchClient) {
            ListClientsController lcc = new ListClientsController();
            changePanel(lcc.show());
        }
        if (e.getSource() == view.btnDiary) {
            DiaryController dc = new DiaryController();
            changePanel(dc.show());
        }
        if (e.getSource() == view.btnAddService) {
            ServiceController sc = new ServiceController();
            changePanel(sc.show());
        }
        if (e.getSource() == view.btnGenerateReport) {
            ReportController rc = new ReportController();
            changePanel(rc.show());
        }
    }
    
    private void changePanel(Component comp) {
        home.panel.removeAll();
        home.panel.add(comp);
        home.panel.revalidate();
        home.panel.repaint(); 
    }
}