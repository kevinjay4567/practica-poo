package org.example.baseDatos;

import org.example.gestorAplicacion.entidades.Cliente;
import org.example.gestorAplicacion.servicio.Hotel;
import org.example.gestorAplicacion.servicio.Servicio;

import java.io.*;
import java.util.List;

public class Serializador {
    static File archivo = new File("");
    FileOutputStream f;

    public void hotelSerializador(List<Hotel> hoteles) {


        try {
            f = new FileOutputStream(archivo.getAbsolutePath() +
                    "\\src\\temp\\Hotel.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(hoteles);
            o.close();
            f.close();
            System.out.println("Serializacion completa correctamente");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public void clienteSerializador(List<Cliente> clientes) {

        try {
            f = new FileOutputStream(archivo.getAbsolutePath() +
                    "\\src\\temp\\Cliente.txt");
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(clientes);
            o.close();
            f.close();
            System.out.println("Serializacion completa correctamente");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
