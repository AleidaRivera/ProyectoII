
package tallergestion.moduloServicios;

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;


public class FormularioServicio extends javax.swing.JPanel {

    
    public FormularioServicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        lblTipo = new javax.swing.JLabel();
        comboTipoServicio = new javax.swing.JComboBox<>();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblPrioridad = new javax.swing.JLabel();
        comboPrioridad = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        rbtnActivo = new javax.swing.JRadioButton();
        lblMensaje = new javax.swing.JLabel();
        rbtnInactivo = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        setLayout(new java.awt.GridLayout(7, 2));

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTipo.setText("Tipo de Servicio");
        add(lblTipo);

        comboTipoServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica", "Pintura", "Revision", "Otros" }));
        comboTipoServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoServicioActionPerformed(evt);
            }
        });
        add(comboTipoServicio);

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescripcion.setText("Descripcion");
        add(lblDescripcion);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Hola Muguiwaras!!");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);

        lblPrioridad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrioridad.setText("Prioridad");
        add(lblPrioridad);

        comboPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "baja" }));
        comboPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrioridadActionPerformed(evt);
            }
        });
        add(comboPrioridad);

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEstado.setText("Estado");
        add(lblEstado);

        rbtnActivo.setBackground(new java.awt.Color(255, 255, 255));
        grupoEstado.add(rbtnActivo);
        rbtnActivo.setText("Activo");
        add(rbtnActivo);
        add(lblMensaje);

        rbtnInactivo.setBackground(new java.awt.Color(255, 255, 255));
        grupoEstado.add(rbtnInactivo);
        rbtnInactivo.setText("Inactivo");
        add(rbtnInactivo);

        btnGuardar.setBackground(new java.awt.Color(153, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGuardar.setText("Guardar Servicio");
        add(btnGuardar);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        add(btnCerrar);
    }// </editor-fold>//GEN-END:initComponents

    private void comboPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPrioridadActionPerformed

    private void comboTipoServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoServicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoServicioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Container contenedor = FormularioServicio.this.getParent();
        if (contenedor instanceof JPanel) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
        cl.show(contenedor, "inicio");
}

        
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboPrioridad;
    private javax.swing.JComboBox<String> comboTipoServicio;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JRadioButton rbtnActivo;
    private javax.swing.JRadioButton rbtnInactivo;
    // End of variables declaration//GEN-END:variables
}
