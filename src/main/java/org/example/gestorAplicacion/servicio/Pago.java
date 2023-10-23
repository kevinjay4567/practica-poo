package org.example.gestorAplicacion.servicio;

import java.util.LinkedList;
import java.util.List;

public class Pago {
    private Double total;
    private List<Servicio> servicios;
    private String fecha_pago;

    public Pago(){
    }

    public Pago(Double total, List<Servicio> servicios, String fecha_pago) {
        this.total = total;
        this.servicios = servicios;
        this.fecha_pago = fecha_pago;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Servicio> getTipo_servicio() {
        return servicios;
    }

    public void setServicios (List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    @Override
    public String toString() {
        return "Pago: { \n" +
                "Servicios Adicionales: " + servicios + "\n" +
                "Total: " + total + "\n" +
                "Fecha de pago: '" + fecha_pago + "'\n" +
                "}";
    }
}
