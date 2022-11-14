package Models.Interfaces;

import Models.DAO.exceptions.NonexistentEntityException;
import Models.DiaryModel;
import java.util.List;

/**
 *
 * @author Camila Carrero
 */
public interface DiaryInterface {
    
    public void create(DiaryModel diary);
    public  List<DiaryModel> findDiaryModelEntities();
    public DiaryModel findDiaryModel(int id);
    public void edit(DiaryModel diary) throws NonexistentEntityException, Exception;
    public void destroy(int id) throws NonexistentEntityException;
}
