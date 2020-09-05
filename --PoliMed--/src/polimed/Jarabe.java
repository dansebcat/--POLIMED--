/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

/**
 *
 * @author danie
 */

public class Jarabe extends Medicina {

    public Jarabe(String codigoProducto, String nombreProducto, String sintoma, double precioProducto) {
        super(codigoProducto, nombreProducto, sintoma, precioProducto);
    }

    

    @Override
    public double calcularPrecio(int cantidadProducto) {
         return this.getPrecioProducto()*cantidadProducto;
    }
    
}
