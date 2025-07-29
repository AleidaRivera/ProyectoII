
package Clases;

public class Vehiculo {
    
   private String placa;
   private String marca; 
   private String model; 
   private int año;
   private String idCliente;

    public Vehiculo(String placa, String marca, String model, int año, String idCliente) {
        this.placa = placa;
        this.marca = marca;
        this.model = model;
        this.año = año;
        this.idCliente = idCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", model=" + model + ", a\u00f1o=" + año + ", idCliente=" + idCliente + '}';
    }
   
   
   
}
