
package tallergestion.vista;



import java.awt.CardLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ConsultaClientes extends javax.swing.JPanel {

 
    public ConsultaClientes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        ltxtNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        ltxtDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        ltxtTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCliente = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        setLayout(new java.awt.BorderLayout(2, 2));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "Telefono", "Direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID.setText("ID Cliente");
        jPanel1.add(lblID);
        lblID.getAccessibleContext().setAccessibleName("lblID");

        jPanel1.add(txtId);

        ltxtNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ltxtNombre.setText("Nombre Completo");
        jPanel1.add(ltxtNombre);
        jPanel1.add(txtNombre);

        ltxtDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ltxtDireccion.setText("Direccion");
        jPanel1.add(ltxtDireccion);
        jPanel1.add(txtDireccion);

        ltxtTelefono.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ltxtTelefono.setText("Telefono");
        jPanel1.add(ltxtTelefono);
        jPanel1.add(txtTelefono);

        btnModificar.setBackground(new java.awt.Color(51, 255, 204));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);

        btnEliminar.setBackground(new java.awt.Color(255, 255, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar por ID Cliente");
        jPanel2.add(jLabel1);

        btnBuscarCliente.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCliente);
        jPanel2.add(txtBuscarCliente);

        add(jPanel2, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Container contenedor = ConsultaClientes.this.getParent();  
    if (contenedor instanceof JPanel) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
        cl.show(contenedor, "inicio"); // Este es el nombre del panel neutral que creaste
     }
            
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
      String idBuscar = txtBuscarCliente.getText().trim();

    if (idBuscar.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID de cliente.");
        return;
    }

    File archivo = new File("clientes.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "No hay clientes registrados.");
        return;
    }

    DefaultTableModel modelo = (DefaultTableModel) tablaClientes.getModel();
    modelo.setRowCount(0); // Limpia la tabla antes de mostrar resultados

    boolean encontrado = false;

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");

            if (datos.length >= 4 && datos[0].equals(idBuscar)) {
                String id = datos[0];
                String nombre = datos[1];
                String telefono = datos[2];
                String direccion = datos[3];

                modelo.addRow(new Object[]{id, nombre, telefono, direccion});
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado.");
        }

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + e.getMessage());
    }
        
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    String id = txtId.getText().trim();
    String nombre = txtNombre.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String direccion = txtDireccion.getText().trim();

    if (id.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File archivo = new File("clientes.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "No existe el archivo clientes.txt", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        List<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 4) {
                String idCliente = partes[0];
                if (idCliente.equals(id)) {
                    
                    linea = id + "," + nombre + "," + telefono + "," + direccion;
                    encontrado = true;
                }
            }
            lineas.add(linea);
        }
        br.close();

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Cliente con ID " + id + " no encontrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

       
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for (String l : lineas) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();

        JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al modificar el cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtId.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del cliente a eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    File archivo = new File("clientes.txt");
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "El archivo clientes.txt no existe", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        List<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length >= 1) {
                String idCliente = partes[0];
                if (idCliente.equals(id)) {
                    // No agregamos esta línea para eliminarla
                    encontrado = true;
                    continue;
                }
            }
            lineas.add(linea);
        }
        br.close();

        if (!encontrado) {
            JOptionPane.showMessageDialog(this, "Cliente con ID " + id + " no encontrado.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Sobrescribir archivo sin la línea eliminada
        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        for (String l : lineas) {
            bw.write(l);
            bw.newLine();
        }
        bw.close();

        JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Aquí podrías actualizar la tabla o limpiar campos
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error al eliminar el cliente: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel ltxtDireccion;
    private javax.swing.JLabel ltxtNombre;
    private javax.swing.JLabel ltxtTelefono;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
    


