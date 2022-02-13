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
public class EventoDeportivo extends Evento {

    //cantidad maxima de gente es 20 mil
    //estos datos son parte de la creacion en la opcion del menu en la que se crean
    private Deportes tipoDeporte;
    private int cantidadGente;
    private String equipo1;
    private String equipo2;
    private ArrayList<String> listadoJugadores1;
    private ArrayList<String> listadoJugadores2;

    /*||Atributos extras||
    listado de jugadores por equipo
    cada listado dentro de un arraylist para cada equipo
     */

    public EventoDeportivo(Deportes tipoDeporte, int cantidadGente, String equipo1, String equipo2, int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        super(codigo, tituloEvento, descripcion, fechaEvento, montoRenta);
        this.tipoDeporte = tipoDeporte;
        this.cantidadGente = cantidadGente;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.listadoJugadores1 = new ArrayList();
        this.listadoJugadores2 = new ArrayList();
    }
    

    public Deportes getDeporte() {
        return tipoDeporte;
    }

    public void setDeporte(Deportes deporte) {
        this.tipoDeporte = deporte;
    }

    public int getCantidadGente() {
        return cantidadGente;
    }

    public void setCantidadGente(int cantidadGente) {
        this.cantidadGente = cantidadGente;
    }

    public Deportes getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(Deportes tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

   

    public ArrayList<String> getListadoJugadores1() {
        return listadoJugadores1;
    }

    public void setListadoJugadores1(ArrayList<String> listadoJugadores1) {
        this.listadoJugadores1 = listadoJugadores1;
    }

    public ArrayList<String> getListadoJugadores2() {
        return listadoJugadores2;
    }

    public void setListadoJugadores2(ArrayList<String> listadoJugadores2) {
        this.listadoJugadores2 = listadoJugadores2;
    }

    @Override
    public String toString() {
        return "EventoDeportivo" + "Deporte " + tipoDeporte
                + "Cantidad de Gente " + cantidadGente
                + "Equipo1 " + equipo1
                + "Equipo2 " + equipo2
                + super.toString();//To change body of generated methods, choose Tools | Templates.

    }

}
