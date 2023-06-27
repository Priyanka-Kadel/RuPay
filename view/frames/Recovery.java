
package view.frames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static Controller.LinkManager.SignupFrame;
import view.custom.scrollbar.ScrollBarCustom;

public class Recovery extends javax.swing.JFrame {


    public Recovery() {
        initComponents();        
        scroll.setVerticalScrollBar(new ScrollBarCustom());

        
    }
     void userVerification(String username,String password)
    {
          try {
            Class.forName("org.sqlite.JDBC");
              try (Connection con = DriverManager.getConnection("jdbc:sqlite:rupaydb.db")) {
                  String sql = "SELECT * FROM signup WHERE uname = ? AND pwd = ?";
                  PreparedStatement pst = con.prepareStatement(sql);
                  pst.setString(1, username);
                  pst.setString(2, password);
                  ResultSet rs = pst.executeQuery();
                  if (rs.next()) {
                      JOptionPane.showMessageDialog(this, "Login Successful");
                      Dashboard dashboard= new Dashboard();
                      dashboard.show();
                      this.dispose();
                  } else {
                      JOptionPane.showMessageDialog(this, "Wrong username or password");
                  }
                  // Close the connection after use
              }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        roundPanel1 = new test.RoundPanel();
        Welcome_to = new javax.swing.JLabel();
        coin_logo = new javax.swing.JLabel();
        Recover_your_Account = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        inner_pane = new test.RoundPanel();
        Login_to_aacc = new javax.swing.JLabel();
        txt_uname = new textfield.TextField();
        txt_pwd = new textfield.TextField();
        lbl_err = new javax.swing.JLabel();
        btn_signin = new button.Button();
        btn_signup = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        btn_signin1 = new button.Button();
        jSeparator2 = new javax.swing.JSeparator();
        txt_pwd1 = new textfield.TextField();
        txt_pwd2 = new textfield.TextField();
        lbl_err1 = new javax.swing.JLabel();
        btn_signin2 = new button.Button();
        jSeparator3 = new javax.swing.JSeparator();
        txt_pwd3 = new textfield.TextField();
        txt_pwd4 = new textfield.TextField();
        lbl_err2 = new javax.swing.JLabel();
        Login_to_aacc1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new java.awt.Color(62, 62, 62));
        roundPanel1.setRoundBottomLeft(40);
        roundPanel1.setRoundBottomRight(40);
        roundPanel1.setRoundTopLeft(40);
        roundPanel1.setRoundTopRight(40);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome_to.setBackground(new java.awt.Color(62, 62, 62));
        Welcome_to.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        Welcome_to.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_to.setText("Welcome to");
        roundPanel1.add(Welcome_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, 60));

