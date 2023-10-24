package org.example.baseDatos;

import org.example.gestorAplicacion.entidades.Cliente;
import org.example.gestorAplicacion.servicio.Hotel;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Deserializador {
    static File archivo = new File("");
    FileInputStream f;

    public List<Hotel> hotelDeserializar() {

        try {
            f = new FileInputStream(archivo.getAbsolutePath() +
                    "\\src\\temp\\Hotel.txt");
            ObjectInputStream o = new ObjectInputStream(f);

            List<Hotel> hoteles = (List<Hotel>) o.readObject();
            o.close();
            f.close();
            return hoteles;

        } catch (IOException | ClassNotFoundException e) {
            return new LinkedList<Hotel>();
        }
    }

    public List<Cliente> clienteDeserializar() {

        try {
            f = new FileInputStream(new File(archivo.getAbsolutePath() +
                    "\\src\\temp\\Cliente.txt"));
            ObjectInputStream o = new ObjectInputStream(f);

            List<Cliente> clientes = (List<Cliente>) o.readObject();
            o.close();
            f.close();
            return clientes;

        } catch (IOException | ClassNotFoundException e) {
            return new LinkedList<Cliente>();
        }
    }
}
