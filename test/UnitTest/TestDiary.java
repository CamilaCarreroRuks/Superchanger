package UnitTest;

import Controllers.DiaryController;
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
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void validateDateFalse() {
        DiaryModel model = DiaryModel.getInstance();
        LocalDate date = LocalDate.of(2022, 11, 13);
        LocalTime time = LocalTime.of(12,0,0,0);
        model.setDate(Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        model.setHour(time);
        Boolean result = diary.verificationTurn(model);
        assertEquals(false, result);
    }
    
    @Test
    public void validateDateTrue() {
        DiaryModel model = DiaryModel.getInstance();
        LocalDate date = LocalDate.of(2022, 11, 14);
        LocalTime time = LocalTime.of(10,30,0,0);
        model.setDate(Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        model.setHour(time);
        Boolean result = diary.verificationTurn(model);
        assertEquals(true, result);
    }
    
    @Test
    public void validateTimeFalse() {
        LocalTime time = LocalTime.of(07,45,0,0);
        Boolean result = diary.verificationHours(time);
        assertEquals(false, result);
    }
    
    @Test
    public void validateTimeTrue() {
        LocalTime time = LocalTime.of(17,30,0,0);
        Boolean result = diary.verificationHours(time);
        assertEquals(true, result);
    }
    
    @Test
    public void validateDayofWeek() {
        LocalDate date = LocalDate.of(2022, 11, 14);
        Date dateFormatter = Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        int result = diary.dayofWeek(dateFormatter);
        assertEquals(1, result);
    }   
}
