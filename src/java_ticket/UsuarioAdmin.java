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

    public UsuarioAdmin(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
        this.eventosCreados = new ArrayList();
    }

    public ArrayList<Evento> getEventosCreados() {
        return eventosCreados;
    }

    public void setEventosCreados(ArrayList<Evento> eventosCreados) {
        this.eventosCreados = eventosCreados;
    }
    
    public ArrayList<String> idsEvento(){
        ArrayList<String>ids = new ArrayList();
        for(Evento evento:eventosCreados){
            ids.add(String.valueOf(evento.getCodigo()));
        }
        return ids;
    }
   
    @Override
    public String toString() {
        return "UsuarioAdmin{" + "IdsDeEventos " + idsEvento()+ super.toString() +eventosCreados+ "}";//To change body of generated methods, choose Tools | Templates.
    }

}
