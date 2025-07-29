
package Clases;


public class Cliente extends Persona {
    
    public Cliente(String id, String nombre, String apellido, String direccion) {
        super(id, nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Cliente{" + '}';
    }
    
    
}
