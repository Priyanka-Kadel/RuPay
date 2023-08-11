package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class RegisterModel {

    private String fullname;
    private String username;
    private String pwd;
    private String cpwd;
    private String dob;
    private String contact;
    private String q1;
    private String q2;
    private String q3;
    // Getter Setter
    
    public RegisterModel(String fname,String uname, String pwd,String cpwd, String dob, String cont,String q1,String q2, String q3){
    fullname=fname;
    username=uname;
    this.pwd=pwd;
    this.cpwd=cpwd;    
    this.dob=dob;
    contact=cont;
    this.q1=q1;
    this.q2=q2;
    this.q3=q3;
    }
    public String getfullname() {
        return fullname;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getcpwd() {
        return cpwd;
    }

    public void setcpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public String getdob() {
        return dob;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }

    public String getq1() {
        return q1;
    }

    public void setq1(String q1) {
        this.q1 = q1;
    }

    public String getq2() {
        return q2;
    }

    public void setq2(String q2) {
        this.q2 = q2;
    }

    public String getq3() {
        return q3;
    }

    public void setq3(String q3) {
        this.q3 = q3;
    }

    public static boolean fullnamevalidation(String var) {
        return !(var.equals("") || (var.equals("    Full Name"))||var.matches("\\s*"));
    }

    public static boolean usernamevalidation(String var) {
        return !(var.equals("") || (var.equals("    Username"))||var.matches("\\s*"));
    }

    public static boolean pwdvalidation(String var) {
        return !(var.equals("") || (var.equals("    Enter Password"))||var.matches("\\s*"));
    }

    public static boolean cpwdvalidation(String var) {
        return !(var.equals("") || (var.equals("    Confirm Password"))||var.matches("\\s*"));
    }

    public static boolean dobvalidation(String var) {
        return !var.equals("    Date Of Birth");
    }

    public static boolean contactvalidation(String var) {
        return !(var.equals("") || (var.equals("    Contact No."))||var.matches("\\s*"));
    }

    public static boolean q1validation(String var) {
        return !(var.equals("") || (var.equals("    What is your favourite food?"))||var.matches("\\s*"));
    }

    public static boolean q2validation(String var) {
        return !(var.equals("") || (var.equals("    What is your hobby?"))||var.matches("\\s*"));
    }

    public static boolean q3validation(String var) {
        return !(var.equals("") || (var.equals("    What is your favourite place?"))||var.matches("\\s*"));
    }

    public static boolean samepwd(String var1, String var2) {
        return var1.equals(var2);
    }
    
public static boolean isOlderThan18(String dob) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate dateOfBirth = LocalDate.parse(dob, formatter);
    LocalDate currentDate = LocalDate.now();
    int age = currentDate.getYear() - dateOfBirth.getYear();
    return age >= 18;
}


}
