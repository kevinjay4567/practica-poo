package org.example.gestorAplicacion.entidades;
import org.example.gestorAplicacion.servicio.*;

import java.util.LinkedList;


public class Cliente extends Persona {
    private String idCliente;
    private Hotel hotel;
    private int puntos = 0;
    private Habitacion habitacion;

    private String Membresia;
    //enum membresia
    private int equipaje;

    private LinkedList<GestionReserva> historial = new LinkedList<>();
    private String historiaComentario;
    private GestionReserva reserva;

    public Cliente(String idCliente, Hotel hotel, int puntos, Habitacion habitacion, String membresia, int equipaje) {
        this.idCliente = idCliente;
        this.hotel = hotel;
        this.puntos = puntos;
        this.habitacion = habitacion;
        Membresia = membresia;
        this.equipaje = equipaje;
    }

    public void solicitarServicio(Servicio servicio){
        this.reserva.aggServicio(servicio);
        this.puntos++;
    }
    public void cancelarServicio(int servicio){
        //Se hará con la posición del servicio en la lista de ellos
        this.reserva.getServiciosAdicionales().remove(servicio);
        this.puntos--;
    }

    public void realizarReserva(GestionReserva reserva){
        //Por reserva 20 puntos, por servicio adicional 1 punto
        this.reserva = reserva;
        this.historial.add(reserva);
        this.puntos += 20;
    }

    public String consultaReserva(){
        return this.reserva.toString();
    }

    public Boolean cancelarReserva(){
        //Por el booleano se determina la respuesta en la ui
        reserva=null;
        if(this.historial.isEmpty()){
            return false;
        }
        historial.removeLast();
        return true;

    }

    public double verFactura(){

        return 3.14d;
    }



    public int getPuntos(){
        return puntos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente='" + idCliente + '\'' +
                "Nombre= " + getNombre() +
                "CC=" + getNum_documento()+
                "Puntos=" + getPuntos() +
                '}';
    }

    @Override
    public String personaRol() {
        return "Cliente";
    }
}
