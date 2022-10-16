package Views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Camila Carrero
 */
public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        setLocationRelativeTo(null);
        Image iconIcon= new ImageIcon(getClass().getResource("/images/iconB2.png")).getImage();
        ImageIcon imageIcon=new ImageIcon(iconIcon.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_FAST));
        icon.setIcon(imageIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        tfName = new javax.swing.JTextField();
        lName = new javax.swing.JLabel();
        lPassword = new javax.swing.JLabel();
        lTittle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        icon = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        panelLogin.setBackground(new java.awt.Color(45, 97, 168));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        tfName.setToolTipText("Usuario");

        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("Usuario");

        lPassword.setForeground(new java.awt.Color(255, 255, 255));
        lPassword.setText("Contraseña");

        lTittle.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        lTittle.setForeground(new java.awt.Color(255, 255, 255));
        lTittle.setText("Supercharger S.R.L.");
        lTittle.setInheritsPopupMenu(false);

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setForeground(new java.awt.Color(204, 204, 204));
        btnLogin.setText("Ingresar");

        icon.setBackground(new java.awt.Color(45, 97, 168));
        icon.setBorder(null);
        icon.setBorderPainted(false);
        icon.setIconTextGap(3);
        icon.setMinimumSize(new java.awt.Dimension(30, 30));
        icon.setPreferredSize(new java.awt.Dimension(30, 30));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        tfPassword.setToolTipText("");

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lName)
                        .addGap(18, 18, 18)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(lPassword)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addComponent(lTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton icon;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lTittle;
    private javax.swing.JPanel panelLogin;
    public javax.swing.JTextField tfName;
    public javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}