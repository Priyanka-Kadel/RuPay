package view.frames;

import static Controller.LinkManager.*;
import static DAO.rqueries.lastrecord;
import static dependencies.NumberToWordsConverter.convert;
import java.awt.Toolkit;
import model.DashModel;
import model.PrintModel;
import static model.PrintModel.printpdf;

public class Print_Receipt extends javax.swing.JFrame {

    int count = 0;

    public Print_Receipt() {
        setTitle("Rupay - Print Receipt");
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Assets/icon.png")));

        dropdown.setVisible(false);
    }

    public void setReceipt(PrintModel pmodel) {
        txt_receiptNo.setText(pmodel.getReceipt_no());
        txt_Payment.setText(pmodel.getMode());

        if (txt_Payment.getText().equals("Bank")) {
            txt_cheque_dd.setText(pmodel.getCh_no());
            txt_bankName.setText(pmodel.getBank());
        } else {
            txt_cheque_dd.setText("-");
            txt_bankName.setText("-");
        }

        txt_receivedFrom.setText(pmodel.getName());
        txt_date.setText(pmodel.getDate());
        txt_gstin.setText("00000000");
        txt_year1.setText(pmodel.getFrom());
        txt_year2.setText(pmodel.getTo());
        txt_courseName.setText(pmodel.getCourse());
        txt_initialAmount.setText(pmodel.getFee());
        txt_cgst.setText(pmodel.getVat());
        txt_sgst.setText(pmodel.getDiscount());
        txt_total.setText(pmodel.getTotal());
        txt_totalInWords.setText(convert((int) Double.parseDouble(pmodel.getTotal())));
        txt_remark.setText(pmodel.getRemarks());
    }

    public static PrintModel getReceipt() {
        String val[] = lastrecord();
        PrintModel pmodel = new PrintModel(val[0], val[1], val[2], val[3], val[4], val[5], val[6], val[7], val[8], val[9], val[10], val[11], val[12], val[13]);
        return pmodel;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        search_records = new button.Button();
        edit_course = new button.Button();
        view_courses = new button.Button();
        view_report = new button.Button();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        button1 = new button.Button();
        dropdown = new test.RoundPanel();
        btn_logout = new button.Button();
        button4 = new button.Button();
        button5 = new button.Button();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_dash = new button.Button();
        inner_panel = new test.RoundPanel();
        main_print = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_receiptNo = new javax.swing.JLabel();
        txt_Payment = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_cheque_dd = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_bankName = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_cheque_Dd = new javax.swing.JLabel();
        txt_year2 = new javax.swing.JLabel();
        txt_receivedFrom = new javax.swing.JLabel();
        txt_year1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbl_bankName = new javax.swing.JLabel();
        txt_gstin = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_total = new javax.swing.JLabel();
        txt_totalInWords = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txt_courseName = new javax.swing.JLabel();
        txt_initialAmount = new javax.swing.JLabel();
        txt_cgst = new javax.swing.JLabel();
        txt_sgst = new javax.swing.JLabel();
        txt_courseName5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txt_sgsty1 = new javax.swing.JLabel();
        txt_sgsty2 = new javax.swing.JLabel();
        txt_remark = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txt_sgsty4 = new javax.swing.JLabel();
        txt_sgsty5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_print = new button.Button();
        button2 = new button.Button();
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
        sidebar.add(side_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 230, 120));

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

