

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
    static String correo;
    static String contraseña;

    public Usuario() {
        super(null, null, null, 0);
    }

    
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

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    

    public static String getCedula() {
        return cedula;
    }

    public static void setCedula(String cedula) {
        Persona.cedula = cedula;
    }

    public static int getEdad() {
        return edad;
    }

    public static void setEdad(int edad) {
        Persona.edad = edad;
    }
    
}

/*this.usuario.correo = (archivo primera linea)
this.usario.cedula= (archivo segunda linea)
this.usario.nombre = (archivo tercerra */




