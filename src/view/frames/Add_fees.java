package view.frames;

import dependencies.NumberToWordsConverter;
import static Controller.LinkManager.*;
import Controller.AddController;
import static DAO.rqueries.*;
import static DAO.cqueries.*;
import static model.AddModel.*;

import javax.swing.JOptionPane;
import model.AddModel;

import view.custom.scrollbar.ScrollBarCustom;
import static dependencies.NumberToWordsConverter.convert;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import model.DashModel;

public class Add_fees extends javax.swing.JFrame {

    int count = 0;

    public Add_fees() {
        setTitle("Rupay - Fee Payment");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());

        txt_issue.setText(today());
        txt_issue.setEditable(false);

        for (Object values : fillComboBox()) {
            comboCourse.addItem(values);
        }

        txt_receiptNo.setText(Integer.toString(getReceiptNo()));

        lbl_cheque.setVisible(false);
        lbl_bank.setVisible(false);

        txt_chequeNo.setVisible(false);
        txt_bankName.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new view.custom.datechooser.DateChooser();
        main_panel = new javax.swing.JPanel();
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        add_fees = new button.Button();
        search_records = new button.Button();
        edit_course = new button.Button();
        view_report = new button.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button1 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button3 = new button.Button();
        button4 = new button.Button();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        btn_dash = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        workng_panel = new javax.swing.JPanel();
        lbl_rno = new javax.swing.JLabel();
        txt_receiptNo = new textfield.TextField();
        top_date = new javax.swing.JLabel();
        txt_issue = new textfield.TextField();
        txt_GSTNo = new javax.swing.JLabel();
        lbl_pmode = new javax.swing.JLabel();
        comboCourse = new view.custom.Combobox();
        lbl_cheque = new javax.swing.JLabel();
        txt_chequeNo = new textfield.TextField();
        lbl_bank = new javax.swing.JLabel();
        txt_bankName = new textfield.TextField();
        lbl_rfrom = new javax.swing.JLabel();
        txt_receivedFrom = new textfield.TextField();
        payment_lbl = new javax.swing.JLabel();
        txt_from = new textfield.TextField();
        to = new javax.swing.JLabel();
        txt_to = new textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        SN = new javax.swing.JLabel();
        Courses = new javax.swing.JLabel();
        Amount = new javax.swing.JLabel();
        txt_courseName = new textfield.TextField();
        txt_amount = new textfield.TextField();
        txt_vat = new textfield.TextField();
        txt_sc_amt = new textfield.TextField();
        vat = new javax.swing.JLabel();
        sc_amt = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        total = new javax.swing.JLabel();
        txt_total = new textfield.TextField();
        In_Words = new javax.swing.JLabel();
        remarks = new javax.swing.JLabel();
        btn_print = new button.Button();
        sign = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textAreaScroll1 = new view.custom.textarea.TextAreaScroll();
        txt_remark = new view.custom.textarea.TextArea();
        combo_Mode = new view.custom.Combobox();
        jSeparator5 = new javax.swing.JSeparator();
        inwords = new javax.swing.JLabel();
        txt_discount = new textfield.TextField();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        date.setForeground(new java.awt.Color(255, 226, 57));
        date.setDateFormat("yyyy-MM-dd");
        date.setTextRefernce(txt_issue);

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

