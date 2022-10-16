package Views;

/**
 *
 * @author Camila Carrero
 */
public class formRegisterService extends javax.swing.JPanel {

    private static formRegisterService formRegisterService = null;
    
    private formRegisterService() {
        initComponents();
    }
    
    public static formRegisterService getInstance() {
        if (formRegisterService == null) {
            formRegisterService = new formRegisterService();
        }
        return formRegisterService;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        btnGenerateRegister = new javax.swing.JButton();
        lActivities = new javax.swing.JLabel();
        lInputs = new javax.swing.JLabel();
        btnAddActivities = new javax.swing.JButton();
        btnAddInputs = new javax.swing.JButton();
        tfTask = new javax.swing.JTextField();
        dateSelected = new com.github.lgooddatepicker.components.DatePicker();
        lDate = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lTask = new javax.swing.JLabel();
        lTime = new javax.swing.JLabel();
        jScrollPaneInputs = new javax.swing.JScrollPane();
        tableInputs = new javax.swing.JTable();
        jScrollPaneActivities = new javax.swing.JScrollPane();
        tableActivities = new javax.swing.JTable();
        lInput = new javax.swing.JLabel();
        tfInput = new javax.swing.JTextField();
        lCost = new javax.swing.JLabel();
        tfCost = new javax.swing.JTextField();
        lIdentifacition = new javax.swing.JLabel();
        tfIdentification = new javax.swing.JTextField();
        btnSearchClient = new javax.swing.JButton();

        setBackground(new java.awt.Color(128, 169, 225));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));

        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Registro de Servicio");
        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setMinimumSize(new java.awt.Dimension(150, 23));
        tittle.setPreferredSize(new java.awt.Dimension(150, 23));
        tittle.setToolTipText("");

        btnGenerateRegister.setText("Generar Registro");

        lActivities.setText("Actividades");
        lActivities.setForeground(new java.awt.Color(0, 0, 0));

        lInputs.setText("Insumos");
        lInputs.setForeground(new java.awt.Color(0, 0, 0));

        btnAddActivities.setText("Agregar");

        btnAddInputs.setText("Agregar");

        tfTask.setBackground(new java.awt.Color(255, 255, 255));
        tfTask.setForeground(new java.awt.Color(0, 0, 0));

        lDate.setText("Fecha");
        lDate.setForeground(new java.awt.Color(0, 0, 0));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));

        lTask.setText("Tarea");
        lTask.setForeground(new java.awt.Color(0, 0, 0));

        lTime.setText("Tiempo");
        lTime.setForeground(new java.awt.Color(0, 0, 0));

        tableInputs.setAutoCreateRowSorter(true);
        tableInputs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Insumo", "Costo"
            }
        ));
        tableInputs.setBackground(new java.awt.Color(204, 204, 204));
        tableInputs.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPaneInputs.setViewportView(tableInputs);
        if (tableInputs.getColumnModel().getColumnCount() > 0) {
            tableInputs.getColumnModel().getColumn(0).setMinWidth(200);
        }

        tableActivities.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarea", "Tiempo"
            }
        ));
        tableActivities.setBackground(new java.awt.Color(204, 204, 204));
        tableActivities.setForeground(new java.awt.Color(153, 153, 153));
        jScrollPaneActivities.setViewportView(tableActivities);
        if (tableActivities.getColumnModel().getColumnCount() > 0) {
            tableActivities.getColumnModel().getColumn(0).setMinWidth(200);
        }

        lInput.setText("Insumo");
        lInput.setForeground(new java.awt.Color(0, 0, 0));

        tfInput.setBackground(new java.awt.Color(255, 255, 255));
        tfInput.setForeground(new java.awt.Color(0, 0, 0));

        lCost.setText("Costo");
        lCost.setForeground(new java.awt.Color(0, 0, 0));

        tfCost.setBackground(new java.awt.Color(255, 255, 255));
        tfCost.setForeground(new java.awt.Color(0, 0, 0));

        lIdentifacition.setText("Nº de Documento");
        lIdentifacition.setForeground(new java.awt.Color(0, 0, 0));

        tfIdentification.setBackground(new java.awt.Color(255, 255, 255));
        tfIdentification.setForeground(new java.awt.Color(0, 0, 0));

        btnSearchClient.setText("Buscar Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lInputs)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lTask)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfTask, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lTime)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddActivities))))
                            .addComponent(jScrollPaneInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPaneActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lInput)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lCost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddInputs))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(btnGenerateRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(lDate)))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lIdentifacition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfIdentification))
                                        .addGap(11, 11, 11)
                                        .addComponent(btnSearchClient))
                                    .addComponent(lActivities))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lDate)
                    .addComponent(lIdentifacition))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lActivities)
                .addGap(3, 3, 3)
                .addComponent(jScrollPaneActivities, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddActivities)
                    .addComponent(tfTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTask)
                    .addComponent(lTime))
                .addGap(12, 12, 12)
                .addComponent(lInputs)
                .addGap(1, 1, 1)
                .addComponent(jScrollPaneInputs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddInputs)
                    .addComponent(tfInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lInput)
                    .addComponent(lCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerateRegister)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddActivities;
    public javax.swing.JButton btnAddInputs;
    public javax.swing.JButton btnGenerateRegister;
    public javax.swing.JButton btnSearchClient;
    public com.github.lgooddatepicker.components.DatePicker dateSelected;
    private javax.swing.JScrollPane jScrollPaneActivities;
    private javax.swing.JScrollPane jScrollPaneInputs;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lActivities;
    private javax.swing.JLabel lCost;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lIdentifacition;
    private javax.swing.JLabel lInput;
    private javax.swing.JLabel lInputs;
    private javax.swing.JLabel lTask;
    private javax.swing.JLabel lTime;
    private javax.swing.JTable tableActivities;
    private javax.swing.JTable tableInputs;
    public javax.swing.JTextField tfCost;
    public javax.swing.JTextField tfIdentification;
    public javax.swing.JTextField tfInput;
    private javax.swing.JTextField tfTask;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}