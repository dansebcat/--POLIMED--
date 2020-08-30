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
public class ListaUsuarios {
    private ArrayList <Usuario> listaUsuarios;

    public ListaUsuarios() {
        //Crear Una Lista de Usuarios
       listaUsuarios = new ArrayList<Usuario>();
    }
    
    public void añadirUsuario (Usuario usuario){
      // Metodo para añadir Usuarios al Arreglo
      this.listaUsuarios.add(usuario);
    }
    public boolean validarUsuario (String correo , String contraseña){
        boolean run=false;
        //Si encuentra al usuario en el arreglo retorna true, si no false
        for (Usuario usuario : this.listaUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)){
                run = true;
                break;
            } 
        }
     return   run;
    }
    
    public int buscarUsuario ( String correo ){
        //Busca un Usuario y regresa el Indice el usario
         int auxas=0;
         for (Usuario usuario : this.listaUsuarios) {
           
            if (usuario.getCorreo().equals(correo) )
               auxas = listaUsuarios.indexOf(usuario);
                break;
            }
         return auxas;
        }
    }

