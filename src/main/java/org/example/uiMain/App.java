package org.example.uiMain;

import org.example.gestorAplicacion.servicio.Hotel;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Hotel> hoteles = new LinkedList<>();

    public static void initApp() {
        Scanner sc = new Scanner(System.in);
        Integer opcion;
        List<Double> tarifas = new LinkedList<>();
        tarifas.add(2.99);
        tarifas.add(6.99);
        Hotel hotelObj = new Hotel();
        hotelObj.setNombre("Sol caribe");
        hotelObj.setDireccion("<direccion>");
        hotelObj.setTarifas(tarifas);
        hotelObj.setComentarios(new String[]{"Excelente", "Hola"});
        hoteles.add(hotelObj);
        System.out.println("---- Servicio de reserva ----\n");
        System.out.println("Escoja una opción: ");
        System.out.println("1. Ver hoteles disponibles");
        System.out.println("0. Salir");

        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------- Hoteles ----------");
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel);
                    }
                    System.out.println("-----------------------------");
                    break;
            }
        } while (opcion != 0);


    }
}
