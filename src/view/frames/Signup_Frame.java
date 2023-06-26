
package view.frames;

import view.custom.scrollbar.ScrollBarCustom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static Controller.LinkManager.LoginFrame;



public class Signup_Frame extends javax.swing.JFrame {
    String fname, uname, pwd,dob, cpwd, cont_no,q1,q2,q3;
    
    int id=0;


    public Signup_Frame() {
        initComponents();
        scroll.setVerticalScrollBar(new ScrollBarCustom());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        txt_pwd = new textfield.TextField();
        lbl_pwd_err = new javax.swing.JLabel();
        txt_cpwd = new textfield.TextField();
        txt_cont_no = new textfield.TextField();
        lbl_cont_err = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        question1 = new textfield.TextField();
        question2 = new textfield.TextField();
        question3 = new textfield.TextField();
        txt_dob = new textfield.TextField();
        background = new javax.swing.JLabel();

        calendar.setForeground(new java.awt.Color(255, 226, 57));
        calendar.setDateFormat("yyyy-MM-dd");
        calendar.setTextRefernce(txt_dob);

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

        scrollpanel.setBackground(new java.awt.Color(62, 62, 62));
        scrollpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_fname.setBackground(new java.awt.Color(66, 66, 66));
        txt_fname.setForeground(new java.awt.Color(183, 183, 183));
        txt_fname.setText("    Full Name");
        txt_fname.setRound(45);
        txt_fname.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_fname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_fnameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_fnameMouseEntered(evt);
            }
        });
        txt_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fnameActionPerformed(evt);
            }
        });
        scrollpanel.add(txt_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 270, -1));

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
        scrollpanel.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, -1));

        lbl_uname_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_uname_err.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        lbl_uname_err.setForeground(new java.awt.Color(254, 112, 113));
        scrollpanel.add(lbl_uname_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 270, 20));

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
        txt_pwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_pwdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pwdKeyReleased(evt);
            }
        });
        scrollpanel.add(txt_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 270, -1));

        lbl_pwd_err.setBackground(new java.awt.Color(66, 66, 66));
        lbl_pwd_err.setForeground(new java.awt.Color(254, 112, 113));
        scrollpanel.add(lbl_pwd_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 270, 20));

        txt_cpwd.setBackground(new java.awt.Color(66, 66, 66));
        txt_cpwd.setForeground(new java.awt.Color(183, 183, 183));
        txt_cpwd.setText("     Confirm Password");
        txt_cpwd.setRound(45);
        txt_cpwd.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_cpwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpwdActionPerformed(evt);
            }
        });
        scrollpanel.add(txt_cpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 270, -1));

        txt_cont_no.setBackground(new java.awt.Color(66, 66, 66));
        txt_cont_no.setForeground(new java.awt.Color(183, 183, 183));
        txt_cont_no.setText("    Contact No");
        txt_cont_no.setRound(45);
        txt_cont_no.setShadowColor(new java.awt.Color(255, 226, 57));
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
        scrollpanel.add(lbl_cont_err, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 270, 20));

        jSeparator2.setBackground(new java.awt.Color(66, 66, 66));
        jSeparator2.setForeground(new java.awt.Color(183, 183, 183));
        scrollpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 320, 10));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 183, 183));
        jLabel1.setText("Security Questions");
        scrollpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 20));

        question1.setBackground(new java.awt.Color(66, 66, 66));
        question1.setForeground(new java.awt.Color(183, 183, 183));
        question1.setText("    What is your favourite food?");
        question1.setRound(45);
        question1.setShadowColor(new java.awt.Color(255, 226, 57));
        question1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question1ActionPerformed(evt);
            }
        });
        scrollpanel.add(question1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 270, -1));

        question2.setBackground(new java.awt.Color(66, 66, 66));
        question2.setForeground(new java.awt.Color(183, 183, 183));
        question2.setText("     What is your hobby?");
        question2.setRound(45);
        question2.setShadowColor(new java.awt.Color(255, 226, 57));
        question2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question2ActionPerformed(evt);
            }
        });
        scrollpanel.add(question2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 270, -1));

        question3.setBackground(new java.awt.Color(66, 66, 66));
        question3.setForeground(new java.awt.Color(183, 183, 183));
        question3.setText("     Where is your favourite place?");
        question3.setRound(45);
        question3.setShadowColor(new java.awt.Color(255, 226, 57));
        question3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                question3ActionPerformed(evt);
            }
        });
        scrollpanel.add(question3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 270, -1));

        txt_dob.setBackground(new java.awt.Color(66, 66, 66));
        txt_dob.setForeground(new java.awt.Color(183, 183, 183));
        txt_dob.setRound(45);
        txt_dob.setShadowColor(new java.awt.Color(255, 226, 57));
        txt_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dobActionPerformed(evt);
            }
        });
        scrollpanel.add(txt_dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 270, -1));

        scroll.setViewportView(scrollpanel);

        login_pane.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 400, 340));

        main_panel.add(login_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 400, 640));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
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
     if(validation()){
            insertDataToDatabase();
            clearFields();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_signupActionPerformed

    private void txt_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fnameActionPerformed

    private void txt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_unameActionPerformed

    private void txt_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdActionPerformed

    private void txt_cpwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cpwdActionPerformed

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

    private void txt_pwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwdKeyPressed
    checkPassword();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdKeyPressed

    private void txt_pwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pwdKeyReleased
    checkPassword();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pwdKeyReleased

    private void txt_cont_noKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cont_noKeyPressed
    checkContactNo();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont_noKeyPressed

    private void txt_cont_noKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cont_noKeyReleased
    checkContactNo();        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cont_noKeyReleased

    private void txt_fnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fnameMouseClicked
       
    }//GEN-LAST:event_txt_fnameMouseClicked

    private void txt_fnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_fnameMouseEntered
