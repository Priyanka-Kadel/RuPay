
import Controller.RecoveryController;
import view.frames.Recovery;
 
public class RecoveryMain {

    public static void main(String[] args) {
        Recovery view = new Recovery();
        RecoveryController rcontroller = new RecoveryController(view);
        view.setVisible(true);
    }
}
