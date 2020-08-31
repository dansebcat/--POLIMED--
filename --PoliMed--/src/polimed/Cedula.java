/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

/**
 *
 * @author INTEL
 */
public class Cedula {
    
    public boolean esValida(String cedulaNumero){//cambie le metodo de fabricio porque no me funcionaba en algunas cedulas le puse mi metodo de cedulas perdon :)
        int total=0;
        int duplicado;
        String nuevaCedula[];
        nuevaCedula=cedulaNumero.split("");
            for(int i=0;i<nuevaCedula.length-1;i++){
                if(i%2==0){
                    duplicado=Integer.parseInt(nuevaCedula[i])*2;
                    if(duplicado>9){
                        duplicado-=9;
                        total+=duplicado;
                    }else{
                        total+=duplicado;
                    }
                }else{
                    total+=Integer.parseInt(nuevaCedula[i]);
                }
            }
        int decenaSuperior=total+(10-(total%10));
        int digitoFinal=decenaSuperior-total,
        digitoVerificador=Integer.parseInt(nuevaCedula[9]);
        return digitoVerificador==digitoFinal;      
    }
}
