package org.example.gestorAplicacion.servicio;

import java.util.List;

public class Pago {
    private Double total;
    private List<Servicio> servicios;
    private String fecha_pago;
    private static final double IVA = 0.19;

    public Pago() {
    }

    public Pago(Double total, List<Servicio> servicios, String fecha_pago) {
        this.total = total;
        this.servicios = servicios;
        this.fecha_pago = fecha_pago;
    }

    public Double getTotal() {
        double precioIva = total * IVA;
        return total + precioIva;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
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
                "Servicios Adicionales: " + getServicios() + "\n" +
                "Total: " + getTotal() + "\n" +
                "Fecha de pago: '" + getFecha_pago() + "'\n" +
                "}";
    }
}