        view_courses.setBackground(new java.awt.Color(70, 70, 70));
        view_courses.setForeground(new java.awt.Color(214, 173, 87));
        view_courses.setText("Add Fees");
        view_courses.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_courses.setRound(60);
        view_courses.setShadowColor(new java.awt.Color(30, 30, 30));
        view_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_coursesActionPerformed(evt);
            }
        });
        sidebar.add(view_courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 330, 70));

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        sidebar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 50, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/search.png"))); // NOI18N
        sidebar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 40, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/courses.png"))); // NOI18N
        sidebar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 50, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/report.png"))); // NOI18N
        sidebar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 50, 50));

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

        button4.setBackground(new java.awt.Color(70, 70, 70));
        button4.setForeground(new java.awt.Color(252, 252, 252));
        button4.setText("Account Settings");
        button4.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button4.setRound(40);
        button4.setShadowColor(new java.awt.Color(30, 30, 30));
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        dropdown.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 50));

        button5.setBackground(new java.awt.Color(70, 70, 70));
        button5.setForeground(new java.awt.Color(252, 252, 252));
        button5.setText("About Us");
        button5.setFont(new java.awt.Font("Noto Sans", 0, 15)); // NOI18N
        button5.setRound(40);
        button5.setShadowColor(new java.awt.Color(30, 30, 30));
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        dropdown.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 170, 50));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        dropdown.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/acc.png"))); // NOI18N
        dropdown.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/about.png"))); // NOI18N
        jLabel16.setText("jLabel14");
        dropdown.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        sidebar.add(dropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 240, 160));

        lbl_uname.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lbl_uname.setForeground(new java.awt.Color(254, 254, 254));
        sidebar.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 230, 50));

        jLabel19.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(254, 254, 254));
        jLabel19.setText("Hello,");
        sidebar.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 50));

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

        main_print.setBackground(new java.awt.Color(255, 249, 248));
        main_print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Mahakavi Marg, Kathmandu 44600");
        main_print.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 330, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("RuPay");
        main_print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 70, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Softwarica Coventry");
        main_print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 420, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Coventry Affiliated");
        main_print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 500, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/print_coin .png"))); // NOI18N
        main_print.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 130, 140));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, 1380, 20));

        txt_receiptNo.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_receiptNo.setForeground(new java.awt.Color(51, 0, 102));
        txt_receiptNo.setText("Receipt no:        ");
        main_print.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, -1));

        txt_Payment.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_Payment.setForeground(new java.awt.Color(51, 0, 102));
        txt_Payment.setText("Payment Mode:");
        main_print.add(txt_Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 190, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("Receipt no:       ");
        main_print.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, -1));

        txt_cheque_dd.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_cheque_dd.setForeground(new java.awt.Color(51, 0, 102));
        txt_cheque_dd.setText("Cheque No:");
        main_print.add(txt_cheque_dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Payment Mode:");
        main_print.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 130, -1));

        txt_bankName.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_bankName.setForeground(new java.awt.Color(51, 0, 102));
        txt_bankName.setText("Bank Name:");
        main_print.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 190, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 102));
        jLabel12.setText("The following payment in the college office of the year");
        main_print.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 450, -1));

        lbl_cheque_Dd.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_cheque_Dd.setForeground(new java.awt.Color(51, 0, 102));
        lbl_cheque_Dd.setText("Cheque number:");
        main_print.add(lbl_cheque_Dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, -1));

        txt_year2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_year2.setForeground(new java.awt.Color(51, 0, 102));
        txt_year2.setText("2024");
        main_print.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        txt_receivedFrom.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_receivedFrom.setForeground(new java.awt.Color(51, 0, 102));
        txt_receivedFrom.setText("Recived From:");
        main_print.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 200, -1));

        txt_year1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_year1.setForeground(new java.awt.Color(51, 0, 102));
        txt_year1.setText("2023");
        main_print.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 102));
        jLabel17.setText("  -");
        main_print.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 20, -1));

        lbl_bankName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_bankName.setForeground(new java.awt.Color(51, 0, 102));
        lbl_bankName.setText("Bank Name:");
        main_print.add(lbl_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 110, -1));

        txt_gstin.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_gstin.setForeground(new java.awt.Color(51, 0, 102));
        txt_gstin.setText("GSTIN:");
        main_print.add(txt_gstin, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, 130, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 102));
        jLabel20.setText("Amount(Rs.):");
        main_print.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, -1, 20));

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_date.setForeground(new java.awt.Color(51, 0, 102));
        txt_date.setText("Date:");
        main_print.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 210, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 102));
        jLabel22.setText("Date:");
        main_print.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1300, 10));

        txt_total.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_total.setForeground(new java.awt.Color(51, 0, 102));
        txt_total.setText("Total");
        main_print.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 640, 110, -1));

        txt_totalInWords.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        txt_totalInWords.setForeground(new java.awt.Color(51, 0, 102));
        txt_totalInWords.setText("total in words:");
        main_print.add(txt_totalInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 900, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 102));
        jLabel25.setText("Heads:");
        main_print.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 0, 102));
        jLabel26.setText("S.N");
        main_print.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 0, 102));
        jLabel27.setText("1.");
        main_print.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        txt_courseName.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_courseName.setForeground(new java.awt.Color(51, 0, 102));
        txt_courseName.setText("1.");
        main_print.add(txt_courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        txt_initialAmount.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_initialAmount.setForeground(new java.awt.Color(51, 0, 102));
        txt_initialAmount.setText("amount");
        main_print.add(txt_initialAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 510, 150, -1));

        txt_cgst.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_cgst.setForeground(new java.awt.Color(51, 0, 102));
        txt_cgst.setText("vat");
        main_print.add(txt_cgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, 150, -1));

        txt_sgst.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_sgst.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgst.setText("scholarship");
        main_print.add(txt_sgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 140, -1));

        txt_courseName5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_courseName5.setForeground(new java.awt.Color(51, 0, 102));
        txt_courseName5.setText("VAT");
        main_print.add(txt_courseName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, 90, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1300, 10));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 102));
        jLabel24.setText("Received From:");
        main_print.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txt_sgsty1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_sgsty1.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty1.setText("Scholarship");
        main_print.add(txt_sgsty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 100, -1));

        txt_sgsty2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgsty2.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty2.setText("Received Signature");
        main_print.add(txt_sgsty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 750, 160, -1));

        txt_remark.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txt_remark.setForeground(new java.awt.Color(51, 0, 102));
        txt_remark.setText("Remarks:");
        main_print.add(txt_remark, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 760, 340, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 620, 310, 10));

        jSeparator5.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 740, 220, 10));

        txt_sgsty4.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgsty4.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty4.setText("total in words:");
        main_print.add(txt_sgsty4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 120, -1));

        txt_sgsty5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgsty5.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty5.setText("Remarks:");
        main_print.add(txt_sgsty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 120, -1));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Reg Code:");
        main_print.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        inner_panel.add(main_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1290, 810));

        btn_print.setBackground(new java.awt.Color(255, 226, 57));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/print.png"))); // NOI18N
        btn_print.setRound(100);
        btn_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_printMouseClicked(evt);
            }
        });
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        inner_panel.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 840, -1, 110));

        button2.setBackground(new java.awt.Color(255, 226, 57));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/edit.png"))); // NOI18N
        button2.setRound(100);
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        inner_panel.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 840, 120, 110));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 1310, 950));

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

    private void view_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_coursesActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Addfees(dmodel.getusername());
        this.dispose();
    }//GEN-LAST:event_view_coursesActionPerformed

    private void view_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_reportActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        ViewReport(dmodel.getusername());
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_view_reportActionPerformed

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
        printpdf(main_print);
    }//GEN-LAST:event_btn_printMouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Add_fees af = new Add_fees();
        af.welcome(dmodel.getusername());
        af.setVisible(true);
        af.editReceipt();
        this.dispose();
    }//GEN-LAST:event_button2MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        count++;
        if (count % 2 == 1) {
            dropdown.setVisible(true);
        } else {
            dropdown.setVisible(false);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        DashModel dmodel = new DashModel();
        dmodel.setusername(lbl_uname.getText());
        Acc(dmodel.getusername());
    }//GEN-LAST:event_button4ActionPerformed

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

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        About();
    }//GEN-LAST:event_button5ActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    public void welcome(String var) {
        lbl_uname.setText(var);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_logout;
    private button.Button btn_print;
    private button.Button button1;
    private button.Button button2;
    private button.Button button4;
    private button.Button button5;
    private test.RoundPanel dropdown;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_bankName;
    private javax.swing.JLabel lbl_cheque_Dd;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel main_print;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private javax.swing.JLabel txt_Payment;
    private javax.swing.JLabel txt_bankName;
    private javax.swing.JLabel txt_cgst;
    private javax.swing.JLabel txt_cheque_dd;
    private javax.swing.JLabel txt_courseName;
    private javax.swing.JLabel txt_courseName5;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_gstin;
    private javax.swing.JLabel txt_initialAmount;
    private javax.swing.JLabel txt_receiptNo;
    private javax.swing.JLabel txt_receivedFrom;
    private javax.swing.JLabel txt_remark;
    private javax.swing.JLabel txt_sgst;
    private javax.swing.JLabel txt_sgsty1;
    private javax.swing.JLabel txt_sgsty2;
    private javax.swing.JLabel txt_sgsty4;
    private javax.swing.JLabel txt_sgsty5;
    private javax.swing.JLabel txt_total;
    private javax.swing.JLabel txt_totalInWords;
    private javax.swing.JLabel txt_year1;
    private javax.swing.JLabel txt_year2;
    private button.Button view_courses;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}
