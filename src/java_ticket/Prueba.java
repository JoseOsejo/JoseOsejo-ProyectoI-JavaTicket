/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

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
    Scanner leer = new Scanner(System.in);
    int opcion = 0;
    
       while(opcion!= 3){
          
           System.out.println(" [JAVA TICKET]\n1. LogIn\n2. Crear Cuenta\n3. Salir");
           opcion = leer.nextInt();
           
            if(opcion <1 || opcion >3){
               break;
           }
       }
    }
}