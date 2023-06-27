package view.frames;

import static Controller.LinkManager.SignupFrame;
import Controller.LoginController;
import static DataAccess.dbaccess.checkUsernameExists;
import model.LoginModel;
import static model.LoginModel.*;

import javax.swing.JOptionPane;

public class Login_Frame extends javax.swing.JFrame {

    public Login_Frame() {
        initComponents();
    }

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
        btn_signup = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        btn_signup1 = new button.Button();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_uname_err = new javax.swing.JLabel();
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
        txt_uname.setText("    Username");
        txt_uname.setRound(45);
        txt_uname.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_unameActionPerformed(evt);
            }
        });
        txt_uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_unameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_unameKeyReleased(evt);
            }
        });
        login_pane.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 270, -1));

        txt_pwd.setBackground(new java.awt.Color(66, 66, 66));
        txt_pwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd.setText("    Enter Password");
        txt_pwd.setRound(45);
        txt_pwd.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pwdActionPerformed(evt);
            }
        });
        login_pane.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 270, -1));

        lbl_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err.setForeground(new java.awt.Color(254, 112, 113));
        login_pane.add(lbl_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 20));

        btn_signin.setBackground(new java.awt.Color(255, 226, 57));
        btn_signin.setText("Sign In");
        btn_signin.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signin.setRound(50);
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        login_pane.add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 150, 50));

        btn_signup.setBackground(new java.awt.Color(62, 62, 62));
        btn_signup.setForeground(new java.awt.Color(252, 252, 252));
        btn_signup.setText("Don't have an account? Sign up");
        btn_signup.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        login_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 220, 20));
        login_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 200, 10));

        btn_signup1.setBackground(new java.awt.Color(62, 62, 62));
        btn_signup1.setForeground(new java.awt.Color(252, 252, 252));
        btn_signup1.setText("Forgot Password?");
        btn_signup1.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signup1ActionPerformed(evt);
            }
        });
        login_pane.add(btn_signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 230, 20));
        login_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 110, 10));

        lbl_uname_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_uname_err.setForeground(new java.awt.Color(254, 112, 113));
        login_pane.add(lbl_uname_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 20));

        main_panel.add(login_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 380, 490));

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
        LoginController lcontrol = new LoginController(getuser(), this);
        lcontrol.verifyuser();
    }//GEN-LAST:event_btn_signinActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

    private void btn_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signup1ActionPerformed

    private void txt_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyPressed
        if (!checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username Doesn't exist");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyPressed

    private void txt_unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyReleased
        if (!checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username Doesn't exist");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyReleased

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
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    public boolean isvalid() {
        String uname = txt_uname.getText();
        String pwd = txt_pwd.getText();

        if (!usernamevalidation(uname)) {
            JOptionPane.showMessageDialog(this, "Please enter your Username");
            return false;
        }
        if (!checkUsernameExists(uname)) {
            JOptionPane.showMessageDialog(this, "Username doesn't Exist.");
            return false;
        }
        if (!pwdvalidation(pwd)) {
            JOptionPane.showMessageDialog(this, "Please Enter your Password");
            return false;
        }
        return true;
    }

    public LoginModel getuser() {
        LoginModel lmodel = new LoginModel(
                txt_uname.getText(),
                txt_pwd.getText());
        return lmodel;
    }
    public void displaymessage(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_to_aacc;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_signin;
    private button.Button btn_signup;
    private button.Button btn_signup1;
    private javax.swing.JLabel coin_logo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_err;
    private javax.swing.JLabel lbl_uname_err;
    private test.RoundPanel login_pane;
    private javax.swing.JPanel main_panel;
    private textfield.TextField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
