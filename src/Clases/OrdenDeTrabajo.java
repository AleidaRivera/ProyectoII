
package Clases;

import Interfaz.Facturable;
import java.util.Date;
import java.util.List;


public abstract class OrdenDeTrabajo implements Facturable {
    
    private String numeroOrden;
    private String idCliente;
    private String plcaVehiculo;
    private List<Servicio>servicios;        
    private Date fechaIngreso;
    private String fechaEntregs; 
    private double costoTotal;

    public OrdenDeTrabajo(String numeroOrden, String idCliente, String plcaVehiculo, List<Servicio> servicios, Date fechaIngreso, String fechaEntregs, double costoTotal) {
        this.numeroOrden = numeroOrden;
        this.idCliente = idCliente;
        this.plcaVehiculo = plcaVehiculo;
        this.servicios = servicios;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntregs = fechaEntregs;
        this.costoTotal = costoTotal;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getPlcaVehiculo() {
        return plcaVehiculo;
    }

    public void setPlcaVehiculo(String plcaVehiculo) {
        this.plcaVehiculo = plcaVehiculo;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEntregs() {
        return fechaEntregs;
    }

    public void setFechaEntregs(String fechaEntregs) {
        this.fechaEntregs = fechaEntregs;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public String toString() {
        return "OrdenDeTrabajo{" + "numeroOrden=" + numeroOrden + ", idCliente=" + idCliente + ", plcaVehiculo=" + plcaVehiculo + ", servicios=" + servicios + ", fechaIngreso=" + fechaIngreso + ", fechaEntregs=" + fechaEntregs + ", costoTotal=" + costoTotal + '}';
    }          
}
