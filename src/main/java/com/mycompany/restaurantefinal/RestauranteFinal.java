/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.restaurantefinal;

import Model.DtoCliente;
import Model.DtoReserva;
import Service.ReservaService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shido
 */

/** Codigo desarrollado por:
 * Daniel Zapata Muñoz cc: 1042706584
 * Aida Lisseth Betancur López cc: 1039458783
 */
public class RestauranteFinal {

    public static void main(String[] args) {
        ReservaService servicio = new ReservaService();
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
                    DtoCliente cliente = extraerCliente(scanner);
                    if (cliente == null) break;

                    servicio.crearReserva (cliente);

                    break;
                case 2:
                    System.out.println("Introduzca el número de reserva");
                    String reservaId = scanner.next();
                    servicio.cancelarReserva(reservaId);


                    break;

                case 3:
                    System.out.println("Introduzca el numero de reserva a modificar:");
                    String reservaModificar = scanner.next();
                    DtoCliente clienteModificado = extraerCliente(scanner);
                    if (clienteModificado == null) break;
                    clienteModificado.getReserva().setReservaId(reservaModificar);

                    servicio.modificarReserva(clienteModificado);


                    break;


                case 4:
                    System.out.println("Introduzca el documento del cliente:");
                    String documento = scanner.next();
                    System.out.println("Introduzca el numero de reserva:");
                    String reserva = scanner.next();
                    System.out.println("Introduzca la fecha (YYYY-MM-DD):");
                    String fecha = scanner.next();
                    System.out.println("Introduzca la hora (HH:MM):");
                    String hora = scanner.next();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    Date fechaReserva = null;

                    try {
                        fechaReserva = dateFormat.parse(fecha + " " + hora);
                    } catch (ParseException e) {
                        System.out.println("El formato de fecha es incorrecto." + fecha + " " + hora);
                       break;
                    }
                    servicio.consultaReserva(documento, reserva, fechaReserva);
                    break;

                case 99:
                    System.exit(0);
                default:
                    break;
            }

        }

    }

    private static DtoCliente extraerCliente(Scanner scanner) {
        System.out.println("Introduzca el documento del cliente:");
        String documento = scanner.next();
        System.out.println("Introduzca el nombre del cliente:");
        String nombre = scanner.next();
        System.out.println("Introduzca el teléfono del cliente:");
        String telefono = scanner.next();
        System.out.println("Introduzca el correo del cliente:");
        String correo = scanner.next();
        System.out.println("Introduzca la fecha (YYYY-MM-DD):");
        String fecha = scanner.next();
        System.out.println("Introduzca la hora (HH:MM):");
        String hora = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date fechaReserva = null;
        try {
            fechaReserva = dateFormat.parse(fecha + " " + hora);
        } catch (ParseException e) {
            System.out.println("El formato de fecha es incorrecto." + fecha + " " + hora);
            return null;
        }

        System.out.println("Introduzca la cantidad de acompañantes");
        Integer acompanantes = scanner.nextInt();
        System.out.println("Introduzca decoración");
        String decoracion = scanner.next();
        DtoReserva reserva = new DtoReserva();
        reserva.setEstadoReserva("creado");
        reserva.setDecoracion(decoracion);
        reserva.setCantidadAcompanantes(acompanantes);
        reserva.setFechaReserva(fechaReserva);

        DtoCliente cliente = new DtoCliente();
        cliente.setReserva(reserva);
        cliente.setCorreo(correo);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setDocumento(documento);
        return cliente;
    }

}
