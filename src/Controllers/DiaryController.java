package Controllers;

import Models.DAO.DiaryDAO;
import Models.DiaryModel;
import Notifications.NotificationService;
import Controllers.TurnStrategy.TurnAvailable;
import Controllers.TurnStrategy.TurnDisable;
import Controllers.TurnStrategy.TurnStrategy;
import Controllers.TurnStrategy.TurnTaken;
import Models.ClientModel;
import Views.formDiary;
import com.github.lgooddatepicker.optionalusertools.CalendarListener;
import com.github.lgooddatepicker.optionalusertools.TimeChangeListener;
import com.github.lgooddatepicker.zinternaltools.CalendarSelectionEvent;
import com.github.lgooddatepicker.zinternaltools.TimeChangeEvent;
import com.github.lgooddatepicker.zinternaltools.YearMonthChangeEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Camila Carrero
 */
public class DiaryController implements ActionListener, TimeChangeListener, CalendarListener{

    public formDiary view = formDiary.getInstance();
    private DiaryModel model = DiaryModel.getInstance();
    private DiaryDAO dao = new DiaryDAO();
    private boolean timeChanged = false;
    private boolean calendarChanged = false;
    private static TurnStrategy strategy;
    public ProofTurnController ptc;

    public DiaryController() {
        start(view);
    }
    
     private void start (formDiary view) {
        this.view = view;
        this.view.btnAddTurn.addActionListener(this);
        this.view.btnGenerateProofTurn.addActionListener(this);
        this.view.btnAddAssistance.addActionListener(this);
        if (this.view.cbAssistance.isSelected() || 
                this.view.tfClient.getText().isEmpty()){
           this.view.btnAddAssistance.setEnabled(false);
        }
        if (this.view.tfClient.getText().isEmpty()) {
            this.view.btnGenerateProofTurn.setEnabled(false);
        }
        this.view.time.addTimeChangeListener(this);
        this.view.calendarPanel.addCalendarListener(this);
    };
     
    public formDiary show() {
        view.setVisible(true);
        view.setSize(500, 450);
        view.setLocation(0, 0);
        return view;
    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnAddTurn) {
           if (view.time.getText().isEmpty() || view.calendarPanel.getSelectedDate() == null) {
               NotificationService notify = 
                       new NotificationService("Debe completar todos los campos", "alert");
           } else {
                if (selectedTurnStrategy()){
                    TurnController tc = new TurnController();
                    tc.show();
                }
           }
        }
        if (e.getSource() == view.btnGenerateProofTurn) {
           ptc = new ProofTurnController();
           ptc.show();
        }
    };

    @Override
    public void timeChanged(TimeChangeEvent tce) {
        if (tce.getSource() == view.time && calendarChanged) {
            selectedTurnStrategy();
        }
    };

    @Override
    public void selectedDateChanged(CalendarSelectionEvent cse) {
        if (cse.getSource() == view.calendarPanel && view.time.getTime() != null) {
            selectedTurnStrategy();
        }
    };

    @Override
    public void yearMonthChanged(YearMonthChangeEvent ymce) {
     };
    
    private Boolean selectedTurnStrategy() {
        Boolean result = false;
        model.setDate(Date.from(view.calendarPanel.getSelectedDate().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        model.setHour(view.time.getTime());
        if (dao.existsDiary(model)){
            strategy = new TurnTaken();
            model = dao.findDiaryModel(model.getId());
            ClientModel client = ClientModel.getInstance();
            view.tfClient.setText(client.getName() + " " + client.getSurname());
            //view.tfVehicle.setText(client.getVehicle());
            view.btnAddAssistance.setEnabled(true);
            view.btnGenerateProofTurn.setEnabled(true);
        } else if (!verificationTurn(model) ) {
            strategy = new TurnDisable();
        } else {
            strategy = new TurnAvailable();
            result = true;
        }
        strategy.responseTurn(view);
        return result;
    };
    
    public boolean verificationTurn(DiaryModel model) {
        int day = dayofWeek(model.getDate());
        boolean hours = verificationHours(model.getHour());
        if (day != 7 && hours) {
            return true;
        } else {
            return false;
        }
    };
    
    public boolean verificationHours(LocalTime hours) {
        LocalTime start = LocalTime.of( 7 , 59 );
        LocalTime stop = LocalTime.of( 19 , 31 );
        if(hours.isAfter(start) && hours.isBefore(stop)){
            return true;
        } else {
            return false;
        }
    };
    
    public int dayofWeek(Date dat) {
        LocalDate localDate = Instant.ofEpochMilli(dat.getTime())
          .atZone(ZoneId.systemDefault())
          .toLocalDate();
        DayOfWeek day = localDate.getDayOfWeek();
        return day.getValue();
    }
}