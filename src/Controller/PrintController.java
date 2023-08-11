package Controller;

import model.PrintModel;
import view.frames.Print_Receipt;

public class PrintController {

    private PrintModel rmodel;
    private Print_Receipt view;

    public PrintController(PrintModel rmodel, Print_Receipt view) {
        this.rmodel = rmodel;
        this.view = view;
    }

    public PrintController(Print_Receipt view) {
        this.view = view;
    }
}