//        txt_fname.setText("rrr");

    }//GEN-LAST:event_txt_fnameMouseEntered

    private void txt_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dobActionPerformed

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
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup_Frame().setVisible(true);
            }
        });
    }
    boolean validation()
        {
            
            fname=txt_fname.getText();
            uname=txt_uname.getText();
            pwd=txt_pwd.getText();
            cpwd=txt_cpwd.getText();            
            dob=txt_dob.getText();
            cont_no=txt_cont_no.getText();
            q1=question1.getText();
            q2=question2.getText();
            q3=question3.getText();

            
            
            
            if (fname.equals("") ||(fname.equals("      Full Name")))
            {
                JOptionPane.showMessageDialog(this,"please enter full name");
                return false;
            }
            if (uname.equals("")||(uname.equals("      Username")))
            {
                JOptionPane.showMessageDialog(this,"please enter your username");
                return false;
            }
                if (checkUsernameExists(uname))
            {
                JOptionPane.showMessageDialog(this, "Username already exists");
                return false;
            }   
                if (pwd.equals("")||(pwd.equals("     Enter Password")))
            {
                JOptionPane.showMessageDialog(this,"please enter password");
                return false;
            }
                if (cpwd.equals("")||(cpwd.equals("     Confirm Password")))
            {
                JOptionPane.showMessageDialog(this,"please confirm the password");
                return false;
            }
                if ((dob == null)||(dob==null))
            {
                JOptionPane.showMessageDialog(this,"please enter your date of birth");
                return false;
            }
                if (cont_no.equals("")||(cont_no.equals("    Contact No")))
            {
                JOptionPane.showMessageDialog(this,"please enter your Contact No.");
                return false;
            }
                if (pwd.length()<8)
            {
                    lbl_pwd_err.setText("Password must be 8 Characters long");
            }
                if (!pwd.equals(cpwd))
            {
                    JOptionPane.showMessageDialog(this ,"Passwords don't match");
                    return false;
            }
                 if (pwd.length()<8)
            {
                    JOptionPane.showMessageDialog(this, "Password must be 8 characters long.");
                    return false;
            }
              
                if (cont_no.length()<10||(cont_no.length()>10))
            {
                    JOptionPane.showMessageDialog(this, "Contact no must be of 10 digits long");
                    return false;
            }
                if(checkContactNoExists(cont_no))
            {
                JOptionPane.showMessageDialog(this, "Contact no already exists");
                return false;
            }  
                if(q1.equals("")||(q1.equals("    What is your favourite food?")))
            {
                JOptionPane.showMessageDialog(this, "Please Enter your Favourite Food.");
                return false;
            }
                if(q2.equals("")||(q2.equals("     What is your hobby?")))
            {
                JOptionPane.showMessageDialog(this, "Please Enter your Hobby");
                return false;
            }
                if(q3.equals("")||(q3.equals("     What is your favourite place?")))
            {
                JOptionPane.showMessageDialog(this, "Please Enter your Favourite Place");
                return false;
            }
               
                return true;
                
        }
    
       public void checkPassword()
    {
        pwd=txt_pwd.getText();
        if(pwd .length()<8){
            lbl_pwd_err.setText("Password must be 8 character long");
        }
        else
        {
           lbl_pwd_err.setText("") ;
        }
    }
    public void checkContactNo()
    {
    cont_no=txt_cont_no.getText();
    if(cont_no.length()==10)
    {
        lbl_cont_err.setText("");
    }
        else
        {
            lbl_cont_err.setText("Contact no must be 10 digit long");       
        }
    }
    private boolean checkUsernameExists(String uname) {
    String query = "SELECT COUNT(*) FROM signup WHERE uname = ?";
    try (Connection connection = DBConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, uname);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
     private boolean checkContactNoExists(String cont_no) {
    String query = "SELECT COUNT(*) FROM signup WHERE cont_no = ?";
    try (Connection connection = DBConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setString(1, cont_no);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    public Connection getConnection() {
    Connection connection = null;
    try {  
        String url = "jdbc:sqlite:E:\\RuPay\\RuPay\\src\\Controller\\rupaydb.db";
        connection = DriverManager.getConnection(url);
    } catch (SQLException e) {
        System.out.println("Error connecting to the database: " + e.getMessage());
    }
    return connection;
}
     void clearFields() {
    txt_fname.setText("");
    txt_uname.setText("");
    txt_pwd.setText("");
    txt_cpwd.setText("");
    txt_dob.setText(null);
    txt_cont_no.setText("");
}
    
    // Function to get the last ID from the database and increment it by 1
int getNextIdFromDatabase() {
    int nextId = 0;
    try (Connection connection = getConnection()) {
        String query = "SELECT MAX(id) FROM signup";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            int lastId = resultSet.getInt(1);
            nextId = lastId + 1;
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving next ID: " + e.getMessage());
    }
    return nextId;
}
// Function to insert the data into the database
void insertDataToDatabase() {
    id = getNextIdFromDatabase();

    try (Connection connection = getConnection()) {
        String query = "INSERT INTO signup (id, fname, uname, pwd, dob, cont_no,q1,q2,q3) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        statement.setString(2, fname);
        statement.setString(3, uname);
        statement.setString(4, pwd);
        statement.setString(5, dob);
        statement.setString(6, cont_no);
        statement.setString(7, q1);
        statement.setString(8, q2);
        statement.setString(9, q3);

        int affectedRows = statement.executeUpdate();
        
        if       
             (affectedRows > 0) {
            // Show a success message
            JOptionPane.showMessageDialog(this, "Record inserted successfully");

            // Clear the input fields
            clearFields();
        }
         
    } catch (SQLException e) {
        System.out.println("Error inserting data: " + e.getMessage());
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Create_an_acc;
    private javax.swing.JLabel Welcome_to;
    private javax.swing.JLabel background;
    private button.Button btn_signin;
    private button.Button btn_signup;
    private view.custom.datechooser.DateChooser calendar;
    private javax.swing.JLabel coin_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private textfield.TextField txt_cpwd;
    private textfield.TextField txt_dob;
    private textfield.TextField txt_fname;
    private textfield.TextField txt_pwd;
    private textfield.TextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