        coin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login_logo.png"))); // NOI18N
        roundPanel1.add(coin_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 70));

        Recover_your_Account.setBackground(new java.awt.Color(62, 62, 62));
        Recover_your_Account.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Recover_your_Account.setForeground(new java.awt.Color(255, 255, 255));
        Recover_your_Account.setText("Recover your Account");
        roundPanel1.add(Recover_your_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        scroll.setBorder(null);

        inner_pane.setBackground(new java.awt.Color(62, 62, 62));
        inner_pane.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        inner_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login_to_aacc.setBackground(new java.awt.Color(62, 62, 62));
        Login_to_aacc.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Login_to_aacc.setForeground(new java.awt.Color(255, 255, 255));
        Login_to_aacc.setText("Enter your New Passoword");
        inner_pane.add(Login_to_aacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, -1, -1));

        txt_uname.setBackground(new java.awt.Color(66, 66, 66));
        txt_uname.setForeground(new java.awt.Color(183, 183, 183));
        txt_uname.setText("      Username");
        txt_uname.setRound(45);
        txt_uname.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        inner_pane.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 270, -1));

        txt_pwd.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd.setText("     Enter Password");
        txt_pwd.setRound(45);
        txt_pwd.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdActionPerformed(evt);
            }
        });
        inner_pane.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 270, -1));

        lbl_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 360, 20));

        btn_signin.setBackground(new java.awt.Color(255, 226, 57));
        btn_signin.setText("Verify");
        btn_signin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signin.setRound(50);
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        inner_pane.add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, 150, 50));

        btn_signup.setBackground(new java.awt.Color(62, 62, 62));
        btn_signup.setForeground(new java.awt.Color(252, 252, 252));
        btn_signup.setText("Don't have an account? Sign up");
        btn_signup.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        inner_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 230, 20));
        inner_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 10));

        btn_signin1.setBackground(new java.awt.Color(255, 226, 57));
        btn_signin1.setText("Reset");
        btn_signin1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signin1.setRound(50);
        btn_signin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signin1ActionPerformed(evt);
            }
        });
        inner_pane.add(btn_signin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 150, 50));
        inner_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 340, 10));

        txt_pwd1.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd1.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd1.setText("    Confirm New Password");
        txt_pwd1.setRound(45);
        txt_pwd1.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwd1ActionPerformed(evt);
            }
        });
        inner_pane.add(txt_pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 270, -1));

        txt_pwd2.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd2.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd2.setText("     Enter Password");
        txt_pwd2.setRound(45);
        txt_pwd2.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwd2ActionPerformed(evt);
            }
        });
        inner_pane.add(txt_pwd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, -1));

        lbl_err1.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err1.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, 20));

        btn_signin2.setBackground(new java.awt.Color(255, 226, 57));
        btn_signin2.setText("Verify");
        btn_signin2.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signin2.setRound(50);
        btn_signin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signin2ActionPerformed(evt);
            }
        });
        inner_pane.add(btn_signin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 50));
        inner_pane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 10));

        txt_pwd3.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd3.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd3.setText("     Enter Password");
        txt_pwd3.setRound(45);
        txt_pwd3.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwd3ActionPerformed(evt);
            }
        });
        inner_pane.add(txt_pwd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 270, -1));

        txt_pwd4.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd4.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd4.setText("    New Password");
        txt_pwd4.setRound(45);
        txt_pwd4.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwd4ActionPerformed(evt);
            }
        });
        inner_pane.add(txt_pwd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 270, -1));

        lbl_err2.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err2.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 360, 20));

        Login_to_aacc1.setBackground(new java.awt.Color(62, 62, 62));
        Login_to_aacc1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Login_to_aacc1.setForeground(new java.awt.Color(255, 255, 255));
        Login_to_aacc1.setText("Please answer the Security Queestions");
        inner_pane.add(Login_to_aacc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        scroll.setViewportView(inner_pane);

        roundPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 260));

        main_panel.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 405, 430));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        main_panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        setSize(new java.awt.Dimension(1250, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
     SignupFrame(); 
     this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_signupActionPerformed

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
     String username=txt_uname.getText();
      String password=txt_pwd.getText();
      if (username.trim().equals("")||password.trim().equals(""))
      {
          lbl_err.setText("Please Enter Username and Password");
      }
      else
      {
          userVerification(username, password);
      }         // TODO add your handling code here:
    }//GEN-LAST:event_btn_signinActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

    private void btn_signin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signin1ActionPerformed

    private void txt_pwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwd1ActionPerformed

    private void txt_pwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwd2ActionPerformed

    private void btn_signin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signin2ActionPerformed

    private void txt_pwd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwd3ActionPerformed

    private void txt_pwd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwd4ActionPerformed

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
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recovery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recovery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_to_aacc;
    private javax.swing.JLabel Login_to_aacc1;
    private javax.swing.JLabel Recover_your_Account;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_signin;
    private button.Button btn_signin1;
    private button.Button btn_signin2;
    private button.Button btn_signup;
    private javax.swing.JLabel coin_logo;
    private test.RoundPanel inner_pane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_err;
    private javax.swing.JLabel lbl_err1;
    private javax.swing.JLabel lbl_err2;
    private javax.swing.JPanel main_panel;
    private test.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scroll;
    private textfield.TextField txt_pwd;
    private textfield.TextField txt_pwd1;
    private textfield.TextField txt_pwd2;
    private textfield.TextField txt_pwd3;
    private textfield.TextField txt_pwd4;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
