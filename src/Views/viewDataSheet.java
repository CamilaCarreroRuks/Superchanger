package Views;

/**
 *
 * @author Camila Carrero
 */
public class viewDataSheet extends javax.swing.JDialog {

    public viewDataSheet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneDataSheet = new javax.swing.JScrollPane();
        panelDataSheet = new javax.swing.JPanel();
        lDataTime = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lTime = new javax.swing.JLabel();
        lDataDate = new javax.swing.JLabel();
        lInsurance = new javax.swing.JLabel();
        iDataInsurance = new javax.swing.JLabel();
        lTypeService = new javax.swing.JLabel();
        iDataTypeService = new javax.swing.JLabel();
        lClient = new javax.swing.JLabel();
        iDataClient = new javax.swing.JLabel();
        lVehicle = new javax.swing.JLabel();
        iDataVehicle = new javax.swing.JLabel();
        lActivities = new javax.swing.JLabel();
        jScrollPaneActivities = new javax.swing.JScrollPane();
        tableActivities = new javax.swing.JTable();
        lInputs = new javax.swing.JLabel();
        jScrollPaneInputs = new javax.swing.JScrollPane();
        tableInputs = new javax.swing.JTable();
        lDate1 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supercharger S.R.L.");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jScrollPaneDataSheet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelDataSheet.setBackground(new java.awt.Color(255, 255, 255));
        panelDataSheet.setForeground(new java.awt.Color(255, 255, 255));
        panelDataSheet.setAutoscrolls(true);

        lDataTime.setForeground(new java.awt.Color(0, 0, 0));
        lDataTime.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Supercharger S.R.L.");

        lDate.setForeground(new java.awt.Color(0, 0, 0));
        lDate.setText("Fecha:  ");

        lTime.setForeground(new java.awt.Color(0, 0, 0));
        lTime.setText("Hora");

        lDataDate.setForeground(new java.awt.Color(0, 0, 0));
        lDataDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lInsurance.setForeground(new java.awt.Color(0, 0, 0));
        lInsurance.setText("Compañia de Seguro:");

        iDataInsurance.setForeground(new java.awt.Color(0, 0, 0));
        iDataInsurance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lTypeService.setForeground(new java.awt.Color(0, 0, 0));
        lTypeService.setText("Tipo de Servicio:");

        iDataTypeService.setForeground(new java.awt.Color(0, 0, 0));
        iDataTypeService.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lClient.setForeground(new java.awt.Color(0, 0, 0));
        lClient.setText("Cliente:");

        iDataClient.setForeground(new java.awt.Color(0, 0, 0));
        iDataClient.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lVehicle.setForeground(new java.awt.Color(0, 0, 0));
        lVehicle.setText("Vehículo:");

        iDataVehicle.setForeground(new java.awt.Color(0, 0, 0));
        iDataVehicle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        lActivities.setForeground(new java.awt.Color(0, 0, 0));
        lActivities.setText("Actividades");

        jScrollPaneActivities.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneActivities.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tableActivities.setBackground(new java.awt.Color(255, 255, 255));
        tableActivities.setForeground(new java.awt.Color(0, 0, 0));
        tableActivities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tarea", "Tiempo"
            }
        ));
        tableActivities.setFocusable(false);
        tableActivities.setRowSelectionAllowed(false);
        jScrollPaneActivities.setViewportView(tableActivities);
        if (tableActivities.getColumnModel().getColumnCount() > 0) {
            tableActivities.getColumnModel().getColumn(0).setMinWidth(300);
        }

        lInputs.setForeground(new java.awt.Color(0, 0, 0));
        lInputs.setText("Insumos");

        jScrollPaneInputs.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPaneInputs.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tableInputs.setAutoCreateRowSorter(true);
        tableInputs.setBackground(new java.awt.Color(255, 255, 255));
        tableInputs.setForeground(new java.awt.Color(0, 0, 0));
        tableInputs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Insumo", "Costo"
            }
        ));
        tableInputs.setFocusable(false);
        tableInputs.setRowSelectionAllowed(false);
        jScrollPaneInputs.setViewportView(tableInputs);
        if (tableInputs.getColumnModel().getColumnCount() > 0) {
            tableInputs.getColumnModel().getColumn(0).setMinWidth(300);
        }

        lDate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lDate1.setForeground(new java.awt.Color(0, 0, 0));
        lDate1.setText("Ficha Técnica");
        lDate1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelDataSheetLayout = new javax.swing.GroupLayout(panelDataSheet);
        panelDataSheet.setLayout(panelDataSheetLayout);
        panelDataSheetLayout.setHorizontalGroup(
            panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDataSheetLayout.createSequentialGroup()
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDataSheetLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lActivities)
                            .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPaneActivities, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPaneInputs)
                                .addGroup(panelDataSheetLayout.createSequentialGroup()
                                    .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelDataSheetLayout.createSequentialGroup()
                                                .addComponent(lVehicle)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iDataVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panelDataSheetLayout.createSequentialGroup()
                                                .addComponent(lDate)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lTime)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lDataTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panelDataSheetLayout.createSequentialGroup()
                                                .addComponent(lInsurance)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iDataInsurance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(panelDataSheetLayout.createSequentialGroup()
                                                .addComponent(lClient)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelDataSheetLayout.createSequentialGroup()
                                                .addComponent(lTypeService)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(iDataTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lInputs))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(panelDataSheetLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lDate1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        panelDataSheetLayout.setVerticalGroup(
            panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataSheetLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lDate1)
                .addGap(24, 24, 24)
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lDataDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lDate)
                    .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lTime)
                        .addComponent(lDataTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lInsurance)
                    .addComponent(iDataInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTypeService)
                    .addComponent(iDataTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lClient)
                    .addComponent(iDataClient, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDataSheetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lVehicle)
                    .addComponent(iDataVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lActivities)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lInputs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jScrollPaneDataSheet.setViewportView(panelDataSheet);

        btnPrint.setText("Imprimir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneDataSheet)
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
                .addComponent(jScrollPaneDataSheet, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            java.util.logging.Logger.getLogger(viewDataSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDataSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDataSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDataSheet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                viewDataSheet dialog = new viewDataSheet(new javax.swing.JFrame(), true);
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
    public javax.swing.JLabel iDataClient;
    public javax.swing.JLabel iDataInsurance;
    public javax.swing.JLabel iDataTypeService;
    public javax.swing.JLabel iDataVehicle;
    private javax.swing.JScrollPane jScrollPaneActivities;
    private javax.swing.JScrollPane jScrollPaneDataSheet;
    private javax.swing.JScrollPane jScrollPaneInputs;
    private javax.swing.JLabel lActivities;
    private javax.swing.JLabel lClient;
    public javax.swing.JLabel lDataDate;
    public javax.swing.JLabel lDataTime;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lDate1;
    private javax.swing.JLabel lInputs;
    private javax.swing.JLabel lInsurance;
    private javax.swing.JLabel lTime;
    private javax.swing.JLabel lTypeService;
    private javax.swing.JLabel lVehicle;
    private javax.swing.JPanel panelDataSheet;
    private javax.swing.JTable tableActivities;
    private javax.swing.JTable tableInputs;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}