package Notifications;

/**
 *
 * @author Camila Carrero
 */
public class NotificationFactory {
    
    public NotificationsInterface createNotification(String type) {
        if (type == null || type.isEmpty()){
            return null;
        }
        switch (type) {
            case "possitive":
                return new NotificationPositive();
            case "negative":
                return new NotificationNegative();
            case "alert":
                return new NotificationAlert();
            default:
                throw new AssertionError();
        }
    };
}