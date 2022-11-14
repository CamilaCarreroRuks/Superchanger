package Models;

import java.io.Serializable;
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
@Table (name = "reports")
public class ReportModel implements Serializable{

    private static final long serialVersionUID = 1L;
        @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    @Column (length = 6)
    private Date date1;
    @Column (length = 6)
    private Date date2;
    @Column (length = 10)
    private int id_client;
    @Column (length = 25)
    private String insurance;
    
    private static ReportModel report = null;
    
    private ReportModel() {
    }

    public static ReportModel getInstance() {
        if(report == null) {
            report = new ReportModel();
        }        
        return report;
    };

    public ReportModel(Date date1, Date date2, int id_client, String insurance) {
        this.date1 = date1;
        this.date2 = date2;
        this.id_client = id_client;
        this.insurance = insurance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public static ReportModel getReport() {
        return report;
    }

    public static void setReport(ReportModel report) {
        ReportModel.report = report;
    }    
}