/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class Prueba {
    public static ArrayList<Usuario> usuarios = new ArrayList();
    public static ArrayList<Evento>eventos = new ArrayList();

    public static void main(String[] args) {
        //eventos
        eventos.add(new Evento(123,"Rock","dkfj;adf",Calendar.getInstance().getTime(),343));
        eventos.add(new Evento(1234,"Rock","dkfj;adf",Calendar.getInstance().getTime(),343));
        eventos.add(new Evento(12345,"Rock","dkfj;adf",Calendar.getInstance().getTime(),343));

        System.out.println(retornarEvento(12345));
        //Usuarios 
        usuarios.add(new UsuarioAdmin("Jose","jcoq2003","34342",45));
        usuarios.add(new UsuarioAdmin("Jose","juanca","34342",45));
        usuarios.add(new UsuarioAdmin("Jose","Marios","34342",45));
        usuarios.add(new UsuarioAdmin("Jose","luis","34342",45));
        
        System.out.println(retornarUsuario("juanca"));
        /*
        ar hoy = Calendar.getInstance();
            Calendar fecha = Calendar.getInstance();
            fecha.set(2015, 01, 27);
            //System.out.println(fecha.get((Calendar.YEAR))+" "+fecha.get(Calendar.MONTH)+" "+fecha.get(Calendar.DATE));            System.out.println(hoy.get(Calendar.DATE));
            hoy.add(Calendar.YEAR, -9);
            System.out.println(hoy.before(fecha));
            
            
            Calendar hoy = Calendar.getInstance();
            hoy.add(Calendar.DATE, -1);
            System.out.println(hoy.get(Calendar.DATE));
         */
        /*Calendar fecha = Calendar.getInstance();
        fecha.set(2022, 02, 13);
        Evento e = new Evento(3424, "ldfkjs", "dlkf", fecha.getTime(), 3423);
        System.out.println(fecha.getTime());
        Calendar hoy = Calendar.getInstance();
        
        if (hoy.before(fecha)) {
            hoy.add(Calendar.DATE, -1);
            if (hoy.before(fecha)) {
                System.out.println("Hola");
                System.out.println(fecha.getTime());
                System.out.println(hoy.getTime());
            } else {
                System.out.println("SIU");
            }
        }*/
        // System.out.println(unDiaAntes(e.getFechaEvento()));

        //System.out.println(e);
    }
    //funciones recursivas
    private static Usuario retornarUsuario(String username,int i)
    {
        if(i<usuarios.size()){
            if(usuarios.get(i).getUsername().equalsIgnoreCase(username)){
                return usuarios.get(i);
            }
        }
        return retornarUsuario(username,i+1);
    }

    public static Usuario retornarUsuario(String username){
        return retornarUsuario(username,0);
    }
    
    private static Evento retornarEvento(int codigo,int i){
        if(i<eventos.size()){
            if(eventos.get(i).getCodigo() == codigo){
                return eventos.get(i);
            }
        }
        return retornarEvento(codigo,i+1);
    }
    public static Evento retornarEvento(int codigo){
        return retornarEvento(codigo,0);
    }
}
