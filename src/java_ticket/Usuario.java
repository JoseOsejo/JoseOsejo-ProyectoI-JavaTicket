/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ticket;

/**
 *
 * @author jcoq2
 */
public class Usuario 
{
 /*antes de crear un usuario es importante definir que tipo de usuario sera*/
private String nombreCompleto;
private String username;//no se puede repetir
private String password;
private int edad;

    public Usuario(String nombreCompleto, String username, String password, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.username = username;
        this.password = password;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ", " + "nombreCompleto=" + nombreCompleto
                + ", username=" + username 
                + ", password=" + password 
                + ", edad=" + edad + '}';
    }

    
}
