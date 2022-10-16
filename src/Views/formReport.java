package Views;

/**
 *
 * @author Camila Carrero
 */
public class formReport extends javax.swing.JPanel {
    
    private static formReport formReport = null;
    
    private formReport() {
        initComponents();
    }
    
    public static formReport getInstance() {
        if (formReport == null) {
            formReport = new formReport();
        }
        return formReport;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        btnGenerateReport = new javax.swing.JButton();
        dateFrom = new com.github.lgooddatepicker.components.DatePicker();
        dateTo = new com.github.lgooddatepicker.components.DatePicker();
        cbInsurance = new javax.swing.JComboBox<>();
        lIdentification = new javax.swing.JLabel();
        tfIdentification = new javax.swing.JTextField();
        btnSearchClient = new javax.swing.JButton();
        lInsurance = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lFrom = new javax.swing.JLabel();
        lTo = new javax.swing.JLabel();
        lTypeService = new javax.swing.JLabel();
        cbTypeService = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(128, 169, 225));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));

        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Reporte");
        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setMinimumSize(new java.awt.Dimension(150, 23));
        tittle.setPreferredSize(new java.awt.Dimension(150, 23));
        tittle.setToolTipText("");

        btnGenerateReport.setText("Generar");

        cbInsurance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Provincia Seguros", "La Segunda Seguros", "Seguros Rivadavia" }));
        cbInsurance.setBackground(new java.awt.Color(255, 255, 255));
        cbInsurance.setForeground(new java.awt.Color(0, 0, 0));
        cbInsurance.setToolTipText("Seleccionar Seguro");

        lIdentification.setText("Nº de Documento");
        lIdentification.setForeground(new java.awt.Color(0, 0, 0));

        tfIdentification.setBackground(new java.awt.Color(255, 255, 255));
        tfIdentification.setForeground(new java.awt.Color(0, 0, 0));

        btnSearchClient.setText("Buscar Cliente");

        lInsurance.setText("Compañia de Seguro");
        lInsurance.setForeground(new java.awt.Color(0, 0, 0));

        lDate.setText("Fecha");
        lDate.setForeground(new java.awt.Color(0, 0, 0));

        lFrom.setText("Desde");
        lFrom.setForeground(new java.awt.Color(0, 0, 0));

        lTo.setText("Hasta");
        lTo.setForeground(new java.awt.Color(0, 0, 0));

        lTypeService.setText("Tipo de Servicio");
        lTypeService.setForeground(new java.awt.Color(0, 0, 0));

        cbTypeService.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Frenos", "Electricidad", "Tren delantero y amortiguación", "Encendido y carburación", "Chapa y pintura", "Mecánica en general" }));
        cbTypeService.setBackground(new java.awt.Color(255, 255, 255));
        cbTypeService.setForeground(new java.awt.Color(0, 0, 0));
        cbTypeService.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnGenerateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnSearchClient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(cbTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lInsurance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTypeService)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lFrom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lTo)
                                .addGap(98, 98, 98)))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(lIdentification))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lDate)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lFrom)
                    .addComponent(lTo))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTypeService, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lInsurance)
                    .addComponent(lTypeService))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchClient)
                    .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lIdentification)
                .addGap(51, 51, 51)
                .addComponent(btnGenerateReport)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnGenerateReport;
    public javax.swing.JButton btnSearchClient;
    public javax.swing.JComboBox<String> cbInsurance;
    public javax.swing.JComboBox<String> cbTypeService;
    public com.github.lgooddatepicker.components.DatePicker dateFrom;
    public com.github.lgooddatepicker.components.DatePicker dateTo;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lFrom;
    private javax.swing.JLabel lIdentification;
    private javax.swing.JLabel lInsurance;
    private javax.swing.JLabel lTo;
    private javax.swing.JLabel lTypeService;
    public javax.swing.JTextField tfIdentification;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}