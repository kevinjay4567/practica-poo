package org.example.baseDatos;

import org.example.gestorAplicacion.servicio.Hotel;

import java.io.*;

public class Serializador {
    Hotel hotel = new Hotel("Hotel 1", "direccion # hotel - 1");
    static File archivo = new File("");



    public void hotelSerializador() {
        FileOutputStream f;
        try {
            f = new FileOutputStream(new File(archivo.getAbsolutePath()+
                    "\\src\\temp\\Hotel.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(hotel);
            o.close();
            f.close();
            System.out.println("Serializacion completa correctamente");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
