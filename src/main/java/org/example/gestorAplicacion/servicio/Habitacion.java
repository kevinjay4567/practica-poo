package org.example.gestorAplicacion.servicio;


public class Habitacion {
    private Hotel hotel;
    private String numHabitacion;
    private int capacidad;
    private double precioxNoche;
    private TipoHabitacion tipo;
    private Boolean ocupacion;

    public void ocupar(){
        ocupacion = true;
    }
    public void desocupar(){
        ocupacion = false;
    }
    public Boolean getOcupacion(){
        return ocupacion;
    }

    public String getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(String numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecioxNoche() {
        return precioxNoche;
    }

    public void setPrecioxNoche(double precioxNoche) {
        this.precioxNoche = this.tipo.getPrecio();
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }
}
