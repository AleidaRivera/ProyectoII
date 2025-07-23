
package tallergestion.vista;



import java.awt.CardLayout;
import java.awt.Container;
import javax.swing.JPanel;


public class ConsultaClientes extends javax.swing.JPanel {

 
    public ConsultaClientes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
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
        btnBuscar = new javax.swing.JButton();
        txtBuscarCliente = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        setLayout(new java.awt.BorderLayout(2, 2));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"209680157", "Aleida Rivera", "50127059", "Pital San Carlos"},
                {"205200020", "Erick Mata Guzman", "89900145", "Cruce de los Chiles"},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre Completo", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(TablaClientes);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(6, 2));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblID.setText("ID Cliente");
        jPanel1.add(lblID);
        lblID.getAccessibleContext().setAccessibleName("lblID");

        lblMensaje.setText("--");
        jPanel1.add(lblMensaje);

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
        jPanel1.add(btnEliminar);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Buscar por ID Cliente");
        jPanel2.add(jLabel1);

        btnBuscar.setBackground(new java.awt.Color(153, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel2.add(btnBuscar);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel ltxtDireccion;
    private javax.swing.JLabel ltxtNombre;
    private javax.swing.JLabel ltxtTelefono;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
