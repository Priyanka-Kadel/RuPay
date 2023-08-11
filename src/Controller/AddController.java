package Controller;

import model.AddModel;
import view.frames.Add_fees;
import view.frames.Print_Receipt;
import static DAO.rqueries.lastID;
import DAO.rqueries;

public class AddController {

    private AddModel amodel;
    private Add_fees view;
    private Print_Receipt view1;

    public AddController(AddModel lmodel, Add_fees view, Print_Receipt view1) {
        this.amodel = lmodel;
        this.view = view;
        this.view1 = view1;
    }

    public AddController(Add_fees view) {
        this.view = view;
    }

    public String addinfo() {
        if (view.validation()) {
            if (lastID() == null || !lastID().equals(amodel.getRec())) {

                rqueries.insertData(
                        amodel.getReceive(),
                        amodel.getMode(),
                        amodel.getCh_no(),
                        amodel.getBank(),
                        amodel.getTotal(),
                        amodel.getIssue(),
                        amodel.getFee(),
                        amodel.getVat(),
                        amodel.getDiscount(),
                        amodel.getRemarks(),
                        amodel.getFrom(),
                        amodel.getTo(),
                        amodel.getCourse()
                );
                view.displaymessage("Record insertion Successful.");
                return "insert";

            } else{
                rqueries.updateData(
                        amodel.getRec(),
                        amodel.getReceive(),
                        amodel.getMode(),
                        amodel.getCh_no(),
                        amodel.getBank(),
                        amodel.getTotal(),
                        amodel.getIssue(),
                        amodel.getFee(),
                        amodel.getVat(),
                        amodel.getDiscount(),
                        amodel.getRemarks(),
                        amodel.getFrom(),
                        amodel.getTo(),
                        amodel.getCourse()
                );
                view.displaymessage("Record updated Successfully.");
                return "update";
            }
        }
        return null;
    }
}
