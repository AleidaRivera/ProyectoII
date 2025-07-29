
package tallergestion.ModuloOrdenesdeTrabajo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



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
        ComboClientesYVehiculos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tablaServiciosSeleccionados = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaEntrega = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JTextField();
        btnRegistrarOrden = new javax.swing.JButton();
        btnCargarServicio = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Orden de Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        lblCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCliente.setText("Cliente");
        jPanel1.add(lblCliente);

        ComboClientesYVehiculos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        ComboClientesYVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboClientesYVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(ComboClientesYVehiculos);

        add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));
        add(jPanel2);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num", "Servicio", "Descripcion ", "Precio", "Seleccionar"
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
        tablaServiciosSeleccionados.setViewportView(tablaServicios);

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

        btnCargarServicio.setBackground(new java.awt.Color(51, 153, 0));
        btnCargarServicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCargarServicio.setText("Cargar Servicios ");
        btnCargarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarServicioActionPerformed(evt);
            }
        });
        jPanel4.add(btnCargarServicio);

        add(jPanel4);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
        
    DefaultTableModel modelo = (DefaultTableModel) tablaServicios.getModel();

    
    String codigoOrden = generarCodigoOrden();

    boolean haySeleccion = false;

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("orden_servicios.txt", true))) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Boolean seleccionado = (Boolean) modelo.getValueAt(i, 0);
            if (seleccionado != null && seleccionado) {
                haySeleccion = true;

                String id = (String) modelo.getValueAt(i, 1);
                String nombre = (String) modelo.getValueAt(i, 2);
                String descripcion = (String) modelo.getValueAt(i, 3);
                String precio = (String) modelo.getValueAt(i, 4);
                String tipo = (String) modelo.getValueAt(i, 5);
                String estado = (String) modelo.getValueAt(i, 6);

                bw.write(codigoOrden + "," + id + "," + nombre + "," + descripcion + "," + precio + "," + tipo + "," + estado);
                bw.newLine();
            }
        }

        if (haySeleccion) {
            JOptionPane.showMessageDialog(this, "Orden registrada con código: " + codigoOrden);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un servicio.");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar la orden: " + e.getMessage());
    }

    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private void ComboClientesYVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboClientesYVehiculosActionPerformed
    
      ComboClientesYVehiculos.removeAllItems();
      ComboClientesYVehiculos.addItem("-- Seleccione Cliente y Vehículo --");

      File archivoClientes = new File("clientes.txt");
      File archivoVehiculos = new File("vehiculos.txt");

if (!archivoClientes.exists()) {
    ComboClientesYVehiculos.addItem("No hay clientes registrados");
    return;
}

try (BufferedReader brClientes = new BufferedReader(new FileReader(archivoClientes))) {
    String lineaCliente;
    
    while ((lineaCliente = brClientes.readLine()) != null) {
        String[] datosCliente = lineaCliente.split(",");
        if (datosCliente.length >= 2) {
            String idCliente = datosCliente[0].trim();
            String nombreCliente = datosCliente[1].trim();
            
            ComboClientesYVehiculos.addItem("*" + idCliente + " - " + nombreCliente);
            
            if (archivoVehiculos.exists()) {
                try (BufferedReader brVehiculos = new BufferedReader(new FileReader(archivoVehiculos))) {
                    String lineaVehiculo;
                    boolean tieneVehiculos = false;
                    
                    while ((lineaVehiculo = brVehiculos.readLine()) != null) {
                        String[] datosVehiculo = lineaVehiculo.split(",");
                           
                        if (datosVehiculo.length >= 5 && datosVehiculo[0].trim().equals(idCliente)) {
                            String placa = datosVehiculo[1].trim();
                            String marca = datosVehiculo[2].trim();
                            String modelo = datosVehiculo[3].trim();
                            String año = datosVehiculo[4].trim(); 
                            
                            ComboClientesYVehiculos.addItem("**" + placa + " - " + marca + " " + modelo + " " + año);
                            tieneVehiculos = true;
                        }
                    }
                    
                    if (!tieneVehiculos) {
                        ComboClientesYVehiculos.addItem("️Sin vehículos registrados");
                    }
                    
                } catch (IOException e) {
                    ComboClientesYVehiculos.addItem("Error al cargar vehículos");
                }
            } else {
                ComboClientesYVehiculos.addItem("No existe archivo de vehículos");
            }
            
            ComboClientesYVehiculos.addItem("────────────────────────────");
        }
    }
    
} catch (IOException e) {
    JOptionPane.showMessageDialog(this, "Error al cargar datos: " + e.getMessage());
    }//GEN-LAST:event_ComboClientesYVehiculosActionPerformed
    }
    private void btnCargarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarServicioActionPerformed
          cargarServicios();
    }//GEN-LAST:event_btnCargarServicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboClientesYVehiculos;
    private javax.swing.JButton btnCargarServicio;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JScrollPane tablaServiciosSeleccionados;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaIngreso;
    // End of variables declaration//GEN-END:variables



    private String generarCodigoOrden() {
        int contador = 1;
        File archivo = new File("orden_servicios.txt");
        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    contador++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return "ORD" + String.format("%03d", contador);
        
    
    }

    private void cargarServicios() {
         DefaultTableModel modelo = (DefaultTableModel) tablaServicios.getModel();
    modelo.setRowCount(0); // Limpiar tabla
    
    File archivo = new File("servicios.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "No existe el archivo servicios.txt");
        return;
    }
    
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;
        int numero = 1;
        
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            
            if (datos.length >= 4) {
                String id = datos[0].trim();
                String nombre = datos[1].trim();
                String descripcion = datos[2].trim();
                String precio = datos[3].trim();
                
             
                modelo.addRow(new Object[]{
                    numero++,           
                    nombre,          
                    descripcion,      
                    Double.parseDouble(precio), 
                    false             
                });
            }
        }
        
        if (modelo.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay servicios registrados en el archivo");
        }
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer servicios: " + e.getMessage());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error en el formato del precio: " + e.getMessage());
    }
    }

  
    
}
