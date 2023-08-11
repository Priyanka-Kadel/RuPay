package Controller;

import view.frames.*;
import javax.swing.JOptionPane;

public class LinkManager {

    public static void LoginFrame() {
        Login_Frame lframe = new Login_Frame();
        LoginController login = new LoginController(lframe);
        lframe.setVisible(true);
    }

    public static void SignupFrame() {
        Signup_Frame sframe = new Signup_Frame();
        RegisterController login = new RegisterController(sframe);
        sframe.setVisible(true);
    }

    public static void Dashboard(String var) {
        Dashboard dashboard = new Dashboard();
        dashboard.welcome(var);
        dashboard.setVisible(true);
    }

    public static void Addfees(String var) {
        Add_fees addfees = new Add_fees();
        addfees.welcome(var);
        addfees.setVisible(true);

    }

    public static void Print(String var) {
        Print_Receipt print = new Print_Receipt();
        print.welcome(var);
        print.setVisible(true);

    }

    public static void SearchRecord(String var) {
        Search_Records search = new Search_Records();
        search.welcome(var);
        search.setVisible(true);
    }

    public static void Edit(String var) {
        Courses edit = new Courses();
        edit.welcome(var);
        edit.setVisible(true);
    }

    public static void ViewReport(String var) {
        View_Report report = new View_Report();
        report.welcome(var);
        report.setVisible(true);
    }

    public static void Recovery() {
        Recovery recovery = new Recovery();
        recovery.setVisible(true);
    }
    public static void About() {
        About_Us about = new About_Us();
        about.setVisible(true);
    }
    public static void Acc(String var) {
        Account_Settings acc = new Account_Settings();
        acc.welcome(var);
        acc.setVisible(true);
    }

    public static int Logout() {
        int logout = JOptionPane.showConfirmDialog(null, "Confim Log Out?", "Select", JOptionPane.YES_NO_OPTION);
        if (logout == 0) {
            LoginFrame();
            return 0;
        } else {
            return -1;
        }
    }
}
