
package tallergestion.moduloServicios;




public class FormularioServicio extends javax.swing.JPanel {

    
    public FormularioServicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        lblTipo = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        setLayout(new java.awt.GridLayout(7, 2));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTipo.setText("Tipo de Servicio");
        add(lblTipo);
        add(jTextField3);

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescripcion.setText("Descripcion");
        add(lblDescripcion);
        add(jTextField1);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Servicio");
        add(jLabel1);
        add(jTextField2);

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar Servicio");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar);
        add(lblMensaje);

        btnCerrar1.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCerrar1.setText("Cerrar");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        add(btnCerrar1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrar1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblTipo;
    // End of variables declaration//GEN-END:variables

   
   
    

    
}
