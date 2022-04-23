/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.restaurantefinal;

import Service.Reservas;
import java.util.Scanner;

/**
 *
 * @author shido
 */
public class RestauranteFinal {

    public static void main(String[] args) {
        Reservas servicio = new Reservas();
        while (true) {
            System.out.println("Bienvenido a Restaurante!");
            System.out.println();
            System.out.println("Elija una opcion: ");
            System.out.println("\t1 - Crear Reserva");
            System.out.println("\t2 - Cancerlar Reserva");
            System.out.println("\t3 - Modificar Reserva");
            System.out.println("\t4 - Consultar Reserva");
            System.out.println("\t99 - Salir");

            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el documento del cliente:");
                    String documento = scanner.next();
                    System.out.println("Introduzca el nombre del cliente:");
                    String nombre = scanner.next();
                    System.out.println("Introduzca el telefono del cliente:");
                    String telefono = scanner.next();
                    System.out.println("Introduzca el correo del cliente:");
                    String correo = scanner.next();                    
                    System.out.println("Introduzca la fecha (YYYY-MM-DD):");
                    String fecha = scanner.next();
                    System.out.println("Introduzca la hora (HH:MM):");
                    
                    System.out.println("Introduzca la cantidad de acompañantes");
                    Integer acompanantes = scanner.nextInt();
                    System.out.println("Introdusca decoracion");
                    String decocarion = scanner.next();

                    servicio.crearReserva(null);

                    break;
                case 2:
                    System.out.println("Introduzca la reserva");
                    Integer reservaId = scanner.nextInt();
                    servicio.cancelarReserva(reservaId);
                    
                    
                    break;

                case 3:

                    Cliente cliente = new Cliente();
                    cliente.setNombre(nombre);
                    cliente.setTelefono(telefono);

                    Mesa mesaElegida = null;
                    for (Mesa mesa : Restaurante.getInstancia().getMesas()) {
                        if (mesa.getIdMesa().equals(mesaId)) {
                            mesaElegida = mesa;
                            break;
                        }
                    }

                    if (mesaElegida == null) {
                        System.err.println("La mesa no existe");
                        break;
                    }

                    LocalDateTime fechaYHora = LocalDateTime.parse(fecha + "T" + hora + ":00");

                    Reserva reserva = new Reserva();
                    reserva.setCliente(cliente);
                    reserva.setMesa(mesaElegida);
                    reserva.setFecha(fechaYHora);
                    reserva.getMesa().setReservada(true);

                    Restaurante.getInstancia().getReservas().add(reserva);

                    break;
                case 99:
                    System.exit(0);
                default:
                    break;
            }

        }

    }

}
