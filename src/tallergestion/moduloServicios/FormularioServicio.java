
package tallergestion.moduloServicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;




public class FormularioServicio extends javax.swing.JPanel {

    
    public FormularioServicio() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        lblTipo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnCerrar1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        comboTipo = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(0, 0, 0));
        lblTipo.setText("Tipo de Servicio");

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripcion");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Precio ");

        btnCerrar1.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar1.setText("Cerrar");
        btnCerrar1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 102));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanica", "Pintura", "Cambio de Llanatas", "Otros" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, Short.MAX_VALUE)
                        .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String nombre = (String) comboTipo.getSelectedItem();
    String precio = txtPrecio.getText().trim();
    String descripcion = txtDescripcion.getText().trim();

    if (nombre != null && !precio.isEmpty() && !descripcion.isEmpty()) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("servicios.txt", true))) {
            int id = generarId();
            bw.write(id + "," + nombre + "," + precio + "," + descripcion + "," + nombre + ",Activo");
          
            bw.newLine();
            JOptionPane.showMessageDialog(this, "Servicio guardado correctamente.");

            txtPrecio.setText("");
            txtDescripcion.setText("");
            comboTipo.setSelectedIndex(0); 

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar el servicio.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Complete todos los campos.");
    }
}

    private int generarId() {
    int id = 1;
    try (BufferedReader br = new BufferedReader(new FileReader("servicios.txt"))) {
        while (br.readLine() != null) id++;
    } catch (IOException e) {
       
    }
    return id;
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    
}
