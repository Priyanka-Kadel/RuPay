package view.frames;

import static Controller.LinkManager.*;
import static DAO.rqueries.*;
import static DAO.cqueries.fillComboBox;
import static dependencies.NumberToWordsConverter.convert;
import java.awt.Toolkit;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import java.text.MessageFormat;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;
import model.DashModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class View_Report extends javax.swing.JFrame {

    int count = 0;
    DefaultTableModel model;

    public View_Report() {
        setTitle("Rupay - View Report");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);
        tbl.fixTable(scroll);
        for (Object values : fillComboBox()) {
            combo_Course.addItem(values);
        }
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        from = new view.custom.datechooser.DateChooser();
        to = new view.custom.datechooser.DateChooser();
        main_panel = new javax.swing.JPanel();
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        btn_dash = new button.Button();
        add_fees = new button.Button();
        search_records = new button.Button();
        edit_course = new button.Button();
        view_report = new button.Button();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        button1 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button3 = new button.Button();
        button4 = new button.Button();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_course = new javax.swing.JLabel();
        lbl_totalInWords = new javax.swing.JLabel();
        lbl_totalAmount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combo_Course = new view.custom.Combobox();
        jLabel7 = new javax.swing.JLabel();
        txt_to = new textfield.TextField();
        txt_from = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        btn_print = new button.Button();
        btn_sub = new button.Button();
        txt_path = new textfield.TextField();
        btn_excel = new button.Button();
        scroll = new javax.swing.JScrollPane();
        tbl = new tabledark.TableDark();
        bg = new javax.swing.JLabel();

        from.setForeground(new java.awt.Color(255, 226, 57));
        from.setDateFormat("yyyy-MM-dd");
        from.setTextRefernce(txt_from);

        to.setForeground(new java.awt.Color(255, 226, 57));
        to.setDateFormat("yyyy-MM-dd");
        to.setTextRefernce(txt_to);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(62, 62, 62));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(60, 60, 60));
        sidebar.setToolTipText("");
        sidebar.setRoundBottomRight(50);
        sidebar.setRoundTopRight(50);
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dash_logo.png"))); // NOI18N
        sidebar.add(side_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 230, 120));

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

        view_report.setBackground(new java.awt.Color(214, 173, 87));
        view_report.setForeground(new java.awt.Color(65, 65, 65));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        sidebar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 50, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        sidebar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        sidebar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, -1, -1));

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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        dropdown.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Hello,");
        sidebar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, 50));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        main_panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1050));

        inner_panel.setBackground(new java.awt.Color(50, 50, 50));
        inner_panel.setRoundBottomLeft(40);
        inner_panel.setRoundBottomRight(40);
        inner_panel.setRoundTopLeft(40);
        inner_panel.setRoundTopRight(40);
        inner_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(255, 255, 255));
        Add_fees.setText("View Report");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Select Course:");
        inner_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount In Words:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course Selected:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, 20));

        lbl_course.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbl_course.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 200, 40));

        lbl_totalInWords.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbl_totalInWords.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_totalInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 40));

        lbl_totalAmount.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        lbl_totalAmount.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 160, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Amount Collected:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 230, 20));

        inner_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 500, 220));

        combo_Course.setBackground(new java.awt.Color(65, 65, 65));
        combo_Course.setForeground(new java.awt.Color(255, 226, 57));
        combo_Course.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        inner_panel.add(combo_Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 250, 60));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("View Report From:");
        inner_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txt_to.setBackground(new java.awt.Color(95, 95, 95));
        txt_to.setForeground(new java.awt.Color(183, 183, 183));
        txt_to.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_to.setShadowColor(new java.awt.Color(58, 58, 58));
        inner_panel.add(txt_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 150, -1));

        txt_from.setBackground(new java.awt.Color(95, 95, 95));
        txt_from.setForeground(new java.awt.Color(183, 183, 183));
        txt_from.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_from.setShadowColor(new java.awt.Color(58, 58, 58));
        inner_panel.add(txt_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, -1));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("to");
        inner_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 20, -1));

        btn_print.setBackground(new java.awt.Color(255, 226, 57));
        btn_print.setText("Print report");
        btn_print.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btn_print.setRound(50);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        inner_panel.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 140, -1));

        btn_sub.setBackground(new java.awt.Color(255, 226, 57));
        btn_sub.setText("Submit");
        btn_sub.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btn_sub.setRound(50);
        btn_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subActionPerformed(evt);
            }
        });
        inner_panel.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 100, -1));

        txt_path.setBackground(new java.awt.Color(95, 95, 95));
        txt_path.setForeground(new java.awt.Color(183, 183, 183));
        txt_path.setText("Save Location");
        txt_path.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_path.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_pathMouseClicked(evt);
            }
        });
        txt_path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pathActionPerformed(evt);
            }
        });
        inner_panel.add(txt_path, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 310, -1));

        btn_excel.setBackground(new java.awt.Color(255, 226, 57));
        btn_excel.setText("Export to Excel");
        btn_excel.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btn_excel.setRound(50);
        btn_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excelActionPerformed(evt);
            }
        });
        inner_panel.add(btn_excel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 160, -1));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receipt No.", "Student Name", "Mode of Payment", "Course", "Amount", "Remark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scroll.setViewportView(tbl);

        inner_panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 1130, 360));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 1220, 850));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        bg.setText("background");
        main_panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 1490, 1050));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Dashboard(dmodel.getusername());
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_dashActionPerformed

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

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header = new MessageFormat("Report From " + txt_from.getText() + " To " + txt_to.getText());
        MessageFormat footer = new MessageFormat("page {0}");
        try {
            tbl.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (Exception e) {
            e.getMessage();
        }

    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excelActionPerformed
        exportToExcel();

    }//GEN-LAST:event_btn_excelActionPerformed

    private void btn_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subActionPerformed
        updateRangeTable(txt_from.getText(), txt_to.getText());
        lbl_course.setText(combo_Course.getSelectedItem().toString());
        int total = generateReport(txt_from.getText(), txt_to.getText(), lbl_course.getText());
        lbl_totalAmount.setText(String.valueOf(total));
        lbl_totalInWords.setText(convert(total));
    }//GEN-LAST:event_btn_subActionPerformed

    private void txt_pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pathActionPerformed

    }//GEN-LAST:event_txt_pathActionPerformed

    private void txt_pathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_pathMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(this);

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dateFormat.format(new Date());

        try {
            File f = fileChooser.getSelectedFile();
            String path = f.getAbsolutePath();

            path = path + "_" + date + ".xlsx";
            txt_path.setText(path);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_txt_pathMouseClicked

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Report().setVisible(true);
            }
        });
    }

    public void updateTable() {
        List<String[]> courseData = fetchRecordData();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        for (String[] rowData : courseData) {
            model.addRow(rowData);
        }
    }

    public void updateRangeTable(String from, String to) {
        List<String[]> courseData = fetchRangeData(from, to, combo_Course.getSelectedItem().toString());
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        for (String[] rowData : courseData) {
            model.addRow(rowData);
        }
    }

    public void exportToExcel() {
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        TreeMap<String, Object[]> map = new TreeMap<>();

        map.put("0", new Object[]{model.getColumnName(0), model.getColumnName(1), model.getColumnName(2),
            model.getColumnName(3), model.getColumnName(4), model.getColumnName(5),});
        for (int i = 0; i < model.getRowCount(); i++) {

            map.put(Integer.toString(i + 1), new Object[]{model.getValueAt(i, 0), model.getValueAt(i, 1), model.getValueAt(i, 2),
                model.getValueAt(i, 3), model.getValueAt(i, 4), model.getValueAt(i, 5),});
        }

        Set<String> id = map.keySet();

        XSSFRow FRow;

        int rowId = 0;

        for (String key : id) {
            FRow = ws.createRow(rowId++);

            Object[] value = map.get(key);

            int cellId = 0;

            for (Object object : value) {

                XSSFCell cell = FRow.createCell(cellId++);
                cell.setCellValue(object.toString());

            }

        }
        try (FileOutputStream fos = new FileOutputStream(new File(txt_path.getText()))) {

            wb.write(fos);
            JOptionPane.showMessageDialog(this, "file exported successfully : " + txt_path.getText());
        } catch (Exception e) {
        }

    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }
    public void printdta(String from, String to) {
        Map<String, Integer> data = getGraphData(from, to);
        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            String course = entry.getKey();
            int totalAmount = entry.getValue();
            System.out.println("Course: " + course + ", Total Amount: " + totalAmount);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_excel;
    private button.Button btn_logout;
    private button.Button btn_print;
    private button.Button btn_sub;
    private button.Button button1;
    private button.Button button3;
    private button.Button button4;
    private view.custom.Combobox combo_Course;
    private test.RoundPanel dropdown;
    private button.Button edit_course;
    private view.custom.datechooser.DateChooser from;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_totalAmount;
    private javax.swing.JLabel lbl_totalInWords;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private javax.swing.JScrollPane scroll;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private tabledark.TableDark tbl;
    private view.custom.datechooser.DateChooser to;
    private textfield.TextField txt_from;
    private textfield.TextField txt_path;
    private textfield.TextField txt_to;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}
