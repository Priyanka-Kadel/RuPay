
import Controller.RegisterController;
import view.frames.Signup_Frame;

public class RegisterMain {
    public static void main(String[] args) {
        Signup_Frame view= new Signup_Frame();
        RegisterController rcontroller= new RegisterController(view);
        view.setVisible(true);
    }
}