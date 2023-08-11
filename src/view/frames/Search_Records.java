package view.frames;

import static Controller.LinkManager.*;
import static DAO.rqueries.fetchRecordData;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.DashModel;

public class Search_Records extends javax.swing.JFrame {

    int count = 0;
    DefaultTableModel model;

    public Search_Records() {
        setTitle("Rupay - Search Records");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);
        tbl_recordData.fixTable(scroll);
        tbl_recordData.setColumnWidth(0, 100);
        tbl_recordData.setColumnWidth(1, 250);
        tbl_recordData.setColumnWidth(2, 170);
        tbl_recordData.setColumnWidth(3, 170);

        updateTable();
    }

    public void search(String str) {

        model = (DefaultTableModel) tbl_recordData.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tbl_recordData.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        button1 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button3 = new button.Button();
        button4 = new button.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_dash = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        Add_fees1 = new javax.swing.JLabel();
        txt_search = new textfield.TextField();
        scroll = new javax.swing.JScrollPane();
        tbl_recordData = new view.custom.Table();
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

        search_records.setBackground(new java.awt.Color(214, 173, 87));
        search_records.setForeground(new java.awt.Color(65, 65, 65));
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

        edit_course.setBackground(new java.awt.Color(70, 70, 70));
        edit_course.setForeground(new java.awt.Color(214, 173, 87));
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
        sidebar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        sidebar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        dropdown.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Hello,");
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 50));

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

        Add_fees.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(242, 242, 242));
        Add_fees.setText("Enter Student's Name:");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 290, 40));

        Add_fees1.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        Add_fees1.setForeground(new java.awt.Color(255, 255, 255));
        Add_fees1.setText("SEARCH RECORDS");
        inner_panel.add(Add_fees1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        txt_search.setBackground(new java.awt.Color(90, 90, 90));
        txt_search.setForeground(new java.awt.Color(183, 183, 183));
        txt_search.setShadowColor(new java.awt.Color(58, 58, 58));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        inner_panel.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 440, -1));

        tbl_recordData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receipt No.", "Student Name", "Course", "Mode of Payment", "Amount", "Remark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_recordData.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        scroll.setViewportView(tbl_recordData);

        inner_panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 1040, 550));

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

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        search(txt_search.getText());
    }//GEN-LAST:event_txt_searchKeyPressed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        search(txt_search.getText());

    }//GEN-LAST:event_txt_searchKeyReleased

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        count++;
        if (count % 2 == 1) {
            dropdown.setVisible(true);
        } else {
            dropdown.setVisible(false);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void btn_dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Dashboard(dmodel.getusername());
        this.dispose();
    }//GEN-LAST:event_btn_dashActionPerformed

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    public void updateTable() {
        List<String[]> courseData = fetchRecordData();
        DefaultTableModel model = (DefaultTableModel) tbl_recordData.getModel();
        model.setRowCount(0);
        for (String[] rowData : courseData) {
            model.addRow(rowData);
        }
    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private javax.swing.JLabel Add_fees1;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_logout;
    private button.Button button1;
    private button.Button button3;
    private button.Button button4;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private javax.swing.JScrollPane scroll;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private view.custom.Table tbl_recordData;
    private textfield.TextField txt_search;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}
