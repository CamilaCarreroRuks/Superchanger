package Views;

/**
 *
 * @author Camila Carrero
 */
public class viewProofTurn extends javax.swing.JDialog {

    public viewProofTurn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProofTurn = new javax.swing.JPanel();
        tittle = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lDateTurn = new javax.swing.JLabel();
        lMessage = new javax.swing.JLabel();
        lTypeService = new javax.swing.JLabel();
        lTypeServiceTurn = new javax.swing.JLabel();
        lTime = new javax.swing.JLabel();
        lTimeTurn = new javax.swing.JLabel();
        lClient = new javax.swing.JLabel();
        lClientTurn = new javax.swing.JLabel();
        lSubtittle = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supercharger S.R.L.");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        panelProofTurn.setBackground(new java.awt.Color(255, 255, 255));

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Supercharger S.R.L.");
        tittle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDate.setForeground(new java.awt.Color(0, 0, 0));
        lDate.setText("Fecha: ");

        lDateTurn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lDateTurn.setForeground(new java.awt.Color(0, 0, 0));
        lDateTurn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lMessage.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lMessage.setForeground(new java.awt.Color(0, 0, 0));
        lMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMessage.setText("Lo esperamos!");

        lTypeService.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTypeService.setForeground(new java.awt.Color(0, 0, 0));
        lTypeService.setText("Tipo de Servicio: ");

        lTypeServiceTurn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTypeServiceTurn.setForeground(new java.awt.Color(0, 0, 0));
        lTypeServiceTurn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTime.setForeground(new java.awt.Color(0, 0, 0));
        lTime.setText("Hora: ");

        lTimeTurn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lTimeTurn.setForeground(new java.awt.Color(0, 0, 0));
        lTimeTurn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lClient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lClient.setForeground(new java.awt.Color(0, 0, 0));
        lClient.setText("Cliente: ");

        lClientTurn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lClientTurn.setForeground(new java.awt.Color(0, 0, 0));
        lClientTurn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lSubtittle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lSubtittle.setForeground(new java.awt.Color(0, 0, 0));
        lSubtittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSubtittle.setText("Turno otorgado:");

        javax.swing.GroupLayout panelProofTurnLayout = new javax.swing.GroupLayout(panelProofTurn);
        panelProofTurn.setLayout(panelProofTurnLayout);
        panelProofTurnLayout.setHorizontalGroup(
            panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelProofTurnLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProofTurnLayout.createSequentialGroup()
                        .addComponent(lClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lClientTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelProofTurnLayout.createSequentialGroup()
                        .addComponent(lTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTimeTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelProofTurnLayout.createSequentialGroup()
                        .addComponent(lTypeService)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lTypeServiceTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProofTurnLayout.createSequentialGroup()
                        .addComponent(lDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lDateTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(panelProofTurnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lSubtittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProofTurnLayout.setVerticalGroup(
            panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProofTurnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addComponent(lSubtittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDateTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTimeTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTime))
                .addGap(8, 8, 8)
                .addGroup(panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTypeServiceTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTypeService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelProofTurnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lClientTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMessage)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        btnPrint.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProofTurn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelProofTurn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(viewProofTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProofTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProofTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProofTurn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewProofTurn dialog = new viewProofTurn(new javax.swing.JFrame(), true);
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
    public javax.swing.JButton btnPrint;
    private javax.swing.JLabel lClient;
    public javax.swing.JLabel lClientTurn;
    private javax.swing.JLabel lDate;
    public javax.swing.JLabel lDateTurn;
    private javax.swing.JLabel lMessage;
    private javax.swing.JLabel lSubtittle;
    private javax.swing.JLabel lTime;
    public javax.swing.JLabel lTimeTurn;
    private javax.swing.JLabel lTypeService;
    public javax.swing.JLabel lTypeServiceTurn;
    private javax.swing.JPanel panelProofTurn;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}