package org.example.gestorAplicacion.servicio;

import org.example.gestorAplicacion.entidades.Cliente;

public class GestionReserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private Pago factura;
    private String ingreso;
    private String salida;
    private Servicio serviciosAdicionales;

    public void aggReserva(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    public void cancelarReserva(){
        //Reserva
    }

    public double cotizar(){
        return 3.1416d;
    }

    public void aggServicio(Servicio servicio){
        this.serviciosAdicionales = servicio;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public Habitacion getHabitacion(){
        return habitacion;
    }

    public String getIngreso() {
        return ingreso;
    }


    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Servicio getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(Servicio serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }
}
