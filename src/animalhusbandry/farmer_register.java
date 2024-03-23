
package animalhusbandry;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
//import net.proteanit.sql.DbUtils;
public class farmer_register extends javax.swing.JFrame {

    
    public farmer_register() {
        initComponents();
    }
Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement st = null;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        Faddress = new javax.swing.JTextField();
        Fage = new javax.swing.JTextField();
        FContact = new javax.swing.JTextField();
        Fpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Fgender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FARMER_ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 113, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 113, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 113, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AGE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 113, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CONTACT_NO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 113, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 113, -1));
        getContentPane().add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 163, -1));

        Faddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaddressActionPerformed(evt);
            }
        });
        getContentPane().add(Faddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 163, -1));
        getContentPane().add(Fage, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 163, -1));
        getContentPane().add(FContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 163, -1));
        getContentPane().add(Fpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 163, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, 89, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("GENDER");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 113, -1));

        Fgender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Fgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", " " }));
        getContentPane().add(Fgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 163, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FARMER REGISTRATION");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 356, -1));

        fid.setText(" ");
        getContentPane().add(fid, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 163, -1));

        jLabel10.setBackground(new java.awt.Color(204, 153, 0));
        jLabel10.setText(" ");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-850, 0, 2770, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaddressActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    if (Fage.getText().isEmpty() || Fname.getText().isEmpty()|| Faddress.getText().isEmpty() || Fgender.getSelectedIndex()==-1||Fpass.getText().isEmpty())
    {
        JOptionPane.showMessageDialog(this,"Missing Information");
    }else{
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ab", "root", "October31#2016");
                PreparedStatement Add = Con.prepareStatement("Insert into farmer Value(?,?,?,?,?,?,?)");
                 Add.setString(1, fid.getText());
                 Add.setString(2, Fname.getText());
                Add.setString(3, Faddress.getText());
                Add.setString(4, Fage.getText());
                Add.setString(5, FContact.getText());
                Add.setString(6, Fgender.getSelectedItem().toString());
                  Add.setString(7, Fpass.getText());
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "FARMER is added Successfully");
                Con.close();
              
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex);

            }
        
        }
    
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
        login_page bb=new login_page();
bb.setVisible(true); 
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
            java.util.logging.Logger.getLogger(farmer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(farmer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(farmer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(farmer_register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new farmer_register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FContact;
    private javax.swing.JTextField Faddress;
    private javax.swing.JTextField Fage;
    private javax.swing.JComboBox<String> Fgender;
    private javax.swing.JTextField Fname;
    private javax.swing.JTextField Fpass;
    private javax.swing.JTextField fid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
