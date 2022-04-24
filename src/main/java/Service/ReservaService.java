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
public class ReservaService {

    private List<DtoCliente> clientes;

    public ReservaService() {
        clientes = Collections.emptyList();
    }

    public void crearReserva(DtoCliente cliente) {
       System.out.println("Reserva Creada " + cliente);
       cliente.getReserva().setReservaId(java.util.UUID.randomUUID().toString());
       clientes.add(cliente) ;
    }


    public void cancelarReserva (String noReserva  ){
        System.out.println("Reserva Cancelada " + noReserva);
        clientes.stream().filter(dtoCliente -> dtoCliente.getReserva().getReservaId().equals(noReserva)).forEach(dtoCliente -> dtoCliente.getReserva().setEstadoReserva("cancelada"));

    }
    public void modificarReserva (DtoCliente reserva){
        System.out.println("Reserva Modificada " + reserva);
        
    }
    public List<DtoReserva> consultaReserva(String documento, String reserva, Date fecha){
        System.out.println("Lista de Reserva " + documento + " " + reserva + " " + fecha);
        return Collections.emptyList();
        
    }

}
