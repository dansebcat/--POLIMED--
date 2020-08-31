
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.util.ArrayList;

/**
 *
 * @author PoliSoft
 */
public class PoliMed {
    //Esta clase representa a la Aplcacion de la farmacia.
      private ArrayList <Producto> productosFarmacia; // Arreglo que contiene todos los productos disponibles.
      private ArrayList <Usuario> usuariosRegistrados; //Arreglo que almacena usuario registrados.
      //Es necesario añadir un arreglo para productos a comprar.

    public PoliMed() {
        //Inicializamos los Arreglos
        productosFarmacia=new ArrayList<>();
        usuariosRegistrados=new ArrayList<>();
    }  
    
      public void añadirProducto(Producto producto){
         //Metodo Para Añadir Productos A la Farmacia.
       this.productosFarmacia.add(producto);
    }
      public void añadirUsuario (Usuario usuario){
      // Metodo para añadir Usuarios al Arreglo de Usuarios Registrados.
      this.usuariosRegistrados.add(usuario);
    }
     public boolean validarUsuario (String correo , String contraseña){
        boolean run=false;
        //Si encuentra al usuario en el arreglo retorna true, si no false
        for (Usuario usuario : this.usuariosRegistrados) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)){
                run = true;
                break;
            } 
        }
     return   run;
    }
      public void iniciarPoliMed(){
          //Aqui se deben inicializar todos los productos 
          //Tambien se deben inicializar los usuarios registrados desde un archivo.
      }
      
      
      
}

