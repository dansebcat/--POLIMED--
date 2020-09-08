package polimed;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class GUI_Productos extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    PoliMed polimed = new PoliMed();
   
   
    public void cargarDatos(){
        polimed.iniciarProductos();
        ArrayList <Object>nombrecolumna= new ArrayList<>();
        nombrecolumna.add("Cod. Producto");
        nombrecolumna.add("Nombre ");
        nombrecolumna.add("Sintoma");
        nombrecolumna.add("Precio $");
        
        for(Object columna:nombrecolumna){
            model.addColumn(columna);
        }
        this.tblProductos.setModel(model);
        
        ArrayList <Object[]> datos= new ArrayList<>();
        Object[] info1 = new Object[] {"P01","MUXOL OTC 30 mg","T0S",4.40};
        Object[] info2 = new Object[] {"P02","BISOLVON","T0S",6.80};
        Object[] info3 = new Object[] {"P03","KALOBA 20 mg","T0S",13.50};
        Object[] info4 = new Object[] {"P04","ISLA MINT","DOLOR DE GARGANTA",6.20};
        Object[] info5 = new Object[] {"P05","ORALSEPT","DOLOR DE GARGANTA",18};
        Object[] info6 = new Object[] {"P06","MEBOLIMON","DOLOR DE GARGANTA",19.20};
        Object[] info7 = new Object[] {"P07","NEOGRIPAL F","GRIPE",4.80};
        Object[] info8 = new Object[] {"P08","FINALIN GRIPE","GRIPE",18.24};
        Object[] info9 = new Object[] {"P09","lEMONFLU","GRIPE",15};
        Object[] info10 = new Object[] {"P10","ASPIRINA","ANALGESICO",10.80};
        Object[] info11 = new Object[] {"P11","PROFINAL FLASH","ANALGESICO",4.80};
        Object[] info12 = new Object[] {"P12","BUPREX FALSH","ANALGESICO",2.50};
        Object[] info13 = new Object[] {"JO1","MUCOSOLVAN 120 ml","TOS",7.39};
        Object[] info14 = new Object[] {"JO2","BEBITOL 60 ml","TOS",3.11};
        Object[] info15 = new Object[] {"JO3","BISOLVON 120 ml","TOS",5.04};
        Object[] info16 = new Object[] {"JO4","ORALSEPT 240 ml","DOLOR DE GARGANTA",2.26};
        Object[] info17 = new Object[] {"JO5","SALIV HUMECTANTE 60 ml","DOLOR DE GARGANTA",4.80};
        Object[] info18 = new Object[] {"JO6","KALOBA","GRIPE",17.45};
        Object[] info19 = new Object[] {"JO7","NASTIFRIN 100 ml","GRIPE",6.08};
        Object[] info20 = new Object[] {"JO8","NEOGRIPAL 60 ml","GRIPE",5.24};
        Object[] info21 = new Object[] {"JO9","FEVERIL 120 ml","ANALGESICO",1.90};
        Object[] info22 = new Object[] {"J10","MK-PARACETAMOL 30 ml","ANALGESICO",1.63};
        Object[] info23 = new Object[] {"J11","UMBRAL 60 ml","ANALGESICO",2.15};
        
        datos.add(info1);
        datos.add(info2);
        datos.add(info3);
        datos.add(info4);
        datos.add(info5);
        datos.add(info6);
        datos.add(info7);
        datos.add(info8);
        datos.add(info9);
        datos.add(info10);
        datos.add(info11);
        datos.add(info12);
        datos.add(info13);
        datos.add(info14);
        datos.add(info15);
        datos.add(info16);
        datos.add(info17);
        datos.add(info18);
        datos.add(info19);
        datos.add(info20);
        datos.add(info21);
        datos.add(info22);
        datos.add(info23);
       /* for(Object[] products:datos){
            model.addRow(products);
           
        }*/
        for (Producto producto : polimed.productosFarmacia) {
            Object obj = producto;
            model.addRow((Object[]) obj);
        }
        
        
        this.tblProductos.setModel(model);
    }
    public GUI_Productos() {
        initComponents();
         
        setLocationRelativeTo(null);
        cargarDatos();
        TextPrompt busqueda = new TextPrompt("Producto a Buscar", txtBusqueda);
        TextPrompt cantidad = new TextPrompt("Cantidad", txtCantidad);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 68, 280, 38));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconSearch.png"))); // NOI18N
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 68, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 68, 112, 38));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/iconShop.png"))); // NOI18N
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 68, 42, -1));

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
        jScrollPane2.setViewportView(tblProductos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 136, 580, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polimed/fondoRegister.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(685, 485));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables

}
