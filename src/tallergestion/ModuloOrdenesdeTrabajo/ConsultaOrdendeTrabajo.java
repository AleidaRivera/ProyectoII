
package tallergestion.ModuloOrdenesdeTrabajo;


public class ConsultaOrdendeTrabajo extends javax.swing.JPanel {

    
    public ConsultaOrdendeTrabajo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFiltroCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFiltroVehiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFiltroFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxFiltroEstado = new javax.swing.JComboBox<>();
        btnBuscarOrdenes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDetalleCliente = new javax.swing.JTextField();
        ComboBoxDetalleVehiculo = new javax.swing.JComboBox<>();
        txtDetalleIngreso = new javax.swing.JTextField();
        txtDetalleEntrega = new javax.swing.JTextField();
        txtDetalleEstado = new javax.swing.JTextField();
        txtDetalleCosto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnModificarOrden = new javax.swing.JButton();
        btnCerrarOrden = new javax.swing.JButton();
        lblMensajeAccion = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orden de trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar ordenes por criterio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 3));

        jLabel1.setText("Cliente");
        jPanel2.add(jLabel1);
        jPanel2.add(txtFiltroCliente);

        jLabel2.setText("Vehículo");
        jPanel2.add(jLabel2);
        jPanel2.add(txtFiltroVehiculo);

        jLabel3.setText("Fecha ingreso");
        jPanel2.add(jLabel3);
        jPanel2.add(txtFiltroFecha);

        jLabel5.setText("Estado");
        jPanel2.add(jLabel5);

        ComboBoxFiltroEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "En progreso", "Finalizado", "Orden Cancelada" }));
        jPanel2.add(ComboBoxFiltroEstado);

        btnBuscarOrdenes.setText("Buscar");
        btnBuscarOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenesActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarOrdenes);

        jLabel4.setText("--");
        jPanel2.add(jLabel4);

        jPanel1.add(jPanel2);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Fecha ingreso", "Fecha entrega", "Estado", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de la Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(2, 5));

        jLabel11.setText("Cliente");
        jPanel3.add(jLabel11);

        jLabel12.setText("Vehiculo");
        jPanel3.add(jLabel12);

        jLabel10.setText("Fecha ingreso");
        jPanel3.add(jLabel10);

        jLabel6.setText("Fecha entrega");
        jPanel3.add(jLabel6);

        jLabel7.setText("Estado");
        jPanel3.add(jLabel7);

        jLabel8.setText("Costo");
        jPanel3.add(jLabel8);

        txtDetalleCliente.setEditable(false);
        jPanel3.add(txtDetalleCliente);

        ComboBoxDetalleVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(ComboBoxDetalleVehiculo);

        txtDetalleIngreso.setEditable(false);
        jPanel3.add(txtDetalleIngreso);
        jPanel3.add(txtDetalleEntrega);
        jPanel3.add(txtDetalleEstado);
        jPanel3.add(txtDetalleCosto);

        jPanel1.add(jPanel3);

        btnModificarOrden.setBackground(new java.awt.Color(102, 255, 204));
        btnModificarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarOrden.setText("Modificar Orden");
        jPanel4.add(btnModificarOrden);

        btnCerrarOrden.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarOrden.setText("Cerrar Orden");
        jPanel4.add(btnCerrarOrden);

        lblMensajeAccion.setText("Este label es para mostar el mensaje \"orden cerrada con exito ect\"");
        jPanel4.add(lblMensajeAccion);

        jPanel1.add(jPanel4);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenesActionPerformed
  
    }//GEN-LAST:event_btnBuscarOrdenesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxDetalleVehiculo;
    private javax.swing.JComboBox<String> ComboBoxFiltroEstado;
    private javax.swing.JButton btnBuscarOrdenes;
    private javax.swing.JButton btnCerrarOrden;
    private javax.swing.JButton btnModificarOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensajeAccion;
    private javax.swing.JTextField txtDetalleCliente;
    private javax.swing.JTextField txtDetalleCosto;
    private javax.swing.JTextField txtDetalleEntrega;
    private javax.swing.JTextField txtDetalleEstado;
    private javax.swing.JTextField txtDetalleIngreso;
    private javax.swing.JTextField txtFiltroCliente;
    private javax.swing.JTextField txtFiltroFecha;
    private javax.swing.JTextField txtFiltroVehiculo;
    // End of variables declaration//GEN-END:variables
}
