package org.example;
import org.example.baseDatos.Serializador;
import org.example.uiMain.App;

public class Main {
    public static void main(String[] args) {
        App.initApp();
        Serializador serializador = new Serializador();
        serializador.hotelSerializador();
    }
}