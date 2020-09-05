package polimed;

import javax.swing.JOptionPane;

public class LeerArchivo {
   public boolean validarUsuario(String usuarios[],String user,String pass){
       boolean encontrado= false;
       for(int i=0; i<usuarios.length;i++){
           if(usuarios[i].equalsIgnoreCase(user) && usuarios[i+1].equalsIgnoreCase(pass)){
               JOptionPane.showMessageDialog(null,"Login Sucessfull!!!\n"+"Bienvenido "+user);
              encontrado = true;
           }
       }
       return encontrado;
   }
}
