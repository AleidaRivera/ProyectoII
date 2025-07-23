
package tallergestion.moduloVehiculos;

import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;


public class ConsultaVehiculos extends javax.swing.JPanel {

    public ConsultaVehiculos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAño = new javax.swing.JTextField();
        Placa = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        btnModificarVehiculo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnEliminarVehiculo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();

        setName(""); // NOI18N
        setLayout(new java.awt.BorderLayout());

        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"209680157", "Mischubichi", "L200", "2020", "CL 320167"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Cliente", "Marca", "Modelo", "Año", "Placa"
            }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Marca");
        jPanel1.add(jLabel1);
        jPanel1.add(txtMarca);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Modelo");
        jPanel1.add(jLabel2);
        jPanel1.add(txtModelo);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Año");
        jPanel1.add(jLabel3);
        jPanel1.add(txtAño);

        Placa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Placa.setText("Placa");
        jPanel1.add(Placa);
        jPanel1.add(txtPlaca);

        btnModificarVehiculo.setBackground(new java.awt.Color(102, 255, 204));
        btnModificarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnModificarVehiculo.setText("Modificar");
        jPanel1.add(btnModificarVehiculo);

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);

        btnEliminarVehiculo.setBackground(new java.awt.Color(255, 255, 51));
        btnEliminarVehiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEliminarVehiculo.setText("Eliminar");
        jPanel1.add(btnEliminarVehiculo);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Buscar por ID Cliente");
        jPanel2.add(jLabel5);

        btnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar);
        jPanel2.add(txtBuscarCliente);

        add(jPanel2, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleName("Consultar Vehiculos");
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Container contenedor = ConsultaVehiculos.this.getParent();
        if (contenedor instanceof JPanel) {
        CardLayout cl = (CardLayout) contenedor.getLayout();
         cl.show(contenedor, "inicio");
}




    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Placa;
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminarVehiculo;
    private javax.swing.JButton btnModificarVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
