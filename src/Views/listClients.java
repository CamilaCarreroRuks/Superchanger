package Views;

/**
 *
 * @author Camila Carrero
 */
public class listClients extends javax.swing.JPanel {
  
    private static listClients listClients = null;
    
    private listClients() {
        initComponents();
    }
    
    public static listClients getInstance() {
        if (listClients == null) {
            listClients = new listClients();
        }
        return listClients;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bModificar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        tittle = new javax.swing.JLabel();
        bAgregar = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        tfBuscar = new javax.swing.JTextField();
        filtro = new javax.swing.JComboBox<>();
        jPanel = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 200, 251), 10));
        jPanel1.setLayout(new java.awt.BorderLayout());

        setBackground(new java.awt.Color(128, 169, 225));
        setMaximumSize(new java.awt.Dimension(500, 450));
        setMinimumSize(new java.awt.Dimension(500, 450));
        setPreferredSize(new java.awt.Dimension(500, 450));

        bModificar.setText("Modificar");
        bModificar.setFocusCycleRoot(true);
        bModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bModificar.setMaximumSize(new java.awt.Dimension(90, 25));
        bModificar.setMinimumSize(new java.awt.Dimension(90, 25));
        bModificar.setPreferredSize(new java.awt.Dimension(90, 25));

        bEliminar.setText("Eliminar");
        bEliminar.setFocusCycleRoot(true);
        bEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bEliminar.setMaximumSize(new java.awt.Dimension(90, 25));
        bEliminar.setMinimumSize(new java.awt.Dimension(90, 25));
        bEliminar.setPreferredSize(new java.awt.Dimension(90, 25));
        bEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tittle.setBackground(new java.awt.Color(128, 169, 225));
        tittle.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(0, 0, 0));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Clientes");

        bAgregar.setText("Agregar");
        bAgregar.setFocusCycleRoot(true);
        bAgregar.setHideActionText(true);
        bAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAgregar.setMaximumSize(new java.awt.Dimension(90, 25));
        bAgregar.setMinimumSize(new java.awt.Dimension(90, 25));
        bAgregar.setName(""); // NOI18N
        bAgregar.setPreferredSize(new java.awt.Dimension(90, 25));
        bAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        bBuscar.setText("Buscar");
        bBuscar.setFocusCycleRoot(true);
        bBuscar.setHideActionText(true);
        bBuscar.setMaximumSize(new java.awt.Dimension(85, 25));
        bBuscar.setMinimumSize(new java.awt.Dimension(85, 25));
        bBuscar.setPreferredSize(new java.awt.Dimension(85, 25));

        tfBuscar.setBackground(new java.awt.Color(240, 240, 240));
        tfBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfBuscar.setForeground(new java.awt.Color(153, 153, 153));
        tfBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        tfBuscar.setMinimumSize(new java.awt.Dimension(150, 21));
        tfBuscar.setName(""); // NOI18N
        tfBuscar.setPreferredSize(new java.awt.Dimension(150, 30));

        filtro.setBackground(new java.awt.Color(240, 240, 240));
        filtro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Nombre", "Dni" }));

        jPanel.setBackground(new java.awt.Color(128, 169, 225));
        jPanel.setMinimumSize(new java.awt.Dimension(23, 100));
        jPanel.setPreferredSize(new java.awt.Dimension(548, 380));

        jScrollPane.setBackground(new java.awt.Color(128, 169, 225));
        jScrollPane.setBorder(null);
        jScrollPane.setWheelScrollingEnabled(false);

        table.setAutoCreateRowSorter(true);
        table.setBackground(new java.awt.Color(204, 204, 204));
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setForeground(new java.awt.Color(153, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Documento", "Teléfono ", "Seguro", "Póliza", "Modelo ", "Marca "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText("");
        table.setFocusable(false);
        table.setGridColor(new java.awt.Color(240, 240, 240));
        table.setRowHeight(25);
        table.setShowGrid(true);
        jScrollPane.setViewportView(table);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane)
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bAgregar;
    private javax.swing.JButton bBuscar;
    public static javax.swing.JButton bEliminar;
    public javax.swing.JButton bModificar;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    public static javax.swing.JTable table;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}