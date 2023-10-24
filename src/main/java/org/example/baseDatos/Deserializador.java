package org.example.baseDatos;

import org.example.gestorAplicacion.servicio.Hotel;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Deserializador {
    static File archivo = new File("");

    public List<Hotel> hotelDeserializar() {
        FileInputStream f;
        try {
            f = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\temp\\Hotel.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            List<Hotel> hoteles = (List<Hotel>) o.readObject();
            o.close();
            f.close();
            return hoteles;

        } catch (IOException | ClassNotFoundException e) {
            return new LinkedList<Hotel>();
        }
    }
}
