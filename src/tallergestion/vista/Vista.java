package tallergestion.vista;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
//import tallergestion.FormularioCliente;
import tallergestion.ModuloOrdenesdeTrabajo.ConsultaOrdendeTrabajo;
import tallergestion.ModuloOrdenesdeTrabajo.FormularioOrdendeTrabajo;
import tallergestion.moduloServicios.AsociarServicioOrden;
import tallergestion.moduloServicios.FormularioServicio;
import tallergestion.moduloVehiculos.ConsultaVehiculos;
import tallergestion.moduloVehiculos.FormularioVehiculo;
import vista.PanelInicio;

public class Vista extends javax.swing.JFrame {
 
    public Vista() {
    initComponents();

    //Ocultar los botones del submenu Clientes
    btnRegistrarCliente.setVisible(false);
    btnConsultarCliente.setVisible(false);
    PanelSubmenuClientes.setVisible(false);
    
    
    // Mostrar u ocultar el submenu cuando se toca el boton Clientes
    btnClientes.addActionListener(e -> {
        boolean visible = btnRegistrarCliente.isVisible(); // podés usar cualquiera
        btnRegistrarCliente.setVisible(!visible);
        btnConsultarCliente.setVisible(!visible);
    });
      
    PanelSubmenuOrdenes.setVisible(false);
    btnRegistrarOrden.setVisible(false);
    btnConsultarOrden.setVisible(false);

    

    // Instancias de paneles 
    FormularioCliente panelRegistro = new FormularioCliente(); //hacemos la llamada
    ConsultaClientes panelConsulta = new ConsultaClientes();
    FormularioVehiculo panelRegistroVehiculo = new FormularioVehiculo();
    ConsultaVehiculos panelConsultaVehiculo = new ConsultaVehiculos();
    ConsultaOrdendeTrabajo panelConsultaOrden = new ConsultaOrdendeTrabajo();
    
    
    
     //Agregarlos al panel con CardLayout 
    PanelContenido.setLayout(new CardLayout());
    add(PanelContenido, BorderLayout.CENTER);
    PanelContenido.add(new PanelInicio(), "inicio");
    PanelContenido.add(panelRegistro, "registro");
    PanelContenido.add(panelConsulta, "consulta");
    PanelContenido.add(new FormularioVehiculo(), "registroVehiculo"); 
    PanelContenido.add(new ConsultaVehiculos(), "consultaVehiculo");
    PanelContenido.add(panelRegistroVehiculo, "registroVehiculo");
    PanelContenido.add(panelConsultaVehiculo, "consultaVehiculo");
    PanelContenido.add(new FormularioServicio(), "registroServicio");
    PanelContenido.add(new AsociarServicioOrden(), "asociarServicio");
    PanelContenido.add(new FormularioOrdendeTrabajo(), "formularioOrden");
    PanelContenido.add(panelConsultaOrden, "consultarOrden");


   


   
   


    



    
    
    // Mostrar el vacío al inicio
    ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio");
    
    
    
         //Conectar los botones secundarios SubmenuClientes
    btnRegistrarCliente.addActionListener(e -> {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "registro");
    });

