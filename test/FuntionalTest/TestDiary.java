package FuntionalTest;

import Controllers.DiaryController;
import Controllers.ListClientsController;
import Controllers.TurnController;
import Models.DiaryModel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila Carrero
 */
public class TestDiary {
   
    private DiaryController diary;
    private TurnController turn;
    private ListClientsController list;
    
    public TestDiary() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        diary = new DiaryController();
        turn = new TurnController();
        list = new ListClientsController();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void turn() {
        DiaryModel model = DiaryModel.getInstance();
        LocalDate date = LocalDate.of(2022, 11, 14);
        model.setDate(Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        model.setHour(LocalTime.of(10,30,0,0));
        diary.view.time.setText("09:30");
        diary.view.calendarPanel.setSelectedDate(date);
        diary.view.btnAddTurn.doClick();
        turn.view.btnAddClient.doClick();
        list.view.btnBuscar.doClick();
        list.view.table.setRowSelectionInterval(0, 0);
        list.view.bAgregar.doClick();
        turn.view.btnAddTurn.doClick();
        assertEquals(model.toString(), turn.model.toString());
    }
    
    @Test
    public void proofTurn() {
        DiaryModel model = DiaryModel.getInstance();
        LocalDate date = LocalDate.of(2022, 11, 14);
        model.setDate(Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        model.setHour(LocalTime.of(10,30,0,0));
        diary.view.time.setText("09:30");
        diary.view.calendarPanel.setSelectedDate(date);
        diary.view.btnGenerateProofTurn.doClick();
        diary.ptc.view.btnPrint.doClick();
        assertEquals(false, diary.ptc.view.isVisible());
    }
}
