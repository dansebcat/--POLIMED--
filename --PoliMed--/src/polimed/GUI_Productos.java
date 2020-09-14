package polimed;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class GUI_Productos extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    private TableRowSorter trsFiltro;//instancia de un objeto tipo TableRowSorter
    PoliMed polimed = new PoliMed();
    
    public void filtro(){// metodo para filtrar la busqueda 
        String filtro = txtBusqueda.getText().toUpperCase();
        
        if (rbtNombre.isSelected()) {
            int columna = 1;
            trsFiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        } else if (rbtSintoma.isSelected()) {
            int columna = 2;
            trsFiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
        }
    }
   
    public void cargarDatos(){// carga de datos del arraylist a la tabla
         
        Object[][] vector = new Object [polimed.productosFarmacia.size()][4]; 
        polimed.iniciarProductos();
        model.addColumn("Cod. Producto");
        model.addColumn("Nombre Producto");
        model.addColumn("Sintoma");
        model.addColumn("Precio $");
        
        this.tblProductos.setModel(model);
      
        for (Producto producto : polimed.productosFarmacia) {
           model.addRow(new Object[]{producto.getCodigoProducto(),producto.getNombreProducto(),((Medicina)producto).getSintoma(),String.valueOf(producto.getPrecioProducto())}); 
        }
        this.tblProductos.setModel(model);
    }
    public GUI_Productos() {
        initComponents();
         
        setLocationRelativeTo(null);
        cargarDatos();
        TextPrompt busqueda = new TextPrompt("Producto a Buscar", txtBusqueda);//placeholders
        TextPrompt cantidad = new TextPrompt("Cantidad", txtCantidad);//placeholders
        TextPrompt codProdcuto = new TextPrompt("Cod. Producto", txtCodigo);//placeholders
    }

    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgFiltro = new javax.swing.ButtonGroup();
        txtBusqueda = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rbtNombre = new javax.swing.JRadioButton();
        rbtSintoma = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusqueda.setEditable(false);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 38));

        txtCantidad.setEditable(false);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 112, 38));

        tblProductos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.getTableHeader().setResizingAllowed(false);
        tblProductos.getTableHeader().setReorderingAllowed(false);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 580, 290));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Filtro por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        btgFiltro.add(rbtNombre);
        rbtNombre.setText("Nombre Producto");
        getContentPane().add(rbtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        btgFiltro.add(rbtSintoma);
        rbtSintoma.setText("Sintoma");
        getContentPane().add(rbtSintoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        txtCodigo.setEditable(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 123, 38));

        btnFinalizar.setText("FINALIZAR COMPRA");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 152, 38));

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconAdd.png"))); // NOI18N
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 50, 38));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/fondoRegister.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void borrarElementos(){
        txtBusqueda.setText("");
        txtCantidad.setText("");
        txtCodigo.setText("");
    }
    
    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        // TODO add your handling code here:
        if(btgFiltro.getSelection() == null){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Elija un filtro para realizar la Busqueda");
        }else{
            txtBusqueda.setEditable(true);
            txtCantidad.setEditable(true);
            txtCodigo.setEditable(true);
            txtBusqueda.addKeyListener(new KeyAdapter(){
                @Override
                public void keyTyped(final KeyEvent e) {
                    filtro();
                }
            });
            trsFiltro = new TableRowSorter(model);
            tblProductos.setRowSorter(trsFiltro);
        }
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        // TODO add your handling code here:
        if(!txtBusqueda.getText().isEmpty() && !txtCantidad.getText().isEmpty() && !txtCodigo.getText().isEmpty()){
            PoliMed.añadirProductoComprado(txtCodigo.getText().toUpperCase(), Integer.parseInt(txtCantidad.getText()));
            borrarElementos();
        }else{
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        // TODO add your handling code here:
        char valid = evt.getKeyChar();
        if(Character.isLetter(valid)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        
        if( PoliMed.productosComprados.isEmpty()){
          JOptionPane.showMessageDialog(null,"No existe un registro de Productos");
       }else{
            GUI_Factura factura = new GUI_Factura();
            factura.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        // TODO add your handling code here:
        int seleccionar = tblProductos.rowAtPoint(evt.getPoint());
        txtBusqueda.setText(String.valueOf(tblProductos.getValueAt(seleccionar, 1)));
        txtCodigo.setText(String.valueOf(tblProductos.getValueAt(seleccionar, 0)));
        txtBusqueda.setEditable(false);
        txtCodigo.setEditable(false);
    }//GEN-LAST:event_tblProductosMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgFiltro;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtNombre;
    private javax.swing.JRadioButton rbtSintoma;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

}
