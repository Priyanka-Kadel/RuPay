/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.frames;
import static Controller.LinkManager.Addfees;
import static Controller.LinkManager.Dashboard;
import static Controller.LinkManager.Edit;
import static Controller.LinkManager.Quit;
import static Controller.LinkManager.SearchRecord;
import static Controller.LinkManager.ViewAll;
import static Controller.LinkManager.ViewCourse;
import static Controller.LinkManager.ViewReport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author rolen
 */
public class View_Report extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public View_Report() {
        initComponents(); 
    }
    public void fillComboBox(){
        try{Connection con = DBConnection.getConnection();
             
            PreparedStatement pst=con.prepareStatement("select cname from course");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                combo_CourseDetails.addItem(rs.getString("cname"));
            }
            
            
        }catch(Exception e){
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
        btn_logout = new button.Button();
        inner_panel = new test.RoundPanel();
        Add_fees = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        combo_CourseDetails = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_course = new javax.swing.JLabel();
        lbl_totalInWords = new javax.swing.JLabel();
        lbl_totalAmount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_u = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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

        add_fees.setBackground(new java.awt.Color(65, 65, 65));
        add_fees.setForeground(new java.awt.Color(214, 173, 87));
        add_fees.setText("Add Fees");
        add_fees.setFont(new java.awt.Font("Droid Sans", 1, 36)); // NOI18N
        add_fees.setRound(60);
        add_fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_feesActionPerformed(evt);
            }
        });
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

        view_report.setBackground(new java.awt.Color(214, 173, 87));
        view_report.setForeground(new java.awt.Color(65, 65, 65));
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
        Add_fees.setForeground(new java.awt.Color(255, 255, 255));
        Add_fees.setText("View Report");
        inner_panel.add(Add_fees, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Select Course:");
        inner_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        combo_CourseDetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computing", "Ethical" }));
        combo_CourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_CourseDetailsActionPerformed(evt);
            }
        });
        inner_panel.add(combo_CourseDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 180, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("From Date:");
        inner_panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Date:");
        inner_panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton1.setText("Export to database");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        inner_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        inner_panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        inner_panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 240, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        inner_panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jButton4.setText("Browse ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        inner_panel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Reciept No", "Student Name", "Payment Mode", "Course Taken", "Amount", "Remark"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        inner_panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 1120, 410));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Amount In Words:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 200, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Course Selected:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 20));

        lbl_course.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_course.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 200, 20));

        lbl_totalInWords.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_totalInWords.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbl_totalInWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 370, 20));
        jPanel1.add(lbl_totalAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 160, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Amount Collected:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, 20));
        jPanel1.add(lbl_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 140, 20));

        inner_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 390, 180));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("To Date:");
        inner_panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        main_panel.add(inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 1220, 850));

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

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
    Quit();          // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void add_feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_feesActionPerformed
        Addfees();
    this.dispose();
    }//GEN-LAST:event_add_feesActionPerformed

    private void combo_CourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_CourseDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_CourseDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_fees;
    private button.Button add_fees;
    private javax.swing.JLabel bg;
    private button.Button btn_dash;
    private button.Button btn_logout;
    private javax.swing.JComboBox<String> combo_CourseDetails;
    private button.Button edit_course;
    private test.RoundPanel inner_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_totalAmount;
    private javax.swing.JLabel lbl_totalInWords;
    private javax.swing.JLabel lbl_u;
    private javax.swing.JPanel main_panel;
    private button.Button search_records;
    private javax.swing.JLabel side_logo;
    private test.RoundPanel sidebar;
    private button.Button view_all_records;
    private button.Button view_courses;
    private button.Button view_report;
    // End of variables declaration//GEN-END:variables
}
