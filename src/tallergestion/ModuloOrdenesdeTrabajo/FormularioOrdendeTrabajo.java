
package tallergestion.ModuloOrdenesdeTrabajo;

import java.awt.CardLayout;
import tallergestion.moduloServicios.AsociarServicioOrden;


public class FormularioOrdendeTrabajo extends javax.swing.JPanel {

    /**
     * Creates new form FormularioOrdendeTrabajo
     */
    public FormularioOrdendeTrabajo() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        ComboClientes = new javax.swing.JComboBox<>();
        btnBuscarCliente = new javax.swing.JButton();
        lblErrorCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        ComboVehiculos = new javax.swing.JComboBox<>();
        btnValidarVehiculo = new javax.swing.JButton();
        lblErrorVehiculo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnServiciosrealizados = new javax.swing.JButton();
        ComboServicios = new javax.swing.JComboBox<>();
        tablaServiciosSeleccionados = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaEntrega = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        btnRegistrarOrden = new javax.swing.JButton();
        lblMensConf = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Orden de Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCliente.setText("Cliente");
        jPanel1.add(lblCliente);

        ComboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(ComboClientes);

        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCliente);

        lblErrorCliente.setText("--");
        jPanel1.add(lblErrorCliente);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setText("Vehiculo");
        jPanel2.add(lblVehiculo);

        ComboVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(ComboVehiculos);

        btnValidarVehiculo.setText("Validar");
        jPanel2.add(btnValidarVehiculo);

        lblErrorVehiculo.setText("--");
        jPanel2.add(lblErrorVehiculo);

        add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        btnServiciosrealizados.setBackground(new java.awt.Color(102, 255, 204));
        btnServiciosrealizados.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnServiciosrealizados.setText("Servicio realizados");
        btnServiciosrealizados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnServiciosrealizados.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btnServiciosrealizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServiciosrealizadosActionPerformed(evt);
            }
        });
        jPanel3.add(btnServiciosrealizados);

        ComboServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(ComboServicios);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "pintura", "pintar carro",  new Double(50000.0), "media"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num", "Servicio", "Descripcion ", "Precio", "Prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaServiciosSeleccionados.setViewportView(jTable1);

        jPanel3.add(tablaServiciosSeleccionados);

        add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(4, 3));

        lblFechaIngreso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaIngreso.setText("Fecha de ingreso");
        jPanel4.add(lblFechaIngreso);
        jPanel4.add(txtFechaIngreso);

        lblFechaEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaEntrega.setText("Fecha de entrega");
        jPanel4.add(lblFechaEntrega);
        jPanel4.add(txtFechaEntrega);

        lblCosto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCosto.setText("Costo");
        jPanel4.add(lblCosto);
        jPanel4.add(txtCostoTotal);

        btnRegistrarOrden.setBackground(new java.awt.Color(102, 255, 204));
        btnRegistrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarOrden.setText("Registar orden");
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });
        jPanel4.add(btnRegistrarOrden);

        lblMensConf.setText("--");
        jPanel4.add(lblMensConf);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnServiciosrealizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServiciosrealizadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnServiciosrealizadosActionPerformed

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
    

    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboClientes;
    private javax.swing.JComboBox<String> ComboServicios;
    private javax.swing.JComboBox<String> ComboVehiculos;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JButton btnServiciosrealizados;
    private javax.swing.JButton btnValidarVehiculo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblErrorCliente;
    private javax.swing.JLabel lblErrorVehiculo;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblMensConf;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JScrollPane tablaServiciosSeleccionados;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaIngreso;
    // End of variables declaration//GEN-END:variables
}
