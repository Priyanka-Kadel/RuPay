package view.frames;

import static Controller.LinkManager.LoginFrame;
import Controller.AccController;
import model.AccModel;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Account_Settings extends javax.swing.JFrame {

    public Account_Settings() {
        initComponents();
        ecpwd.togglepwdview();
        setTitle("RuPay - Account Settings");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_uname = new textfield.TextField();
        button1 = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        button2 = new button.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        encpwd = new passwordfield.PasswordField();
        ecpwd = new passwordfield.PasswordField();
        enpwd = new passwordfield.PasswordField();
        button3 = new button.Button();
        button4 = new button.Button();
        button5 = new button.Button();
        lbl_pwd_err = new javax.swing.JLabel();
        txt_user = new textfield.TextField();
        jLabel8 = new javax.swing.JLabel();
        txt_pwd = new textfield.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Delete Account");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        txt_uname.setEditable(false);
        txt_uname.setBackground(new java.awt.Color(115, 115, 115));
        txt_uname.setForeground(new java.awt.Color(221, 218, 218));
        txt_uname.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_uname.setRound(30);
        txt_uname.setShadowColor(new java.awt.Color(45, 45, 45));
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 310, -1));

        button1.setBackground(new java.awt.Color(254, 112, 113));
        button1.setText("Delete Account");
        button1.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        button1.setRound(50);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 690, 190, 60));

        jSeparator1.setBackground(new java.awt.Color(254, 254, 254));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254), 5));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 690, 10));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 33)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Account Settings");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        button2.setBackground(new java.awt.Color(255, 226, 57));
        button2.setText("Update Password");
        button2.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        button2.setRound(50);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 210, 60));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Enter New Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Enter Current Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 30));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Re-Enter New Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 30));

        encpwd.setBackground(new java.awt.Color(115, 115, 115));
        encpwd.setForeground(new java.awt.Color(221, 218, 218));
        encpwd.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        encpwd.setRound(30);
        encpwd.setShadowColor(new java.awt.Color(45, 45, 45));
        encpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                encpwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                encpwdKeyReleased(evt);
            }
        });
        jPanel1.add(encpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 340, -1));

        ecpwd.setBackground(new java.awt.Color(115, 115, 115));
        ecpwd.setForeground(new java.awt.Color(221, 218, 218));
        ecpwd.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        ecpwd.setRound(30);
        ecpwd.setShadowColor(new java.awt.Color(45, 45, 45));
        jPanel1.add(ecpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 340, -1));

        enpwd.setBackground(new java.awt.Color(115, 115, 115));
        enpwd.setForeground(new java.awt.Color(221, 218, 218));
        enpwd.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        enpwd.setRound(30);
        enpwd.setShadowColor(new java.awt.Color(45, 45, 45));
        enpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                enpwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                enpwdKeyReleased(evt);
            }
        });
        jPanel1.add(enpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 340, -1));

        button3.setBackground(new java.awt.Color(255, 226, 57));
        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button3.setRound(60);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, 50));

        button4.setBackground(new java.awt.Color(255, 226, 57));
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button4.setRound(60);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, 50));

        button5.setBackground(new java.awt.Color(255, 226, 57));
        button5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button5.setRound(60);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        jPanel1.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, 50));

        lbl_pwd_err.setFont(new java.awt.Font("Noto Sans", 1, 15)); // NOI18N
        lbl_pwd_err.setForeground(new java.awt.Color(254, 112, 113));
        jPanel1.add(lbl_pwd_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 320, 20));

        txt_user.setEditable(false);
        txt_user.setBackground(new java.awt.Color(115, 115, 115));
        txt_user.setForeground(new java.awt.Color(221, 218, 218));
        txt_user.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_user.setRound(30);
        txt_user.setShadowColor(new java.awt.Color(45, 45, 45));
        jPanel1.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 340, -1));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Your Username:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 40));

        txt_pwd.setBackground(new java.awt.Color(115, 115, 115));
        txt_pwd.setForeground(new java.awt.Color(221, 218, 218));
        txt_pwd.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_pwd.setRound(30);
        txt_pwd.setShadowColor(new java.awt.Color(45, 45, 45));
        jPanel1.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 700, 310, -1));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText(" For confirmation, Enter your password below to delete your account");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 640, 30));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Password:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 710, 100, -1));

        jLabel10.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Username:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 754, 770));

        setSize(new java.awt.Dimension(754, 798));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        ecpwd.togglepwdview();
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        enpwd.togglepwdview();
    }//GEN-LAST:event_button5ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        encpwd.togglepwdview();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        AccController acontroller = new AccController(getUpdateInfo(), this);
        acontroller.update();
    }//GEN-LAST:event_button2ActionPerformed

    private void enpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enpwdKeyPressed
        if (enpwd.getText().length() < 8) {
            lbl_pwd_err.setText("Password must be 8 characters long.");
        } else {
            lbl_pwd_err.setText("");
        }
    }//GEN-LAST:event_enpwdKeyPressed

    private void enpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enpwdKeyReleased
        if (enpwd.getText().length() < 8) {
            lbl_pwd_err.setText("Password must be 8 characters long.");
        } else {
            lbl_pwd_err.setText("");
        }
    }//GEN-LAST:event_enpwdKeyReleased

    private void encpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encpwdKeyPressed
        if (encpwd.getText().length() < 8) {
            lbl_pwd_err.setText("Password Must be 8 characters long.");
        } else {
            lbl_pwd_err.setText("");
        }
    }//GEN-LAST:event_encpwdKeyPressed

    private void encpwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_encpwdKeyReleased
        if (encpwd.getText().length() < 8) {
            lbl_pwd_err.setText("Password Must be 8 characters long.");
        } else {
            lbl_pwd_err.setText("");
        }
    }//GEN-LAST:event_encpwdKeyReleased

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        AccController acontroller = new AccController(getDeleteInfo(), this);
        if (acontroller.delete() == 0) {
            disposeAllFrames();
            LoginFrame();
        }
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Account_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account_Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account_Settings().setVisible(true);
            }
        });
    }

    public void displaymessage(String var) {
        JOptionPane.showMessageDialog(this, var);
    }

    public AccModel getUpdateInfo() {

        AccModel amodel = new AccModel(txt_user.getText(), ecpwd.getText(), enpwd.getText(), encpwd.getText());
        return amodel;
    }

    public AccModel getDeleteInfo() {

        AccModel amodel = new AccModel(txt_uname.getText(), txt_pwd.getText());
        return amodel;
    }
    
      public static void disposeAllFrames() {
        Window[] windows = Window.getWindows();
        for (Window window : windows) {
            if (window instanceof JFrame) {
                window.dispose();
            }
        }
    }
      
      public void welcome(String var){
          txt_user.setText(var);
          txt_uname.setText(var);
      }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.Button button1;
    private button.Button button2;
    private button.Button button3;
    private button.Button button4;
    private button.Button button5;
    private passwordfield.PasswordField ecpwd;
    private passwordfield.PasswordField encpwd;
    private passwordfield.PasswordField enpwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_pwd_err;
    private textfield.TextField txt_pwd;
    private textfield.TextField txt_uname;
    private textfield.TextField txt_user;
    // End of variables declaration//GEN-END:variables
}
