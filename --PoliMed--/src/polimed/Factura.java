/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Factura {
    public int anio,dia,mes,hora,minuto,segundos;
    public double total;
    
    public void mostrarFecha(){//metodo para calcular la fecha y hora actual
        Calendar calendario= Calendar.getInstance();
        String fecha;
        anio=calendario.get(Calendar.YEAR);//obtiene el año actual
        dia=calendario.get(Calendar.DATE);//obtiene el dia actual
        mes=calendario.get(Calendar.MONTH)+1;//obtiene el mes actual
        hora=calendario.get(Calendar.HOUR_OF_DAY);//obtiene la hora actual
        minuto=calendario.get(Calendar.MINUTE);//obtiene los minutos actuales
        segundos=calendario.get(Calendar.SECOND);//obtiene los segundos actuales
    }
    public void calcularTotalPagar(){//metodo para calcular el total a pagar por la compra
    
    
    }
    @Override
    public String toString() {
        return "Fecha: "+dia+"/"+mes+"/"+anio+"\nHora: "+hora+":"+minuto+":"+segundos+"\n";
    }
    
}
