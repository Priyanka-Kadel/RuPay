/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.frames;
import static Controller.LinkManager.Dashboard;
import static Controller.LinkManager.Edit;
import static Controller.LinkManager.Quit;
import static Controller.LinkManager.SearchRecord;
import static Controller.LinkManager.ViewAll;
import static Controller.LinkManager.ViewCourse;
import static Controller.LinkManager.ViewReport;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import view.custom.scrollbar.ScrollBarCustom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


   

   


/**
 *
 * @author rolen
 */
public class Print_Receipt extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Print_Receipt() {
        initComponents();
        getRecords();
    }
    
    
    public void getRecords(){
        try{
            Connection con = DBConnection.getConnection();
            PreparedStatement pst = con.prepareStatement("SELECT * FROM fees_detail ORDER BY  reciept_no DESC LIMIT 1");
            ResultSet rs = pst.executeQuery();
            rs.next();
            
            txt_receiptNo.setText(rs.getString("reciept_no"));
            txt_Payment.setText(rs.getString("payment_mode"));
            
            String paymentMode = rs.getString("payment_mode");
            
            if(paymentMode.equalsIgnoreCase("cash")){
//                lbl_cheque_Dd.setText("Cheque No");
                txt_cheque_dd.setText("-");
                txt_bankName.setText("-");           
            }
            
            if(paymentMode.equalsIgnoreCase("Bank")){
//                lbl_cheque_Dd.setText("Cheque No");
                txt_cheque_dd.setText(rs.getString("cheque_no"));
                txt_bankName.setText(rs.getString("bank_name"));           
            }
            
            if(paymentMode.equalsIgnoreCase("Online Payment")){
//                lbl_cheque_Dd.setText("Cheque No");
                txt_cheque_dd.setText("-");
                txt_bankName.setText("-");           
            }
            
            txt_receivedFrom.setText(rs.getString("student_name"));
            txt_date.setText(rs.getString("date"));
            txt_gstin.setText(rs.getString("gstin"));
            txt_year1.setText(rs.getString("year1"));
            txt_year2.setText(rs.getString("year2"));
            
            txt_initialAmount.setText(rs.getString("amount"));
            txt_cgst.setText(rs.getString("vat"));
            txt_sgst.setText(rs.getString("scholarship"));
            txt_total.setText(rs.getString("total_amount"));
            txt_totalInWords.setText(rs.getString("total_in_words"));
            txt_remark.setText(rs.getString("remark"));
            
        pst.close();
        rs.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    
    
    
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
        sidebar = new test.RoundPanel();
        side_logo = new javax.swing.JLabel();
        btn_dash = new button.Button();
        add_fees = new button.Button();
        search_records = new button.Button();
        view_all_records = new button.Button();
        edit_course = new button.Button();
        view_courses = new button.Button();
        view_report = new button.Button();
        btn_edit = new button.Button();
        btn_print = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
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
        txt_courseName1 = new javax.swing.JLabel();
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
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(62, 62, 62));
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebar.setBackground(new java.awt.Color(82, 82, 82));
        sidebar.setRoundBottomRight(50);
        sidebar.setRoundTopRight(50);
        sidebar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/dash_logo.png"))); // NOI18N
        sidebar.add(side_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 230, 120));

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
        sidebar.add(btn_dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        add_fees.setBackground(new java.awt.Color(214, 173, 87));
        add_fees.setForeground(new java.awt.Color(65, 65, 65));
        add_fees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add2.png"))); // NOI18N
        add_fees.setText("Add Fees");
        add_fees.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        add_fees.setRound(60);
        sidebar.add(add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 330, 70));

        search_records.setBackground(new java.awt.Color(65, 65, 65));
        search_records.setForeground(new java.awt.Color(214, 173, 87));
        search_records.setText("Search Records");
        search_records.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        search_records.setRound(60);
        search_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_recordsActionPerformed(evt);
            }
        });
        sidebar.add(search_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 330, 70));

        view_all_records.setBackground(new java.awt.Color(65, 65, 65));
        view_all_records.setForeground(new java.awt.Color(214, 173, 87));
        view_all_records.setText("View all Records");
        view_all_records.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_all_records.setRound(60);
        view_all_records.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_recordsActionPerformed(evt);
            }
        });
        sidebar.add(view_all_records, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 330, 70));

        edit_course.setBackground(new java.awt.Color(65, 65, 65));
        edit_course.setForeground(new java.awt.Color(214, 173, 87));
        edit_course.setText("Edit Course");
        edit_course.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        edit_course.setRound(60);
        edit_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_courseActionPerformed(evt);
            }
        });
        sidebar.add(edit_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, 330, 70));

        view_courses.setBackground(new java.awt.Color(65, 65, 65));
        view_courses.setForeground(new java.awt.Color(214, 173, 87));
        view_courses.setText("View Courses");
        view_courses.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_courses.setRound(60);
        view_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_coursesActionPerformed(evt);
            }
        });
        sidebar.add(view_courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 330, 70));

        view_report.setBackground(new java.awt.Color(65, 65, 65));
        view_report.setForeground(new java.awt.Color(214, 173, 87));
        view_report.setText("View Report");
        view_report.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        view_report.setRound(60);
        view_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_reportActionPerformed(evt);
            }
        });
        sidebar.add(view_report, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 790, 330, 70));

        btn_edit.setBackground(new java.awt.Color(120, 120, 120));
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/edit2.png"))); // NOI18N
        btn_edit.setRound(100);
        btn_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editMouseClicked(evt);
            }
        });
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        sidebar.add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 880, 110, 100));

        btn_print.setBackground(new java.awt.Color(120, 120, 120));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/printer.png"))); // NOI18N
        btn_print.setToolTipText("");
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
        sidebar.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 880, 120, 110));

        main_panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1050));

        inner_panel.setBackground(new java.awt.Color(255, 249, 248));
        inner_panel.setRoundBottomLeft(40);
        inner_panel.setRoundBottomRight(40);
        inner_panel.setRoundTopLeft(40);
        inner_panel.setRoundTopRight(40);
        inner_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        Add_fees.setText("Print Receipt");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        main_print.setBackground(new java.awt.Color(255, 249, 248));
        main_print.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("Mahakavi Marg, Kathmandu 44600");
        main_print.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 280, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("RuPay");
        main_print.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 70, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Softwarica Coventry");
        main_print.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 320, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 55)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Coventry Affiliated");
        main_print.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 450, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/coin .png"))); // NOI18N
        main_print.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 240, 150));

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));
        jPanel1.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 160, 1380, 20));

        txt_receiptNo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_receiptNo.setForeground(new java.awt.Color(51, 0, 102));
        txt_receiptNo.setText("Receipt no:        ");
        main_print.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 170, -1));

        txt_Payment.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_Payment.setForeground(new java.awt.Color(51, 0, 102));
        txt_Payment.setText("Payment Mode:");
        main_print.add(txt_Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 190, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("Receipt no:         SOC-");
        main_print.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, -1));

        txt_cheque_dd.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_cheque_dd.setForeground(new java.awt.Color(51, 0, 102));
        txt_cheque_dd.setText("Cheque No:");
        main_print.add(txt_cheque_dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Payment Mode:");
        main_print.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 120, -1));

        txt_bankName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_bankName.setForeground(new java.awt.Color(51, 0, 102));
        txt_bankName.setText("Bank Name:");
        main_print.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 190, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 102));
        jLabel12.setText("The following payment in the college office of the year");
        main_print.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 410, -1));

        lbl_cheque_Dd.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_cheque_Dd.setForeground(new java.awt.Color(51, 0, 102));
        lbl_cheque_Dd.setText("Cheque dd:");
        main_print.add(lbl_cheque_Dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 90, -1));

        txt_year2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_year2.setForeground(new java.awt.Color(51, 0, 102));
        txt_year2.setText("2024");
        main_print.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        txt_receivedFrom.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_receivedFrom.setForeground(new java.awt.Color(51, 0, 102));
        txt_receivedFrom.setText("Recived From:");
        main_print.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 200, -1));

        txt_year1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_year1.setForeground(new java.awt.Color(51, 0, 102));
        txt_year1.setText("2023");
        main_print.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 102));
        jLabel17.setText("-");
        main_print.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        lbl_bankName.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        lbl_bankName.setForeground(new java.awt.Color(51, 0, 102));
        lbl_bankName.setText("Bank Name:");
        main_print.add(lbl_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 90, -1));

        txt_gstin.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_gstin.setForeground(new java.awt.Color(51, 0, 102));
        txt_gstin.setText("GSTIN:");
        main_print.add(txt_gstin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 240, 130, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 0, 102));
        jLabel20.setText("Amount(rs):");
        main_print.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 460, -1, 20));

        txt_date.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_date.setForeground(new java.awt.Color(51, 0, 102));
        txt_date.setText("Date:");
        main_print.add(txt_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 200, 210, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 0, 102));
        jLabel22.setText("Date:");
        main_print.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 1300, 10));

        txt_total.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_total.setForeground(new java.awt.Color(51, 0, 102));
        txt_total.setText("Total");
        main_print.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 640, 60, -1));

        txt_totalInWords.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_totalInWords.setForeground(new java.awt.Color(51, 0, 102));
        txt_totalInWords.setText("total in words:");
        main_print.add(txt_totalInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 690, 380, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 0, 102));
        jLabel25.setText("Heads:");
        main_print.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 0, 102));
        jLabel26.setText("Sr NO:");
        main_print.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 0, 102));
        jLabel27.setText("1.");
        main_print.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        txt_courseName1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_courseName1.setForeground(new java.awt.Color(51, 0, 102));
        txt_courseName1.setText("1.");
        main_print.add(txt_courseName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        txt_initialAmount.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_initialAmount.setForeground(new java.awt.Color(51, 0, 102));
        txt_initialAmount.setText("amount");
        main_print.add(txt_initialAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 510, 160, -1));

        txt_cgst.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_cgst.setForeground(new java.awt.Color(51, 0, 102));
        txt_cgst.setText("vat");
        main_print.add(txt_cgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 550, 160, -1));

        txt_sgst.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgst.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgst.setText("scholarship");
        main_print.add(txt_sgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 590, 160, -1));

        txt_courseName5.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_courseName5.setForeground(new java.awt.Color(51, 0, 102));
        txt_courseName5.setText("VAT");
        main_print.add(txt_courseName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 90, -1));

        jSeparator3.setForeground(new java.awt.Color(51, 0, 102));
        main_print.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 1300, 10));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 0, 102));
        jLabel24.setText("Received From:");
        main_print.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        txt_sgsty1.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgsty1.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty1.setText("Scholarship");
        main_print.add(txt_sgsty1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 100, -1));

        txt_sgsty2.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        txt_sgsty2.setForeground(new java.awt.Color(51, 0, 102));
        txt_sgsty2.setText("Received Signature");
        main_print.add(txt_sgsty2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 750, 160, -1));

        txt_remark.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
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

        inner_panel.add(main_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1290, 840));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 1310, 920));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        bg.setText("background");
        main_panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1480, 1050));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashActionPerformed
    Dashboard();
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btn_dashActionPerformed

    private void search_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_recordsActionPerformed
    SearchRecord();
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_search_recordsActionPerformed

    private void view_all_recordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_recordsActionPerformed
    ViewAll();
        this.dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_view_all_recordsActionPerformed

    private void edit_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_courseActionPerformed
    Edit();
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_edit_courseActionPerformed

    private void view_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_coursesActionPerformed
    ViewCourse();
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_view_coursesActionPerformed

    private void view_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_reportActionPerformed
    ViewReport();
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_view_reportActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_printMouseClicked
    PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                    pf.setOrientation(PageFormat.LANDSCAPE);
                 if(pageNum > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.47,0.47);
                
                main_print.print(g2);
         
               
                return Printable.PAGE_EXISTS;
                         
                
            }
    });
            boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){
	ex.printStackTrace();
}
        }
    
    }//GEN-LAST:event_btn_printMouseClicked

    private void btn_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editMouseClicked
        UpdateFeesDetails update=new UpdateFeesDetails();
        update.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_editMouseClicked

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            new Print_Receipt().setVisible(true);
        });
    
}
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_edit;
    private button.Button btn_print;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_bankName;
    private javax.swing.JLabel lbl_cheque_Dd;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel main_print;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private javax.swing.JLabel txt_Payment;
    private javax.swing.JLabel txt_bankName;
    private javax.swing.JLabel txt_cgst;
    private javax.swing.JLabel txt_cheque_dd;
    private javax.swing.JLabel txt_courseName1;
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
    private button.Button view_all_records;
    private button.Button view_courses;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}