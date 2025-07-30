
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
        btnBuscarOrdenes = new javax.swing.JButton();
        txtNumeroOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenesServicios = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDetalleOrden = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnModificarOrden = new javax.swing.JButton();
        btnCerrarOrden = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orden de trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar ordenes por criterio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 2, 3));

        btnBuscarOrdenes.setText("Buscar");
        btnBuscarOrdenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenesActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarOrdenes);

        txtNumeroOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroOrdenActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroOrden);

        jPanel1.add(jPanel2);

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

        jPanel1.add(jScrollPane1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de la Orden", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tablaDetalleOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cliente ", "Vehiculo", "Fecha Ingreso", "Fecha Entrega ", "Estado", "Costo"
            }
        ));
        jScrollPane2.setViewportView(tablaDetalleOrden);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jPanel1.add(jPanel3);

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

        jPanel1.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    File archivoOriginal = new File("orden_servicios.txt");
    File archivoTemporal = new File("orden_servicios_temp.txt");

    try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
         BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 5) {
                String ord = partes[0].trim();

                // Si es la orden seleccionada, cambiamos el estado a Completada
                if (ord.equals(codigoOrden)) {
                    String idServicio = partes[1].trim();
                    String nombre = partes[2].trim();
                    String descripcion = partes[3].trim();
                    String precio = partes[4].trim();
                    String categoria = (partes.length > 5) ? partes[5].trim() : "No definido";

                    // Estado actualizado
                    String nuevaLinea = ord + "," + idServicio + "," + nombre + "," + descripcion + "," + precio + "," + categoria + ",Completada";
                    bw.write(nuevaLinea);
                } else {
                    // Dejar la línea igual si no es la orden seleccionada
                    bw.write(linea);
                }
                bw.newLine();
            }
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Reemplazar el archivo original por el temporal
    if (archivoOriginal.delete()) {
        archivoTemporal.renameTo(archivoOriginal);
    }

    JOptionPane.showMessageDialog(this, "Orden " + codigoOrden + " cerrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    // Refrescar la tabla para mostrar el nuevo estado
    cargarOrdenes(); // Asume que tienes un método para recargar la tabla desde el archivo
    }//GEN-LAST:event_btnCerrarOrdenActionPerformed

    private void btnBuscarOrdenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenesActionPerformed
       
     String numeroOrden = txtNumeroOrden.getText().trim();

DefaultTableModel modelo = new DefaultTableModel(
    new String[]{"Orden", "ID Servicio", "Nombre", "Descripción", "Precio", "Categoría", "Estado"}, 0
) {
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (getRowCount() > 0 && columnIndex < getColumnCount()) {
            Object value = getValueAt(0, columnIndex);
            return (value != null) ? value.getClass() : Object.class;
        }
        return Object.class;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
};

tablaOrdenesServicios.setModel(modelo);

File archivo = new File("orden_servicios.txt");

if (!archivo.exists()) {
    JOptionPane.showMessageDialog(this, "No hay servicios asociados a órdenes.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    return;
}

try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
    String linea;
    boolean encontrado = false;
    boolean buscarTodas = numeroOrden.isEmpty();
    String ordenMostrada = null;

    while ((linea = br.readLine()) != null) {
        linea = linea.trim();
        if (linea.isEmpty()) continue;

        String[] partes = linea.split(",");

        if (partes.length >= 5) {
            String ord = partes[0].trim();
            String idServicio = partes[1].trim();
            String nombreServicio = partes[2].trim();
            String descripcion = partes[3].trim();
            String precio = partes[4].trim();
            String categoria = (partes.length > 5) ? partes[5].trim() : "No definido";
            String estado = (partes.length > 6) ? partes[6].trim() : "No definido";

            if (buscarTodas || ord.equalsIgnoreCase(numeroOrden)) {
                modelo.addRow(new Object[]{
                    ord, idServicio, nombreServicio, descripcion, precio, categoria, estado
                });
                encontrado = true;

                // Guardar la orden mostrada (para mostrar su detalle luego)
                if (!buscarTodas) {
                    ordenMostrada = ord;
                }
            }
        }
    }

    if (!encontrado) {
        if (buscarTodas) {
            JOptionPane.showMessageDialog(this, "No hay servicios registrados en el sistema.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron servicios para la orden " + numeroOrden, "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        // ✅ Mostrar detalle de la orden en la tabla inferior
        if (!buscarTodas && ordenMostrada != null) {
            mostrarDetalleOrden(ordenMostrada); // 👈 aquí se muestra el detalle automáticamente
        }
    }

} catch (IOException ex) {
    JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

    }//GEN-LAST:event_btnBuscarOrdenesActionPerformed
    }
    private void txtNumeroOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroOrdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOrdenes;
    private javax.swing.JButton btnCerrarOrden;
    private javax.swing.JButton btnModificarOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaDetalleOrden;
    private javax.swing.JTable tablaOrdenesServicios;
    private javax.swing.JTextField txtNumeroOrden;
    // End of variables declaration//GEN-END:variables

    private void cargarOrdenes() {
       DefaultTableModel modelo = (DefaultTableModel) tablaOrdenesServicios.getModel();
    modelo.setRowCount(0); // Limpiar tabla antes de cargar

    File archivo = new File("orden_servicios.txt");
    if (!archivo.exists()) {
        // Si el archivo no existe, no hacer nada o mostrar mensaje
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            // Según tu formato: orden, idServicio, nombre, descripcion, precio, categoria, estado (opcional)
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

    private void mostrarDetalleOrden(String ordenMostrada) {
   
          DefaultTableModel modeloDetalle = (DefaultTableModel) tablaDetalleOrden.getModel();
    modeloDetalle.setRowCount(0); // limpiar tabla

    File archivo = new File("ordenes.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo de órdenes no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            // Formato esperado: ID,Cliente,Vehiculo,FechaIngreso,FechaEntrega,Estado,Costo
            if (datos[0].equalsIgnoreCase(ordenMostrada)) {
                modeloDetalle.addRow(new Object[]{
                    datos[1], // Cliente
                    datos[2], // Vehículo
                    datos[3], // Fecha ingreso
                    datos[4], // Fecha entrega
                    datos[5], // Estado
                    datos[6]  // Costo total
                });
                break;
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer detalles de la orden.", "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }
}