    btnConsultarCliente.addActionListener((ActionEvent e) -> {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "consulta");
    });
}
    
   


    
    
    
    
                 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelvista = new javax.swing.JPanel();
        btnClientes = new javax.swing.JButton();
        bntServicios = new javax.swing.JButton();
        btnVehiculos = new javax.swing.JButton();
        btnOrdenesTrabajo = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        PanelSubmenuVehiculos = new javax.swing.JPanel();
        btnConsultarVehiculo = new javax.swing.JButton();
        btnRegistrarVehiculo = new javax.swing.JButton();
        PanelSubmenuClientes = new javax.swing.JPanel();
        btnConsultarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        PanelSubmenuServicios = new javax.swing.JPanel();
        btnRegistrarServicio = new javax.swing.JButton();
        btnAsociarServicio = new javax.swing.JButton();
        PanelSubmenuOrdenes = new javax.swing.JPanel();
        btnRegistrarOrden = new javax.swing.JButton();
        btnConsultarOrden = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItemAcercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Gestion Taller");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema Gestion de Taller");

        jPanelvista.setLayout(new javax.swing.BoxLayout(jPanelvista, javax.swing.BoxLayout.LINE_AXIS));

        btnClientes.setText("Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        bntServicios.setText("Servicios");
        bntServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntServiciosActionPerformed(evt);
            }
        });

        btnVehiculos.setText("Vehiculos");
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnOrdenesTrabajo.setText("Ordenes de Trabajo");
        btnOrdenesTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenesTrabajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelContenidoLayout = new javax.swing.GroupLayout(PanelContenido);
        PanelContenido.setLayout(PanelContenidoLayout);
        PanelContenidoLayout.setHorizontalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 969, Short.MAX_VALUE)
        );
        PanelContenidoLayout.setVerticalGroup(
            PanelContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        PanelSubmenuVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelSubmenuVehiculos.setLayout(new java.awt.BorderLayout());

        btnConsultarVehiculo.setText("Consultar");
        btnConsultarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarVehiculoActionPerformed(evt);
            }
        });
        PanelSubmenuVehiculos.add(btnConsultarVehiculo, java.awt.BorderLayout.PAGE_END);

        btnRegistrarVehiculo.setText("Registar");
        btnRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVehiculoActionPerformed(evt);
            }
        });
        PanelSubmenuVehiculos.add(btnRegistrarVehiculo, java.awt.BorderLayout.CENTER);

        PanelSubmenuClientes.setLayout(new java.awt.BorderLayout());

        btnConsultarCliente.setText("Consultar");
        PanelSubmenuClientes.add(btnConsultarCliente, java.awt.BorderLayout.CENTER);

        btnRegistrarCliente.setText("Registrar");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        PanelSubmenuClientes.add(btnRegistrarCliente, java.awt.BorderLayout.PAGE_END);

        PanelSubmenuServicios.setLayout(new java.awt.BorderLayout());

        btnRegistrarServicio.setText("Registrar Servicio");
        btnRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarServicioActionPerformed(evt);
            }
        });
        PanelSubmenuServicios.add(btnRegistrarServicio, java.awt.BorderLayout.CENTER);

        btnAsociarServicio.setText("Asociar Orden");
        btnAsociarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsociarServicioActionPerformed(evt);
            }
        });
        PanelSubmenuServicios.add(btnAsociarServicio, java.awt.BorderLayout.PAGE_END);

        PanelSubmenuOrdenes.setLayout(new java.awt.BorderLayout());

        btnRegistrarOrden.setText("Registrar Orden");
        btnRegistrarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarOrdenActionPerformed(evt);
            }
        });
        PanelSubmenuOrdenes.add(btnRegistrarOrden, java.awt.BorderLayout.PAGE_START);

        btnConsultarOrden.setText("Consultar Orden");
        btnConsultarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarOrdenActionPerformed(evt);
            }
        });
        PanelSubmenuOrdenes.add(btnConsultarOrden, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Sistema");

        MenuItemSalir.setText("Salir");
        MenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        MenuItemAcercade.setText("Acerca de ");
        MenuItemAcercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAcercadeActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItemAcercade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jPanelvista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bntServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelSubmenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnOrdenesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelSubmenuServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PanelSubmenuVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PanelSubmenuOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelSubmenuClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelSubmenuVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntServicios, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelSubmenuServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdenesTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(PanelSubmenuOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(543, 543, 543)
                .addComponent(jPanelvista, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelContenido.getAccessibleContext().setAccessibleName("PanelContenido");
        PanelSubmenuClientes.getAccessibleContext().setAccessibleName("PanelSubmenuClientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //  Mostrar/ocultar submenú de clientes con el fin de que se vean solo al desplegarlos
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       
       PanelSubmenuClientes.setVisible(!PanelSubmenuClientes.isVisible());

    if (!PanelSubmenuClientes.isVisible()) {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio");
    }

       
        
        
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void bntServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntServiciosActionPerformed
        PanelSubmenuServicios.setVisible(!PanelSubmenuServicios.isVisible());
    }//GEN-LAST:event_bntServiciosActionPerformed

    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed
         PanelSubmenuVehiculos.setVisible(!PanelSubmenuVehiculos.isVisible()); //mostrar y ocultar el submenu
         if (!PanelSubmenuVehiculos.isVisible()) {
         ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio"); //se limpia la vista cuando se oculta
}
        
    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void btnRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVehiculoActionPerformed
        
        CardLayout cl = (CardLayout) PanelContenido.getLayout();
        cl.show(PanelContenido, "registroVehiculo");
    
    }//GEN-LAST:event_btnRegistrarVehiculoActionPerformed

    private void btnConsultarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarVehiculoActionPerformed
        
        CardLayout cl = (CardLayout) PanelContenido.getLayout();
        cl.show(PanelContenido, "consultaVehiculo");

        
    }//GEN-LAST:event_btnConsultarVehiculoActionPerformed

    private void btnRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarServicioActionPerformed
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "registroServicio");
    }//GEN-LAST:event_btnRegistrarServicioActionPerformed

    private void btnAsociarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsociarServicioActionPerformed
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "asociarServicio");
    }//GEN-LAST:event_btnAsociarServicioActionPerformed

    private void MenuItemAcercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAcercadeActionPerformed
        JOptionPane.showMessageDialog(this,
       "Sistema desarrollado por Aleida Rivera\nVersión 1.0\nGestión Taller",
       "Acerca de",
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuItemAcercadeActionPerformed

    private void MenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSalirActionPerformed
        System.exit(0); // Cierra toda la aplicación
    }//GEN-LAST:event_MenuItemSalirActionPerformed

    private void btnOrdenesTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenesTrabajoActionPerformed
        btnOrdenesTrabajo.addActionListener(e -> {          //Me falta corregir este codigo
        boolean visible = PanelSubmenuOrdenes.isVisible();
        PanelSubmenuOrdenes.setVisible(!visible);
        btnRegistrarOrden.setVisible(!visible);
        btnConsultarOrden.setVisible(!visible);

        if (!PanelSubmenuOrdenes.isVisible()) {
        ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "inicio");
    }
});

    }//GEN-LAST:event_btnOrdenesTrabajoActionPerformed

    private void btnRegistrarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarOrdenActionPerformed
      btnRegistrarOrden.addActionListener(e -> {
    ((CardLayout) PanelContenido.getLayout()).show(PanelContenido, "formularioOrden");
});




    }//GEN-LAST:event_btnRegistrarOrdenActionPerformed

    private void btnConsultarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarOrdenActionPerformed
    btnConsultarOrden.addActionListener(e -> {
    CardLayout cl = (CardLayout) PanelContenido.getLayout();
    cl.show(PanelContenido, "consultarOrden");
});
    }//GEN-LAST:event_btnConsultarOrdenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Vista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAcercade;
    private javax.swing.JMenuItem MenuItemSalir;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelSubmenuClientes;
    private javax.swing.JPanel PanelSubmenuOrdenes;
    private javax.swing.JPanel PanelSubmenuServicios;
    private javax.swing.JPanel PanelSubmenuVehiculos;
    private javax.swing.JButton bntServicios;
    private javax.swing.JButton btnAsociarServicio;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConsultarCliente;
    private javax.swing.JButton btnConsultarOrden;
    private javax.swing.JButton btnConsultarVehiculo;
    private javax.swing.JButton btnOrdenesTrabajo;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnRegistrarOrden;
    private javax.swing.JButton btnRegistrarServicio;
    private javax.swing.JButton btnRegistrarVehiculo;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelvista;
    // End of variables declaration//GEN-END:variables
}
