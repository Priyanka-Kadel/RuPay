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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

import view.custom.scrollbar.ScrollBarCustom;

/**
 *
 * @author rolen
 */
public class Add_fees extends javax.swing.JFrame {
    

    /**
     * Creates new form Dashboard
     */
    public Add_fees() {
        initComponents();
        fillComboBox();
        int recieptNo=getReceiptNo();
        txt_receiptNo.setText(Integer.toString(recieptNo));
        
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        
        lbl_cheque.setVisible(false);
        lbl_bank.setVisible(false);
        
        txt_ChequeNo.setVisible(false);
        txt_bankName.setVisible(false);
        
    }
    public boolean validation(){
        if (txt_receivedFrom.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "please enter recieved from");
            return false;
            
        }
        if (dateChooser.getText()==null){
            JOptionPane.showMessageDialog(this, "please select a date");
            return false;
            
        }
        if (txt_amount.getText().equals("")|| txt_amount.getText().matches("[0-9]+")==false) {
            JOptionPane.showMessageDialog(this, "please enter amount in number");
            return false;
        }
        if (comboCourse.getSelectedItem().toString().equalsIgnoreCase("bank")){
            if(txt_ChequeNo.getText().equals("")){
                JOptionPane.showMessageDialog(this, "please enter cheque number");
                return false;
            }
            if(txt_bankName.getText().equals("")){
                JOptionPane.showMessageDialog(this, "please enter bank name");
                return false;
            }
        }
        
