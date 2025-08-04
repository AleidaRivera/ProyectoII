
package tallergestion.ModuloOrdenesdeTrabajo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaOrdendeTrabajo extends javax.swing.JPanel {

    
    public ConsultaOrdendeTrabajo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNumeroOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenesServicios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnModificarOrden = new javax.swing.JButton();
        btnCerrarOrden = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orden de trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar ordenes por criterio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 3));
        jPanel2.add(txtNumeroOrden);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tablaOrdenesServicios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaOrdenesServicios);

        btnModificarOrden.setBackground(new java.awt.Color(102, 255, 204));
        btnModificarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarOrden.setText("Modificar Orden");
        btnModificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOrdenActionPerformed(evt);
            }
        });
        jPanel4.add(btnModificarOrden);

        btnCerrarOrden.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarOrden.setText("Cerrar Orden");
        btnCerrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarOrdenActionPerformed(evt);
            }
        });
        jPanel4.add(btnCerrarOrden);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOrdenActionPerformed
   
    }//GEN-LAST:event_btnModificarOrdenActionPerformed

    private void btnCerrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarOrdenActionPerformed
      int filaSeleccionada = tablaOrdenesServicios.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una orden para cerrar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String codigoOrden = tablaOrdenesServicios.getValueAt(filaSeleccionada, 0).toString();

    int opcion = JOptionPane.showConfirmDialog(this,
            "¿Está seguro que desea cerrar la orden " + codigoOrden + "?",
            "Confirmar cierre", JOptionPane.YES_NO_OPTION);

    if (opcion != JOptionPane.YES_OPTION) return;

    File archivoOriginal = new File("ordenes.txt");
    File archivoTemporal = new File("ordenes.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
         BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 5) {
                String ord = partes[0].trim();

                
                if (ord.equals(codigoOrden)) {
                    String idServicio = partes[1].trim();
                    String nombre = partes[2].trim();
                    String descripcion = partes[3].trim();
                    String precio = partes[4].trim();
                    String categoria = (partes.length > 5) ? partes[5].trim() : "No definido";

                    
                    String nuevaLinea = ord + "," + idServicio + "," + nombre + "," + descripcion + "," + precio + "," + categoria + ",Completada";
                    bw.write(nuevaLinea);
                } else {
                   
                    bw.write(linea);
                }
                bw.newLine();
            }
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    if (archivoOriginal.delete()) {
        archivoTemporal.renameTo(archivoOriginal);
    }

    JOptionPane.showMessageDialog(this, "Orden " + codigoOrden + " cerrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

   
    cargarOrdenes(); 
    }//GEN-LAST:event_btnCerrarOrdenActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarOrden;
    private javax.swing.JButton btnModificarOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaOrdenesServicios;
    private javax.swing.JTextField txtNumeroOrden;
    // End of variables declaration//GEN-END:variables

    private void cargarOrdenes() {
       DefaultTableModel modelo = (DefaultTableModel) tablaOrdenesServicios.getModel();
    modelo.setRowCount(0); 

    File archivo = new File("orden_servicios.txt");
    if (!archivo.exists()) {
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 6) {
                String orden = partes[0].trim();
                String idServicio = partes[1].trim();
                String nombre = partes[2].trim();
                String descripcion = partes[3].trim();
                String precio = partes[4].trim();
                String categoria = partes[5].trim();
                String estado = (partes.length > 6) ? partes[6].trim() : "Pendiente";

                Object[] fila = {orden, idServicio, nombre, descripcion, precio, categoria, estado};
                modelo.addRow(fila);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar órdenes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
}
 

