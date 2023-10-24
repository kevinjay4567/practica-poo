package org.example.uiMain;

import org.example.gestorAplicacion.entidades.Cliente;
import org.example.gestorAplicacion.servicio.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Hotel> hoteles = Hotel.getHoteles();
    public static List<Servicio> servicios = new LinkedList<>();
    public static List<Habitacion> habitaciones = new LinkedList<>();
    public static List<GestionReserva> reservas = new LinkedList<>();
    private static List<Cliente> clientes;

    // Inicializacion de la App
    public static void initApp() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Cliente client;
        Boolean pago = false;
        Habitacion habitacion = new Habitacion();
        // TODO: Datos de prueba
        Servicio serv1 = new Servicio("Desayuno", 2.99, 5, "01-01-2023", "01-20-2023");
        Servicio serv2 = new Servicio("Actividad tematica", 6.99, 4, "01-30-2023", "02-05-2023");

        //habitaciones.add(habi1);
        //habitaciones.add(habi2);
        servicios.add(serv1);
        servicios.add(serv2);
        Hotel hotelObj = new Hotel();
        hotelObj.setNombre("Sol caribe");
        hotelObj.setDireccion("<direccion>");
        hotelObj.setComentarios(new String[]{"Excelente", "Hola"});
        Hotel hotel02 = new Hotel("OnVcation", "San Luis");
        hotel02.setComentarios(new String[]{"Excelente", "Hola"});
        hotel02.addServicios(serv1);
        hotel02.addServicios(serv2);
        //hotelObj.setHabitaciones(habitaciones);
        hotelObj.addServicios(serv1);
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "101", 1, 200000.0, TipoHabitacion.INDIVIDUAL, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "102", 2, 200000.0, TipoHabitacion.DOBLE, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "103", 2, 200000.0, TipoHabitacion.DOBLE, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "104", 2, 200000.0, TipoHabitacion.MATRIMONIAL, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "105", 1, 200000.0, TipoHabitacion.INDIVIDUAL, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "106", 2, 200000.0, TipoHabitacion.DOBLE, false));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "107", 3, 200000.0, TipoHabitacion.SUITE, true));
        hotelObj.addHabitaciones(new Habitacion(hotelObj, "108", 2, 200000.0, TipoHabitacion.DOBLE, true));
        hotel02.addHabitaciones(new Habitacion(hotelObj, "102", 2, 2000.0, TipoHabitacion.DOBLE, false));
        //Cliente cl001 = new Cliente("Omar", "cc", "111421412", "323242442", "cl001", hotelObj, "Gold", 2);
        //GestionReserva gr001 = new GestionReserva(cl001, h)
        // Inicio del Menu interactivo
        System.out.println("---- Servicio de reserva ----\n");

        do {
            System.out.println("Escoja una opción: ");
            System.out.println("1. Ver hoteles disponibles");
            System.out.println("2. Gestionar reserva");
            System.out.println("3. Gestion de pagos");
            System.out.println("4. Comentarios y calificaciones");
            System.out.println("5. Puntos");
            System.out.println("6. Gestión de equipajes");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            List<GestionReserva> reservas = GestionReserva.reservas;
            switch (opcion) {
                case 1:
                    System.out.println("---------- Hoteles ----------");

                    for (Hotel hotel : hoteles) {
                        System.out.println(hotel);
                    }
                    System.out.println("-----------------------------");
                    break;

                case 2:
                    System.out.println("Escoja una opción: ");
                    System.out.println("1. Crear reservas.");
                    System.out.println("2. Consultar reservas.");
                    System.out.println("3. Agregar servicios adicionales.");
                    System.out.println("4. Eliminar reserva.");
                    System.out.println("5. Check-Inn");
                    System.out.println("6. Check-Out");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Digite el nombre del hotel a reservar: ");
                            sc.nextLine();
                            String opcionReserva = sc.nextLine();

                            if (!opcionReserva.equals("0")) {
                                int count = 0;
                                int cuentaHab = 0;
                                for (Hotel hotel : hoteles) {
                                    if (hotel.getNombre().equals(opcionReserva)) {
                                        Boolean habCorrecta = false;

                                        do {
                                            habitaciones = hotel.getHabitaciones();
                                            System.out.println("Seleccione la habitación deseada: ");
                                            for (Habitacion hab : habitaciones) {
                                                if (!hab.getOcupacion()) {
                                                    System.out.println(hab);
                                                }

                                            }
                                            String opcionHab = sc.nextLine();

                                            for (Habitacion habitacionx : habitaciones) {
                                                if (opcionHab.equals(habitacionx.getNumHabitacion())) {
                                                    habCorrecta=true;
                                                    habitacion = habitacionx;
                                                    break;
                                                }
                                                cuentaHab++;
                                            }
                                            if (cuentaHab == habitaciones.size()) {
                                                System.out.println("---------[ERROR]---------");
                                                System.out.println("!! Habitación no encontrada !!");
                                                System.out.println("-------------------------\n");
                                            }
                                        }while(!habCorrecta);
                                        List<Cliente> clientes = Cliente.getClientes();
                                        String opcioncl;
                                        if (clientes.isEmpty()){
                                            opcioncl="1";
                                        } else {
                                            System.out.println("1. Cliente nuevo");
                                            System.out.println("2. Cliente antiguo");
                                            opcioncl = sc.nextLine();
                                        }
                                        if (opcioncl.equals("1")) {
                                            System.out.println("¿Cual es su nombre?");
                                            String nombre = sc.nextLine();
                                            System.out.println("Tipo de documento: ");
                                            String tipoDoc = sc.nextLine();
                                            System.out.println("Número de documento: ");
                                            String numDoc = sc.nextLine();
                                            System.out.println("Numero de telefono: ");
                                            String numTlf = sc.nextLine();
                                            System.out.println("Cuantas piezas de equipaje lleva: ");
                                            int numEqui = sc.nextInt();
                                            client = new Cliente(nombre, tipoDoc, numDoc, numTlf, "cl0" + Cliente.getClientes().size(), hotel, "Basic", numEqui, habitacion);
                                        } else {
                                            List<Cliente> clients = Cliente.getClientes();
                                            System.out.println("Elija el cliente existente: ");
                                            for (int i = 0; i < clients.size(); i++) {
                                                System.out.println((i + 1) + ". " + clients.get(i));
                                            }
                                            int eleccion = sc.nextInt();
                                            client = Cliente.getClientes().get(eleccion - 1);
                                        }
                                        System.out.println("Cuantas noches desea quedarse: ");
                                        int noches = sc.nextInt();

                                        GestionReserva reserva = new GestionReserva(client, habitacion, noches, pago, hotel);
                                        client.realizarReserva(reserva);
                                        System.out.println(client.getPuntos());
                                        System.out.println("---------[OK]----------");
                                        System.out.println("!! Reserva realizada !!");
                                        System.out.println("-----------------------");
                                        break;
                                    }
                                    count++;
                                }
                                if (count == hoteles.size()) {
                                    System.out.println("---------[ERROR]---------");
                                    System.out.println("!! Hotel no encontrado !!");
                                    System.out.println("-------------------------\n");
                                }
                            }
                            break;

                        case 2:
                            reservas = GestionReserva.reservas;
                            for (GestionReserva reservass : reservas){
                                System.out.println(reservass);
                            }
                            break;
                        case 3:
                            reservas = GestionReserva.reservas;
                            int contador = 0;
                            for (GestionReserva reservass : reservas){
                                System.out.println(contador + "."+reservass);
                                contador++;
                            }
                            System.out.println("Elija la reserva a modificar: ");
                            int opcionRes = sc.nextInt();
                            GestionReserva reservamod = reservas.get(opcionRes-1);
                            List<Servicio> servicioss = reservamod.getHotel().getServicios();
                            System.out.println("Servicios disponibles: ");
                            for(Servicio servicios : servicioss){
                                System.out.println(servicios);
                            }
                            System.out.println("Elija servicios a añadir: ");
                            int opcionservicio = sc.nextInt();
                            reservamod.aggServicio(servicioss.get(opcionservicio-1));
                            System.out.println("---------[OK]----------");
                            System.out.println(" !! Servicio añadido !!");
                            System.out.println("-----------------------");
                            break;

                        case 4:
                            reservas = GestionReserva.reservas;
                            contador = 0;
                            for (GestionReserva reservass : reservas){
                                System.out.println(contador + "."+reservass);
                                contador++;
                            }
                            System.out.println("Elija la reserva a cancelar: ");
                            opcionRes = sc.nextInt();
                            GestionReserva reserCancelar = reservas.get(opcionRes-1);
                            reserCancelar.getCliente().cancelarReserva(reserCancelar);
                            System.out.println("---------[OK]----------");
                            System.out.println(" !! Reserva canelada !!");
                            System.out.println("-----------------------");
                            break;

                        case 5:
                            reservas = GestionReserva.reservas;
                            contador = 0;
                            for (GestionReserva reservass : reservas){
                                System.out.println(contador + "."+reservass);
                                contador++;
                            }
                            System.out.println("Elija la reserva para realizar check-in: ");
                            opcionRes = sc.nextInt();
                            GestionReserva reserCheckIn = reservas.get(opcionRes-1);
                            reserCheckIn.getHabitacion().ocupar();
                            System.out.println("---------[OK]----------");
                            System.out.println(" !! CheckIn Listo !!");
                            System.out.println("-----------------------");

                            break;
                        case 6:
                            reservas = GestionReserva.reservas;
                            contador = 0;
                            for (GestionReserva reservass : reservas){
                                System.out.println(contador + "."+reservass);
                                contador++;
                            }
                            System.out.println("Elija la reserva para realizar check-out: ");
                            opcionRes = sc.nextInt();
                            GestionReserva reserCheckout = reservas.get(opcionRes-1);
                            reserCheckout.getHabitacion().desocupar();
                            reserCheckout.borrarReserva();
                            System.out.println("---------[OK]----------");
                            System.out.println(" !! CheckOut Listo !!");
                            System.out.println("-----------------------");

                    }
                    break;


                case 3:
                    clientes = Cliente.getClientes();

                    for (Cliente cliente : clientes) {
                        System.out.println(cliente);
                    }

                    System.out.println("Ingrese su documento");
                    String id = sc.next();

                    Cliente cliente = Cliente.getClienteById(id);

                    if (cliente == null) {
                        System.out.println("----------[ERROR]----------");
                        System.out.println("!! Cliente no encontrado !!");
                        System.out.println("---------------------------\n");
                    } else {
                        if (cliente.consultaReserva() == null) {
                            System.out.println("-----------[ERROR]-----------");
                            System.out.println("!! No hay reservas actuales !!");
                            System.out.println("-----------------------------\n");
                        } else {
                            System.out.println("\n" + cliente.generarFactura() + "\n");
                        }
                    }
                    break;
            }
        } while (opcion != 0);

    }
}
