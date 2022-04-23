/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author shido
 */
public class DtoReserva
{
    private Date fechaReserva;
    private String estadoReserva;
    private String cantidadAcompanantes;
    private String decoracion; 

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getCantidadAcompanantes() {
        return cantidadAcompanantes;
    }

    public void setCantidadAcompanantes(String cantidadAcompanantes) {
        this.cantidadAcompanantes = cantidadAcompanantes;
    }
      
    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }
    
}
