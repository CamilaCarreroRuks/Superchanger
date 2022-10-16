package Controllers.TurnStrategy;

import Notifications.NotificationService;
import Views.formDiary;
import javax.swing.text.View;

/**
 *
 * @author Camila Carrero
 */
public class TurnTaken implements TurnStrategy{

    @Override
    public void responseTurn(formDiary view) {
        view.btnAddTurn.setEnabled(false);
    }
}
