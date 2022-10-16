package Views;

/**
 *
 * @author Camila Carrero
 */
public class viewCertificateConformity extends javax.swing.JDialog {

    public viewCertificateConformity(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneCertificate = new javax.swing.JScrollPane();
        panelCertificate = new javax.swing.JPanel();
        lDataIdentification = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        lText1 = new javax.swing.JLabel();
        lText2 = new javax.swing.JLabel();
        lDataClient = new javax.swing.JLabel();
        lText3 = new javax.swing.JLabel();
        lText4 = new javax.swing.JLabel();
        lText5 = new javax.swing.JLabel();
        iDataDate = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lSubtittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listActivities = new javax.swing.JList<>();
        lSignature = new javax.swing.JLabel();
        iDataSignature = new javax.swing.JLabel();
        lClarification = new javax.swing.JLabel();
        iDataClarification = new javax.swing.JLabel();
        lIdentification = new javax.swing.JLabel();
        iDataIdentificationSignature = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supercharger S.R.L.");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jScrollPaneCertificate.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelCertificate.setBackground(new java.awt.Color(255, 255, 255));
        panelCertificate.setForeground(new java.awt.Color(255, 255, 255));
        panelCertificate.setAutoscrolls(true);

        lDataIdentification.setForeground(new java.awt.Color(0, 0, 0));
        lDataIdentification.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Supercharger S.R.L.");

        lText1.setForeground(new java.awt.Color(0, 0, 0));
        lText1.setText("El/la Sr./Sra. ");

        lText2.setForeground(new java.awt.Color(0, 0, 0));
        lText2.setText("DNI/LC/LE Nº ");

        lDataClient.setForeground(new java.awt.Color(0, 0, 0));
        lDataClient.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lText3.setForeground(new java.awt.Color(0, 0, 0));
        lText3.setText("deja constancia y manifiesta que la empresa Supercharger S.R.L. ha prestado sus servicios ");

        lText4.setForeground(new java.awt.Color(0, 0, 0));
        lText4.setText("realizando las siguientes actividades:");

        lText5.setForeground(new java.awt.Color(0, 0, 0));
        lText5.setText("por lo tanto se emite la presente CONFORMIDAD / NO CONFORMIDAD DEL SERVICIO.");

        iDataDate.setForeground(new java.awt.Color(0, 0, 0));
        iDataDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lDate.setForeground(new java.awt.Color(0, 0, 0));
        lDate.setText("Fecha");

        lSubtittle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lSubtittle.setForeground(new java.awt.Color(0, 0, 0));
        lSubtittle.setText("CONSTANCIA DE CONFORMIDAD ");
        lSubtittle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listActivities.setBackground(new java.awt.Color(255, 255, 255));
        listActivities.setBorder(null);
        listActivities.setForeground(new java.awt.Color(0, 0, 0));
        listActivities.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "-", "-", "-", "-", "-", "-", "-", "-" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listActivities.setFocusable(false);
        jScrollPane1.setViewportView(listActivities);

        lSignature.setForeground(new java.awt.Color(0, 0, 0));
        lSignature.setText("Firma");

        iDataSignature.setForeground(new java.awt.Color(0, 0, 0));
        iDataSignature.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lClarification.setForeground(new java.awt.Color(0, 0, 0));
        lClarification.setText("Aclaración");

        iDataClarification.setForeground(new java.awt.Color(0, 0, 0));
        iDataClarification.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lIdentification.setForeground(new java.awt.Color(0, 0, 0));
        lIdentification.setText("Nº de Documento");

        iDataIdentificationSignature.setForeground(new java.awt.Color(0, 0, 0));
        iDataIdentificationSignature.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelCertificateLayout = new javax.swing.GroupLayout(panelCertificate);
        panelCertificate.setLayout(panelCertificateLayout);
        panelCertificateLayout.setHorizontalGroup(
            panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelCertificateLayout.createSequentialGroup()
                .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCertificateLayout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lSubtittle))
                    .addGroup(panelCertificateLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lIdentification)
                            .addGroup(panelCertificateLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lClarification))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCertificateLayout.createSequentialGroup()
                                .addComponent(lSignature)
                                .addGap(41, 41, 41)))
                        .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iDataClarification, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iDataSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iDataIdentificationSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCertificateLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelCertificateLayout.createSequentialGroup()
                                    .addComponent(lText1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lDataClient, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lText2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lDataIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lText3)
                                .addComponent(lText4)
                                .addComponent(jScrollPane1)
                                .addComponent(lText5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCertificateLayout.createSequentialGroup()
                                    .addComponent(lDate)
                                    .addGap(66, 66, 66))))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelCertificateLayout.setVerticalGroup(
            panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCertificateLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lSubtittle)
                .addGap(24, 24, 24)
                .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lText1)
                    .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lText2)
                        .addComponent(lDataIdentification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lText3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lText4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lText5)
                .addGap(30, 30, 30)
                .addComponent(iDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lDate)
                .addGap(30, 30, 30)
                .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iDataSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSignature))
                .addGap(18, 18, 18)
                .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iDataClarification, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lClarification))
                .addGap(18, 18, 18)
                .addGroup(panelCertificateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iDataIdentificationSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lIdentification))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        jScrollPaneCertificate.setViewportView(panelCertificate);

        btnPrint.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneCertificate)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(viewCertificateConformity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCertificateConformity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCertificateConformity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCertificateConformity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewCertificateConformity dialog = new viewCertificateConformity(new javax.swing.JFrame(), true);
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
    public javax.swing.JLabel iDataClarification;
    public javax.swing.JLabel iDataDate;
    public javax.swing.JLabel iDataIdentificationSignature;
    public javax.swing.JLabel iDataSignature;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneCertificate;
    private javax.swing.JLabel lClarification;
    public javax.swing.JLabel lDataClient;
    public javax.swing.JLabel lDataIdentification;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lIdentification;
    private javax.swing.JLabel lSignature;
    private javax.swing.JLabel lSubtittle;
    private javax.swing.JLabel lText1;
    private javax.swing.JLabel lText2;
    private javax.swing.JLabel lText3;
    private javax.swing.JLabel lText4;
    private javax.swing.JLabel lText5;
    public javax.swing.JList<String> listActivities;
    private javax.swing.JPanel panelCertificate;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}