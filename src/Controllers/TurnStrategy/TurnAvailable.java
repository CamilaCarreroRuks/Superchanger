package Controllers.TurnStrategy;

import Views.formDiary;

/**
 *
 * @author Camila Carrero
 */
public class TurnAvailable implements TurnStrategy{

    @Override
    public void responseTurn(formDiary view) {
        view.btnAddTurn.setEnabled(true);
    }
}
