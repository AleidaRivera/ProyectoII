
package tallergestion.moduloVehiculos;

import java.awt.CardLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ConsultaVehiculos extends javax.swing.JPanel {

    public ConsultaVehiculos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnModificarVehiculo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscarVehiculo = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();

        setName(""); // NOI18N
        setLayout(new java.awt.BorderLayout());

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Marca", "Modelo", "Año", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVehiculos);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Marca");
        jPanel1.add(jLabel1);
        jPanel1.add(txtMarca);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2);
        jPanel1.add(txtModelo);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3);
        jPanel1.add(txtAño);

        Placa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Placa.setText("Placa");
        jPanel1.add(Placa);
        jPanel1.add(txtPlaca);

        btnModificarVehiculo.setBackground(new java.awt.Color(102, 255, 204));
        btnModificarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnModificarVehiculo.setText("Modificar");
        jPanel1.add(btnModificarVehiculo);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);

        btnEliminarVehiculo.setBackground(new java.awt.Color(255, 255, 51));
        btnEliminarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminarVehiculo.setText("Eliminar");
        jPanel1.add(btnEliminarVehiculo);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar por ID Cliente");
        jPanel2.add(jLabel5);

        btnBuscarVehiculo.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarVehiculo.setText("Buscar");
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarVehiculo);
        jPanel2.add(txtIdCliente);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleName("Consultar Vehiculos");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Container contenedor = ConsultaVehiculos.this.getParent();
        if (contenedor instanceof JPanel) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
         cl.show(contenedor, "inicio");
}
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
       String idTexto = txtIdCliente.getText().trim();

    if (idTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un ID de cliente.");
        return;
    }

    try {
        int idCliente = Integer.parseInt(idTexto);
        DefaultTableModel modelo = (DefaultTableModel) tablaVehiculos.getModel();
        modelo.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader("vehiculos.txt"))) {
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 5) {
                    int idArchivo = Integer.parseInt(datos[0]);

                    if (idArchivo == idCliente) {
                        String id = datos[1];
                        String marca = datos[2];
                        String modeloVeh = datos[3];
                        String anio = datos[4];

                        modelo.addRow(new Object[]{id, marca, modeloVeh, anio});
                        encontrado = true;
                    }
                }
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No se encontraron vehículos para este cliente.");
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El ID debe ser un número.");
    }
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Placa;
    private javax.swing.JButton btnBuscarVehiculo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnModificarVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    
}
    

