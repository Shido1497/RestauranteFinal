/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DtoCliente;
import Model.DtoReserva;

import java.util.ArrayList;
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
       cliente.getReserva().setEstadoReserva("activa");
       clientes.add(cliente) ;
    }


    public void cancelarReserva (String noReserva  ){
        System.out.println("Reserva Cancelada " + noReserva);


        for (DtoCliente dtoCliente : clientes){
            if (dtoCliente.getReserva().getReservaId().equals(noReserva)) {
                dtoCliente.getReserva().setEstadoReserva("cancelada");
            }
        }

    }
    public void modificarReserva (DtoCliente cliente){
        System.out.println("Reserva Modificada " + cliente);

        for (DtoCliente dtoCliente : clientes){
            if (dtoCliente.getReserva().getReservaId().equals(cliente.getReserva().getReservaId())) {
            dtoCliente.setTelefono(cliente.getTelefono());
            dtoCliente.setDocumento(cliente.getDocumento());
            dtoCliente.setCorreo(cliente.getCorreo());
            dtoCliente.setNombre(cliente.getNombre());
                DtoReserva reserva = dtoCliente.getReserva();
                reserva.setFechaReserva(cliente.getReserva().getFechaReserva());
                reserva.setEstadoReserva("modificado");
                reserva.setDecoracion(cliente.getReserva().getDecoracion());
                reserva.setCantidadAcompanantes(cliente.getReserva().getCantidadAcompanantes());
            }
        }
        
    }
    public List<DtoCliente> consultaReserva(String documento, String reserva, Date fecha){
        System.out.println("Lista de Reserva " + documento + " " + reserva + " " + fecha);
        List<DtoCliente> reservas = new ArrayList<>();

        for (DtoCliente dtoCliente : clientes){
            if (dtoCliente.getReserva().getReservaId().equals(reserva)) {
                reservas.add(dtoCliente);
            } else if (dtoCliente.getReserva().getFechaReserva().equals(fecha)) {
                reservas.add(dtoCliente);
            } else if (dtoCliente.getDocumento().equals(documento)) {
                reservas.add(dtoCliente);

            }
        }

        return reservas;
    }

}
