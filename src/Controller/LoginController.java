package Controller;

import model.LoginModel;
import view.frames.Login_Frame;
import DataAccess.dbaccess;

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

    public void verifyuser() {
        if (view.isvalid()) {
            if (dbaccess.verifyLogin(lmodel.getusername(), lmodel.getpwd())) {
                view.displaymessage("Login Successful");
            } else {
                view.displaymessage("Incorrect Password");
            }
        }
    }
}
