package Models;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Camila Carrero
 */
public class DiaryModel {
    private int id ;
    private int id_client;
    private String typeService;
    private Date date;
    private LocalTime hour;
    private boolean attendance;

    private static DiaryModel diary = null;
    
    private DiaryModel() {
    }
    
    public static DiaryModel getInstance() {
        if(diary == null) {
            diary = new DiaryModel();
        }        
        return diary;
    };

    public DiaryModel(int id_client, String typeService, Date date, LocalTime hour, boolean attendance) {
        this.id_client = id_client;
        this.typeService = typeService;
        this.date = date;
        this.hour = hour;
        this.attendance = attendance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }
    
    
}
