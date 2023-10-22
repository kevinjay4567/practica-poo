package org.example.gestorAplicacion.servicio;

import org.example.gestorAplicacion.entidades.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionReserva {
    private Cliente cliente;
    private Habitacion habitacion;
    private Pago factura;
    private String ingreso;
    private String salida;
    private List<Servicio> serviciosAdicionales;

    public void aggReserva(Habitacion habitacion){
        this.habitacion = habitacion;
    }
    public void cancelarReserva(){
        //Reserva
    }
    //HACER FUNCION
    public double cotizar(int[] servicios){
        double precioCotizacion = 0;
        if(Servicio.getServicios().isEmpty()){
            return 0d;
        }
        for (int i = 0; i < servicios.length; i++) {
            precioCotizacion += Servicio.getServicios().get(servicios[i]).getPrecio();
        }
        return precioCotizacion;

    }

    public void aggServicio(Servicio servicio){
        this.serviciosAdicionales.add(servicio);
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

    public List<Servicio> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<Servicio> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    //Hacer la de ver factura
    //public Pago verFactura(){
      //  factura.toString();
    //}

    @Override
    public String toString() {
        return "GestionReserva{" +
                "cliente=" + cliente.toString() +
                ", habitacion=" + habitacion +
                ", ingreso='" + ingreso + '\'' +
                ", salida='" + salida + '\'' +
                ", serviciosAdicionales=" + serviciosAdicionales +
                '}';
    }
}
