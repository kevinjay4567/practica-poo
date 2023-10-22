package org.example.uiMain;

import org.example.gestorAplicacion.servicio.Habitacion;
import org.example.gestorAplicacion.servicio.Hotel;
import org.example.gestorAplicacion.servicio.Servicio;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Hotel> hoteles = new LinkedList<>();
    public static List<Servicio> servicios = new LinkedList<>();
    public static List<Habitacion> habitaciones = new LinkedList<>();

    // Inicializacion de la App
    public static void initApp() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        // TODO: Datos de prueba
        Servicio serv1 = new Servicio("Desayuno", 2.99, "01-01-2023", "01-20-2023");
        Servicio serv2 = new Servicio("Actividad tematica", 6.99, "01-30-2023", "02-05-2023");
        Habitacion habi1 = new Habitacion();
        Habitacion habi2 = new Habitacion();
        habitaciones.add(habi1);
        habitaciones.add(habi2);
        servicios.add(serv1);
        servicios.add(serv2);
        Hotel hotelObj = new Hotel();
        hotelObj.setNombre("Sol caribe");
        hotelObj.setDireccion("<direccion>");
        hotelObj.setComentarios(new String[]{"Excelente", "Hola"});
        hotelObj.setHabitaciones(habitaciones);
        hotelObj.setServicios(servicios);
        hoteles.add(hotelObj);

        // Inicio del Menu interactivo
        System.out.println("---- Servicio de reserva ----\n");

        do {
            System.out.println("Escoja una opción: ");
            System.out.println("1. Ver hoteles disponibles");
            System.out.println("2. Realizar reserva");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("---------- Hoteles ----------");
                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel);
                    }
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    System.out.print("Digite el nombre del hotel a reservar: ");
                    sc.nextLine();
                    String opcionReserva = sc.nextLine();

                    if (!opcionReserva.equals("0")){
                        int count = 0;
                        for (Hotel hotel : hoteles) {
                            if (hotel.getNombre().equals(opcionReserva)) {
                                System.out.println("---------[OK]----------");
                                System.out.println("!! Reserva realizada !!");
                                System.out.println("-----------------------");
                                break;
                            }
                            count ++;
                        }
                        if (count == hoteles.size()) {
                            System.out.println("---------[ERROR]---------");
                            System.out.println("!! Hotel no encontrado !!");
                            System.out.println("-------------------------\n");
                        }
                    }
                    break;
            }
        } while (opcion != 0);

    }
}
