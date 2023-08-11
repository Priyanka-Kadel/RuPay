package view.frames;

import static Controller.LinkManager.*;
import static DAO.cqueries.*;
import model.CourseModel;
import Controller.CourseController;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.TableModel;
import model.DashModel;

public class Courses extends javax.swing.JFrame {

    int count = 0;

    public Courses() {
        setTitle("Rupay - Courses");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);
        tbl_courseData.fixTable(scroll);
        tbl_courseData.setColumnWidth(0, 125);
        tbl_courseData.setColumnWidth(2, 150);
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cID = new textfield.TextField();
        main_panel = new javax.swing.JPanel();
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        add_fees = new button.Button();
        search_records = new button.Button();
        edit_course = new button.Button();
        view_report = new button.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button4 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button6 = new button.Button();
        button7 = new button.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        btn_dash = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        roundPanel1 = new test.RoundPanel();
        cfee = new javax.swing.JLabel();
        txt_cfee = new textfield.TextField();
        txt_cname = new textfield.TextField();
        cname1 = new javax.swing.JLabel();
        button2 = new button.Button();
        button3 = new button.Button();
        scroll = new javax.swing.JScrollPane();
        tbl_courseData = new view.custom.Table();
        button1 = new button.Button();
        bg = new javax.swing.JLabel();

        cID.setBackground(new java.awt.Color(123, 123, 123));
        cID.setForeground(new java.awt.Color(221, 218, 218));
        cID.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        cID.setRound(20);

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

