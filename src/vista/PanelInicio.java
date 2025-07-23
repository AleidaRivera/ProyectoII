
package vista;

//Se creo   un panel neutral de inicio, este panel se utiliza como fondo “de descanso” cuando no se esté usando los formularios.

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;



public class PanelInicio extends javax.swing.JPanel {

    
    public PanelInicio() {
        initComponents();
        // Layout externo para agregar imagen debajo del mensaje
          this.setLayout(new BorderLayout());

        JPanel mensajePanel = new JPanel();
        mensajePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mensajePanel.add(lblBienvenida);

         // Crear imagen escalada
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/taller.png"));
        Image imagenEscalada = icono.getImage().getScaledInstance(850, 580, Image.SCALE_SMOOTH);
        ImageIcon iconoReducido = new ImageIcon(imagenEscalada);

         // JLabel con la imagen centrada
        JLabel imagenLabel = new JLabel(iconoReducido);
        imagenLabel.setHorizontalAlignment(SwingConstants.CENTER);

               // Agregar al panel principal
            this.add(mensajePanel, BorderLayout.NORTH);
            this.add(imagenLabel, BorderLayout.CENTER);


        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBienvenida = new javax.swing.JLabel();

        lblBienvenida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBienvenida.setText("Bienvenido al sistema Taller Gestion, seleccione una opción del menu lateral.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBienvenida;
    // End of variables declaration//GEN-END:variables
}
