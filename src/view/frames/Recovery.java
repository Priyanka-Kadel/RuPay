
package view.frames;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static Controller.LinkManager.SignupFrame;
import java.sql.Statement;

import view.custom.scrollbar.ScrollBarCustom;

public class Recovery extends javax.swing.JFrame {


    public Recovery() {
        initComponents();        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        q1.setEditable(false);
        q2.setEditable(false);
        q3.setEditable(false);
        nPW.setEditable(false);
        cPW.setEditable(false); 
        btn_question.setEnabled(false);
        btn_reset.setEnabled(false);
        
    }
    public void set(){
        txt_uname.setText("");
        q1.setText("");
        q2.setText("");
        q3.setText("");
        nPW.setText("");
        cPW.setText("");
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
        q1 = new textfield.TextField();
        lbl_err = new javax.swing.JLabel();
        btn_question = new button.Button();
        btn_signup = new button.Button();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reset = new button.Button();
        jSeparator2 = new javax.swing.JSeparator();
        cPW = new textfield.TextField();
        q2 = new textfield.TextField();
        lbl_err1 = new javax.swing.JLabel();
        btn_verify = new button.Button();
        jSeparator3 = new javax.swing.JSeparator();
        q3 = new textfield.TextField();
        nPW = new textfield.TextField();
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

        q1.setBackground(new java.awt.Color(66, 66, 66));
        q1.setForeground(new java.awt.Color(183, 183, 183));
        q1.setText("What is your Favourite Food?");
        q1.setRound(45);
        q1.setShadowColor(new java.awt.Color(255, 226, 57));
        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        inner_pane.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 270, -1));

        lbl_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, 360, 20));

        btn_question.setBackground(new java.awt.Color(255, 226, 57));
        btn_question.setText("Verify");
        btn_question.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_question.setRound(50);
        btn_question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_questionActionPerformed(evt);
            }
        });
        inner_pane.add(btn_question, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 150, 50));

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

        btn_reset.setBackground(new java.awt.Color(255, 226, 57));
        btn_reset.setText("Reset");
        btn_reset.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_reset.setRound(50);
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        inner_pane.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 150, 50));
        inner_pane.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 340, 10));

        cPW.setBackground(new java.awt.Color(66, 66, 66));
        cPW.setForeground(new java.awt.Color(183, 183, 183));
        cPW.setText("    Confirm New Password");
        cPW.setRound(45);
        cPW.setShadowColor(new java.awt.Color(255, 226, 57));
        cPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPWActionPerformed(evt);
            }
        });
        inner_pane.add(cPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 270, -1));

        q2.setBackground(new java.awt.Color(66, 66, 66));
        q2.setForeground(new java.awt.Color(183, 183, 183));
        q2.setText("What is your Hobby?");
        q2.setRound(45);
        q2.setShadowColor(new java.awt.Color(255, 226, 57));
        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        inner_pane.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, -1));

        lbl_err1.setBackground(new java.awt.Color(66, 66, 66));
        lbl_err1.setForeground(new java.awt.Color(254, 112, 113));
        inner_pane.add(lbl_err1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, 20));

        btn_verify.setBackground(new java.awt.Color(255, 226, 57));
        btn_verify.setText("Verify");
        btn_verify.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        btn_verify.setRound(50);
        btn_verify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verifyActionPerformed(evt);
            }
        });
        inner_pane.add(btn_verify, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 50));
        inner_pane.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 10));

        q3.setBackground(new java.awt.Color(66, 66, 66));
        q3.setForeground(new java.awt.Color(183, 183, 183));
        q3.setText("Where is your Favourite Place?");
        q3.setRound(45);
        q3.setShadowColor(new java.awt.Color(255, 226, 57));
        q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q3ActionPerformed(evt);
            }
        });
        inner_pane.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 270, -1));

        nPW.setBackground(new java.awt.Color(66, 66, 66));
        nPW.setForeground(new java.awt.Color(183, 183, 183));
        nPW.setText("    New Password");
        nPW.setRound(45);
        nPW.setShadowColor(new java.awt.Color(255, 226, 57));
        nPW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPWActionPerformed(evt);
            }
        });
        inner_pane.add(nPW, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 270, -1));

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

    private void btn_questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_questionActionPerformed
