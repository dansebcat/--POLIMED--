
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

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        Persona.direccion = direccion;
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

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }   
}

