
package tallergestion.vista;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FormularioCliente extends javax.swing.JPanel {

   
    public FormularioCliente() {
        initComponents();
 
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID1 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreCliente = new java.awt.TextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new java.awt.TextField();
        btnRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        setLayout(new java.awt.GridLayout(6, 2));

        lblID1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID1.setText("ID Cliente");
        add(lblID1);
        add(txtIdCliente);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Completo");
        add(jLabel1);

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        add(txtNombreCliente);
        txtNombreCliente.getAccessibleContext().setAccessibleName("txtNombre");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Telefono");
        add(jLabel2);
        add(txtTelefono);
        txtTelefono.getAccessibleContext().setAccessibleName("txtTelefono");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Direccion");
        add(jLabel3);

        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        add(txtDireccion);
        txtDireccion.getAccessibleContext().setAccessibleName("txtDireccion");

        btnRegistrar.setBackground(new java.awt.Color(51, 255, 204));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        add(btnCerrar);
        add(lblMensaje);
        lblMensaje.getAccessibleContext().setAccessibleName("lblMensaje ");
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         registraCliente();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        Container contenedor = FormularioCliente.this.getParent();
        if (contenedor instanceof JPanel) {
            CardLayout cl = (CardLayout) contenedor.getLayout();
            cl.show(contenedor, "inicio"); // Este es el nombre del panel neutral que creaste
        }

    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
      
    }//GEN-LAST:event_txtNombreClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblMensaje;
    private java.awt.TextField txtDireccion;
    private javax.swing.JTextField txtIdCliente;
    private java.awt.TextField txtNombreCliente;
    private java.awt.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void registraCliente() {
   String idTexto = txtIdCliente.getText().trim();
   String nombre = txtNombreCliente.getText().trim();
   String telefono = txtTelefono.getText().trim();
   String direccion = txtDireccion.getText().trim();

    if (idTexto.isEmpty() || nombre.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
    return;
    }

    try {
    int id = Integer.parseInt(idTexto); 
    
    try (FileWriter fw = new FileWriter("clientes.txt", true);
         BufferedWriter bw = new BufferedWriter(fw);
         PrintWriter pw = new PrintWriter(bw)) {
        pw.println(id + "," + nombre + "," + telefono + "," + direccion);
        JOptionPane.showMessageDialog(this, "Cliente registrado correctamente.");
        txtIdCliente.setText("");
        txtNombreCliente.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el cliente: " + e.getMessage());
    }
    
    } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.");
  }
    }
}
