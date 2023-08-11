package Controller;
import model.LoginModel;
import view.frames.Login_Frame;
import DAO.uqueries;

public class LoginController {

    private LoginModel lmodel;
    private Login_Frame view;

    public LoginController(LoginModel lmodel, Login_Frame view) {
        this.lmodel = lmodel;
        this.view = view;
    }

    public LoginController(Login_Frame view) {
        this.view = view;
    }

    public String verifyuser() {
        if (view.isvalid()) {
            if (uqueries.verifyLogin(lmodel.getusername(), lmodel.getpwd())) {
                view.displaymessage("Login Successful");
                return "success";
            } else {
                view.displaymessage("Incorrect Password");
                return "failed";
            }
        } else {
            return "failed";
        }
    }
}
