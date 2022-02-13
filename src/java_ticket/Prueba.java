/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jcoq2
 */
public class Prueba {
        static ArrayList<Usuario>usuarios = new ArrayList();

    //tanto los eventos como los usuarios se manejaran con herencia
    /*Revisar los temas en las clases y tambien en videos cursos etc.
     */
    //vamos hacer el menu primero para poder ingresar con un par de funciones 
    //que hagan la validacion de los usuarios
        static        ArrayList<Evento>eventos = new ArrayList();

    public static void main(String[] args) {

        //tengo que intentar crear usuarios para despues 
        //hacer funciones con respecto a que no se repitan
        //y que tambien pueda funcionar el login
        //tengo que hacer por default un usuario admin
        UsuarioAdmin userAdmin = new UsuarioAdmin("S","ekd","dflkd",3);
        eventos.add(new Evento(87,"jdfk","kdfj",new Date(),684));
        eventos.add(new Evento(66,"fdf","dfsdf",new Date(),386));
        eventos.add(new Evento(34,"fdf","dfsdf",new Date(),344));
        searchUserIndex("Carlos");
        
    //        System.out.println(retornarIdsEvento());
        System.out.println(idsEvento());
        /**/
    }
    private static String retornarIdsEvento(){
            for(int i = 0; i<eventos.size();i++){
                return String.valueOf(eventos.get(i).getCodigo());
            }
        return "No tiene eventos Creados!";
    }
    public static void dfdf(){
        for(Evento evento:eventos){
            System.out.print("["+evento.getCodigo()+"] ");
        }
    }
     public static ArrayList<String> idsEvento(){
        ArrayList<String>ids = new ArrayList();
        for(Evento evento:eventos){
            ids.add(String.valueOf(evento.getCodigo()));
        }
        return ids;
    }
    
    public static void searchUserIndex(String username)  {
            
        for(Usuario user: usuarios){
            if(user.getUsername().equalsIgnoreCase(username)){
                System.out.println(usuarios.indexOf(user));
            }
        }
        
        }
}
