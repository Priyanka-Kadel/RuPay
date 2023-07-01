
import Controller.LoginController;
import view.frames.Login_Frame;
 
public class LoginMain {

    public static void main(String[] args) {
        Login_Frame view = new Login_Frame();
        LoginController rcontroller = new LoginController(view);
        view.setVisible(true);
    }
}
