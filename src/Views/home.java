package Views;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Camila Carrero
 */
public class home extends javax.swing.JFrame {

    private static home home = null;
    
    private home() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());       
        Image iconIcon= new ImageIcon(getClass().getResource("/images/iconB2.png")).getImage();
        ImageIcon imageIcon=new ImageIcon(iconIcon.getScaledInstance(icon.getWidth(), icon.getHeight(), Image.SCALE_FAST));
        icon.setIcon(imageIcon);
    };
    
    public static home getInstance() {
        if (home == null) {
            home = new home();
        }
        return home;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btnAddClient = new javax.swing.JButton();
        btnSearchClient = new javax.swing.JButton();
        btnAddService = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();
        btnDiary = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        toolbar = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        icon = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supercharger S.R.L.");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setName("home"); // NOI18N
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(52, 68, 92));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 500));

        menu.setBackground(new java.awt.Color(45, 97, 168));
        menu.setAlignmentX(0.0F);
        menu.setAlignmentY(0.0F);
        menu.setMinimumSize(new java.awt.Dimension(0, 450));
        menu.setName(""); // NOI18N
        menu.setPreferredSize(new java.awt.Dimension(157, 450));

        btnAddClient.setBackground(new java.awt.Color(128, 169, 225));
        btnAddClient.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAddClient.setForeground(new java.awt.Color(0, 0, 0));
        btnAddClient.setText("Agregar Cliente");
        btnAddClient.setMaximumSize(new java.awt.Dimension(130, 30));
        btnAddClient.setMinimumSize(new java.awt.Dimension(130, 30));
        btnAddClient.setPreferredSize(new java.awt.Dimension(130, 30));

        btnSearchClient.setBackground(new java.awt.Color(128, 169, 225));
        btnSearchClient.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSearchClient.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchClient.setText("Buscar Cliente");
        btnSearchClient.setMaximumSize(new java.awt.Dimension(130, 30));
        btnSearchClient.setMinimumSize(new java.awt.Dimension(130, 30));
        btnSearchClient.setPreferredSize(new java.awt.Dimension(130, 30));

        btnAddService.setBackground(new java.awt.Color(128, 169, 225));
        btnAddService.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAddService.setForeground(new java.awt.Color(0, 0, 0));
        btnAddService.setText("Registrar Servicio");
        btnAddService.setMaximumSize(new java.awt.Dimension(130, 30));
        btnAddService.setMinimumSize(new java.awt.Dimension(130, 30));
        btnAddService.setPreferredSize(new java.awt.Dimension(130, 30));

        btnGenerateReport.setText("Generar Reporte");
        btnGenerateReport.setBackground(new java.awt.Color(128, 169, 225));
        btnGenerateReport.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnGenerateReport.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerateReport.setMaximumSize(new java.awt.Dimension(130, 30));
        btnGenerateReport.setMinimumSize(new java.awt.Dimension(130, 30));
        btnGenerateReport.setPreferredSize(new java.awt.Dimension(130, 30));
        btnGenerateReport.setToolTipText("");

        btnDiary.setBackground(new java.awt.Color(128, 169, 225));
        btnDiary.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDiary.setForeground(new java.awt.Color(0, 0, 0));
        btnDiary.setText("Agenda");
        btnDiary.setMaximumSize(new java.awt.Dimension(130, 30));
        btnDiary.setMinimumSize(new java.awt.Dimension(130, 30));
        btnDiary.setPreferredSize(new java.awt.Dimension(130, 30));

        jSeparator1.setBackground(new java.awt.Color(52, 68, 92));
        jSeparator1.setForeground(new java.awt.Color(52, 68, 92));
        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 50));

        jSeparator2.setBackground(new java.awt.Color(52, 68, 92));
        jSeparator2.setForeground(new java.awt.Color(52, 68, 92));
        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setMinimumSize(new java.awt.Dimension(50, 50));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDiary, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnAddClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnSearchClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDiary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        toolbar.setBackground(new java.awt.Color(52, 68, 92));
        toolbar.setAlignmentX(0.0F);
        toolbar.setAlignmentY(0.0F);
        toolbar.setName("toolbar"); // NOI18N

        tittle.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setText("Supercharger S.R.L.");
        tittle.setInheritsPopupMenu(false);

        icon.setBackground(new java.awt.Color(52, 68, 92));
        icon.setBorder(null);
        icon.setBorderPainted(false);
        icon.setIconTextGap(3);
        icon.setMinimumSize(new java.awt.Dimension(30, 30));
        icon.setPreferredSize(new java.awt.Dimension(30, 30));

        btnExit.setBackground(new java.awt.Color(128, 169, 225));
        btnExit.setForeground(new java.awt.Color(0, 0, 0));
        btnExit.setText("Salir");
        btnExit.setToolTipText("");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnExit.setBorderPainted(false);
        btnExit.setIconTextGap(3);
        btnExit.setMinimumSize(new java.awt.Dimension(30, 30));
        btnExit.setPreferredSize(new java.awt.Dimension(30, 30));

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, toolbarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.setBackground(new java.awt.Color(128, 169, 225));
        panel.setToolTipText("");
        panel.setAlignmentX(0.0F);
        panel.setAlignmentY(0.0F);
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panel.setFocusCycleRoot(true);
        panel.setMaximumSize(new java.awt.Dimension(400, 450));
        panel.setMinimumSize(new java.awt.Dimension(400, 450));
        panel.setName("panel"); // NOI18N
        panel.setPreferredSize(new java.awt.Dimension(400, 450));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddClient;
    public javax.swing.JButton btnAddService;
    public javax.swing.JButton btnDiary;
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnGenerateReport;
    public javax.swing.JButton btnSearchClient;
    public javax.swing.JButton icon;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPanel menu;
    public static javax.swing.JPanel panel;
    private javax.swing.JLabel tittle;
    public javax.swing.JPanel toolbar;
    // End of variables declaration//GEN-END:variables
}