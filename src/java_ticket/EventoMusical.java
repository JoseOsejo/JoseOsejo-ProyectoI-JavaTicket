/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class EventoMusical extends Evento {
    //cantidad Maxima es de 25 mil(por el uso de la grama)
    //seguro = 30/valorRenta
    private Musica tipoMusica;
    private int cantidadGente;
    private double seguro;
    private ArrayList<String>listadoEquipoMusical;
    
    //un seguro por la grama del 30% sobre el valor de la renta
    /*Arraylist de los nombres de las personas que conforman la banda musical*/

    public EventoMusical(Musica tipoMusica, int cantidadGente,int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        super(codigo, tituloEvento, descripcion, fechaEvento, montoRenta);
        this.tipoMusica = tipoMusica;
        this.cantidadGente = cantidadGente;
        this.seguro = 0.3*montoRenta;
        this.listadoEquipoMusical = new ArrayList();
    }

    public Musica getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(Musica tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public int getCantidadGente() {
        return cantidadGente;
    }

    public void setCantidadGente(int cantidadGente) {
        this.cantidadGente = cantidadGente;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public ArrayList<String> getListadoEquipoMusical() {
        return listadoEquipoMusical;
    }

    public void setListadoEquipoMusical(ArrayList<String> listadoEquipoMusical) {
        this.listadoEquipoMusical = listadoEquipoMusical;
    }

    @Override
    public String toString() {
        return "Evento Musical"+"Tipo Musica "+tipoMusica
                +"cantidadGente "+cantidadGente
                +"Seguro"+seguro
                +"Equipo Musical"+listadoEquipoMusical
                +super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
