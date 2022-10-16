package Views;

/**
 *
 * @author Camila Carrero
 */
public class formClient extends javax.swing.JPanel {

    private static formClient formClient = null;
        
    private formClient() {
        initComponents();
    }
    
    public static formClient getInstance() {
        if (formClient == null) {
            formClient = new formClient();
        }
        return formClient;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lName = new javax.swing.JLabel();
        lSurname = new javax.swing.JLabel();
        tfSurname = new javax.swing.JTextField();
        lPhone = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lIdentification = new javax.swing.JLabel();
        tfIdentification = new javax.swing.JTextField();
        cbTypeIdentification = new javax.swing.JComboBox<>();
        lType = new javax.swing.JLabel();
        tfPolicy = new javax.swing.JTextField();
        lPolicy = new javax.swing.JLabel();
        cbInsurance = new javax.swing.JComboBox<>();
        lInsurance = new javax.swing.JLabel();
        tfModelVehicle = new javax.swing.JTextField();
        lModelVehicle = new javax.swing.JLabel();
        lBrandVehicle = new javax.swing.JLabel();
        tfBrandVehicle = new javax.swing.JTextField();
        btnAddClient = new javax.swing.JButton();

        setBackground(new java.awt.Color(128, 169, 225));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));

        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Nuevo Cliente");
        tittle.setToolTipText("");
        tittle.setMinimumSize(new java.awt.Dimension(150, 23));
        tittle.setPreferredSize(new java.awt.Dimension(150, 23));

        tfName.setBackground(new java.awt.Color(255, 255, 255));
        tfName.setForeground(new java.awt.Color(0, 0, 0));
        tfName.setToolTipText("Nombre");

        lName.setForeground(new java.awt.Color(0, 0, 0));
        lName.setText("Nombre");

        lSurname.setForeground(new java.awt.Color(0, 0, 0));
        lSurname.setText("Apellido");

        tfSurname.setBackground(new java.awt.Color(255, 255, 255));
        tfSurname.setForeground(new java.awt.Color(0, 0, 0));
        tfSurname.setToolTipText("Nombre");

        lPhone.setForeground(new java.awt.Color(0, 0, 0));
        lPhone.setText("Teléfono");

        tfPhone.setBackground(new java.awt.Color(255, 255, 255));
        tfPhone.setForeground(new java.awt.Color(0, 0, 0));
        tfPhone.setToolTipText("Nombre");

        lIdentification.setForeground(new java.awt.Color(0, 0, 0));
        lIdentification.setText("Nº de Documento");

        tfIdentification.setBackground(new java.awt.Color(255, 255, 255));
        tfIdentification.setForeground(new java.awt.Color(0, 0, 0));
        tfIdentification.setToolTipText("Nombre");

        cbTypeIdentification.setBackground(new java.awt.Color(255, 255, 255));
        cbTypeIdentification.setForeground(new java.awt.Color(0, 0, 0));
        cbTypeIdentification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "LC", " " }));

        lType.setForeground(new java.awt.Color(0, 0, 0));
        lType.setText("Tipo");

        tfPolicy.setBackground(new java.awt.Color(255, 255, 255));
        tfPolicy.setForeground(new java.awt.Color(0, 0, 0));
        tfPolicy.setToolTipText("Nombre");

        lPolicy.setForeground(new java.awt.Color(0, 0, 0));
        lPolicy.setText("Póliza");

        cbInsurance.setBackground(new java.awt.Color(255, 255, 255));
        cbInsurance.setForeground(new java.awt.Color(0, 0, 0));
        cbInsurance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincia Seguros", "La Segunda Seguros", "Seguros Rivadavia" }));
        cbInsurance.setToolTipText("Seleccionar Seguro");

        lInsurance.setForeground(new java.awt.Color(0, 0, 0));
        lInsurance.setText("Compañia de Seguro");

        tfModelVehicle.setBackground(new java.awt.Color(255, 255, 255));
        tfModelVehicle.setForeground(new java.awt.Color(0, 0, 0));
        tfModelVehicle.setToolTipText("Nombre");

        lModelVehicle.setForeground(new java.awt.Color(0, 0, 0));
        lModelVehicle.setText("Modelo del Vehículo");

        lBrandVehicle.setForeground(new java.awt.Color(0, 0, 0));
        lBrandVehicle.setText("Marca del Vehículo");

        tfBrandVehicle.setBackground(new java.awt.Color(255, 255, 255));
        tfBrandVehicle.setForeground(new java.awt.Color(0, 0, 0));
        tfBrandVehicle.setToolTipText("Nombre");

        btnAddClient.setText("Agregar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lSurname)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lName)
                                .addGap(77, 77, 77)))
                        .addGap(29, 29, 29)
                        .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lType)
                                        .addGap(46, 46, 46)
                                        .addComponent(lIdentification)
                                        .addGap(15, 15, 15))
                                    .addComponent(cbInsurance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cbTypeIdentification, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(8, 8, 8)
                                        .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lPhone)
                                        .addGap(77, 77, 77))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lModelVehicle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lBrandVehicle)
                                .addGap(50, 50, 50))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfModelVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tfBrandVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lInsurance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lPolicy)
                                .addGap(79, 79, 79))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(btnAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName)
                    .addComponent(lSurname))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lPhone))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTypeIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lIdentification)
                            .addComponent(lType))))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPolicy)
                    .addComponent(lInsurance))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfModelVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBrandVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lModelVehicle)
                    .addComponent(lBrandVehicle))
                .addGap(18, 18, 18)
                .addComponent(btnAddClient)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddClient;
    public javax.swing.JComboBox<String> cbInsurance;
    public javax.swing.JComboBox<String> cbTypeIdentification;
    private javax.swing.JLabel lBrandVehicle;
    private javax.swing.JLabel lIdentification;
    private javax.swing.JLabel lInsurance;
    private javax.swing.JLabel lModelVehicle;
    private javax.swing.JLabel lName;
    private javax.swing.JLabel lPhone;
    private javax.swing.JLabel lPolicy;
    private javax.swing.JLabel lSurname;
    private javax.swing.JLabel lType;
    public javax.swing.JTextField tfBrandVehicle;
    public javax.swing.JTextField tfIdentification;
    public javax.swing.JTextField tfModelVehicle;
    public javax.swing.JTextField tfName;
    public javax.swing.JTextField tfPhone;
    public javax.swing.JTextField tfPolicy;
    public javax.swing.JTextField tfSurname;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}