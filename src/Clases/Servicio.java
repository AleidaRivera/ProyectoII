/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


public class Servicio {
   private  String id; 
   private String descripcion;
   private double costo;
   private boolean activo;

    public Servicio(String id, String descripcion, double costo, boolean activo) {
        this.id = id;
        this.descripcion = descripcion;
        this.costo = costo;
        this.activo = activo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", descripcion=" + descripcion + ", costo=" + costo + ", activo=" + activo + '}';
    }
   
   
}
