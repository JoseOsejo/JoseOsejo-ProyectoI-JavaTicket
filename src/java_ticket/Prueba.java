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
        ArrayList<Usuario> usuarios = new ArrayList();
        ArrayList<Evento> eventos = new ArrayList();
        Date fecha = new Date();
        int montoRenta = 500;
        Evento evento = new Evento(134, "MANA", "increibleEvento", fecha, montoRenta);
        eventos.add(evento);
        String nombre = "Jose";
        String user = "admin";
        String password = "supersecreto";
        int edad = 19;
        Usuario admin = new UsuarioAdmin(eventos, nombre, user, password, edad);
        Usuario loco = new UsuarioAdmin(eventos, nombre, user, password, edad);
        usuarios.add(loco);
        usuarios.add(admin);
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
