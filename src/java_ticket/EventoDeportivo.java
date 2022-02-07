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
    private ArrayList<String> equipos;
    private ArrayList<String> listadoJugadores1;
    private ArrayList<String> listadoJugadores2;

    /*||Atributos extras||
    listado de jugadores por equipo
    cada listado dentro de un arraylist para cada equipo
     */
    public EventoDeportivo(Deportes deporte, int cantidadGente, ArrayList<String> equipos, ArrayList<String> listadoJugadores1, ArrayList<String> listadoJugadores2, int codigo, String tituloEvento, String descripcion, Date fechaEvento, int montoRenta) {
        super(codigo, tituloEvento, descripcion, fechaEvento, montoRenta);
        this.tipoDeporte = deporte;
        this.cantidadGente = cantidadGente;
        this.equipos = equipos;
        this.listadoJugadores1 = listadoJugadores1;
        this.listadoJugadores2 = listadoJugadores2;
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

    public ArrayList<String> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<String> equipos) {
        this.equipos = equipos;
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
        return "Evento Deportivo" + "Deporte " + tipoDeporte
                + "Cantidad de Gente " + cantidadGente
                + "Equipos " + equipos
                + super.toString();//To change body of generated methods, choose Tools | Templates.

    }

}
