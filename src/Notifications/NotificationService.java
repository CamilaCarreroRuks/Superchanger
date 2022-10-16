package Notifications;

/**
 *
 * @author Camila Carrero
 */
public class NotificationService { 

    public NotificationService(String mensage, String type) {
        NotificationFactory notificationFactory = new NotificationFactory();
        NotificationsInterface notification = notificationFactory.createNotification(type);
        notification.notifyUser(mensage);
    }
}