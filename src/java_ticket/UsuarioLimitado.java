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
public final class UsuarioLimitado extends Usuario
{

    public UsuarioLimitado(String nombreCompleto, String username, String password, int edad) {
        super(nombreCompleto, username, password, edad);
    }

    @Override
    public String toString() {
        return "UsuarioLimitado{" +super.toString()+ '}';
    }

   
    
}
