package view.frames;

import static Controller.LinkManager.LoginFrame;
import Controller.RegisterController;

import model.RegisterModel;
import static model.RegisterModel.*;

import static DAO.uqueries.checkContactNoExists;
import static DAO.uqueries.checkUsernameExists;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

import view.custom.scrollbar.ScrollBarCustom;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import junit.framework.Assert;

public class Signup_Frame extends javax.swing.JFrame {

    public Signup_Frame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        txt_pwd.togglepwdview();
        txt_cpwd.togglepwdview();
        addPlaceholderStyle(txt_fname);
        addPlaceholderStyle(txt_uname);
        addPlaceholderStyle(txt_pwd);
        addPlaceholderStyle(txt_cpwd);
        addPlaceholderStyle(txt_cont_no);
        addPlaceholderStyle(question1);
        addPlaceholderStyle(question2);
        addPlaceholderStyle(question3);

    }

    public void addPlaceholderStyle(JTextField textField) {

    }

    public void removePlaceholderStyle(JTextField textField) {

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendar = new view.custom.datechooser.DateChooser();
        main_panel = new javax.swing.JPanel();
        login_pane = new test.RoundPanel();
        Welcome_to = new javax.swing.JLabel();
        coin_logo = new javax.swing.JLabel();
        Create_an_acc = new javax.swing.JLabel();
        btn_signup = new button.Button();
        btn_signin = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        scroll = new javax.swing.JScrollPane();
        scrollpanel = new javax.swing.JPanel();
        txt_fname = new textfield.TextField();
        txt_uname = new textfield.TextField();
        lbl_uname_err = new javax.swing.JLabel();
        lbl_pwd_err = new javax.swing.JLabel();
        txt_dob1 = new button.Button();
        txt_cont_no = new textfield.TextField();
        lbl_cont_err = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        question1 = new textfield.TextField();
        question2 = new textfield.TextField();
        question3 = new textfield.TextField();
        txt_dob = new textfield.TextField();
        lbl_age = new javax.swing.JLabel();
        txt_cpwd = new passwordfield.PasswordField();
        txt_pwd = new passwordfield.PasswordField();
        button1 = new button.Button();
        button2 = new button.Button();
        background = new javax.swing.JLabel();

        calendar.setForeground(new java.awt.Color(255, 226, 57));
        calendar.setDateFormat("yyyy-MM-dd");
        calendar.setTextRefernce(txt_dob);

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

        login_pane.setBackground(new java.awt.Color(50, 50, 50));
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
        login_pane.add(Welcome_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 160, 60));

        coin_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/login_logo.png"))); // NOI18N
        login_pane.add(coin_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 140, 70));

        Create_an_acc.setBackground(new java.awt.Color(62, 62, 62));
        Create_an_acc.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        Create_an_acc.setForeground(new java.awt.Color(255, 255, 255));
        Create_an_acc.setText("Create an Account");
        login_pane.add(Create_an_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        btn_signup.setBackground(new java.awt.Color(255, 226, 57));
        btn_signup.setText("Sign Up");
        btn_signup.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_signup.setRound(50);
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        login_pane.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 150, 50));

        btn_signin.setBackground(new java.awt.Color(62, 62, 62));
        btn_signin.setForeground(new java.awt.Color(252, 252, 252));
        btn_signin.setText("Already have an account? Sign in");
        btn_signin.setShadowColor(new java.awt.Color(62, 62, 62));
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });
        login_pane.add(btn_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 230, 20));
        login_pane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 210, 10));

        scroll.setBorder(null);

        scrollpanel.setBackground(new java.awt.Color(50, 50, 50));
        scrollpanel.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        scrollpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fname.setBackground(new java.awt.Color(70, 70, 70));
        txt_fname.setForeground(new java.awt.Color(183, 183, 183));
        txt_fname.setText("    Full Name");
        txt_fname.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_fname.setRound(30);
        txt_fname.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_fnameFocusLost(evt);
            }
        });
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        scrollpanel.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, -1));

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
        scrollpanel.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, -1));

        lbl_uname_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_uname_err.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbl_uname_err.setForeground(new java.awt.Color(254, 112, 113));
        lbl_uname_err.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_uname_errKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_uname_errKeyReleased(evt);
            }
        });
        scrollpanel.add(lbl_uname_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 270, 20));

        lbl_pwd_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_pwd_err.setForeground(new java.awt.Color(254, 112, 113));
        lbl_pwd_err.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_pwd_errKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_pwd_errKeyReleased(evt);
            }
        });
        scrollpanel.add(lbl_pwd_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 270, 20));

        txt_dob1.setBackground(new java.awt.Color(66, 66, 66));
        txt_dob1.setForeground(new java.awt.Color(183, 183, 183));
        txt_dob1.setText("...");
        txt_dob1.setRound(30);
        txt_dob1.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_dob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dob1ActionPerformed(evt);
            }
        });
        scrollpanel.add(txt_dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 50, -1));

        txt_cont_no.setBackground(new java.awt.Color(70, 70, 70));
        txt_cont_no.setForeground(new java.awt.Color(183, 183, 183));
        txt_cont_no.setText("    Contact No.");
        txt_cont_no.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_cont_no.setRound(30);
        txt_cont_no.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_cont_no.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cont_noFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cont_noFocusLost(evt);
            }
        });
        txt_cont_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cont_noActionPerformed(evt);
            }
        });
        txt_cont_no.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cont_noKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cont_noKeyReleased(evt);
            }
        });
        scrollpanel.add(txt_cont_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 270, -1));

        lbl_cont_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_cont_err.setForeground(new java.awt.Color(254, 112, 113));
        lbl_cont_err.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbl_cont_errKeyPressed(evt);
            }
        });
        scrollpanel.add(lbl_cont_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 270, 20));

        jSeparator2.setBackground(new java.awt.Color(66, 66, 66));
        jSeparator2.setForeground(new java.awt.Color(183, 183, 183));
        scrollpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 10));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 183, 183));
        jLabel1.setText("Security Questions");
        scrollpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 20));

        question1.setBackground(new java.awt.Color(70, 70, 70));
        question1.setForeground(new java.awt.Color(183, 183, 183));
        question1.setText("    What is your favourite food?");
        question1.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        question1.setRound(30);
        question1.setShadowColor(new java.awt.Color(175, 152, 20));
        question1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                question1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                question1FocusLost(evt);
            }
        });
        question1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question1ActionPerformed(evt);
            }
        });
        scrollpanel.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 270, -1));

        question2.setBackground(new java.awt.Color(70, 70, 70));
        question2.setForeground(new java.awt.Color(183, 183, 183));
        question2.setText("    What is your hobby?");
        question2.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        question2.setRound(30);
        question2.setShadowColor(new java.awt.Color(175, 152, 20));
        question2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                question2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                question2FocusLost(evt);
            }
        });
        question2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question2ActionPerformed(evt);
            }
        });
        scrollpanel.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 270, -1));

        question3.setBackground(new java.awt.Color(70, 70, 70));
        question3.setForeground(new java.awt.Color(183, 183, 183));
        question3.setText("    What is your favourite place?");
        question3.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        question3.setRound(30);
        question3.setShadowColor(new java.awt.Color(175, 152, 20));
        question3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                question3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                question3FocusLost(evt);
            }
        });
        question3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question3ActionPerformed(evt);
            }
        });
        scrollpanel.add(question3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 270, -1));

        txt_dob.setBackground(new java.awt.Color(70, 70, 70));
        txt_dob.setForeground(new java.awt.Color(183, 183, 183));
        txt_dob.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_dob.setRound(30);
        txt_dob.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_dob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_dobMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_dobMouseExited(evt);
            }
        });
        txt_dob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dobKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_dobKeyReleased(evt);
            }
        });
        scrollpanel.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 220, -1));

        lbl_age.setBackground(new java.awt.Color(66, 66, 66));
        lbl_age.setForeground(new java.awt.Color(254, 112, 113));
        scrollpanel.add(lbl_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 270, 20));

        txt_cpwd.setBackground(new java.awt.Color(70, 70, 70));
        txt_cpwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_cpwd.setText("    Confirm Password");
        txt_cpwd.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        txt_cpwd.setRound(30);
        txt_cpwd.setShadowColor(new java.awt.Color(175, 152, 20));
        txt_cpwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cpwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cpwdFocusLost(evt);
            }
        });
        scrollpanel.add(txt_cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 270, -1));

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
        scrollpanel.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 270, -1));

        button1.setBackground(new java.awt.Color(255, 226, 57));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button1.setRound(60);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        scrollpanel.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 50, 50));

        button2.setBackground(new java.awt.Color(255, 226, 57));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/eye.png"))); // NOI18N
        button2.setRound(60);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        scrollpanel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 50, 50));

        scroll.setViewportView(scrollpanel);

        login_pane.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, 340));

        main_panel.add(login_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 400, 640));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        background.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                backgroundFocusGained(evt);
            }
        });
        main_panel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 740));

        setSize(new java.awt.Dimension(1250, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        LoginFrame();
        this.dispose();
    }//GEN-LAST:event_btn_signinActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        RegisterController rcontrol = new RegisterController(getuser(), this);
        rcontrol.registeruser();
    }//GEN-LAST:event_btn_signupActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void txt_cont_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cont_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont_noActionPerformed

    private void question3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question3ActionPerformed

    private void question1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question1ActionPerformed

    private void question2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_question2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_question2ActionPerformed

    private void txt_cont_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cont_noKeyPressed
        if (txt_cont_no.getText().length() == 10) {
            lbl_cont_err.setText("");
        }
        if (!checkContactNoExists(txt_cont_no.getText())) {
            lbl_cont_err.setText("");
        }
    }//GEN-LAST:event_txt_cont_noKeyPressed

    private void txt_cont_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cont_noKeyReleased
        if (txt_cont_no.getText().length() != 10) {
            lbl_cont_err.setText("Contact must be 10 digits long");

        }
        if (checkContactNoExists(txt_cont_no.getText())) {
            lbl_cont_err.setText("Contact already in use");
        }
    }//GEN-LAST:event_txt_cont_noKeyReleased

    private void txt_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fnameMouseClicked

    }//GEN-LAST:event_txt_fnameMouseClicked

    private void txt_fnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fnameMouseEntered

    }//GEN-LAST:event_txt_fnameMouseEntered

    private void lbl_uname_errKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_uname_errKeyPressed

    }//GEN-LAST:event_lbl_uname_errKeyPressed

    private void lbl_uname_errKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_uname_errKeyReleased

    }//GEN-LAST:event_lbl_uname_errKeyReleased

    private void lbl_cont_errKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_cont_errKeyPressed

    }//GEN-LAST:event_lbl_cont_errKeyPressed

    private void lbl_pwd_errKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_pwd_errKeyPressed

    }//GEN-LAST:event_lbl_pwd_errKeyPressed

    private void lbl_pwd_errKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_pwd_errKeyReleased

    }//GEN-LAST:event_lbl_pwd_errKeyReleased

    private void txt_unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyReleased
        if (checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username Already Exists");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyReleased

    private void txt_unameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_unameKeyPressed
        if (checkUsernameExists(txt_uname.getText())) {
            lbl_uname_err.setText("Username Already Exists");
        } else {
            lbl_uname_err.setText("");
        }
    }//GEN-LAST:event_txt_unameKeyPressed

    private void txt_dob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dob1ActionPerformed
        calendar.showPopup();
    }//GEN-LAST:event_txt_dob1ActionPerformed

    private void txt_dobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dobKeyReleased

    }//GEN-LAST:event_txt_dobKeyReleased

    private void txt_dobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dobKeyPressed

    }//GEN-LAST:event_txt_dobKeyPressed

    private void txt_dobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dobMouseClicked

    }//GEN-LAST:event_txt_dobMouseClicked

    private void txt_dobMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_dobMouseExited
        if (!isOlderThan18(txt_dob.getText())) {
            lbl_age.setText("You must be 18 years or above.");
        } else
            lbl_age.setText("");
    }//GEN-LAST:event_txt_dobMouseExited

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
        Assert.assertEquals(false,txt_cpwd.getText().length()==0);
    }//GEN-LAST:event_txt_unameFocusLost

    private void txt_fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fnameFocusGained
        if (txt_fname.getText().equals("    Full Name")) {
            txt_fname.setText(null);
            txt_fname.requestFocus();
            removePlaceholderStyle(txt_fname);
        }
        
    }//GEN-LAST:event_txt_fnameFocusGained

    private void txt_fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_fnameFocusLost
        if (txt_fname.getText().length() == 0) {
            addPlaceholderStyle(txt_fname);
            txt_fname.setText("    Full Name");
        }
        Assert.assertEquals(false,txt_fname.getText().length()==0);
    }//GEN-LAST:event_txt_fnameFocusLost

    private void txt_cont_noFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cont_noFocusGained
        if (txt_cont_no.getText().equals("    Contact No.")) {
            txt_cont_no.setText(null);
            txt_cont_no.requestFocus();
            removePlaceholderStyle(txt_cont_no);
        }
    }//GEN-LAST:event_txt_cont_noFocusGained

    private void txt_cont_noFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cont_noFocusLost
        if (txt_cont_no.getText().length() == 0) {
            addPlaceholderStyle(txt_cont_no);
            txt_cont_no.setText("    Contact No.");
        }
        Assert.assertEquals(false,txt_cont_no.getText().length()==0);
    }//GEN-LAST:event_txt_cont_noFocusLost

    private void question1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question1FocusGained
        if (question1.getText().equals("    What is your favourite food?")) {
            question1.setText(null);
            question1.requestFocus();
            removePlaceholderStyle(question1);
        }
    }//GEN-LAST:event_question1FocusGained

    private void question1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question1FocusLost
        if (question1.getText().length() == 0) {
            addPlaceholderStyle(question1);
            question1.setText("    What is your favourite food?");
        }
        Assert.assertEquals(false,question1.getText().length()==0);
    }//GEN-LAST:event_question1FocusLost

    private void question2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question2FocusGained
        if (question2.getText().equals("    What is your hobby?")) {
            question2.setText(null);
            question2.requestFocus();
            removePlaceholderStyle(question2);
        }
        
    }//GEN-LAST:event_question2FocusGained

    private void question2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question2FocusLost
        if (question2.getText().length() == 0) {
            addPlaceholderStyle(question2);
            question2.setText("    What is your hobby?");
        }
       Assert.assertEquals(false,question2.getText().length()==0);
    }//GEN-LAST:event_question2FocusLost

    private void question3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question3FocusGained
        if (question3.getText().equals("    What is your favourite place?")) {
            question3.setText(null);
            question3.requestFocus();
            removePlaceholderStyle(question3);
        }
    }//GEN-LAST:event_question3FocusGained

    private void question3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_question3FocusLost
        if (question3.getText().length() == 0) {
            addPlaceholderStyle(question3);
            question3.setText("    What is your favourite place?");
        }
       Assert.assertEquals(false,question3.getText().length()==0);
    }//GEN-LAST:event_question3FocusLost

    private void backgroundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_backgroundFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundFocusGained

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        txt_pwd.togglepwdview();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        txt_cpwd.togglepwdview();
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

    private void txt_cpwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cpwdFocusGained
        if (txt_cpwd.getText().equals("    Confirm Password")) {
            txt_cpwd.setText(null);
            txt_cpwd.requestFocus();
            removePlaceholderStyle(txt_cpwd);
        }
    }//GEN-LAST:event_txt_cpwdFocusGained

    private void txt_cpwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cpwdFocusLost
        if (txt_cpwd.getText().length() == 0) {
            addPlaceholderStyle(txt_cpwd);
            txt_cpwd.setText("    Confirm Password");
        }
        Assert.assertEquals(true,txt_cpwd.getText().length()==0);
    }//GEN-LAST:event_txt_cpwdFocusLost

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
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        String fname = txt_fname.getText();
        String uname = txt_uname.getText();
        String pawd = txt_pwd.getText();
        String cpawd = txt_cpwd.getText();
        String cont = txt_cont_no.getText();
        String qu1 = question1.getText();
        String qu2 = question2.getText();
        String qu3 = question3.getText();

        if (!fullnamevalidation(fname)) {
            displaymessage("Please enter your Full name");
            return false;
        }
        if (!usernamevalidation(uname)) {
            displaymessage("Please enter your User name");
            return false;
        }
        if (checkUsernameExists(uname)) {
            displaymessage("Username Already Exists.Try a unique one");
            return false;
        }
        if (!pwdvalidation(pawd)) {
            displaymessage("Please Enter your Password");
            return false;
        }
        if (pawd.length() < 8) {
            displaymessage("Password must be 8 characters long");
            return false;
        }
        if (!cpwdvalidation(cpawd)) {
            displaymessage("Please Confirm your Password");
            return false;
        }
        if (!samepwd(pawd, cpawd)) {
            displaymessage("Passwords don't match.Try Again.");
            return false;
        }

        if (!isOlderThan18(txt_dob.getText())) {
            displaymessage("You must be 18 years or above.");
            return false;
        }

        if (!contactvalidation(cont)) {
            displaymessage("Enter your Contact Number");
            return false;
        }
        if (cont.length() != 10) {
            displaymessage("Contact must be 10 digits long");
            return false;
        }
        if (checkContactNoExists(txt_cont_no.getText())) {
            displaymessage("Contact already in use");
            return false;
        }
        if (!q1validation(qu1)) {
            displaymessage("Please answer your favourite food");
            return false;
        }
        if (!q2validation(qu2)) {
            displaymessage("Please answer your hobby");
            return false;
        }
        if (!q3validation(qu3)) {
            displaymessage("Please answer your favourite place");
            return false;
        }
        return true;
    }

    public RegisterModel getuser() {
        RegisterModel rmodel = new RegisterModel(
                txt_fname.getText(),
                txt_uname.getText(),
                txt_pwd.getText(),
                txt_cpwd.getText(),
                txt_dob.getText(),
                txt_cont_no.getText(),
                question1.getText(),
                question2.getText(),
                question3.getText());
        return rmodel;
    }

    public void displaymessage(String msg) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Assets/error.png"));
        JOptionPane.showMessageDialog(this, msg, "Operation Status", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public void clearfields() {
        txt_fname.setText("    Full Name");
        txt_uname.setText("    User Name");
        txt_pwd.setText("    Enter Password");
        txt_cpwd.setText("    Confirm Password");
        txt_cont_no.setText("   Contact No.");
        question1.setText("    What is your favourite food?");
        question2.setText("    What is your hobby?");
        question3.setText("    What is your favourite place?");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Create_an_acc;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_signin;
    private button.Button btn_signup;
    private button.Button button1;
    private button.Button button2;
    private view.custom.datechooser.DateChooser calendar;
    private javax.swing.JLabel coin_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_cont_err;
    private javax.swing.JLabel lbl_pwd_err;
    private javax.swing.JLabel lbl_uname_err;
    private test.RoundPanel login_pane;
    private javax.swing.JPanel main_panel;
    private textfield.TextField question1;
    private textfield.TextField question2;
    private textfield.TextField question3;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel scrollpanel;
    private textfield.TextField txt_cont_no;
    private passwordfield.PasswordField txt_cpwd;
    private textfield.TextField txt_dob;
    private button.Button txt_dob1;
    private textfield.TextField txt_fname;
    private passwordfield.PasswordField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables

}
