
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.util.Date;

/**
 *
 * @author danie
 */
public class Persona {
    static  String nombre;
    static  String apellido;
    static String direccion;
    static  String cedula;
    static  int edad;

    public Persona() {
        Persona.nombre = null;
        Persona.apellido = null;
        Persona.cedula = null;
        Persona.edad = 0;
    }

    
    public Persona(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
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

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

