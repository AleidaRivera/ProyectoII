//package tallergestion.vista;
package tallergestion.vista;


//import vista.Vista;
import javax.swing.SwingUtilities;
//import vista.Vista;

public class TallerGestion {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Vista vista = new Vista(); 
            vista.setVisible(true);    //muestra mi pantalla principal, en este caso "vista" Dato:Solo se usa para iniciar la ventana principal.
            
        });
    }
}