        add_fees.setBackground(new java.awt.Color(214, 173, 87));
        add_fees.setForeground(new java.awt.Color(65, 65, 65));
        add_fees.setText("Add Fees");
        add_fees.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        add_fees.setRound(60);
        add_fees.setShadowColor(new java.awt.Color(30, 30, 30));
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
        sidebar.add(search_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 570, 330, 70));

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
        sidebar.add(edit_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 330, 70));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        sidebar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 50, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        jLabel4.setToolTipText("");
        sidebar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 50, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        sidebar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 50, 50));

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
        btn_logout.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
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
        button3.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
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
        button4.setFont(new java.awt.Font("Noto Sans", 0, 16)); // NOI18N
        button4.setRound(40);
        button4.setShadowColor(new java.awt.Color(30, 30, 30));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        dropdown.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        dropdown.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Hello,");
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 90, 50));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        btn_dash.setBackground(new java.awt.Color(82, 82, 82));
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

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(254, 254, 254));
        Add_fees.setText("Add Fees");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        workng_panel.setBackground(new java.awt.Color(50, 50, 50));
        workng_panel.setForeground(new java.awt.Color(254, 254, 254));
        workng_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_rno.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_rno.setForeground(new java.awt.Color(254, 254, 254));
        lbl_rno.setText("Receipt no.");
        workng_panel.add(lbl_rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        txt_receiptNo.setEditable(false);
        txt_receiptNo.setBackground(new java.awt.Color(95, 95, 95));
        txt_receiptNo.setForeground(new java.awt.Color(183, 183, 183));
        txt_receiptNo.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_receiptNo.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 34, 190, 50));

        top_date.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        top_date.setForeground(new java.awt.Color(254, 254, 254));
        top_date.setText("Date:");
        workng_panel.add(top_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, -1));

        txt_issue.setBackground(new java.awt.Color(95, 95, 95));
        txt_issue.setForeground(new java.awt.Color(183, 183, 183));
        txt_issue.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_issue.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 34, 180, 50));

        txt_GSTNo.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_GSTNo.setForeground(new java.awt.Color(254, 254, 254));
        txt_GSTNo.setText("GSTIN : 0000000");
        workng_panel.add(txt_GSTNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 200, -1));

        lbl_pmode.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_pmode.setForeground(new java.awt.Color(254, 254, 254));
        lbl_pmode.setText("Mode of Payment");
        workng_panel.add(lbl_pmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        comboCourse.setBackground(new java.awt.Color(65, 65, 65));
        comboCourse.setForeground(new java.awt.Color(254, 254, 254));
        comboCourse.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        comboCourse.setLineColor(new java.awt.Color(255, 226, 57));
        comboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCourseActionPerformed(evt);
            }
        });
        workng_panel.add(comboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 210, 60));

        lbl_cheque.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_cheque.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cheque.setText("Cheque no.");
        workng_panel.add(lbl_cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        txt_chequeNo.setBackground(new java.awt.Color(95, 95, 95));
        txt_chequeNo.setForeground(new java.awt.Color(183, 183, 183));
        txt_chequeNo.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_chequeNo.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_chequeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_chequeNoActionPerformed(evt);
            }
        });
        workng_panel.add(txt_chequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 164, 350, 50));

        lbl_bank.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_bank.setForeground(new java.awt.Color(254, 254, 254));
        lbl_bank.setText("Bank Name");
        workng_panel.add(lbl_bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        txt_bankName.setBackground(new java.awt.Color(95, 95, 95));
        txt_bankName.setForeground(new java.awt.Color(183, 183, 183));
        txt_bankName.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_bankName.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 350, 50));

        lbl_rfrom.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_rfrom.setForeground(new java.awt.Color(254, 254, 254));
        lbl_rfrom.setText("Received From");
        workng_panel.add(lbl_rfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_receivedFrom.setBackground(new java.awt.Color(95, 95, 95));
        txt_receivedFrom.setForeground(new java.awt.Color(183, 183, 183));
        txt_receivedFrom.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_receivedFrom.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 300, 50));

        payment_lbl.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        payment_lbl.setForeground(new java.awt.Color(254, 254, 254));
        payment_lbl.setText("The following payment for college for the year");
        workng_panel.add(payment_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 440, -1));

        txt_from.setBackground(new java.awt.Color(95, 95, 95));
        txt_from.setForeground(new java.awt.Color(183, 183, 183));
        txt_from.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_from.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_from.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fromActionPerformed(evt);
            }
        });
        workng_panel.add(txt_from, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 70, -1));

        to.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        to.setForeground(new java.awt.Color(254, 254, 254));
        to.setText("to");
        workng_panel.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        txt_to.setBackground(new java.awt.Color(95, 95, 95));
        txt_to.setForeground(new java.awt.Color(183, 183, 183));
        txt_to.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_to.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_toActionPerformed(evt);
            }
        });
        workng_panel.add(txt_to, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 70, -1));

        jSeparator1.setForeground(new java.awt.Color(95, 95, 95));
        workng_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 1110, 10));

        jSeparator2.setForeground(new java.awt.Color(95, 95, 95));
        workng_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 1110, 10));

        SN.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        SN.setForeground(new java.awt.Color(254, 254, 254));
        SN.setText("SN");
        workng_panel.add(SN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        Courses.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        Courses.setForeground(new java.awt.Color(254, 254, 254));
        Courses.setText("Courses");
        workng_panel.add(Courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        Amount.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        Amount.setForeground(new java.awt.Color(254, 254, 254));
        Amount.setText("Amount");
        workng_panel.add(Amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 400, -1, -1));

        txt_courseName.setBackground(new java.awt.Color(95, 95, 95));
        txt_courseName.setForeground(new java.awt.Color(183, 183, 183));
        txt_courseName.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_courseName.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_courseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseNameActionPerformed(evt);
            }
        });
        workng_panel.add(txt_courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 480, -1));

        txt_amount.setBackground(new java.awt.Color(95, 95, 95));
        txt_amount.setForeground(new java.awt.Color(183, 183, 183));
        txt_amount.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_amount.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        workng_panel.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 130, 50));

        txt_vat.setBackground(new java.awt.Color(95, 95, 95));
        txt_vat.setForeground(new java.awt.Color(183, 183, 183));
        txt_vat.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_vat.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 130, 50));

        txt_sc_amt.setBackground(new java.awt.Color(95, 95, 95));
        txt_sc_amt.setForeground(new java.awt.Color(183, 183, 183));
        txt_sc_amt.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_sc_amt.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_sc_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 130, 50));

        vat.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        vat.setForeground(new java.awt.Color(254, 254, 254));
        vat.setText("VAT %");
        workng_panel.add(vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        sc_amt.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        sc_amt.setForeground(new java.awt.Color(254, 254, 254));
        sc_amt.setText("Scholarship Amount");
        workng_panel.add(sc_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(95, 95, 95));
        workng_panel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 1110, 10));

        total.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        total.setForeground(new java.awt.Color(254, 254, 254));
        total.setText("Total:");
        workng_panel.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 670, -1, -1));

        txt_total.setBackground(new java.awt.Color(95, 95, 95));
        txt_total.setForeground(new java.awt.Color(183, 183, 183));
        txt_total.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_total.setShadowColor(new java.awt.Color(38, 38, 38));
        workng_panel.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 660, 140, 50));

        In_Words.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        In_Words.setForeground(new java.awt.Color(254, 254, 254));
        In_Words.setText("In Words:");
        workng_panel.add(In_Words, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        remarks.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        remarks.setForeground(new java.awt.Color(254, 254, 254));
        remarks.setText("Remarks:");
        workng_panel.add(remarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 850, -1, -1));

        btn_print.setBackground(new java.awt.Color(255, 226, 57));
        btn_print.setText("Print");
        btn_print.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        btn_print.setRound(40);
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        workng_panel.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 990, 180, 50));

        sign.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        sign.setForeground(new java.awt.Color(254, 254, 254));
        sign.setText("Receiver's Signature");
        workng_panel.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 920, -1, -1));
        workng_panel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 900, 210, 10));

        textAreaScroll1.setBackground(new java.awt.Color(95, 95, 95));
        textAreaScroll1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        textAreaScroll1.setLineColor(new java.awt.Color(255, 226, 57));

        txt_remark.setBackground(new java.awt.Color(95, 95, 95));
        txt_remark.setColumns(20);
        txt_remark.setForeground(new java.awt.Color(183, 183, 183));
        txt_remark.setRows(5);
        txt_remark.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        textAreaScroll1.setViewportView(txt_remark);

        workng_panel.add(textAreaScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 820, 560, 130));

        combo_Mode.setBackground(new java.awt.Color(65, 65, 65));
        combo_Mode.setForeground(new java.awt.Color(254, 254, 254));
        combo_Mode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Bank", "Online Payment" }));
        combo_Mode.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        combo_Mode.setLineColor(new java.awt.Color(255, 226, 57));
        combo_Mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_ModeActionPerformed(evt);
            }
        });
        workng_panel.add(combo_Mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, 60));
        workng_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        inwords.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        inwords.setForeground(new java.awt.Color(254, 254, 254));
        workng_panel.add(inwords, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 740, 670, 40));

        txt_discount.setBackground(new java.awt.Color(95, 95, 95));
        txt_discount.setForeground(new java.awt.Color(183, 183, 183));
        txt_discount.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        txt_discount.setShadowColor(new java.awt.Color(38, 38, 38));
        txt_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_discountActionPerformed(evt);
            }
        });
        txt_discount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_discountKeyReleased(evt);
            }
        });
        workng_panel.add(txt_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 580, 80, 50));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("%");
        workng_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 50, 40));

        scroll.setViewportView(workng_panel);

        inner_panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 730));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 1220, 850));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        bg.setText("background");
        main_panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1480, 1050));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_chequeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_chequeNoActionPerformed

    }//GEN-LAST:event_txt_chequeNoActionPerformed

    private void comboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseActionPerformed
        txt_courseName.setText(comboCourse.getSelectedItem().toString());
        txt_amount.setText(String.valueOf(getCost(txt_courseName.getText())));
    }//GEN-LAST:event_comboCourseActionPerformed

    private void txt_toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_toActionPerformed

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

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        Print_Receipt prview = new Print_Receipt();
        AddController acontroller = new AddController(getinfo(), this, prview);
        try {
            if (acontroller.addinfo() != null) {
                DashModel dmodel = new DashModel();
                dmodel.setusername(lbl_uname.getText());
                prview.welcome(dmodel.getusername());
                prview.setReceipt(prview.getReceipt());
                prview.setVisible(true);
                this.dispose();
            }
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed

    }//GEN-LAST:event_txt_amountActionPerformed

    private void combo_ModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_ModeActionPerformed
        if (combo_Mode.getSelectedIndex() == 1) {
            txt_chequeNo.setVisible(true);
            lbl_cheque.setVisible(true);
            lbl_bank.setVisible(true);
            txt_bankName.setVisible(true);
        }

        if ((combo_Mode.getSelectedIndex() == 0) || (combo_Mode.getSelectedIndex() == 2)) {
            txt_chequeNo.setVisible(false);
            lbl_cheque.setVisible(false);
            lbl_bank.setVisible(false);
            txt_bankName.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_combo_ModeActionPerformed

    private void txt_courseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseNameActionPerformed

    private void txt_fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fromActionPerformed

    private void txt_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_discountActionPerformed

    }//GEN-LAST:event_txt_discountActionPerformed

    private void txt_discountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_discountKeyReleased
        String discount = txt_discount.getText();
        if (discount.isEmpty()) {
            discount = "0";

        }
        switch (discount) {
            case "0" -> {
                String calcs[] = calculate(txt_amount.getText(), 13, "0");
                txt_vat.setText(calcs[0]);
                txt_sc_amt.setText(calcs[1]);
                txt_total.setText(calcs[2]);
                int total = (int) Double.parseDouble(txt_total.getText());
                inwords.setText(NumberToWordsConverter.convert(total) + " only");
                break;
            }
            default -> {
                String calcs[] = calculate(txt_amount.getText(), 13, discount);
                txt_vat.setText(calcs[0]);
                txt_sc_amt.setText(calcs[1]);
                txt_total.setText(calcs[2]);
                int total = (int) Double.parseDouble(txt_total.getText());
                inwords.setText(NumberToWordsConverter.convert(total) + " only");
                break;
            }
        }

    }//GEN-LAST:event_txt_discountKeyReleased

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        About();
    }//GEN-LAST:event_button4ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        count++;
        if (count % 2 == 1) {
            dropdown.setVisible(true);
        } else
            dropdown.setVisible(false);
    }//GEN-LAST:event_button1ActionPerformed

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

    public boolean validation() {
        if (checkEmpty(txt_receivedFrom.getText())) {
            displaymessage("Please enter the payer's name");
            return false;
        }
        if (checkEmpty(txt_issue.getText())) {
            displaymessage("Please select a date");
            return false;
        }
        if (combo_Mode.getSelectedIndex() == 1) {
            if (checkEmpty(txt_chequeNo.getText()) || txt_chequeNo.getText().matches("[0-9]+") == false || txt_chequeNo.getText().length() != 16) {
                displaymessage("Please enter valid cheque number");
                return false;
            }
            if (checkEmpty(txt_bankName.getText())) {
                displaymessage("Please enter name of bank");
                return false;
            }
        }
        if (checkEmpty(txt_from.getText()) || txt_from.getText().matches("[0-9]+") == false || txt_from.getText().length() != 4) {
            displaymessage("Please enter validstarting year for fee");
            return false;
        }
        if (checkEmpty(txt_to.getText()) || txt_to.getText().matches("[0-9]+") == false || txt_to.getText().length() != 4) {
            displaymessage("Please enter valid end year for fee");
            return false;
        }
        if (checkEmpty(txt_discount.getText()) || !txt_discount.getText().matches("^(0|[1-9]\\d?|100)$")) {
            displaymessage("Please enter valid scholarship percentage");
            return false;
        }
        if (checkEmpty(txt_amount.getText()) || checkEmpty(txt_vat.getText()) || checkEmpty(txt_discount.getText())) {
            displaymessage("Please calculate total amount");
            return false;
        }
        if (checkEmpty(txt_remark.getText())) {
            displaymessage("Please enter a remark");
            return false;
        }

        return true;
    }

    public AddModel getinfo() {
        switch (combo_Mode.getSelectedIndex()) {
            case 1: {
                AddModel amodel = new AddModel(txt_receiptNo.getText(), txt_issue.getText(),
                        combo_Mode.getSelectedItem().toString(), txt_receivedFrom.getText(), txt_chequeNo.getText(), txt_bankName.getText(),
                        txt_from.getText(),
                        txt_to.getText(),
                        comboCourse.getSelectedItem().toString(),
                        txt_amount.getText(),
                        txt_vat.getText(),
                        txt_sc_amt.getText(),
                        txt_total.getText(),
                        txt_remark.getText()
                );
                return amodel;
            }
            default: {
                AddModel amodel = new AddModel(txt_receiptNo.getText(), txt_issue.getText(),
                        combo_Mode.getSelectedItem().toString(), txt_receivedFrom.getText(), null, null,
                        txt_from.getText(),
                        txt_to.getText(),
                        comboCourse.getSelectedItem().toString(),
                        txt_amount.getText(),
                        txt_vat.getText(),
                        txt_sc_amt.getText(),
                        txt_total.getText(),
                        txt_remark.getText()
                );
                return amodel;
            }
        }
    }

    public void displaymessage(String msg) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/Assets/error.png"));
        JOptionPane.showMessageDialog(this, msg, "Operation Status", JOptionPane.INFORMATION_MESSAGE, icon);
    }

    public void editReceipt() {
        String values[] = lastrecord();
        txt_receiptNo.setText(values[0]);
        combo_Mode.setSelectedItem(values[1]);

        if ((combo_Mode.getSelectedIndex() == 0) || (combo_Mode.getSelectedIndex() == 2)) {
            txt_chequeNo.setVisible(false);
            txt_bankName.setVisible(false);

            txt_chequeNo.setText(null);
            txt_bankName.setText(null);
        }

        if (combo_Mode.getSelectedIndex() == 1) {
            txt_chequeNo.setVisible(true);
            txt_bankName.setVisible(true);

            txt_chequeNo.setText(values[2]);
            txt_bankName.setText(values[3]);
        }

        txt_receivedFrom.setText(values[4]);
        txt_issue.setText(values[5]);
        txt_from.setText(values[6]);
        txt_to.setText(values[7]);
        comboCourse.setSelectedItem(values[13]);
        txt_courseName.setText(values[13]);
        txt_amount.setText(values[8]);
        txt_vat.setText(values[9]);
        txt_discount.setText(String.valueOf((int) ((float) (int) Double.parseDouble(values[10]) / Integer.parseInt(values[8]) * 100)));
        txt_sc_amt.setText(values[10]);
        txt_total.setText(values[11]);
        inwords.setText(convert((int) Double.parseDouble(values[11])));
        txt_remark.setText(values[12]);
    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private javax.swing.JLabel Amount;
    private javax.swing.JLabel Courses;
    private javax.swing.JLabel In_Words;
    private javax.swing.JLabel SN;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_logout;
    private button.Button btn_print;
    private button.Button button1;
    private button.Button button3;
    private button.Button button4;
    private view.custom.Combobox comboCourse;
    private view.custom.Combobox combo_Mode;
    private view.custom.datechooser.DateChooser date;
    private test.RoundPanel dropdown;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel inwords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_bank;
    private javax.swing.JLabel lbl_cheque;
    private javax.swing.JLabel lbl_pmode;
    private javax.swing.JLabel lbl_rfrom;
    private javax.swing.JLabel lbl_rno;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel payment_lbl;
    private javax.swing.JLabel remarks;
    private javax.swing.JLabel sc_amt;
    private javax.swing.JScrollPane scroll;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private javax.swing.JLabel sign;
    private view.custom.textarea.TextAreaScroll textAreaScroll1;
    private javax.swing.JLabel to;
    private javax.swing.JLabel top_date;
    private javax.swing.JLabel total;
    private javax.swing.JLabel txt_GSTNo;
    private textfield.TextField txt_amount;
    private textfield.TextField txt_bankName;
    private textfield.TextField txt_chequeNo;
    private textfield.TextField txt_courseName;
    private textfield.TextField txt_discount;
    private textfield.TextField txt_from;
    private textfield.TextField txt_issue;
    private textfield.TextField txt_receiptNo;
    private textfield.TextField txt_receivedFrom;
    private view.custom.textarea.TextArea txt_remark;
    private textfield.TextField txt_sc_amt;
    private textfield.TextField txt_to;
    private textfield.TextField txt_total;
    private textfield.TextField txt_vat;
    private javax.swing.JLabel vat;
    private button.Button view_report;
    private javax.swing.JPanel workng_panel;
    // End of variables declaration//GEN-END:variables
}
