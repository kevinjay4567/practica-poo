package org.example.gestorAplicacion.entidades;
import org.example.gestorAplicacion.servicio.GestionReserva;
import org.example.gestorAplicacion.servicio.Habitacion;
import org.example.gestorAplicacion.servicio.Hotel;
import org.example.gestorAplicacion.servicio.Servicio;

import java.util.LinkedList;
import java.util.List;


public class Cliente {
    private String idCliente;
    private Hotel hotel;
    private int puntos = 0;
    private Habitacion habitacion;

    private String Membresia;
    //enum membresia
    private int equipaje;

    private List<GestionReserva> Historial = new LinkedList<>();
    private String historiaComentario;
    private GestionReserva reserva;

    public void solicitarServicio(Servicio servicio){
        this.reserva.aggServicio(servicio);
    }
    public void cancelarServicio(int servicio){
        this.reserva.getServiciosAdicionales().remove(servicio);
    }
}
