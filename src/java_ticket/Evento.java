/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class Evento 
{
    private int codigo;//el codigo de cada evento es unico
    private String tituloEvento;
    private String descripcion;
    private Date fechaEvento;
    private int montoRenta;//renta del estadio
    //todas se ingresan desde el teclado

    public Evento(int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        this.codigo = codigo;
        this.tituloEvento = tituloEvento;
        this.descripcion = descripcion;
        this.fechaEvento = fechaEvento;
        this.montoRenta = montoRenta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getMontoRenta() {
        return montoRenta;
    }

    public void setMontoRenta(int montoRenta) {
        this.montoRenta = montoRenta;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", tituloEvento=" + tituloEvento + ", descripcion=" + descripcion + ", fechaEvento=" + fechaEvento + ", montoRenta=" + montoRenta + '}';
    }
    
    
}
