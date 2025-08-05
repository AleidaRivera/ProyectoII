
package tallergestion.ModuloOrdenesdeTrabajo;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class ConsultaOrdendeTrabajo extends javax.swing.JPanel {

    
    public ConsultaOrdendeTrabajo() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCerrarOrden = new javax.swing.JButton();
        btnModificarOrden = new javax.swing.JButton();
        btnBuscarOrden = new javax.swing.JButton();
        txtNumeroOrden = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenesServicios = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orden de trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar ordenes por criterio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btnCerrarOrden.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarOrden.setText("Cerrar Orden");
        btnCerrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarOrdenActionPerformed(evt);
            }
        });

        btnModificarOrden.setBackground(new java.awt.Color(102, 255, 204));
        btnModificarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificarOrden.setText("Modificar Orden");
        btnModificarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarOrdenActionPerformed(evt);
            }
        });

        btnBuscarOrden.setText("Buscar");
        btnBuscarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado de busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        tablaOrdenesServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Descripcion", "Fecha Ingreso", "Fecha Entrega", "Estado", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaOrdenesServicios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnBuscarOrden)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnCerrarOrden)
                        .addGap(117, 117, 117)
                        .addComponent(btnModificarOrden))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarOrden)
                    .addComponent(txtNumeroOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrarOrden)
                    .addComponent(btnModificarOrden))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 971, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarOrdenActionPerformed
        
         int filaSeleccionada = tablaOrdenesServicios.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla para modificar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String idOrden = tablaOrdenesServicios.getValueAt(filaSeleccionada, 0).toString();
    String cliente = tablaOrdenesServicios.getValueAt(filaSeleccionada, 1).toString();
    String vehiculo = tablaOrdenesServicios.getValueAt(filaSeleccionada, 2).toString();
    String fechaIngreso = tablaOrdenesServicios.getValueAt(filaSeleccionada, 3).toString();
    String fechaEntrega = tablaOrdenesServicios.getValueAt(filaSeleccionada, 4).toString();
    String costoTotal = tablaOrdenesServicios.getValueAt(filaSeleccionada, 5).toString();

    File archivo = new File("orden_servicio.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo de órdenes no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    List<String> lineasActualizadas = new ArrayList<>();
    boolean modificada = false;

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.startsWith(idOrden + ",")) {
                String nuevaLinea = idOrden + "," + cliente + "," + vehiculo + "," + fechaIngreso + "," + fechaEntrega + "," + costoTotal;
                lineasActualizadas.add(nuevaLinea);
                modificada = true;
            } else {
                lineasActualizadas.add(linea);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!modificada) {
        JOptionPane.showMessageDialog(this, "No se encontró la orden con ID: " + idOrden, "Información", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
        for (String l : lineasActualizadas) {
            bw.write(l);
            bw.newLine();
        }
        JOptionPane.showMessageDialog(this, "Orden modificada correctamente en el archivo.");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al escribir en el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
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

    File archivoOriginal = new File("orden_servicio.txt");
    File archivoTemporal = new File("orden_servicio_temp.txt");

    List<String[]> ordenCerrada = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
         BufferedWriter bw = new BufferedWriter(new FileWriter(archivoTemporal))) {

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 6) {
                String id = partes[0].trim();
                if (id.equals(codigoOrden)) {
                    
                    partes[4] = "Completada"; 
                    ordenCerrada.add(partes); 

                   
                    String nuevaLinea = String.join(",", partes);
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

    
    generarFactura(codigoOrden, ordenCerrada);

    JOptionPane.showMessageDialog(this, "Orden " + codigoOrden + " cerrada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    cargarOrdenes();

    }//GEN-LAST:event_btnCerrarOrdenActionPerformed

    private void btnBuscarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenActionPerformed
   

    String idBusqueda = txtNumeroOrden.getText().trim();
    String rutaArchivo = "orden_servicio.txt";
    DefaultTableModel modelo = (DefaultTableModel) tablaOrdenesServicios.getModel();
    modelo.setRowCount(0);

    try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
    String linea;
    boolean encontrado = false;

    while ((linea = br.readLine()) != null) {
        String[] partes = linea.split(",");
        if (partes.length >= 7) {
            String numeroOrden = partes[0].trim();

            
            if (!idBusqueda.isEmpty() && !numeroOrden.equalsIgnoreCase(idBusqueda)) {
                continue;
            }

            String[] datosCliente = partes[1].trim().split(" - ");
            String cliente = (datosCliente.length > 1) ? datosCliente[1].trim() : partes[1].trim();

            String vehiculo = partes[2].trim();
            String servicios = partes[3].trim();
            String fechaIngreso = partes[4].trim();
            String fechaEntrega = partes[5].trim();
            String costoTotal = partes[6].trim();
            String estado = "Activo";
            
            

            String descripcionServicios = servicios.replace(";", ", ");

            modelo.addRow(new Object[]{
                numeroOrden,
                cliente,
                descripcionServicios,
                fechaIngreso,
                fechaEntrega,
                estado,
                costoTotal
            });

            encontrado = true;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(this, "No se encontraron órdenes con ese número.");
    }

    } catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarOrdenActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOrden;
    private javax.swing.JButton btnCerrarOrden;
    private javax.swing.JButton btnModificarOrden;
    private javax.swing.JPanel jPanel1;
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

    private void generarFactura(String codigoOrden, List<String[]> serviciosOrden) {
        
       if (serviciosOrden.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No hay datos para la factura.", "Factura vacía", JOptionPane.WARNING_MESSAGE);
        return;
    }

    StringBuilder factura = new StringBuilder();
    factura.append("========= FACTURA =========\n");
    factura.append("Código de Orden: ").append(codigoOrden).append("\n\n");

    for (String[] partes : serviciosOrden) {
        if (partes.length >= 7) {
            factura.append("Cliente: ").append(partes[1]).append("\n");
            factura.append("Vehículo: ").append(partes[2]).append("\n");
            factura.append("Servicios: ").append(partes[3]).append("\n");
            factura.append("Fecha Ingreso: ").append(partes[4]).append("\n");
            factura.append("Fecha Entrega: ").append(partes[5]).append("\n");
            factura.append("Costo Total: ₡").append(partes[6]).append("\n");
            factura.append("Estado: ").append("Completada").append("\n");
        }
    }

    factura.append("===========================\n");

    // Mostrar factura en un cuadro de diálogo
    JTextArea areaFactura = new JTextArea(factura.toString());
    areaFactura.setEditable(false);
    JOptionPane.showMessageDialog(null, new JScrollPane(areaFactura), "Factura Generada", JOptionPane.INFORMATION_MESSAGE);
}
    
}
 

