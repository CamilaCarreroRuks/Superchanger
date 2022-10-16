package Views;

/**
 *
 * @author Camila Carrero
 */
public class formDiary extends javax.swing.JPanel {
    
    private static formDiary formDiary = null;
    
    private formDiary() {
        initComponents();
    }
    
    public static formDiary getInstance() {
        if (formDiary == null) {
            formDiary = new formDiary();
        }
        return formDiary;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        lTypeService = new javax.swing.JLabel();
        cbTypeService = new javax.swing.JComboBox<>();
        btnAddTurn = new javax.swing.JButton();
        calendarPanel = new com.github.lgooddatepicker.components.CalendarPanel();
        btnAddAssistance = new javax.swing.JButton();
        lHour = new javax.swing.JLabel();
        time = new com.github.lgooddatepicker.components.TimePicker();
        panelTurnGiven = new javax.swing.JPanel();
        cbAssistance = new javax.swing.JCheckBox();
        tfClient = new javax.swing.JTextField();
        lClient = new javax.swing.JLabel();
        tfVehicle = new javax.swing.JTextField();
        lVehicle = new javax.swing.JLabel();
        lAssistance = new javax.swing.JLabel();
        btnGenerateProofTurn = new javax.swing.JButton();

        setBackground(new java.awt.Color(128, 169, 225));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));

        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Agenda");
        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setMinimumSize(new java.awt.Dimension(150, 23));
        tittle.setPreferredSize(new java.awt.Dimension(150, 23));
        tittle.setToolTipText("");

        lTypeService.setText("Tipo de Servicio");
        lTypeService.setForeground(new java.awt.Color(0, 0, 0));

        cbTypeService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frenos", "Electricidad", "Tren delantero y amortiguación", "Encendido y carburación", "Chapa y pintura", "Mecánica en general" }));
        cbTypeService.setBackground(new java.awt.Color(255, 255, 255));
        cbTypeService.setForeground(new java.awt.Color(0, 0, 0));
        cbTypeService.setToolTipText("");

        btnAddTurn.setText("Agregar Turno");

        calendarPanel.setNextFocusableComponent(time);

        btnAddAssistance.setText("Registrar Asistencia");

        lHour.setText("Hora");
        lHour.setForeground(new java.awt.Color(0, 0, 0));

        time.setAutoscrolls(true);
        time.setFocusCycleRoot(true);

        panelTurnGiven.setBackground(new java.awt.Color(128, 169, 225));
        panelTurnGiven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbAssistance.setBackground(new java.awt.Color(128, 169, 225));
        cbAssistance.setEnabled(false);
        cbAssistance.setForeground(new java.awt.Color(0, 0, 0));
        cbAssistance.setRequestFocusEnabled(false);
        cbAssistance.setRolloverEnabled(false);

        tfClient.setEditable(false);
        tfClient.setBackground(new java.awt.Color(255, 255, 255));
        tfClient.setForeground(new java.awt.Color(0, 0, 0));
        tfClient.setToolTipText("Nombre");

        lClient.setText("Cliente");
        lClient.setForeground(new java.awt.Color(0, 0, 0));

        tfVehicle.setEditable(false);
        tfVehicle.setBackground(new java.awt.Color(255, 255, 255));
        tfVehicle.setForeground(new java.awt.Color(0, 0, 0));
        tfVehicle.setToolTipText("Nombre");

        lVehicle.setText("Vehiculo");
        lVehicle.setForeground(new java.awt.Color(0, 0, 0));

        lAssistance.setForeground(new java.awt.Color(0, 0, 0));
        lAssistance.setText("Asistencia");

        javax.swing.GroupLayout panelTurnGivenLayout = new javax.swing.GroupLayout(panelTurnGiven);
        panelTurnGiven.setLayout(panelTurnGivenLayout);
        panelTurnGivenLayout.setHorizontalGroup(
            panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTurnGivenLayout.createSequentialGroup()
                .addGroup(panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTurnGivenLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfClient, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfVehicle)))
                    .addGroup(panelTurnGivenLayout.createSequentialGroup()
                        .addGroup(panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTurnGivenLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lClient))
                            .addGroup(panelTurnGivenLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lVehicle))
                            .addGroup(panelTurnGivenLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(cbAssistance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAssistance)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelTurnGivenLayout.setVerticalGroup(
            panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTurnGivenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(tfVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTurnGivenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAssistance)
                    .addComponent(lAssistance))
                .addContainerGap())
        );

        btnGenerateProofTurn.setText("Generar Comprobante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lTypeService))
                            .addComponent(cbTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(lHour))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(panelTurnGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnAddTurn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerateProofTurn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddAssistance)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(cbTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTypeService)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lHour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTurnGiven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTurn)
                    .addComponent(btnAddAssistance)
                    .addComponent(btnGenerateProofTurn))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddAssistance;
    public javax.swing.JButton btnAddTurn;
    public javax.swing.JButton btnGenerateProofTurn;
    public com.github.lgooddatepicker.components.CalendarPanel calendarPanel;
    public javax.swing.JCheckBox cbAssistance;
    public javax.swing.JComboBox<String> cbTypeService;
    private javax.swing.JLabel lAssistance;
    private javax.swing.JLabel lClient;
    private javax.swing.JLabel lHour;
    private javax.swing.JLabel lTypeService;
    private javax.swing.JLabel lVehicle;
    private javax.swing.JPanel panelTurnGiven;
    public javax.swing.JTextField tfClient;
    public javax.swing.JTextField tfVehicle;
    public com.github.lgooddatepicker.components.TimePicker time;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}