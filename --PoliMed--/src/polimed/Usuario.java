

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.io.PipedReader;



/**
 *
 * @author Usuario
 */
public class Usuario extends Persona{
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String apellido, String cedula, int edad,String correo, String contraseña) {
        super(nombre, apellido, cedula, edad);
        this.correo=correo;
        this.contraseña=contraseña;
    }

   
    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
    
    
    
}

