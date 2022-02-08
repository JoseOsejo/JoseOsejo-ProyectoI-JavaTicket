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
    public static void main(String[] args) {

        //tengo que intentar crear usuarios para despues 
        //hacer funciones con respecto a que no se repitan
        //y que tambien pueda funcionar el login
        //tengo que hacer por default un usuario admin
        ArrayList<Evento>eventos = new ArrayList();
        UsuarioAdmin userAdmin ;
        userAdmin = new UsuarioAdmin(eventos,",dfasd","Carlos","dfsf",3);
        usuarios.add(new Usuario("Willina","Jose","dfasd",3));
        usuarios.add(userAdmin);
        searchUserIndex("Carlos");
        /**/
    }
    public static void searchUserIndex(String username)  {
            
        for(Usuario user: usuarios){
            if(user.getUsername().equalsIgnoreCase(username)){
                System.out.println(usuarios.indexOf(user));
            }
        }
        
        }
}
