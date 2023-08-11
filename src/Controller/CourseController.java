package Controller;

import model.CourseModel;
import view.frames.Courses;
import DAO.cqueries;
import static model.CourseModel.*;

public class CourseController {

    private CourseModel cmodel;
    private Courses view;

    public CourseController(CourseModel cmodel, Courses view) {
        this.cmodel = cmodel;
        this.view = view;
    }

    public CourseController(Courses view) {
        this.view = view;
    }

    public void addCourse() {
        if (isValid()) {
            cqueries.addCourse(cmodel.getCname(), cmodel.getCfee());
            view.displaymessage("Course added successfully");
            view.clearfields();
        }
        view.updateTable();
    }

    public void removeCourse() {
        cqueries.removeCourse(cmodel.getcID());
        view.displaymessage("Course removed successfully");
        view.clearfields();
        view.updateTable();

    }

    public void updateCourse() {
        if (cnameValidation(cmodel.getCname()) && cfeeValidation(cmodel.getCfee())) {
            cqueries.updateCourse(Integer.parseInt(cmodel.getcID()), cmodel.getCname(), cmodel.getCfee());
            view.displaymessage("Course updated successfully");
            view.updateTable();
            view.clearfields();
        } else {
            view.displaymessage("One or more filds invalid");
        }
    }

    public boolean isValid() {
        if (!cnameValidation(cmodel.getCname())) {
            view.displaymessage("Please enter valid Course name");
            return false;
        }
        if (!cfeeValidation(cmodel.getCfee())) {
            view.displaymessage("Please enter valid Course fee");
            return false;
        }
        if (checkcourse(cmodel.getCname())) {
            view.displaymessage("Course already exists. Use update");
            return false;
        }
        return true;
    }
}