String username = txt_uname.getText();
String ques1 = q1.getText();
String ques2 = q2.getText();
String ques3 = q3.getText();
btn_reset.setEnabled(true);
try {
    Connection connect = DBConnection.getConnection();
    Statement statement = connect.createStatement();
    ResultSet rs = statement.executeQuery("SELECT q1, q2, q3 FROM signup WHERE uname = '" + username + "'");

    if (rs.next()) {
        // Retrieve the necessary information from the result set
        String securityQuestion1 = rs.getString("q1");
        String securityQuestion2 = rs.getString("q2");
        String securityQuestion3 = rs.getString("q3");
        
        if (ques1.equals(securityQuestion1) && ques2.equals(securityQuestion2) && ques3.equals(securityQuestion3)) {
            JOptionPane.showMessageDialog(this, "Enter new password");
            q1.setEditable(false);
            q2.setEditable(false);
            q3.setEditable(false);
            nPW.setEditable(true);
            cPW.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong answer.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Record doesn't exist.");
    }
    rs.close();
    statement.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}


    }//GEN-LAST:event_btn_questionActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        q1.setEditable(false);
        q2.setEditable(false);
        q3.setEditable(false);
        nPW.setEditable(true);
        cPW.setEditable(true);
        
        String username=txt_uname.getText();
        String passwordChars = nPW.getText();
        String newPass = new String(passwordChars);
        String passwordChar = cPW.getText();
        String confirmPass = new String(passwordChar);
        if(newPass.isEmpty()){
            JOptionPane.showMessageDialog(this, "Empty field is not allowed.");
            return;
        }
        try{
            Connection connect1 = DBConnection.getConnection();
            Statement statement2 = connect1.createStatement();
            if(newPass.equals(confirmPass)){
                statement2.executeUpdate("UPDATE signup SET pwd='" + newPass + "' WHERE uname='" + username + "'");
                JOptionPane.showMessageDialog(this, "Reset Successful");
                setVisible(false);
                new Login().setVisible(true);
                set();
            }
            else{
                JOptionPane.showMessageDialog(this, "Password didn't match.");
            }
            statement2.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void cPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cPWActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void btn_verifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verifyActionPerformed
try {
    String username = txt_uname.getText();
    Connection connect = DBConnection.getConnection();
    Statement statement = connect.createStatement();
    ResultSet rs = statement.executeQuery("SELECT * FROM signup WHERE uname = '" + username + "'");

    if (rs.next()) {
        JOptionPane.showMessageDialog(this, "Now answer the security question.");

        q1.setEditable(true);
        q2.setEditable(true);
        q3.setEditable(true);
        nPW.setEditable(false);
        cPW.setEditable(false);
        btn_question.setEnabled(true);
        
    } else {
        JOptionPane.showMessageDialog(this, "Such username doesn't exist");
    }
    rs.close();
    statement.close();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, e.getMessage());
}

    }//GEN-LAST:event_btn_verifyActionPerformed

    private void q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q3ActionPerformed

    private void nPWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPWActionPerformed

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
    private button.Button btn_question;
    private button.Button btn_reset;
    private button.Button btn_signup;
    private button.Button btn_verify;
    private textfield.TextField cPW;
    private javax.swing.JLabel coin_logo;
    private test.RoundPanel inner_pane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_err;
    private javax.swing.JLabel lbl_err1;
    private javax.swing.JLabel lbl_err2;
    private javax.swing.JPanel main_panel;
    private textfield.TextField nPW;
    private textfield.TextField q1;
    private textfield.TextField q2;
    private textfield.TextField q3;
    private test.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scroll;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}