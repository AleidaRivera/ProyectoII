
package tallergestion.ModuloOrdenesdeTrabajo;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
        jPanel2 = new javax.swing.JPanel();
        lblVehiculo = new javax.swing.JLabel();
        ComboVehiculos = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        tablaServiciosSeleccionados = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
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
        ComboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClientesActionPerformed(evt);
            }
        });
        jPanel1.add(ComboClientes);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        lblVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVehiculo.setText("Vehiculo");
        jPanel2.add(lblVehiculo);

        ComboVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(ComboVehiculos);

        add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num", "Servicio", "Descripcion ", "Precio", "Prioridad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaServiciosSeleccionados.setViewportView(tablaCliente);

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

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
    

    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private void ComboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboClientesActionPerformed
    
    }//GEN-LAST:event_ComboClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboClientes;
    private javax.swing.JComboBox<String> ComboVehiculos;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JLabel lblMensConf;
    private javax.swing.JLabel lblVehiculo;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JScrollPane tablaServiciosSeleccionados;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaIngreso;
    // End of variables declaration//GEN-END:variables

    private void cargarCliente() {
    String seleccionado = (String) ComboClientes.getSelectedItem();

    if (seleccionado == null || seleccionado.equals("Seleccione un cliente")) {
        return;
    }

    // Obtener solo el ID (antes del guion)
    String idSeleccionado = seleccionado.split("-")[0].trim();

    try (BufferedReader br = new BufferedReader(new FileReader("clientes.txt"))) {
        String linea;
        DefaultTableModel modelo = (DefaultTableModel) tablaCliente.getModel();
        modelo.setRowCount(0); 

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 4) {
                String id = partes[0].trim();
                if (id.equals(idSeleccionado)) {
                    String nombre = partes[1].trim();
                    String telefono = partes[2].trim();
                    String direccion = partes[3].trim();

                    Object[] fila = { id, nombre, telefono, direccion };
                    modelo.addRow(fila);
                    break;
                }
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer cliente: " + e.getMessage());
    }
    }
}
