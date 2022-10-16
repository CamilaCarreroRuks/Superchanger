package Notifications;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Camila Carrero
 */
public class NotificationPositive implements NotificationsInterface{

    @Override
    public void notifyUser(String message) {
        Image icon = new ImageIcon(getClass().getResource("/images/positive.png")).getImage();
        ImageIcon imageIcon=new ImageIcon(icon.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        UIManager UI=new UIManager();
        UI.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 12));
        UI.put("OptionPane.messageForeground", Color.white);
        UI.put("OptionPane.background", Color.decode("#2D61A8"));
        UI.put("Panel.background", Color.decode("#2D61A8"));
        UI.put("Button.background", Color.decode("#4E5052"));
        UI.put("Button.foreground", Color.decode("#BBBBBB"));
        JOptionPane.showMessageDialog(null, message, "Notificación", JOptionPane.INFORMATION_MESSAGE, imageIcon);
    }
    
}
