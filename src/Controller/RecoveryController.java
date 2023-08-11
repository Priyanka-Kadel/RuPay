package Controller;

import static DAO.uqueries.updatePassword;
import static model.RecoveryModel.reset;
import Controller.LoginController;
import view.frames.Login_Frame;
import model.RecoveryModel;
import view.frames.Recovery;

public class RecoveryController {

    private RecoveryModel rmodel;
    private Recovery view;

    public RecoveryController(RecoveryModel rmodel, Recovery view) {
        this.rmodel = rmodel;
        this.view = view;
    }

    public RecoveryController(Recovery view) {
        this.view = view;
    }

    public void resetuser() {
        switch (reset(rmodel.getusername(), rmodel.getpwd(), rmodel.getcpwd())) {
            case 1:
                updatePassword(rmodel.getusername(), rmodel.getcpwd());
                view.displaymessage("Password reset Successful");
                Login_Frame lview = new Login_Frame();
                view.dispose();
                lview.setVisible(true);

                break;
            case -1:
                view.displaymessage("Passwords don't match.Try again");
                break;
            case -2:
                view.displaymessage("Passwords length must be 8 characters long");
                break;
            case 0:
                view.displaymessage("One or more fields are empty.");
                break;
        }
    }
}
