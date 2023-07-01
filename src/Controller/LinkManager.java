<<<<<<< HEAD
package Controller;

import javax.swing.JOptionPane;

import view.frames.Add_fees;
import view.frames.Dashboard;
import view.frames.Edit_Course;
import view.frames.Login;
import view.frames.Search_Records;
import view.frames.Signup_Frame;
import view.frames.View_All_Records;
=======
 package Controller;

import javax.swing.JOptionPane;
import view.frames.Add_fees;
import view.frames.Dashboard;
import view.frames.Edit_Course;
import view.frames.Login_Frame;
import view.frames.Search_Records;
import view.frames.Signup_Frame;
//import project.View_All_Records;
>>>>>>> a18137edbbf8d30a9c4a5c7d6c8af8c9b3514731
import view.frames.View_Courses;
import view.frames.View_Report;

public class LinkManager {
    
    public static void LoginFrame() {
<<<<<<< HEAD
        Login login = new Login();
=======
        Login_Frame login = new Login_Frame();
>>>>>>> a18137edbbf8d30a9c4a5c7d6c8af8c9b3514731
        login.setVisible(true);
    }
    
        public static void SignupFrame() {
        Signup_Frame signup_frame = new Signup_Frame();
        signup_frame.setVisible(true);
    }
    public static void Dashboard(){
        Dashboard dashboard=new Dashboard();
        dashboard.setVisible(true);
    }
    public static void Addfees(){
        Add_fees addfees =new Add_fees();
        addfees.setVisible(true);
        
    }
    public static void SearchRecord(){
        Search_Records search=new Search_Records();
        search.setVisible(true);        
    }
    public static void ViewAll() {
<<<<<<< HEAD
        View_All_Records viewall=new View_All_Records();
        viewall.setVisible(true);       
=======
//        View_All_Records viewall=new View_All_Records();
//        viewall.setVisible(true);       
>>>>>>> a18137edbbf8d30a9c4a5c7d6c8af8c9b3514731
    }
    public static void Edit(){
        Edit_Course edit=new Edit_Course();
        edit.setVisible(true);
    }
    public static void ViewCourse(){
        View_Courses vcourse=new View_Courses();
        vcourse.setVisible(true);
    }
    public static void ViewReport(){
        View_Report report=new View_Report();
        report.setVisible(true);
    }
    public static void Quit() {
        int exit=JOptionPane.showConfirmDialog(null,  "Do you really want to Close Application","SELECT",JOptionPane.YES_NO_OPTION);
     if (exit==0){
         System.exit(0);
     }
    }
    
}
