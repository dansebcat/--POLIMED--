package polimed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author E2
 */
public class leerArchivo {
    
    public static void main(String[] args) {//metodo para leer datos de ussuarios en el archivo txt( pendiente)
        int registros=0;
        File archivo;
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena,nombre="",apellido="",clave="",correo="",cedula="",edad="";
        archivo = new File("Base de Datos Usuario.txt");
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            cadena="";
            while(cadena != null){
                try {
                    cadena=almacenamiento.readLine();
                    nombre=cadena;
                    cadena=almacenamiento.readLine();
                    apellido=cadena;
                    cadena=almacenamiento.readLine();
                    clave=cadena;
                    cadena=almacenamiento.readLine();
                    correo=cadena;
                    cadena=almacenamiento.readLine();
                    cedula=cadena;
                    cadena=almacenamiento.readLine();
                    edad=cadena;
                    if(cadena != null){
                        JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"
                                +"Correo: "+correo+"\n"+"Cedula: "+cedula+"\n"+"Edad: "+edad+"\n"+"Clave: "+clave);
                        registros++;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(GUI_Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                almacenamiento.close();
                leer.close();
            } catch (IOException ex) {
                Logger.getLogger(leerArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI_Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
