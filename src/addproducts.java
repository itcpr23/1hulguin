
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class addproducts extends javax.swing.JFrame {

    /**
     * Creates new form addproducts
     */
    public addproducts() {
        initComponents();
        
    }
    connection con = new connection();
    addproduct_frame aprod = new addproduct_frame();
    public void addproduct(){
        
    }
    
   public void ShowProducts(){
         String sql= "select * from product_info";
         DefaultTableModel model = (DefaultTableModel) product.getModel();
         model.setRowCount(0);
         try{
             Class.forName(con.driver);
             Connection conn = DriverManager.getConnection(con.url,con.username,con.password);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql);
             
              while(rs.next()){
            model.addRow(new Object[]{rs.getString("id"),rs.getString("product"), rs.getString("quantity"), rs.getString("price")});
        }
    
    
             
             
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(addproducts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addproducts.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pro = new javax.swing.JTextField();
        quan = new javax.swing.JSpinner();
        pr = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        product = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setText("Product");

        jLabel2.setText("Price");

        jLabel3.setText("Quantity");

        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add.getContentPane());
        add.getContentPane().setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pro)
                            .addComponent(quan, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(pr)))
                    .addGroup(addLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton2)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(pro)))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(pr))
                .addGap(35, 35, 35)
                .addComponent(jButton2)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "id", "Product", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(product);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(26, 26, 26)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 String product=pro.getText();
 int qty=Integer.parseInt(quan.getValue().toString());
 int price  = Integer.parseInt(pr.getValue().toString());
 addproduct_frame Addproducts = new addproduct_frame();
 connection prodclass=new connection();
 Addproducts.addproduct(product, qty, price);
 
 ShowProducts();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
add.setVisible(true); add.setLocationRelativeTo(this);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
int tbl = product.getSelectedRow();
        if (tbl == -1){
            JOptionPane.showMessageDialog(rootPane, "Please Select Product To Be Deleted", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
        }else{
            String t = product.getValueAt(tbl, 0).toString();
            String t1 = product.getValueAt(tbl, 1).toString();
            int a = JOptionPane.showConfirmDialog(rootPane, "Are you sure you want to delete " +t1+"?\nClick 'OK' to continue","CONFIRMATION", JOptionPane.OK_CANCEL_OPTION);
            if( a == JOptionPane.OK_OPTION);
                int x = JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete "+t1 , "CONFIRMATION", JOptionPane.YES_NO_OPTION);
                if( x == JOptionPane.YES_OPTION){
                    int sus = Integer.parseInt(product.getValueAt(tbl, 0).toString());
                    aprod.deleteprod(sus);
                    ShowProducts();
                }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(addproducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addproducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addproducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addproducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addproducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame add;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField pr;
    private javax.swing.JTextField pro;
    private javax.swing.JTable product;
    private javax.swing.JSpinner quan;
    // End of variables declaration//GEN-END:variables
}
