/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static library.connect.c;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Amena
 */
public class Issu extends javax.swing.JFrame {
    public Issu(String a) throws SQLException {
        
        
        Connection conn=connect.retrieveConnection();
        initComponents();
        PreparedStatement ps=connect.retrieveConnection().prepareStatement("select * from issue where c_no=?");
        //PreparedStatement ps=connect.retrieveConnection().prepareStatement("SELECT T0.book_no, `book_title`,`book_type`,`author_name`,`date`,`edition`,`price`,`shelf_no`, IFNULL(SUM(T1.quan), 0) as 'issued book', (T0.quantity-IFNULL(SUM(T1.quan), 0)) as 'available_book', T0.quantity as 'Total book' FROM `book` T0 LEFT JOIN issue T1 ON T1.b_no = T0.book_no WHERE T0.`book_no` = ? GROUP BY T1.b_no");
        
       // SELECT T0.book_no, `book_title`,`book_type`,`author_name`,`date`,`edition`,`price`,`shelf_no`, IFNULL(SUM(T1.quan), 0) as 'issued book', (T0.quantity-IFNULL(SUM(T1.quan), 0)) as 'available_book', T0.quantity as 'Total book' FROM `book` T0 LEFT JOIN issue T1 ON T1.b_no = T0.book_no WHERE T0.`book_no` = '123' GROUP BY T1.b_no
        
        ps.setString(1, a);
        ResultSet rs =ps.executeQuery();
        while(rs.next())
        {
        jTextField1.setText(rs.getString(1));
        jTextField2.setText(rs.getString(2));
        jTextField3.setText(rs.getString(3));
        jTextField4.setText(rs.getString(4));
        jTextField5.setText(rs.getString(5));
        jTextField6.setText(rs.getString(6));
        jTextField7.setText(rs.getString(7));
        
        
        }
    }
    
    
    
    
    
    public void thequery(String query){
    
    Connection c = null;
    Statement st = null;
    
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_info_system","root","");
            st = c.createStatement();
            int r=st.executeUpdate(query);
            if(r>0)
            JOptionPane.showMessageDialog(null, "Query Exequted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "e.getMessage");
        }
    
    
    }

    /**
     * Creates new form Issu
     */
    public Issu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(428, 488));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Serial No ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 84, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Card No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 129, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Book No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Book Title");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 228, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 271, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Issued Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 314, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Due Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 361, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 81, 138, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 126, 138, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 177, 138, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 225, 138, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 268, 138, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 311, 138, -1));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 349, 138, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Delete.setForeground(new java.awt.Color(0, 102, 102));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("ISSUE BOOKS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/download (1).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 430, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Issue().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
//public void vInfo()
//    {
//        try
//        {
//            String sql ="select * from issue where c_no=?";
//            PreparedStatement ps = connect.retrieveConnection().prepareStatement(sql);
//            ResultSet rs= ps.executeQuery();
//            //emp.setModel(DbUtils.resultSetToTableModel(s));
//            
//        } 
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        
        try {
            boolean bool5= Model.update(jTextField1.getText(),jTextField2.getText(), jTextField4.getText(), jTextField5.getText(), jTextField6.getText(), jTextField7.getText(), jTextField3.getText());
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        //try {
//            boolean bool5=  Model.update_issue(jTextField1.getText(),jTextField2.getText());
//            
//            
            //if(bool5==true)
            //{
               //JOptionPane.showMessageDialog(null, "Update Successfull");
            //}
            
            //else{
                // JOptionPane.showMessageDialog(null, "Update not Successfull");
            //}
// TODO add your handling code here:
//        } catch (Exception ex) {
//           JOptionPane.showMessageDialog(null, ex);
//        } 
//        vInfo();
//    }          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       
        try {
            thequery("delete from issue where c_no="+jTextField2.getText());
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}