package animalhusbandry;

//import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;


public class login_page extends javax.swing.JFrame {

    
    public login_page() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UnameTb = new javax.swing.JTextField();
        PasswordTb = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        RoleCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 114, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 114, -1));
        getContentPane().add(UnameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 184, -1));
        getContentPane().add(PasswordTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 184, -1));

        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        jButton2.setText("register");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, -1, -1));

        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 250, -1, -1));

        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "FARMER", "BUSINESS SECTOR", " " }));
        RoleCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleCbActionPerformed(evt);
            }
        });
        getContentPane().add(RoleCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 120, 220, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/animalhusbandry/My project (2).jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 970));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ANIMAL HUSBANDRY MANAGEMENT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 260, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*java.sql.*/Connection Con = null;
  PreparedStatement pst = null;
    ResultSet Rs = null;
    java.sql.Statement st = null;
    private void RoleCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleCbActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        if(UnameTb.getText().equals("admin") && PasswordTb.getText().equals("admin")){
            new Update_review().setVisible(true);
        }
        else
        {
   if(RoleCb.getSelectedIndex() == -1)
             {
                 JOptionPane.showMessageDialog(this,"Are you Admin or farmer or business sector?");
                 
             }
             else if(RoleCb.getSelectedIndex() == 1){
                 String s=UnameTb.getText();
                 String Query="Select * from farmer where fid='"+UnameTb.getText()+"'and fpassword='"+PasswordTb.getText()+"'";
                 try{
                     Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","October31#2016");
                     st=Con.createStatement();
                     Rs=st.executeQuery(Query);
                     if(Rs.next()){
                         new f_homepage(s).setVisible(true);
                         
                         //  new farmerMainmenu().setVisible(true);
                         this.dispose();
                     }else{
                         JOptionPane.showMessageDialog(this,"Wrong Username and password");
                     }
                 }catch(Exception e){
                     JOptionPane.showMessageDialog(this,e);   
                 }
                 
                 // TODO add your handling code here:
             }
   else {
                    String s=UnameTb.getText();
                    String Query="Select * from bs where bs_id='"+UnameTb.getText()+"'and bs_password='"+PasswordTb.getText()+"'";
                    try{
                    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ab","root","October31#2016");
                    st=Con.createStatement();
                    Rs=st.executeQuery(Query);
                    
                    if(Rs.next()){
                    new bs_homepage(s).setVisible(true);
                    
                    //  new farmerMainmenu().setVisible(true);
                    this.dispose();
                    }else{
                    JOptionPane.showMessageDialog(this,"Wrong Username and password");
                    }
                    }catch(Exception e){
                    JOptionPane.showMessageDialog(this,e);
                    }
                    
             }
    }
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
if(RoleCb.getSelectedItem()=="FARMER"){
farmer_register ad=new farmer_register ();
//  ad.setDefaultCloseOperation(operation:JFrame.EXIT_ON_CLOSE);
  ad.setVisible(true);
  setVisible(false);
 }
 else if(RoleCb.getSelectedItem()=="BUSINESS SECTOR")
 {
   bs_register cd=new bs_register();
//     cd.setDefaultCloseOperation(operation:JFRAME.EXIT_ON_CLOSE);
     cd.setVisible(true);
 }   
 else
 {
     
   admin and=new admin();
   and.setVisible(true);
   setVisible(false);
//     cd.setDefaultCloseOperation(operation:JFRAME.EXIT_ON_CLOSE);
     
     
 }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordTb;
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JTextField UnameTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
