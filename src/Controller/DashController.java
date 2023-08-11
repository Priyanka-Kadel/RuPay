package Controller;
import view.frames.Dashboard;

public class DashController {
    private Dashboard view;

    public DashController(String svar, Dashboard view) {
        this.view = view;
        view.welcome(svar);
    }

}
