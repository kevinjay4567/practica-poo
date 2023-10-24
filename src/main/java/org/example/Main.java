package org.example;
import org.example.baseDatos.Deserializador;
import org.example.baseDatos.Serializador;
import org.example.uiMain.App;

public class Main {
    public static void main(String[] args) {
        Deserializador deserializador = new Deserializador();
        App.hoteles = deserializador.hotelDeserializar();
        App.initApp();
        Serializador serializador = new Serializador();
        serializador.hotelSerializador(App.hoteles);
    }
}