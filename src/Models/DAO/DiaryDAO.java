package Models.DAO;

import Models.DiaryModel;
import Models.Interfaces.DiaryInterface;

/**
 *
 * @author Camila Carrero
 */
public class DiaryDAO implements DiaryInterface{
   
    @Override
    public boolean addDiary(DiaryModel diary) {
        return false;
    }

    @Override
    public DiaryModel[] getAllDiary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DiaryModel getDiary(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean updateDiary(DiaryModel diary) {
        return false;
    }

    @Override
    public boolean deleteDiary(DiaryModel diary) {
        return false;
    }

    @Override
    public boolean existsDiary(DiaryModel diary) {
        return false;
    }
}
