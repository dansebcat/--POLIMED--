/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimed;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author E2
 */
public class GUI_Login extends javax.swing.JFrame {

    private static Scanner read;
    private static String user,psw;
    public GUI_Login() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt user=new TextPrompt("Usuario",txtUsuario);//objeto para tener un placeholder en el jtextfield de usuario
        TextPrompt password= new TextPrompt("Password", pssClave);//objeto para tener un placeholder en el jtextfield de usuario
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pssClave = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(201, 233, 255));
        jPanel1.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconUser.png"))); // NOI18N

        pssClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pssClaveKeyTyped(evt);
            }
        });

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setEnabled(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistro.setText("REGISTRARSE");
        btnRegistro.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pssClave)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pssClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 230, 320));

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 48)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconBuho.png"))); // NOI18N
        jLabel2.setText("POLIMED");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 360, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/fondoLogin1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void borrarElementos(){
        txtUsuario.setText("");
        pssClave.setText("");
    }
    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        habilitarBotones();
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void pssClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pssClaveKeyTyped
        // TODO add your handling code here:
        habilitarBotones();
    }//GEN-LAST:event_pssClaveKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int option;
        GUI_Productos producto= new GUI_Productos();
        GUI_Registro registro= new GUI_Registro();
        try {
            int nLineas = 0;
            int i = 0;
            String [] usuarios= null;
            String linea;
            read = new Scanner(new File("DatosLogin.txt"));
            File f = new File("DatosLogin.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            try {
                while ((linea = br.readLine()) != null) {
                    nLineas++;
                }
            } catch (IOException ex) {
                Logger.getLogger(GUI_Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            usuarios = new String[nLineas];
            while (read.hasNextLine()) {
                usuarios[i++] = read.nextLine();
            }
            user = txtUsuario.getText();
            psw = pssClave.getText();
            LeerArchivo userValid = new LeerArchivo();
            
            if (userValid.validarUsuario(usuarios, user, psw)) {
                producto.setVisible(true);
                this.setVisible(false);
            } else {
                option = JOptionPane.showConfirmDialog(null, "Usuario no Registrado" + "\n" + "Desea Registrarse ");
                if (option == 0) {
                    borrarElementos();
                    txtUsuario.setEnabled(false);
                    pssClave.setEnabled(false);
                    btnIngresar.setEnabled(false);
                    registro.setVisible(true);
                    this.setVisible(false);
                } else {
                    borrarElementos();
                    txtUsuario.setEnabled(true);
                    pssClave.setEnabled(true);
                    btnIngresar.setEnabled(false);
                    btnRegistro.setEnabled(false);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GUI_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        PoliMed emailUser= new PoliMed();
        if(emailUser.esCorreoValido(txtUsuario.getText())){
            
        }else{
            JOptionPane.showMessageDialog(null, "Email Incorrecto");
            txtUsuario.requestFocus();
        }
        habilitarBotones();
    }//GEN-LAST:event_txtUsuarioFocusLost

    /**
     * @param args the command line arguments
     */
    public void habilitarBotones(){//metodo para habilitar bontones
        if(!txtUsuario.getText().isEmpty() && !pssClave.getText().isEmpty()){
            btnIngresar.setEnabled(true);
        }
    }
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
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pssClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
}