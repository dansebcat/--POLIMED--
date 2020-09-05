package polimed;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author E2
 */
public class GUI_Registro extends javax.swing.JFrame {

    public GUI_Registro() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt nombre= new TextPrompt("Nombre", txtNombre);
        TextPrompt apellido= new TextPrompt("Apellido", txtApellido);
        TextPrompt clave= new TextPrompt("Clave", pssClave);
        TextPrompt correo= new TextPrompt("Correo", txtCorreo);
        TextPrompt cedula= new TextPrompt("Cedula", txtCedula);
        TextPrompt edad= new TextPrompt("Edad", txtEdad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        pssClave = new javax.swing.JPasswordField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 152, 139, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 207, 139, -1));

        pssClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pssClaveKeyTyped(evt);
            }
        });
        getContentPane().add(pssClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 287, 139, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 247, 139, -1));

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 327, 139, -1));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 367, 139, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconUser.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 40, 139, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconEnter.png"))); // NOI18N
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconCancel.png"))); // NOI18N
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, -1, -1));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconHome.png"))); // NOI18N
        btnRegresar.setEnabled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 410, 139, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/fondoRegister.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void userData(){// metodo para extraer el correo y la clave y validar un usaurio ya registrado
        String nombreArchivo="DatosLogin";
        String carpeta= System.getProperty("user.dir");
        String direccionCompleta=carpeta+"/"+nombreArchivo+".txt";
        String cadena=txtCorreo.getText()+"\n"+pssClave.getText()+"\n";
        FileWriter ubicacion= null;
        try {
            ubicacion= new FileWriter(direccionCompleta,true);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null,ex);
        }
        try {
            BufferedWriter escritor = new BufferedWriter(ubicacion);
            escritor.write(cadena);
            escritor.close();
        } catch (Exception e) {
        }
    }
    public void crearUsuario(){// metodo para crear archivo.txt y guardar todos los  datos del ususario nuevo
        String nombreArchivo="Base de Datos Usuario";
        String carpeta= System.getProperty("user.dir");
        String direccionCompleta=carpeta+"/"+nombreArchivo+".txt";
        String cadena=txtNombre.getText()+"\n"+txtApellido.getText()+"\n"+pssClave.getText()+"\n"+txtCorreo.getText()+"\n"+txtCedula.getText()+"\n"+txtEdad.getText()+"\n";
        FileWriter ubicacion= null;
        try {
            ubicacion= new FileWriter(direccionCompleta,true);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null,ex);
        }
        try {
            BufferedWriter escritor = new BufferedWriter(ubicacion);
            escritor.write(cadena);
            escritor.close();
        } catch (Exception e) {
        }
    }
    public void limpiarElementos(){
        txtNombre.setText("");
        txtApellido.setText("");
        pssClave.setText("");
        txtCorreo.setText("");
        txtCedula.setText("");
        txtEdad.setText("");
    }
    public void habilitarBotones(){
        if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !pssClave.getText().isEmpty()
           && !txtCorreo.getText().isEmpty() && !txtCedula.getText().isEmpty() && !txtEdad.getText().isEmpty()){
            btnCancelar.setEnabled(true);
            btnGuardar.setEnabled(true);
            btnRegresar.setEnabled(true);
        }
    }
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char validacion1=evt.getKeyChar();
        if(Character.isDigit(validacion1)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten Letras");
        }
        habilitarBotones();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        char validacion1=evt.getKeyChar();
        if(Character.isDigit(validacion1)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten Letras");
        }
        habilitarBotones();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void pssClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pssClaveKeyTyped
        // TODO add your handling code here:
        habilitarBotones();
    }//GEN-LAST:event_pssClaveKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        habilitarBotones();
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        // TODO add your handling code here:
        char validacion1=evt.getKeyChar();
        if(Character.isLetter(validacion1)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten Numeros");
        }
        if(txtCedula.getText().length()>=10){
                evt.consume();
                getToolkit().beep();
        }
        habilitarBotones();
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        char validacion1=evt.getKeyChar();
        if(Character.isLetter(validacion1)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Solo se permiten Numeros");
        }
        if(txtEdad.getText().length()>=2){
                evt.consume();
                getToolkit().beep();
        }
        habilitarBotones();
    }//GEN-LAST:event_txtEdadKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limpiarElementos();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnRegresar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        GUI_Login principal = new GUI_Login();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        crearUsuario();
        userData();
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
        // TODO add your handling code here:
        PoliMed emailUser= new PoliMed();
        if (emailUser.esCorreoValido(txtCorreo.getText())) {

        } else {
            JOptionPane.showMessageDialog(null, "Email Incorrecto!!!");
            txtCorreo.requestFocus();
        }
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost
        // TODO add your handling code here:
        Cedula useId= new Cedula();
        if(useId.esValida(txtCedula.getText())){
            
        }else{
            JOptionPane.showMessageDialog(null,"Cedula Incorrecta!!!");
            txtCedula.requestFocus();
        }
    }//GEN-LAST:event_txtCedulaFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField pssClave;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
