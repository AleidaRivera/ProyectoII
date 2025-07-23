
package tallergestion.vista;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class FormularioCliente extends javax.swing.JPanel {

   
    public FormularioCliente() {
        initComponents();
  
    btnRegistrar.addActionListener((ActionEvent e) -> {
    String nombre = txtNombre.getText().trim();
    String telefono = txtTelefono.getText().trim();
    String direccion = txtDireccion.getText().trim();

    if (nombre.isEmpty() || telefono.isEmpty()) {
        lblMensaje.setText(" Nombre y teléfono son obligatorios");
    } else {
        lblMensaje.setText(" Cliente registrado: " + nombre);
        // Aquí se debera  agregar lógica para guardar los .txt
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }
});

        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new java.awt.TextField();
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

        lblID.setText("----");
        add(lblID);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre");
        add(jLabel1);
        add(txtNombre);
        txtNombre.getAccessibleContext().setAccessibleName("txtNombre");

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
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        Container contenedor = FormularioCliente.this.getParent();
        if (contenedor instanceof JPanel) {
            CardLayout cl = (CardLayout) contenedor.getLayout();
            cl.show(contenedor, "inicio"); // Este es el nombre del panel neutral que creaste
        }

    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblMensaje;
    private java.awt.TextField txtDireccion;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
