
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
    private final String nombre;
    private final String apellido;
    private String direccion;
    private final String cedula;
    private final int edad;

    public Persona(String nombre, String apellido, String cedula, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }

    
    
    
}
