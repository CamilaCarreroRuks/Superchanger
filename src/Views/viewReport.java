package Views;

/**
 *
 * @author Camila Carrero
 */
public class viewReport extends javax.swing.JDialog {

    public viewReport(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneReport = new javax.swing.JScrollPane();
        panelReport = new javax.swing.JPanel();
        lDateTo = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        jScrollPaneDataReport = new javax.swing.JScrollPane();
        tableDataReport = new javax.swing.JTable();
        lDate = new javax.swing.JLabel();
        lTo = new javax.swing.JLabel();
        lDateFrom = new javax.swing.JLabel();
        lInsurance = new javax.swing.JLabel();
        iDataInsurance = new javax.swing.JLabel();
        lTypeService = new javax.swing.JLabel();
        iDataTypeService = new javax.swing.JLabel();
        lTypeService1 = new javax.swing.JLabel();
        iDataTypeService1 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supercharger S.R.L.");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jScrollPaneReport.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneReport.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panelReport.setBackground(new java.awt.Color(255, 255, 255));
        panelReport.setForeground(new java.awt.Color(255, 255, 255));
        panelReport.setAutoscrolls(true);

        lDateTo.setForeground(new java.awt.Color(0, 0, 0));
        lDateTo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setText("Supercharger S.R.L.");

        jScrollPaneDataReport.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneDataReport.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tableDataReport.setBackground(new java.awt.Color(255, 255, 255));
        tableDataReport.setForeground(new java.awt.Color(0, 0, 0));
        tableDataReport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Documento", "Teléfono", "Seguro", "Póliza", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDataReport.setFocusable(false);
        jScrollPaneDataReport.setViewportView(tableDataReport);

        lDate.setForeground(new java.awt.Color(0, 0, 0));
        lDate.setText("Fecha:  Desde");

        lTo.setForeground(new java.awt.Color(0, 0, 0));
        lTo.setText("Hasta");

        lDateFrom.setForeground(new java.awt.Color(0, 0, 0));
        lDateFrom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lInsurance.setForeground(new java.awt.Color(0, 0, 0));
        lInsurance.setText("Compañia de Seguro:");

        iDataInsurance.setForeground(new java.awt.Color(0, 0, 0));
        iDataInsurance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lTypeService.setForeground(new java.awt.Color(0, 0, 0));
        lTypeService.setText("Tipo de Servicio:");

        iDataTypeService.setForeground(new java.awt.Color(0, 0, 0));
        iDataTypeService.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lTypeService1.setForeground(new java.awt.Color(0, 0, 0));
        lTypeService1.setText("Cliente:");

        iDataTypeService1.setForeground(new java.awt.Color(0, 0, 0));
        iDataTypeService1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelReportLayout = new javax.swing.GroupLayout(panelReport);
        panelReport.setLayout(panelReportLayout);
        panelReportLayout.setHorizontalGroup(
            panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportLayout.createSequentialGroup()
                .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReportLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelReportLayout.createSequentialGroup()
                                .addComponent(lDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lTo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lDateTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelReportLayout.createSequentialGroup()
                                .addComponent(lInsurance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iDataInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelReportLayout.createSequentialGroup()
                                .addComponent(lTypeService1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iDataTypeService1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelReportLayout.createSequentialGroup()
                                .addComponent(lTypeService)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iDataTypeService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReportLayout.createSequentialGroup()
                                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164))))
                    .addGroup(panelReportLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPaneDataReport, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelReportLayout.setVerticalGroup(
            panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReportLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tittle)
                .addGap(18, 18, 18)
                .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDate)
                    .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lTo)
                        .addComponent(lDateTo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lInsurance)
                    .addComponent(iDataInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTypeService)
                    .addComponent(iDataTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTypeService1)
                    .addComponent(iDataTypeService1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneDataReport, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jScrollPaneReport.setViewportView(panelReport);

        btnPrint.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneReport)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneReport, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewReport dialog = new viewReport(new javax.swing.JFrame(), true);
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
    public javax.swing.JLabel iDataInsurance;
    public javax.swing.JLabel iDataTypeService;
    public javax.swing.JLabel iDataTypeService1;
    private javax.swing.JScrollPane jScrollPaneDataReport;
    private javax.swing.JScrollPane jScrollPaneReport;
    private javax.swing.JLabel lDate;
    public javax.swing.JLabel lDateFrom;
    public javax.swing.JLabel lDateTo;
    private javax.swing.JLabel lInsurance;
    private javax.swing.JLabel lTo;
    private javax.swing.JLabel lTypeService;
    private javax.swing.JLabel lTypeService1;
    private javax.swing.JPanel panelReport;
    public javax.swing.JTable tableDataReport;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}