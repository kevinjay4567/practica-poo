package org.example.gestorAplicacion.servicio;

import java.io.Serializable;
import java.util.LinkedList;

public class Servicio implements Serializable {
    private String nombre;
    private Double precio;
    private String hora_inicio;
    private String hora_salida;
    private int nochesxEstadia;
    private static LinkedList<Servicio> servicios = new LinkedList<>();

    public Servicio() {
    }

    public Servicio(String nombre, Double precio, int nochesxEstadia, String hora_inicio, String hora_salida) {
        this.nombre = nombre;
        this.precio = precio;
        this.nochesxEstadia = nochesxEstadia;
        this.hora_inicio = hora_inicio;
        this.hora_salida = hora_salida;
        servicios.add(this);
    }

    public Servicio(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getNochesxEstadia() {
        return this.nochesxEstadia;
    }

    public void setNochesxEstadia(int nochesxEstadia) {
        this.nochesxEstadia = nochesxEstadia;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    @Override
    public String toString() {
        return "\n - " + getNombre() + ": " + getPrecio();
    }

    public static LinkedList<Servicio> getServicios() {
        return servicios;
    }
}
