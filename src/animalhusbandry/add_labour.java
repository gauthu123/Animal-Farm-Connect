/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package animalhusbandry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author gauth
 */
public class add_labour extends javax.swing.JFrame {

    /**
     * Creates new form add_labour
     */
    String fffid;
    public add_labour(String f1id) {
        initComponents();
        fffid=f1id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lsalary = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lcontact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lid = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        lage = new javax.swing.JTextField();
        lgender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        oid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lsalary.setText(" ");
        getContentPane().add(lsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 168, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("CONTACT NO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 164, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("LABOUR ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 129, -1));

        lcontact.setText(" ");
        lcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lcontactActionPerformed(evt);
            }
        });
        getContentPane().add(lcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 168, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 151, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, 107, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("AGE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 164, -1));

        jButton2.setBackground(new java.awt.Color(0, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 104, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 164, 22));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText(" SALARY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 164, -1));

        lid.setText(" ");
        getContentPane().add(lid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 168, -1));

        lname.setText(" ");
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, 168, -1));

        lage.setText(" ");
        lage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lageActionPerformed(evt);
            }
        });
        getContentPane().add(lage, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 168, -1));

        lgender.setText(" ");
        lgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lgenderActionPerformed(evt);
            }
        });
        getContentPane().add(lgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 168, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("OWNER ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 164, 33));
        getContentPane().add(oid, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 168, 33));

        jLabel8.setBackground(new java.awt.Color(153, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText(" ");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 2010, 1080));

        jLabel10.setBackground(new java.awt.Color(255, 153, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setText(" ADD LABOURS");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 370, 70));

        jLabel9.setBackground(new java.awt.Color(153, 0, 0));
        jLabel9.setText(" ");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 0, 970, 70));

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setText(" ");
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lcontactActionPerformed

    private void lageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lageActionPerformed

    private void lgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lgenderActionPerformed
Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement st = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (lid.getText().isEmpty() || lname.getText().isEmpty()|| lage.getText().isEmpty() || lgender.getText().isEmpty() || lsalary.getText().isEmpty() ||lcontact.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Missing Information");
    }else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "October31#2016");
                PreparedStatement Add = Con.prepareStatement("Insert into labour Value(?,?,?,?,?,?,?)");
              
                 Add.setString(1, lid.getText());
                Add.setString(2, lname.getText());
                Add.setString(3, lgender.getText());
                Add.setString(4, lage.getText());
                Add.setString(6, lsalary.getText());
                Add.setString(5,lcontact.getText() );
                  Add.setString(7, oid.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Candidate is added Successfully");
                Con.close();
              
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex);

            }
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
f_homepage fn=new f_homepage(fffid);
fn.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(add_labour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_labour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_labour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_labour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_labour(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lage;
    private javax.swing.JTextField lcontact;
    private javax.swing.JTextField lgender;
    private javax.swing.JTextField lid;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField lsalary;
    private javax.swing.JTextField oid;
    // End of variables declaration//GEN-END:variables
}