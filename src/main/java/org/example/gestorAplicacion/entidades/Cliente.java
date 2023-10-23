package org.example.gestorAplicacion.entidades;
import org.example.gestorAplicacion.servicio.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Cliente extends Persona {
    private String idCliente;
    private Hotel hotel;
    private int puntos = 0;
    private Habitacion habitacion;

    private String membresia;
    //enum membresia
    private int equipaje;

    private LinkedList<GestionReserva> historial = new LinkedList<>();
    private String historiaComentario;
    private GestionReserva reserva;
    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String tipo_cedula, String numero_cedula, String telefono, String idCliente, Hotel hotel, String membresia, int equipaje) {
        super(nombre, tipo_cedula, numero_cedula, telefono);
        this.idCliente = idCliente;
        this.hotel = hotel;
        this.puntos = 0;
        this.membresia = membresia;
        this.equipaje = equipaje;
        Cliente.addClientes(this);
    }

    public void solicitarServicio(int servicio){
        //Se hará con la posición del servicio en la lista de ellos
        this.reserva.aggServicio(Servicio.getServicios().get(servicio));
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

    //Mostrar factura en la interfaz

    public void pagarFactura(){
        reserva.setEstado(true);
    }

    public int getPuntos(){
        return puntos;
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }

    public static void addClientes(Cliente cliente) {
        Cliente.clientes.add(cliente);
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
