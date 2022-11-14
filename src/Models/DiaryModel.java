package Models;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Camila Carrero
 */
@Entity
@Table (name = "diary")
public class DiaryModel implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id ;
    @Column (length = 10)
    private int id_client;
    @Column (length = 25)
    private String typeService;
    @Column (length = 6)
    private Date date;
    @Column (length = 5)
    private LocalTime hour;
    @Column (length = 5)
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

    @Override
    public String toString() {
        return "DiaryModel{" + "id_client=" + id_client + ", typeService=" + typeService + ", date=" + date + ", hour=" + hour + ", attendance=" + attendance + '}';
    }
    
}
