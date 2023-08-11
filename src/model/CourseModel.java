package model;

import static DAO.cqueries.checkCourseExists;

public class CourseModel {

    private String cID;
    private String cname;
    private String cfee;

    public CourseModel(String cID, String cname, String cfee) {
        this.cID = cID;
        this.cname = cname;
        this.cfee = cfee;
    }

    public String getcID() {
        return cID;
    }

    public void setcID(String cID) {
        this.cID = cID;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCfee() {
        return cfee;
    }

    public void setCfee(String cfee) {
        this.cfee = cfee;
    }

    public static boolean cnameValidation(String var) {
        return !(var.equals("") || var.equals("\\s*"));
    }

    public static boolean cfeeValidation(String var) {
        return !(var.equals("") || var.equals("\\s*") || var.matches("[0-9]+") == false);
    }

    public static boolean checkcourse(String var) {
        return checkCourseExists(var);
    }
}
