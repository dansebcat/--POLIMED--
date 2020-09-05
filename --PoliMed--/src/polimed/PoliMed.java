
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
      public ArrayList <Producto> productosFarmacia; // Arreglo que contiene todos los productos disponibles.
      //Es necesario añadir un arreglo para productos a comprar.

    public PoliMed() {
        //Inicializamos los Arreglos
        productosFarmacia=new ArrayList<>();
    }  
    
    public void añadirProducto(Producto producto) {
        //Metodo Para Añadir Productos A la Farmacia.
        this.productosFarmacia.add(producto);
    }

    public boolean esCorreoValido(String correo) {
        //Metodo para validar si un correo tiene estructura adecuada  
        return correo.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.([a-zA-Z]{2,4})+$");
    }

    public void iniciarPoliMed() {
        //Aqui se deben inicializar todos los productos 
        //Tambien se deben inicializar los usuarios registrados desde un archivo.
    }
}

