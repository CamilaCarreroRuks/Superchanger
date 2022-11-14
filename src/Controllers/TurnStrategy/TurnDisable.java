package Controllers.TurnStrategy;

import Notifications.NotificationService;
import Views.formDiary;
import javax.swing.text.View;

/**
 *
 * @author Camila Carrero
 */
public class TurnDisable implements TurnStrategy{

    @Override
    public void responseTurn(formDiary view) {
        NotificationService notification = new NotificationService("La fecha y/u hora seleccionada no está habilitada","negative");
    }  
}
