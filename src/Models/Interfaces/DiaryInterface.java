package Models.Interfaces;

import Models.DiaryModel;

/**
 *
 * @author Camila Carrero
 */
public interface DiaryInterface {
    
    public boolean addDiary(DiaryModel diary);
    public DiaryModel[] getAllDiary();
    public DiaryModel getDiary(int id);
    public boolean updateDiary(DiaryModel diary);
    public boolean deleteDiary(DiaryModel diary);
    public boolean existsDiary(DiaryModel diary);
}