        edit_course.setBackground(new java.awt.Color(214, 173, 87));
        edit_course.setForeground(new java.awt.Color(65, 65, 65));
        edit_course.setText("Courses");
        edit_course.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        edit_course.setRound(60);
        edit_course.setShadowColor(new java.awt.Color(30, 30, 30));
        edit_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_courseActionPerformed(evt);
            }
        });
        sidebar.add(edit_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 330, 70));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        sidebar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 50, 50));

        button4.setBackground(new java.awt.Color(65, 65, 65));
        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/hamburger.png"))); // NOI18N
        button4.setRound(100);
        button4.setShadowColor(new java.awt.Color(30, 30, 30));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        sidebar.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 930, 100, 100));

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

        button6.setBackground(new java.awt.Color(70, 70, 70));
        button6.setForeground(new java.awt.Color(252, 252, 252));
        button6.setText("Account Settings");
        button6.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button6.setRound(40);
        button6.setShadowColor(new java.awt.Color(30, 30, 30));
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        dropdown.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 50));

        button7.setBackground(new java.awt.Color(70, 70, 70));
        button7.setForeground(new java.awt.Color(252, 252, 252));
        button7.setText("About Us");
        button7.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button7.setRound(40);
        button7.setShadowColor(new java.awt.Color(30, 30, 30));
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        dropdown.add(button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        dropdown.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Hello,");
        sidebar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 50));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        btn_dash.setBackground(new java.awt.Color(60, 60, 60));
        btn_dash.setForeground(new java.awt.Color(252, 252, 252));
        btn_dash.setText("Dashboard");
        btn_dash.setFont(new java.awt.Font("Noto Sans", 1, 44)); // NOI18N
        btn_dash.setShadowColor(new java.awt.Color(82, 82, 82));
        btn_dash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashActionPerformed(evt);
            }
        });
        sidebar.add(btn_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        main_panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1050));

        inner_panel.setBackground(new java.awt.Color(50, 50, 50));
        inner_panel.setRoundBottomLeft(40);
        inner_panel.setRoundBottomRight(40);
        inner_panel.setRoundTopLeft(40);
        inner_panel.setRoundTopRight(40);
        inner_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(242, 242, 242));
        Add_fees.setText("Edit Course");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 320, 80));

        roundPanel1.setBackground(new java.awt.Color(82, 82, 82));
        roundPanel1.setRoundBottomLeft(40);
        roundPanel1.setRoundBottomRight(40);
        roundPanel1.setRoundTopLeft(40);
        roundPanel1.setRoundTopRight(40);
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cfee.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        cfee.setForeground(new java.awt.Color(242, 242, 242));
        cfee.setText("Course Fee:");
        roundPanel1.add(cfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 130, 30));

        txt_cfee.setBackground(new java.awt.Color(115, 115, 115));
        txt_cfee.setForeground(new java.awt.Color(221, 218, 218));
        txt_cfee.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_cfee.setRound(20);
        txt_cfee.setShadowColor(new java.awt.Color(60, 60, 60));
        roundPanel1.add(txt_cfee, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 310, 50));

        txt_cname.setBackground(new java.awt.Color(115, 115, 115));
        txt_cname.setForeground(new java.awt.Color(221, 218, 218));
        txt_cname.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_cname.setRound(20);
        txt_cname.setShadowColor(new java.awt.Color(60, 60, 60));
        roundPanel1.add(txt_cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 310, 50));

        cname1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        cname1.setForeground(new java.awt.Color(242, 242, 242));
        cname1.setText("Course Name:");
        roundPanel1.add(cname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        inner_panel.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 540, 330));

        button2.setBackground(new java.awt.Color(255, 226, 57));
        button2.setForeground(new java.awt.Color(58, 58, 58));
        button2.setText("Add to Course");
        button2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        button2.setRound(50);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        inner_panel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 160, 60));

        button3.setBackground(new java.awt.Color(255, 226, 57));
        button3.setForeground(new java.awt.Color(58, 58, 58));
        button3.setText("Update Course");
        button3.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        button3.setRound(50);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        inner_panel.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 160, 60));

        tbl_courseData.setBackground(new java.awt.Color(82, 82, 82));
        tbl_courseData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Course Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_courseData.setColumnSelectionAllowed(true);
        tbl_courseData.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        tbl_courseData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_courseDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbl_courseDataMouseEntered(evt);
            }
        });
        scroll.setViewportView(tbl_courseData);
        tbl_courseData.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        inner_panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 190, 500, 410));

        button1.setBackground(new java.awt.Color(255, 226, 57));
        button1.setText("Remove Course");
        button1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        button1.setRound(50);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        inner_panel.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 200, 60));

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

    private void edit_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_courseActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Edit(dmodel.getusername());
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_edit_courseActionPerformed

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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        CourseController ccontroller = new CourseController(getinfo(), this);
        ccontroller.removeCourse();

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        CourseController ccontroller = new CourseController(getinfo(), this);
        ccontroller.addCourse();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        CourseController ccontroller = new CourseController(getinfo(), this);
        ccontroller.updateCourse();

    }//GEN-LAST:event_button3ActionPerformed

    private void tbl_courseDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_courseDataMouseClicked
        int rowNo = tbl_courseData.getSelectedRow();
        TableModel model = tbl_courseData.getModel();

        cID.setText((String) model.getValueAt(rowNo, 0));
        txt_cname.setText((String) model.getValueAt(rowNo, 1));
        txt_cfee.setText(model.getValueAt(rowNo, 2).toString());
    }//GEN-LAST:event_tbl_courseDataMouseClicked

    private void tbl_courseDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_courseDataMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_courseDataMouseEntered

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        count++;
        if (count % 2 == 1) {
            dropdown.setVisible(true);
        } else {
            dropdown.setVisible(false);
        }
    }//GEN-LAST:event_button4ActionPerformed

    private void btn_dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Dashboard(dmodel.getusername());
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dashActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        if (Logout() == 0)
            this.dispose();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        About();
    }//GEN-LAST:event_button7ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Acc(dmodel.getusername());
    }//GEN-LAST:event_button6ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public void updateTable() {
        List<String[]> courseData = fetchCourseData();
        DefaultTableModel model = (DefaultTableModel) tbl_courseData.getModel();
        model.setRowCount(0);
        for (String[] rowData : courseData) {
            model.addRow(rowData);
        }
    }

    public CourseModel getinfo() {
        CourseModel cmodel = new CourseModel(cID.getText(), txt_cname.getText(), txt_cfee.getText());
        return cmodel;
    }

    public void displaymessage(String msg) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Assets/error.png"));
        JOptionPane.showMessageDialog(this, msg, "Operation Status", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }

    public void clearfields() {
        txt_cname.setText("");
        txt_cfee.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_logout;
    private button.Button button1;
    private button.Button button2;
    private button.Button button3;
    private button.Button button4;
    private button.Button button6;
    private button.Button button7;
    private textfield.TextField cID;
    private javax.swing.JLabel cfee;
    private javax.swing.JLabel cname1;
    private test.RoundPanel dropdown;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private test.RoundPanel roundPanel1;
    private javax.swing.JScrollPane scroll;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private view.custom.Table tbl_courseData;
    private textfield.TextField txt_cfee;
    private textfield.TextField txt_cname;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}
