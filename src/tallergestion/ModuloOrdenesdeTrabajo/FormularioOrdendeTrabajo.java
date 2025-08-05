
package tallergestion.ModuloOrdenesdeTrabajo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;



public class FormularioOrdendeTrabajo extends javax.swing.JPanel {

    /**
     * Creates new form FormularioOrdendeTrabajo
     */
    public FormularioOrdendeTrabajo() {
        initComponents();
        cargarClientes(); 
        configurarEventos();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tablaServiciosSeleccionados = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        lblFechaIngreso = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        lblFechaEntrega = new javax.swing.JLabel();
        txtFechaEntrega = new javax.swing.JTextField();
        lblCosto = new javax.swing.JLabel();
        btnRegistrarOrden = new javax.swing.JButton();
        btnCargarServicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboClientes = new javax.swing.JComboBox<>();
        txtCostoTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        comboVehiculos = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Orden de Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setLayout(new java.awt.GridLayout(4, 3));

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

        lblFechaIngreso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaIngreso.setText("Fecha de ingreso");

        lblFechaEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFechaEntrega.setText("Fecha de entrega");

        lblCosto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCosto.setText("Costo $");

        btnRegistrarOrden.setBackground(new java.awt.Color(102, 255, 204));
        btnRegistrarOrden.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarOrden.setText("Registar orden");
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });

        btnCargarServicio.setBackground(new java.awt.Color(51, 153, 0));
        btnCargarServicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCargarServicio.setText("Ver Servicios ");
        btnCargarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarServicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Auto");

        comboClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        comboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClientesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Cliente");

        comboVehiculos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(431, 684, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblFechaEntrega))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tablaServiciosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCosto)
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(txtCostoTotal)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFechaIngreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(btnCargarServicio)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarOrden)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(comboVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(tablaServiciosSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaIngreso)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaEntrega)
                            .addComponent(txtFechaEntrega))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarOrden)
                            .addComponent(btnCargarServicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCosto)
                    .addComponent(txtCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
        
        String clienteSeleccionado = (String) comboClientes.getSelectedItem();
        String vehiculoSeleccionado = (String) comboVehiculos.getSelectedItem();
        String fechaIngreso = txtFechaIngreso.getText().trim();
        String fechaEntrega = txtFechaEntrega.getText().trim();
        String costoTotalStr = txtCostoTotal.getText().trim();

if (clienteSeleccionado == null || clienteSeleccionado.equals("Seleccione")) {
    JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

if (vehiculoSeleccionado == null || vehiculoSeleccionado.equals("Seleccione")) {
    JOptionPane.showMessageDialog(this, "Debe seleccionar un vehículo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

if (fechaIngreso.isEmpty() || fechaEntrega.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar la fecha de ingreso y de entrega.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

if (costoTotalStr.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe ingresar el costo total.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

double costoTotal;
try {
    String costoLimpio = costoTotalStr.replace(",", ".");
    costoTotal = Double.parseDouble(costoLimpio);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "El costo total debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}


List<String> serviciosSeleccionados = new ArrayList<>();
DefaultTableModel modeloServicios = (DefaultTableModel) tablaServicios.getModel();
int filas = modeloServicios.getRowCount();

for (int i = 0; i < filas; i++) {
    Boolean seleccionado = (Boolean) modeloServicios.getValueAt(i, 4); 
    if (seleccionado != null && seleccionado) {
        String descripcionServicio = modeloServicios.getValueAt(i, 2).toString(); 
        serviciosSeleccionados.add(descripcionServicio);
    }
}

if (serviciosSeleccionados.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe seleccionar al menos un servicio.", "Advertencia", JOptionPane.WARNING_MESSAGE);
    return;
}

String numeroOrden = generarNumeroOrden();
String serviciosConcatenados = String.join(";", serviciosSeleccionados);

String linea = numeroOrden + "," + clienteSeleccionado + "," + vehiculoSeleccionado + "," + serviciosConcatenados + "," + fechaIngreso + "," + fechaEntrega + "," + costoTotal;

try (BufferedWriter writer = new BufferedWriter(new FileWriter("orden_servicio.txt", true))) {
    writer.write(linea);
    writer.newLine();
    JOptionPane.showMessageDialog(this, "Orden registrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    comboClientes.setSelectedIndex(0);
    comboVehiculos.setSelectedIndex(0);
    
    for (int i = 0; i < filas; i++) {
        modeloServicios.setValueAt(false, i, 4);
    }
    txtFechaIngreso.setText("");
    txtFechaEntrega.setText("");
    txtCostoTotal.setText("");

} catch (IOException ex) {
    JOptionPane.showMessageDialog(this, "Error al guardar la orden: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed
    
    private void btnCargarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarServicioActionPerformed
          cargarServicios();
    }//GEN-LAST:event_btnCargarServicioActionPerformed

    private void comboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClientesActionPerformed

    private void comboVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboVehiculosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarServicio;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JComboBox<String> comboVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblFechaEntrega;
    private javax.swing.JLabel lblFechaIngreso;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JScrollPane tablaServiciosSeleccionados;
    private javax.swing.JTextField txtCostoTotal;
    private javax.swing.JTextField txtFechaEntrega;
    private javax.swing.JTextField txtFechaIngreso;
    // End of variables declaration//GEN-END:variables


    private void cargarServicios() {
  
       
        DefaultTableModel modelo = new DefaultTableModel(
        new Object[]{"Num", "Servicio", "Descripción", "Precio", "Seleccionar"},
        0
    ) {
        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex == 4) return Boolean.class; 
            return String.class;
        }

        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 4; 
        }
    };

    tablaServicios.setModel(modelo); 

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
                String nombre = datos[1].trim();
                String descripcion = datos[2].trim();
                String precio = datos[3].trim();

                modelo.addRow(new Object[]{
                    numero++,
                    nombre,
                    descripcion,
                    Double.parseDouble(precio.replace(".", "").replace(",", ".")),
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

   
    modelo.addTableModelListener(e -> {
        if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 4) {
            calcularCostoTotal();
        }
    });
    }

    private void calcularCostoTotal() {
     DefaultTableModel modelo = (DefaultTableModel) tablaServicios.getModel();
    double total = 0.0;

    for (int i = 0; i < modelo.getRowCount(); i++) {
        Boolean seleccionado = (Boolean) modelo.getValueAt(i, 4); 
        if (Boolean.TRUE.equals(seleccionado)) {
            try {
                double precio = Double.parseDouble(modelo.getValueAt(i, 3).toString());
                total += precio;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en el precio en la fila " + (i + 1));
            }
        }
    }

    txtCostoTotal.setText(String.format("%.2f", total)); 
    }

    private String generarNumeroOrden() {
          int contador = 1;
    File archivo = new File("ordenes.txt");
    if (archivo.exists()) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contador++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    return String.format("ORD%03d", contador);
    }

    private void cargarClientes() {
        comboClientes.removeAllItems();
    comboClientes.addItem("Seleccione");

    File archivoClientes = new File("clientes.txt");
    if (!archivoClientes.exists()) {
        JOptionPane.showMessageDialog(this, "No existe el archivo de clientes.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (BufferedReader br = new BufferedReader(new FileReader(archivoClientes))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");

            if (partes.length >= 2) {
                String id = partes[0].trim();
                String nombre = partes[1].trim();
                comboClientes.addItem(id + " - " + nombre);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo de clientes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

   private void configurarEventos() {
    comboClientes.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String clienteSeleccionado = (String) comboClientes.getSelectedItem();
            cargarVehiculosDeCliente(clienteSeleccionado);
        }
    });
   }
    private void cargarVehiculosDeCliente(String clienteSeleccionado) {
      comboVehiculos.removeAllItems();
    comboVehiculos.addItem("Seleccione");

    if (clienteSeleccionado == null || clienteSeleccionado.equals("Seleccione")) {
        return;
    }

    String idCliente = clienteSeleccionado.split(" - ")[0].trim(); 

    File archivoVehiculos = new File("vehiculos.txt");
    if (!archivoVehiculos.exists()) {
        JOptionPane.showMessageDialog(this, "No existe el archivo de vehículos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    boolean encontrado = false;

    try (BufferedReader br = new BufferedReader(new FileReader(archivoVehiculos))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");

            if (partes.length >= 5) {
                String clienteID = partes[0].trim();   
                String placa = partes[1].trim();
                String marca = partes[2].trim();
                String modelo = partes[3].trim();
                String anio = partes[4].trim();

                if (clienteID.equals(idCliente)) {
                    String descripcionVehiculo = placa + " - " + marca + " " + modelo + " (" + anio + ")";
                    comboVehiculos.addItem(descripcionVehiculo);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Este cliente no tiene vehículos registrados.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer vehículos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}



