package org.example.gestorAplicacion.servicio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel implements Serializable {
    private String nombre;
    private String direccion;
    private List<Double> tarifas = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();
    private String[] comentarios;

    private List<Habitacion> habitaciones = new ArrayList<>();

    private static List <Hotel> hoteles = new ArrayList<>();

    public Hotel(){
        Hotel.hoteles.add(this);
    }

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        Hotel.hoteles.add(this);
    }

    public Hotel(String nombre, String direccion, List<Double> tarifas, List<Servicio> servicios, String[] comentarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarifas = tarifas;
        this.servicios = servicios;
        this.comentarios = comentarios;
        Hotel.hoteles.add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Double> getTarifas() {
        return tarifas;
    }

    public void setTarifas(List<Double> tarifas) {
        this.tarifas = tarifas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void addServicios(Servicio servicios) {
        this.servicios.add(servicios);
    }

    public String[] getComentarios() {
        return comentarios;
    }

    public void setComentarios(String[] comentarios) {
        this.comentarios = comentarios;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void addHabitaciones(Habitacion hab){
        habitaciones.add(hab);
    }

    public static List<Hotel> getHoteles() {
        return hoteles;
    }

    public static void addHoteles(Hotel hotel) {
        Hotel.hoteles.add(hotel);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Direccion: " + getDireccion() + "\n" +
                "Servicios: " + getServicios() + "\n" +
                "Comentarios: " + Arrays.toString(getComentarios());
    }
}
