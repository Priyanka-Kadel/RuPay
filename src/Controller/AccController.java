package Controller;

import model.AccModel;
import view.frames.Account_Settings;
import DAO.uqueries;

public class AccController {

    private AccModel amodel;
    private Account_Settings view;

    public AccController(AccModel lmodel, Account_Settings view) {
        this.amodel = lmodel;
        this.view = view;
    }

    public void update() {
        switch (amodel.updateisValid(amodel.getUname(), amodel.getEcpwd(), amodel.getEnpwd(), amodel.getEncpwd())) {
            case "empty" ->
                view.displaymessage("One or more fields empty.");
            case "different" ->
                view.displaymessage("New Passwords don't match. Try again");
            case "incorrect" ->
                view.displaymessage("Invalid username/password");
            case "length" ->
                view.displaymessage("Password must be 8 characters long");
            default -> {
                uqueries.updatePassword(amodel.getUname(), amodel.getEncpwd());
                view.displaymessage("Password updated Successfully");
                view.dispose();
            }
        }

    }

    public int delete() {
        switch (amodel.deleteisValid(amodel.getUname(), amodel.getPwd())) {
            case "empty":
                view.displaymessage("One or more fields empty.");
                return -1;
            case "incorrect":
                view.displaymessage("Invalid username/password");
                return -1;
            default:
                uqueries.deleteAcc(amodel.getUname());
                view.displaymessage("Account deleted successfully.");
                view.dispose();
                return 0;
        }
    }
}
