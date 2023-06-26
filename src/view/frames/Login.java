
package view.frames;
import static Controller.LinkManager.SignupFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
    }
     void userVerification(String username,String password)
    {
          try {
            Class.forName("org.sqlite.JDBC");
              Connection con = DBConnection.getConnection(); {
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
        login_pane = new test.RoundPanel();
        Welcome_to = new javax.swing.JLabel();
        coin_logo = new javax.swing.JLabel();
        Login_to_aacc = new javax.swing.JLabel();
        txt_uname = new textfield.TextField();
        txt_pwd = new textfield.TextField();
        lbl_err = new javax.swing.JLabel();
        btn_signin = new button.Button();
        btn_reset = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_signup = new button.Button();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_pane.setBackground(new java.awt.Color(62, 62, 62));
        login_pane.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        login_pane.setRoundBottomLeft(40);
        login_pane.setRoundBottomRight(40);
        login_pane.setRoundTopLeft(40);
        login_pane.setRoundTopRight(40);
        login_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome_to.setBackground(new java.awt.Color(62, 62, 62));
        Welcome_to.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        Welcome_to.setForeground(new java.awt.Color(255, 255, 255));
        Welcome_to.setText("Welcome to");
        login_pane.add(Welcome_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 160, 60));

        coin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login_logo.png"))); // NOI18N
        login_pane.add(coin_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 70));

        Login_to_aacc.setBackground(new java.awt.Color(62, 62, 62));
        Login_to_aacc.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Login_to_aacc.setForeground(new java.awt.Color(255, 255, 255));
        Login_to_aacc.setText("Login to your Account");
        login_pane.add(Login_to_aacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

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
        login_pane.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 270, -1));

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
        login_pane.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 270, -1));

        lbl_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err.setForeground(new java.awt.Color(254, 112, 113));
        login_pane.add(lbl_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, 20));

        btn_signin.setBackground(new java.awt.Color(255, 226, 57));
        btn_signin.setText("Sign In");
        btn_signin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signin.setRound(50);
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        login_pane.add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 150, 50));

        btn_reset.setBackground(new java.awt.Color(62, 62, 62));
        btn_reset.setForeground(new java.awt.Color(252, 252, 252));
        btn_reset.setText("Forgot Password?");
        btn_reset.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        login_pane.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 230, 20));
        login_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 260, 10));
        login_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 200, 10));

        btn_signup.setBackground(new java.awt.Color(62, 62, 62));
        btn_signup.setForeground(new java.awt.Color(252, 252, 252));
        btn_signup.setText("Don't have an account? Sign up");
        btn_signup.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        login_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 230, 20));

        main_panel.add(login_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 400, 470));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        main_panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        setSize(new java.awt.Dimension(1250, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
     Recovery recovery=new Recovery();
     recovery.show();
     this.dispose();
    }//GEN-LAST:event_btn_resetActionPerformed

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

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
    SignupFrame();
    this.dispose();
    }//GEN-LAST:event_btn_signupActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_to_aacc;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_reset;
    private button.Button btn_signin;
    private button.Button btn_signup;
    private javax.swing.JLabel coin_logo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_err;
    private test.RoundPanel login_pane;
    private javax.swing.JPanel main_panel;
    private textfield.TextField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
