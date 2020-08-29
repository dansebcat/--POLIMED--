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
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;
        int tercerDigito;
        int verificador;
        int suma = 0;
        int digito = 0;
        
        try {
            if (cedula.length()==10){
                tercerDigito=Integer.parseInt(cedula.substring(2, 3));
                
                if (tercerDigito<6) {
                    int[] coefValCedula = {2,1,2,1,2,1,2,1,2};
                    verificador=Integer.parseInt(cedula.substring(9,10));
                    
                    for (int i=0;i<(cedula.length()-1);i++){
                        digito=Integer.parseInt(cedula.substring(i,i+1))*coefValCedula[i];
                        suma+=((digito%10)+(digito/10));
                    }                
                    
                    if ((suma%10==0)&&(suma%10==verificador)){
                        cedulaCorrecta=true;
                    }
                    
                    if ((10-(suma%10))==verificador){
                        cedulaCorrecta=true;
                    } 
                    
                    else{
                        cedulaCorrecta=false;
                    }
                }
                
                else {
                    cedulaCorrecta=false;
                }
            } 
            
            else {
                cedulaCorrecta=false;
            }
        }
        
        catch (NumberFormatException nfe) {
           cedulaCorrecta=false;
        }
        
        catch (Exception err) {
           System.out.println("Error");
           cedulaCorrecta=false;
        }
    
        if (!cedulaCorrecta) {
           System.out.println("La Cédula es Incorrecta");
        }
        
        return cedulaCorrecta;
    }
}
