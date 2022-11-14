package Models.Interfaces;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.ReportModel;
import java.util.List;

/**
 *
 * @author Camila Carrero
 */
public interface ReportInterface {
    
    public void create(ReportModel report);
    public List<ReportModel> findReportModelEntities();
    public ReportModel findReportModel(int id);
    public void edit(ReportModel report) throws NonexistentEntityException, Exception;
    public void destroy(int id) throws NonexistentEntityException;
}