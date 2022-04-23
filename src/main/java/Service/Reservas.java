/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DtoCliente;
import Model.DtoReserva;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author shido
 */
public class Reservas {

    public void crearReserva(DtoCliente cliente) {
       System.out.println("Reserva Creada");
        
    }
    public void cancelarReserva (int noReserva  ){
        System.out.println("Reserva Cancelada");
    }
    public void modificarReserva (DtoReserva reserva){
        System.out.println("Reserva Modificada");
        
    }
    public List<DtoReserva> consultaReserva(DtoReserva reserva){
        System.out.println("Lista de Reserva");
        return Collections.emptyList();
        
    }
}
