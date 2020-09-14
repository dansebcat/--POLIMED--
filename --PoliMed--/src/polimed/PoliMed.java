
package polimed;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PoliSoft
 */
public class PoliMed {
    //Esta clase representa a la Aplcacion de la farmacia.
    public static ArrayList <Producto> productosComprados= new ArrayList <> ();  //Arreglo de productos que comprara el usuario.
    public static ArrayList <Producto> productosFarmacia; // Arreglo que contiene todos los productos disponibles.
      //Es necesario añadir un arreglo para productos a comprar.
    public ArrayList <Object[]> productosVector= new ArrayList<>();
    public PoliMed() {
        //Inicializamos los Arreglos
        productosFarmacia=new ArrayList<>();
    }  
    
    public  static void añadirProductoComprado(String codigo , int cantidad){
        //Añade productos que va a comprar el usuario a un Arreglo
        iniciarProductos();
        boolean encontro=false;
        for (Producto producto : productosFarmacia) {
            if (producto.getCodigoProducto().equals(codigo) ){
                     for (int i = 0 ; i < cantidad ; i++){
                      productosComprados.add(producto);
                      encontro=true;
                }
            }
        }
        if ( !encontro){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el producto");
        }else{
            JOptionPane.showMessageDialog(null,"Producto/s agregado/s Correctamente");
        }
            
       
       
    }
    
    //Buscar //Ordenar
    
    public void añadirProducto(Producto producto) {
        //Metodo Para Añadir Productos A la Farmacia.
        this.productosFarmacia.add(producto);
    }

    public boolean esCorreoValido(String correo) {
        //Metodo para validar si un correo tiene estructura adecuada  
        return correo.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.([a-zA-Z]{2,4})+$");
    }

    public static void iniciarProductos() {
        //Aqui se deben inicializar todos los productos 
        //Añadiendo Pastillas
        productosFarmacia.add(new Pastilla ("P01","MUXOL OTC 30MG","TOS",4.40));
        productosFarmacia.add(new Pastilla ("P02","BISOLVON","TOS",6.80));
        productosFarmacia.add(new Pastilla ("P03","KALOBA 20MG","TOS",13.50));
        productosFarmacia.add(new Pastilla ("P04","ISLA MINT","DOLOR DE GARGANTA",6.20));
        productosFarmacia.add(new Pastilla ("P05","ORALSEPT","DOLOR DE GARGANTA",18));
        productosFarmacia.add(new Pastilla ("P06","MEBOLIMON","DOLOR DE GARGANTA",19.20));
        productosFarmacia.add(new Pastilla ("P07","NEOGRIPAL F","GRIPE",4.80));
        productosFarmacia.add(new Pastilla ("P08","FINALIN GRIPE","GRIPE",18.24));
        productosFarmacia.add(new Pastilla ("P09","LEMONFLU","GRIPE",15));
        productosFarmacia.add(new Pastilla ("P10","ASPIRINA","ANALGESICO",10.80));
        productosFarmacia.add(new Pastilla ("P11","PROFINAL FLASH","ANALGESICO",4.80));
        productosFarmacia.add(new Pastilla ("P12","BUPREX FALSH","ANALGESICO",2.50));
        //Añadiendo Jarabes
        productosFarmacia.add(new Jarabe("JO1","MUCOSOLVAN 120ML","TOS",7.39));
        productosFarmacia.add(new Jarabe("JO2","BEBITOL 60ML","TOS",3.11));
        productosFarmacia.add(new Jarabe("JO3","BISOLVON 120 ML","TOS",5.04));
        productosFarmacia.add(new Jarabe("JO4","ORALSEPT 240ML","DOLOR DE GARGANTA",2.26));
        productosFarmacia.add(new Jarabe("JO5","SALIV HUMECTANTE 60 ML","DOLOR DE GARGANTA",4.80));
        productosFarmacia.add(new Jarabe("JO6","KALOBA","GRIPE",17.45));
        productosFarmacia.add(new Jarabe("JO7","NASTIFRIN 100ML","GRIPE",6.08));
        productosFarmacia.add(new Jarabe("JO8","NEOGRIPAL 60ML","GRIPE",5.24));
        productosFarmacia.add(new Jarabe("JO9","FEVERIL 120ML","ANALGESICO",1.90));
        productosFarmacia.add(new Jarabe("J10","MK-PARACETAMOL 30ML","ANALGESICO",1.63));
        productosFarmacia.add(new Jarabe("J11","UMBRAL 60ML","ANALGESICO",2.15));
    }
    public static double calcularPrecioTotal( ){
        double suma=0;
        for (Producto producto : productosComprados) {
            suma+=producto.getPrecioProducto();
        }
        return suma;
    }
}

