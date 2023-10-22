package org.example.gestorAplicacion.servicio;

import java.util.Arrays;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones;
    private List<Double> tarifas;
    private List<Servicio> servicios;
    private String[] comentarios;

    public Hotel(){
    }

    public Hotel(String nombre, String direccion, List<Habitacion> habitaciones,List<Double> tarifas, List<Servicio> servicios, String[] comentarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = habitaciones;
        this.tarifas = tarifas;
        this.servicios = servicios;
        this.comentarios = comentarios;
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

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
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

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public String[] getComentarios() {
        return comentarios;
    }

    public void setComentarios(String[] comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
                "Direccion: " + getDireccion() + "\n" +
                "Habitaciones disponibles: " + getHabitaciones().size() + "\n" +
                "Tarifas: " + getTarifas() + "\n" +
                "Servicios: " + getServicios() + "\n" +
                "Comentarios: " + Arrays.toString(getComentarios());
    }
}
