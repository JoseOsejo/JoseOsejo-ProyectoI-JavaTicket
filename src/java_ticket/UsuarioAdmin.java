/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class UsuarioAdmin extends Usuario {

    private ArrayList<Evento> eventosCreados;

    public UsuarioAdmin(ArrayList<Evento> eventosCreados, String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
        this.eventosCreados = eventosCreados;
    }

    public ArrayList<Evento> getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(ArrayList<Evento> eventosCreados) {
        this.eventosCreados = eventosCreados;
    }


    @Override
    public String toString() {
        return "eventosCreados" + eventosCreados + super.toString();//To change body of generated methods, choose Tools | Templates.
    }

}
