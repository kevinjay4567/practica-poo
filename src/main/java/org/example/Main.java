package org.example;
import org.example.baseDatos.Deserializador;
import org.example.baseDatos.Serializador;
import org.example.gestorAplicacion.entidades.Cliente;
import org.example.gestorAplicacion.servicio.Hotel;
import org.example.uiMain.App;

public class Main {
    public static void main(String[] args) {
        Deserializador deserializador = new Deserializador();
        Hotel.cargarHoteles(deserializador.hotelDeserializar());
        Cliente.cargarClientes(deserializador.clienteDeserializar());
        App.initApp();
        Serializador serializador = new Serializador();
        serializador.hotelSerializador(App.hoteles);
        serializador.clienteSerializador(Cliente.getClientes());
    }
}