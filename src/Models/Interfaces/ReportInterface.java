package Models.Interfaces;

import Models.ReportModel;

/**
 *
 * @author Camila Carrero
 */
public interface ReportInterface {
    
    public boolean addReport(ReportModel report);
    public ReportModel[] getAllReport();
    public ReportModel getReport(int id);
    public boolean updateReport(ReportModel report);
    public boolean deleteReport(ReportModel report);
    public boolean existsReport(ReportModel report);
}