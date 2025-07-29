
package Clases;


public class Auto extends Vehiculo {
    
    public Auto(String placa, String marca, String model, int año, String idCliente) {
        super(placa, marca, model, año, idCliente);
    }

    @Override
    public String toString() {
        return "Auto{" + '}';
    }
    
}
