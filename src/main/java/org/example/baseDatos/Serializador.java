package org.example.baseDatos;

import org.example.gestorAplicacion.servicio.Hotel;

import java.io.*;
import java.util.List;

public class Serializador {
    static File archivo = new File("");

    public void hotelSerializador(List<Hotel> hoteles) {
        FileOutputStream f;

        try {
            f = new FileOutputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(hoteles);
            o.close();
            f.close();
            System.out.println("Serializacion completa correctamente");

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
