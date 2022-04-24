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
    private Integer cantidadAcompanantes;
    private String decoracion;

    private String reservaId;

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

    public Integer getCantidadAcompanantes() {
        return cantidadAcompanantes;
    }

    public void setCantidadAcompanantes(Integer cantidadAcompanantes) {
        this.cantidadAcompanantes = cantidadAcompanantes;
    }
      
    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getReservaId() {
        return reservaId;
    }

    public void setReservaId(String reservaId) {
        this.reservaId = reservaId;
    }

    @Override
    public String toString() {
        return "DtoReserva{" +
                "fechaReserva=" + fechaReserva +
                ", estadoReserva='" + estadoReserva + '\'' +
                ", cantidadAcompanantes=" + cantidadAcompanantes +
                ", decoracion='" + decoracion + '\'' +
                ", reservaId='" + reservaId + '\'' +
                '}';
    }
}
