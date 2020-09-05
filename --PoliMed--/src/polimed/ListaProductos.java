/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class ListaProductos {
    private ArrayList <Producto> listaProductos;

    public ListaProductos() {
        listaProductos = new ArrayList<Producto>();
        
    }
    public void añadirProducto(Producto producto){
        listaProductos.add(producto);
    }
    
}
