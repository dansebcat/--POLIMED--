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
public abstract class Medicina extends Producto{
    private String sintoma;

    public Medicina(String codigoProducto, String nombreProducto, double precioProducto) {
        super(codigoProducto, nombreProducto, precioProducto);
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
    
}
