package view.frames;

import static Controller.LinkManager.*;
import java.awt.Toolkit;
import model.DashModel;

public class Dashboard extends javax.swing.JFrame {

    int count = 0;

    public Dashboard() {
        setTitle("Rupay - Weclome To RuPay");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        add_fees = new button.Button();
        search_records = new button.Button();
        view_report = new button.Button();
        jLabel1 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        courses = new javax.swing.JLabel();
        report = new javax.swing.JLabel();
        view_report1 = new button.Button();
        button1 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button3 = new button.Button();
        button4 = new button.Button();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(62, 62, 62));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(60, 60, 60));
        sidebar.setRoundBottomRight(50);
        sidebar.setRoundTopRight(50);
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dash_logo.png"))); // NOI18N
        sidebar.add(side_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 120));

        add_fees.setBackground(new java.awt.Color(70, 70, 70));
        add_fees.setForeground(new java.awt.Color(214, 173, 87));
        add_fees.setText("Add Fees");
        add_fees.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        add_fees.setRound(60);
        add_fees.setShadowColor(new java.awt.Color(30, 30, 30));
        add_fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_feesActionPerformed(evt);
            }
        });
        sidebar.add(add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 330, 70));

        search_records.setBackground(new java.awt.Color(70, 70, 70));
        search_records.setForeground(new java.awt.Color(214, 173, 87));
        search_records.setText("Search Records");
        search_records.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        search_records.setRound(60);
        search_records.setShadowColor(new java.awt.Color(30, 30, 30));
        search_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_recordsActionPerformed(evt);
            }
        });
        sidebar.add(search_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 330, 70));

        view_report.setBackground(new java.awt.Color(70, 70, 70));
        view_report.setForeground(new java.awt.Color(214, 173, 87));
        view_report.setText("View Report");
        view_report.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_report.setRound(60);
        view_report.setShadowColor(new java.awt.Color(30, 30, 30));
        view_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_reportActionPerformed(evt);
            }
        });
        sidebar.add(view_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, 330, 70));

        jLabel1.setBackground(new java.awt.Color(82, 82, 82));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Hello,");
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 50));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        sidebar.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 50, 50));

        courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        sidebar.add(courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 50, 50));

        report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        sidebar.add(report, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 50, 50));

        view_report1.setBackground(new java.awt.Color(70, 70, 70));
        view_report1.setForeground(new java.awt.Color(214, 173, 87));
        view_report1.setText("Courses");
        view_report1.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_report1.setRound(60);
        view_report1.setShadowColor(new java.awt.Color(30, 30, 30));
        view_report1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_report1ActionPerformed(evt);
            }
        });
        sidebar.add(view_report1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 330, 70));

        button1.setBackground(new java.awt.Color(65, 65, 65));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hamburger.png"))); // NOI18N
        button1.setRound(100);
        button1.setShadowColor(new java.awt.Color(30, 30, 30));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        sidebar.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 930, 100, 100));

        dropdown.setBackground(new java.awt.Color(106, 106, 106));
        dropdown.setRoundBottomLeft(40);
        dropdown.setRoundBottomRight(40);
        dropdown.setRoundTopLeft(40);
        dropdown.setRoundTopRight(40);
        dropdown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setBackground(new java.awt.Color(70, 70, 70));
        btn_logout.setForeground(new java.awt.Color(252, 252, 252));
        btn_logout.setText("Log Out");
        btn_logout.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        btn_logout.setRound(40);
        btn_logout.setShadowColor(new java.awt.Color(30, 30, 30));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        dropdown.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 170, 50));

        button3.setBackground(new java.awt.Color(70, 70, 70));
        button3.setForeground(new java.awt.Color(252, 252, 252));
        button3.setText("Account Settings");
        button3.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button3.setRound(40);
        button3.setShadowColor(new java.awt.Color(30, 30, 30));
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        dropdown.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 50));

        button4.setBackground(new java.awt.Color(70, 70, 70));
        button4.setForeground(new java.awt.Color(252, 252, 252));
        button4.setText("About Us");
        button4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button4.setRound(40);
        button4.setShadowColor(new java.awt.Color(30, 30, 30));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        dropdown.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        dropdown.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        main_panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1050));

        inner_panel.setBackground(new java.awt.Color(50, 50, 50));
        inner_panel.setRoundBottomLeft(40);
        inner_panel.setRoundBottomRight(40);
        inner_panel.setRoundTopLeft(40);
        inner_panel.setRoundTopRight(40);
        inner_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(254, 254, 254));
        Add_fees.setText("Welcome to RuPay");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 460, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dash_coin.png"))); // NOI18N
        inner_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 470, 410));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 1220, 850));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        bg.setText("background");
        main_panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1480, 1050));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_recordsActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        SearchRecord(dmodel.getusername());
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_search_recordsActionPerformed

    private void view_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_reportActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        ViewReport(dmodel.getusername());
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_view_reportActionPerformed

    private void add_feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_feesActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Addfees(dmodel.getusername());
        this.dispose();
    }//GEN-LAST:event_add_feesActionPerformed

    private void view_report1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_report1ActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Edit(dmodel.getusername());
        this.dispose();         // TODO add your handling code here:

    }//GEN-LAST:event_view_report1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        count++;
        if (count % 2 == 1) {
            dropdown.setVisible(true);
        } else {
            dropdown.setVisible(false);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        if (Logout() == 0)
            this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        About();
    }//GEN-LAST:event_button4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Acc(dmodel.getusername());
    }//GEN-LAST:event_button3ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private javax.swing.JLabel add;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_logout;
    private button.Button button1;
    private button.Button button3;
    private button.Button button4;
    private javax.swing.JLabel courses;
    private test.RoundPanel dropdown;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel report;
    private javax.swing.JLabel search;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private button.Button view_report;
    private button.Button view_report1;
    // End of variables declaration//GEN-END:variables
}
