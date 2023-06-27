package Controller;

import model.RegisterModel;
import view.frames.Signup_Frame;
import DataAccess.dbaccess;

public class RegisterController {

    private RegisterModel rmodel;
    private Signup_Frame view;

    public RegisterController(RegisterModel rmodel, Signup_Frame view) {
        this.rmodel = rmodel;
        this.view = view;
    }

    public RegisterController(Signup_Frame view) {
        this.view = view;
    }

    public void registeruser() {
        if (view.isvalid()) {
            dbaccess.saveToDatabase(
                    rmodel.getfullname(),
                    rmodel.getusername(),
                    rmodel.getpwd(),
                    rmodel.getdob(),
                    rmodel.getcontact(),
                    rmodel.getq1(),
                    rmodel.getq2(),
                    rmodel.getq3());
            view.displaymessage("Successfully Registered");
            view.clearfields();
        }
    }
}