        return true;
    }
    public void fillComboBox(){
        try{Connection con = DBConnection.getConnection();
             
            PreparedStatement pst=con.prepareStatement("select cname from course");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                comboCourse.addItem(rs.getString("cname"));
            }
            
            pst.close();
        }catch(Exception e){
            e.printStackTrace();
           
        }
    }
    public int getReceiptNo(){
        int recieptNo=0;
        try {
            Connection con=DBConnection.getConnection();
            PreparedStatement pst=con.prepareStatement("select max(reciept_no) from fees_detail");
            ResultSet rs=pst.executeQuery();
            if (rs.next()==true){
                recieptNo=rs.getInt(1);
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recieptNo+1;
    }
    public String insertData(){
        String status="";
        int recieptNo=Integer.parseInt(txt_receiptNo.getText());
        String studentName=txt_receivedFrom.getText();
        String paymentMode=combo_PaymentMode.getSelectedItem().toString();
        String chequeNo=txt_ChequeNo.getText();
        String bankName=txt_bankName.getText();
        String courseName=txt_courseName.getText();
        String gstin=txt_GSTNo.getText();
        float totalAmount=Float.parseFloat(txt_total.getText());

        String date=dateChooser.getText();
        float initialAmount= Float.parseFloat(txt_amount.getText());
        float vat=Float.parseFloat(txt_vat.getText());
        float scholarship=Float.parseFloat(txt_sc_amt.getText());
        String totalInWords=txt_total_words.getText();
        String remark=txt_remark.getText();
        int year1=Integer.parseInt(txt_year1.getText());
        int year2=Integer.parseInt(txt_year2.getText());
        
        try {
            Connection con= DBConnection.getConnection();
            String query=("INSERT INTO fees_detail(reciept_no,student_name,payment_mode,cheque_no,bank_name,course_name,gstin,total_amount,date,amount,vat,scholarship,total_in_words,remark,year1,year2) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, recieptNo);
            statement.setString(2,studentName);
            statement.setString(3,paymentMode);
            statement.setString(4,chequeNo);
            statement.setString(5, bankName);
            statement.setString(6, courseName);
            statement.setString(7,gstin);
            statement.setFloat(8, totalAmount);
            statement.setString(9, date);
            statement.setFloat(10, initialAmount);
            statement.setFloat(11,vat);
            statement.setFloat(12, scholarship);
            statement.setString(13, totalInWords);
            statement.setString(14, remark);
            statement.setInt(15,year1);
            statement.setInt(16, year2);
            
            int rowCount=statement.executeUpdate();
            if (rowCount==1){
            status="success";
        }else{
                status="failed";
            } 
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
            status = "exception";
            
        }
    return status;        
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new view.custom.datechooser.DateChooser();
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
        btn_logout = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        workng_panel = new javax.swing.JPanel();
        lbl_rno = new javax.swing.JLabel();
        txt_receiptNo = new textfield.TextField();
        top_date = new javax.swing.JLabel();
        dateChooser = new textfield.TextField();
        txt_GSTNo = new javax.swing.JLabel();
        lbl_pmode = new javax.swing.JLabel();
        comboCourse = new view.custom.Combobox();
        lbl_cheque = new javax.swing.JLabel();
        txt_ChequeNo = new textfield.TextField();
        lbl_bank = new javax.swing.JLabel();
        txt_bankName = new textfield.TextField();
        lbl_rfrom = new javax.swing.JLabel();
        txt_receivedFrom = new textfield.TextField();
        payment_lbl = new javax.swing.JLabel();
        txt_year1 = new textfield.TextField();
        to = new javax.swing.JLabel();
        txt_year2 = new textfield.TextField();
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
        txt_total_words = new textfield.TextField();
        remarks = new javax.swing.JLabel();
        btn_print = new button.Button();
        sign = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        textAreaScroll1 = new view.custom.textarea.TextAreaScroll();
        txt_remark = new view.custom.textarea.TextArea();
        combo_PaymentMode = new view.custom.Combobox();
        jSeparator5 = new javax.swing.JSeparator();
        bg = new javax.swing.JLabel();

        date.setForeground(new java.awt.Color(255, 226, 57));
        date.setTextRefernce(dateChooser);

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

        btn_logout.setBackground(new java.awt.Color(120, 120, 120));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        btn_logout.setRound(100);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        sidebar.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 890, 110, 100));

        main_panel.add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 1050));

        inner_panel.setBackground(new java.awt.Color(62, 62, 62));
        inner_panel.setRoundBottomLeft(40);
        inner_panel.setRoundBottomRight(40);
        inner_panel.setRoundTopLeft(40);
        inner_panel.setRoundTopRight(40);
        inner_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Add_fees.setFont(new java.awt.Font("Noto Sans", 1, 36)); // NOI18N
        Add_fees.setForeground(new java.awt.Color(254, 254, 254));
        Add_fees.setText("Add Fees");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        workng_panel.setBackground(new java.awt.Color(62, 62, 62));
        workng_panel.setForeground(new java.awt.Color(254, 254, 254));
        workng_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_rno.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_rno.setForeground(new java.awt.Color(254, 254, 254));
        lbl_rno.setText("Receipt no.");
        workng_panel.add(lbl_rno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        txt_receiptNo.setBackground(new java.awt.Color(95, 95, 95));
        txt_receiptNo.setForeground(new java.awt.Color(183, 183, 183));
        txt_receiptNo.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_receiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, -1));

        top_date.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        top_date.setForeground(new java.awt.Color(254, 254, 254));
        top_date.setText("Date:");
        workng_panel.add(top_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 50, -1, -1));

        dateChooser.setBackground(new java.awt.Color(95, 95, 95));
        dateChooser.setForeground(new java.awt.Color(183, 183, 183));
        dateChooser.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 180, -1));

        txt_GSTNo.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_GSTNo.setForeground(new java.awt.Color(254, 254, 254));
        txt_GSTNo.setText("GSTIN : 0000000");
        workng_panel.add(txt_GSTNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 90, 200, -1));

        lbl_pmode.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_pmode.setForeground(new java.awt.Color(254, 254, 254));
        lbl_pmode.setText("Mode of Payment");
        workng_panel.add(lbl_pmode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        comboCourse.setBackground(new java.awt.Color(65, 65, 65));
        comboCourse.setForeground(new java.awt.Color(255, 226, 57));
        comboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCourseActionPerformed(evt);
            }
        });
        workng_panel.add(comboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 210, 40));

        lbl_cheque.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_cheque.setForeground(new java.awt.Color(254, 254, 254));
        lbl_cheque.setText("Cheque no.");
        workng_panel.add(lbl_cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, -1, -1));

        txt_ChequeNo.setBackground(new java.awt.Color(95, 95, 95));
        txt_ChequeNo.setForeground(new java.awt.Color(183, 183, 183));
        txt_ChequeNo.setShadowColor(new java.awt.Color(254, 254, 254));
        txt_ChequeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ChequeNoActionPerformed(evt);
            }
        });
        workng_panel.add(txt_ChequeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, 350, -1));

        lbl_bank.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_bank.setForeground(new java.awt.Color(254, 254, 254));
        lbl_bank.setText("Bank Name");
        workng_panel.add(lbl_bank, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        txt_bankName.setBackground(new java.awt.Color(95, 95, 95));
        txt_bankName.setForeground(new java.awt.Color(183, 183, 183));
        txt_bankName.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_bankName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 350, -1));

        lbl_rfrom.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        lbl_rfrom.setForeground(new java.awt.Color(254, 254, 254));
        lbl_rfrom.setText("Received From");
        workng_panel.add(lbl_rfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txt_receivedFrom.setBackground(new java.awt.Color(95, 95, 95));
        txt_receivedFrom.setForeground(new java.awt.Color(183, 183, 183));
        txt_receivedFrom.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_receivedFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 300, -1));

        payment_lbl.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        payment_lbl.setForeground(new java.awt.Color(254, 254, 254));
        payment_lbl.setText("The following payment for college for the year");
        workng_panel.add(payment_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 440, -1));

        txt_year1.setBackground(new java.awt.Color(95, 95, 95));
        txt_year1.setForeground(new java.awt.Color(183, 183, 183));
        txt_year1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_year1.setText("2022");
        txt_year1.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_year1ActionPerformed(evt);
            }
        });
        workng_panel.add(txt_year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 70, -1));

        to.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        to.setForeground(new java.awt.Color(254, 254, 254));
        to.setText("to");
        workng_panel.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        txt_year2.setBackground(new java.awt.Color(95, 95, 95));
        txt_year2.setForeground(new java.awt.Color(183, 183, 183));
        txt_year2.setText("2023");
        txt_year2.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_year2.setShadowColor(new java.awt.Color(254, 254, 254));
        txt_year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_year2ActionPerformed(evt);
            }
        });
        workng_panel.add(txt_year2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(95, 95, 95));
        workng_panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 1110, 10));

        jSeparator2.setForeground(new java.awt.Color(95, 95, 95));
        workng_panel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 1110, 10));

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
        txt_courseName.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_courseName.setShadowColor(new java.awt.Color(254, 254, 254));
        txt_courseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseNameActionPerformed(evt);
            }
        });
        workng_panel.add(txt_courseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 480, -1));

        txt_amount.setBackground(new java.awt.Color(95, 95, 95));
        txt_amount.setForeground(new java.awt.Color(183, 183, 183));
        txt_amount.setShadowColor(new java.awt.Color(254, 254, 254));
        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });
        workng_panel.add(txt_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 130, -1));

        txt_vat.setBackground(new java.awt.Color(95, 95, 95));
        txt_vat.setForeground(new java.awt.Color(183, 183, 183));
        txt_vat.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_vat, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 130, -1));

        txt_sc_amt.setBackground(new java.awt.Color(95, 95, 95));
        txt_sc_amt.setForeground(new java.awt.Color(183, 183, 183));
        txt_sc_amt.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_sc_amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 580, 130, -1));

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
        txt_total.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 660, 140, -1));

        In_Words.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        In_Words.setForeground(new java.awt.Color(254, 254, 254));
        In_Words.setText("In Words:");
        workng_panel.add(In_Words, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 750, -1, -1));

        txt_total_words.setBackground(new java.awt.Color(95, 95, 95));
        txt_total_words.setForeground(new java.awt.Color(183, 183, 183));
        txt_total_words.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        txt_total_words.setShadowColor(new java.awt.Color(254, 254, 254));
        workng_panel.add(txt_total_words, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 740, 760, -1));

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
        workng_panel.add(btn_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 990, 120, 50));

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
        txt_remark.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        textAreaScroll1.setViewportView(txt_remark);

        workng_panel.add(textAreaScroll1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 840, 560, 110));

        combo_PaymentMode.setBackground(new java.awt.Color(65, 65, 65));
        combo_PaymentMode.setForeground(new java.awt.Color(255, 226, 57));
        combo_PaymentMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "Bank", "Online Payment" }));
        combo_PaymentMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_PaymentModeActionPerformed(evt);
            }
        });
        workng_panel.add(combo_PaymentMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, 60));
        workng_panel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        scroll.setViewportView(workng_panel);

        inner_panel.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1180, 730));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 1220, 850));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/background.png"))); // NOI18N
        bg.setText("background");
        main_panel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1480, 1050));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ChequeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ChequeNoActionPerformed
        
    }//GEN-LAST:event_txt_ChequeNoActionPerformed

    private void comboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCourseActionPerformed
    txt_courseName.setText(comboCourse.getSelectedItem().toString());
    }//GEN-LAST:event_comboCourseActionPerformed

    private void txt_year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_year2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_year2ActionPerformed

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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
    Quit();          // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
     if (validation()==true){
         String result=insertData();
         if(result.equals("success")){
             JOptionPane.showMessageDialog(this, "record inserted successfully");
             Print_Receipt p = new Print_Receipt();
             p.setVisible(true);
             this.dispose();
         
         }else{
             JOptionPane.showMessageDialog(this, "record insertion failed");
         }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        Float amnt=Float.parseFloat(txt_amount.getText());
        Float vat=(float)(amnt*0.09);
        Float scholar=(float)(amnt*0.09);
        txt_vat.setText(vat.toString());
        txt_sc_amt.setText(scholar.toString());
        float total= amnt + vat + scholar;
        
        txt_total.setText(Float.toString(total));
        txt_total_words.setText(NumberToWordsConverter.convert((int)total)+" only"); 
        
    }//GEN-LAST:event_txt_amountActionPerformed

    private void combo_PaymentModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_PaymentModeActionPerformed
     if(combo_PaymentMode.getSelectedIndex()==1){
            txt_ChequeNo.setVisible(true);
            lbl_cheque.setVisible(true);
            lbl_bank.setVisible(true);
            txt_bankName.setVisible(true);
        }
        
        if((combo_PaymentMode.getSelectedIndex()==0 )|| (combo_PaymentMode.getSelectedIndex()==2 )){
            txt_ChequeNo.setVisible(false);
            lbl_cheque.setVisible(false);
            lbl_bank.setVisible(false);
            txt_bankName.setVisible(false);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_combo_PaymentModeActionPerformed

    private void txt_courseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseNameActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseNameActionPerformed

    private void txt_year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_year1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txt_year1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Add_fees object= new Add_fees();
        object.cash();
        
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
            java.util.logging.Logger.getLogger(Add_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_fees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_fees().setVisible(true);
            }
        });
    }
    public void cash(){
        lbl_cheque.setVisible(false);
        lbl_bank.setVisible(false);
        
        txt_ChequeNo.setVisible(false);
        txt_bankName.setVisible(false);
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
    private view.custom.Combobox comboCourse;
    private view.custom.Combobox combo_PaymentMode;
    private view.custom.datechooser.DateChooser date;
    private textfield.TextField dateChooser;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
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
    private textfield.TextField txt_ChequeNo;
    private javax.swing.JLabel txt_GSTNo;
    private textfield.TextField txt_amount;
    private textfield.TextField txt_bankName;
    private textfield.TextField txt_courseName;
    private textfield.TextField txt_receiptNo;
    private textfield.TextField txt_receivedFrom;
    private view.custom.textarea.TextArea txt_remark;
    private textfield.TextField txt_sc_amt;
    private textfield.TextField txt_total;
    private textfield.TextField txt_total_words;
    private textfield.TextField txt_vat;
    private textfield.TextField txt_year1;
    private textfield.TextField txt_year2;
    private javax.swing.JLabel vat;
    private button.Button view_all_records;
    private button.Button view_courses;
    private button.Button view_report;
    private javax.swing.JPanel workng_panel;
    // End of variables declaration//GEN-END:variables
}
