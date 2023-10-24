package org.example.gestorAplicacion.servicio;

import java.util.List;

public class Pago {
    private Double total;
    private List<Servicio> servicios;
    private String fecha_pago;
    private static final double IVA = 0.19;

    private double descuentoPuntos = 0;

    public Pago() {
    }

    public Pago(Double total, List<Servicio> servicios, String fecha_pago) {
        this.total = total;
        this.servicios = servicios;
        this.fecha_pago = fecha_pago;
    }

    public Double getTotal() {
        double precioIva = total * IVA;
        if (servicios.isEmpty()) {
            return total + precioIva;
        }
        double precioServicios = 0;
        for (Servicio servicio: servicios) {
            precioServicios += servicio.getPrecio();
        }

        return total + precioIva + precioServicios - getDescuentoPuntos();

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

    public double getDescuentoPuntos() {
        return descuentoPuntos;
    }

    public void setDescuentoPuntos(float descuento){
        descuentoPuntos = total * (descuento/1000);
    }

    @Override
    public String toString() {
        return "Pago: { \n" +
                "Estadia: " + total + "\n" +
                "Servicios Adicionales: " + getServicios() + "\n" +
                "IVA: " + total * IVA + "\n" +
                "Descuento Puntos: "+ getDescuentoPuntos() + "\n" +
                "Total: " + getTotal() + "\n" +
                "Fecha de pago: '" + getFecha_pago() + "'\n" +
                "}";
    }
}
