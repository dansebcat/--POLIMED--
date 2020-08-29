/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;



/**
 *
 * @author Usuario
 */
public class Usuario {
    private String correo;
    private String contraseña;
    
    
     public boolean esCorreo(String correo){
        this.correo=correo;  
        return correo.matches("([a-z]*[.]*[a-z]*[0-9]*)+[@]"+"([hotmail.com]*[gmail.com]*[epn.edu.ec]*)");
    }
    
}
