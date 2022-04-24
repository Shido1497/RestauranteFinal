/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DtoCliente;
import Model.DtoReserva;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author shido
 */
public class Reservas {

    public void crearReserva(DtoCliente cliente) {
       System.out.println("Reserva Creada " + cliente);
        
    }
    public void cancelarReserva (int noReserva  ){
        System.out.println("Reserva Cancelada " + noReserva);
    }
    public void modificarReserva (DtoCliente reserva){
        System.out.println("Reserva Modificada " + reserva);
        
    }
    public List<DtoReserva> consultaReserva(String documento, String reserva, Date fecha){
        System.out.println("Lista de Reserva " + documento + " " + reserva + " " + fecha);
        return Collections.emptyList();
        
    }

}
