package Views;

/**
 *
 * @author Camila Carrero
 */
public class formTurn extends javax.swing.JDialog {

    public formTurn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTurn = new javax.swing.JPanel();
        btnSearchClient = new javax.swing.JButton();
        tfIdentification = new javax.swing.JTextField();
        lIdentifacition = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        taDataClient = new javax.swing.JTextArea();
        btnModifyClient = new javax.swing.JButton();
        btnAddClient = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        btnAddTurn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(128, 169, 225));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelTurn.setBackground(new java.awt.Color(128, 169, 225));

        btnSearchClient.setText("Buscar Cliente");

        tfIdentification.setBackground(new java.awt.Color(255, 255, 255));
        tfIdentification.setForeground(new java.awt.Color(0, 0, 0));

        lIdentifacition.setForeground(new java.awt.Color(0, 0, 0));
        lIdentifacition.setText("Nº de Documento");

        taDataClient.setBackground(new java.awt.Color(255, 255, 255));
        taDataClient.setColumns(20);
        taDataClient.setForeground(new java.awt.Color(102, 102, 102));
        taDataClient.setRows(5);
        taDataClient.setText("Nombre:\nNº de Documento:\nTeléfono:\nSeguro:\nVehículo:");
        taDataClient.setFocusable(false);
        jScrollPane.setViewportView(taDataClient);

        btnModifyClient.setText("Modificar Cliente");

        btnAddClient.setText("Agregar Cliente");

        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Asignar Cliente");
        tittle.setToolTipText("");
        tittle.setMinimumSize(new java.awt.Dimension(150, 23));
        tittle.setPreferredSize(new java.awt.Dimension(150, 23));

        btnAddTurn.setText("Aceptar");

        javax.swing.GroupLayout panelTurnLayout = new javax.swing.GroupLayout(panelTurn);
        panelTurn.setLayout(panelTurnLayout);
        panelTurnLayout.setHorizontalGroup(
            panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lIdentifacition))
                            .addGroup(panelTurnLayout.createSequentialGroup()
                                .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnSearchClient)))
                        .addGroup(panelTurnLayout.createSequentialGroup()
                            .addComponent(btnAddClient)
                            .addGap(53, 53, 53)
                            .addComponent(btnModifyClient)))
                    .addGroup(panelTurnLayout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddTurn)))
                .addGap(30, 30, 30))
        );
        panelTurnLayout.setVerticalGroup(
            panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchClient)
                    .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lIdentifacition)
                .addGap(18, 18, 18)
                .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnLayout.createSequentialGroup()
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnLayout.createSequentialGroup()
                        .addComponent(btnAddTurn)
                        .addGap(51, 51, 51)))
                .addGroup(panelTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddClient)
                    .addComponent(btnModifyClient))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTurn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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
            java.util.logging.Logger.getLogger(formTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formTurn dialog = new formTurn(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddClient;
    public javax.swing.JButton btnAddTurn;
    public javax.swing.JButton btnModifyClient;
    public javax.swing.JButton btnSearchClient;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lIdentifacition;
    private javax.swing.JPanel panelTurn;
    public javax.swing.JTextArea taDataClient;
    public javax.swing.JTextField tfIdentification;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}