package view.frames;

import model.LoginModel;
import static model.LoginModel.*;
import static Controller.LinkManager.*;
import static DAO.uqueries.checkUsernameExists;
import Controller.LoginController;
import Controller.DashController;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import junit.framework.Assert;
import model.DashModel;

public class Login_Frame extends javax.swing.JFrame {

    public Login_Frame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));
        addPlaceholderStyle(txt_uname);
        addPlaceholderStyle(txt_pwd);
    }

    public void addPlaceholderStyle(JTextField textField) {

    }

    public void removePlaceholderStyle(JTextField textField) {

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
        btn_signin = new button.Button();
        btn_signup = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        btn_signup1 = new button.Button();
        jSeparator2 = new javax.swing.JSeparator();
        lbl_uname_err = new javax.swing.JLabel();
        txt_pwd = new passwordfield.PasswordField();
        button1 = new button.Button();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
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

        txt_uname.setBackground(new java.awt.Color(70, 70, 70));
        txt_uname.setForeground(new java.awt.Color(183, 183, 183));
        txt_uname.setText("    Username");
        txt_uname.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_uname.setRound(30);
        txt_uname.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_unameFocusLost(evt);
            }
        });
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
        login_pane.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 290, -1));

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
        login_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 220, 20));
        login_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 200, 10));

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

        lbl_uname_err.setBackground(new java.awt.Color(62, 62, 62));
        lbl_uname_err.setForeground(new java.awt.Color(254, 112, 113));
        login_pane.add(lbl_uname_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 240, 20));

        txt_pwd.setBackground(new java.awt.Color(70, 70, 70));
        txt_pwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_pwd.setText("    Enter Password");
        txt_pwd.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_pwd.setRound(30);
        txt_pwd.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_pwdFocusLost(evt);
            }
        });
        login_pane.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 290, 50));

        button1.setBackground(new java.awt.Color(255, 226, 57));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button1.setRound(60);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        login_pane.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 50, 50));

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

        if (lcontrol.verifyuser().equals("success")) {
            Dashboard view = new Dashboard();
            DashModel dmodel = new DashModel();
            dmodel.setusername(txt_uname.getText());
            DashController dcontrol = new DashController(dmodel.getusername(), view);
            view.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_signinActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void btn_signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signup1ActionPerformed
        Recovery();
        this.dispose();
    }//GEN-LAST:event_btn_signup1ActionPerformed

    private void txt_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyPressed
        if (!checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username doesn't exist");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyPressed

    private void txt_unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyReleased
        if (!checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username doesn't exist");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txt_unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_unameFocusGained
        if (txt_uname.getText().equals("    Username")) {
            txt_uname.setText(null);
            txt_uname.requestFocus();
            removePlaceholderStyle(txt_uname);
        }
    }//GEN-LAST:event_txt_unameFocusGained

    private void txt_unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_unameFocusLost
        if (txt_uname.getText().length() == 0) {
            addPlaceholderStyle(txt_uname);
            txt_uname.setText("    Username");
        }
        Assert.assertEquals(false,txt_uname.getText().length()==0);
    }//GEN-LAST:event_txt_unameFocusLost

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        txt_pwd.togglepwdview();
    }//GEN-LAST:event_button1ActionPerformed

    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        if (txt_pwd.getText().equals("    Enter Password")) {
            txt_pwd.setText(null);
            txt_pwd.requestFocus();
            removePlaceholderStyle(txt_pwd);
        }
    }//GEN-LAST:event_txt_pwdFocusGained

    private void txt_pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusLost
        if (txt_pwd.getText().length() == 0) {
            addPlaceholderStyle(txt_pwd);
            txt_pwd.setText("    Enter Password");
        }
        Assert.assertEquals(false,txt_pwd.getText().length()==0);
    }//GEN-LAST:event_txt_pwdFocusLost

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public boolean isvalid() {
        String uname = txt_uname.getText();
        String pwd = txt_pwd.getText();

        if (!usernamevalidation(uname)) {
            displaymessage("Please enter your Username");
            return false;
        }
        if (!checkUsernameExists(uname)) {
            displaymessage("Username doesn't Exist");
            return false;
        }
        if (!pwdvalidation(pwd)) {
            displaymessage("Please Enter your Password");
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
        ImageIcon icon = new ImageIcon(getClass().getResource("/Assets/error.png"));
        JOptionPane.showMessageDialog(this, msg, "Operation Status", JOptionPane.INFORMATION_MESSAGE, icon);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login_to_aacc;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_signin;
    private button.Button btn_signup;
    private button.Button btn_signup1;
    private button.Button button1;
    private javax.swing.JLabel coin_logo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_uname_err;
    private test.RoundPanel login_pane;
    private javax.swing.JPanel main_panel;
    private passwordfield.PasswordField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
