package model;

import static DAO.uqueries.validatePassword;
import static DAO.uqueries.checkUsernameExists;

public class AccModel {

    private String uname;
    private String ecpwd;
    private String enpwd;
    private String encpwd;
    private String pwd;

    public AccModel(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }

    public AccModel(String uname, String ecpwd, String enpwd, String encpwd) {
        this.uname = uname;
        this.ecpwd = ecpwd;
        this.enpwd = enpwd;
        this.encpwd = encpwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEcpwd() {
        return ecpwd;
    }

    public void setEcpwd(String ecpwd) {
        this.ecpwd = ecpwd;
    }

    public String getEnpwd() {
        return enpwd;
    }

    public void setEnpwd(String enpwd) {
        this.enpwd = enpwd;
    }

    public String getEncpwd() {
        return encpwd;
    }

    public void setEncpwd(String encpwd) {
        this.encpwd = encpwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static boolean checkempty(String var) {
        return !(var.equals("") || var.matches("\\s*"));
    }

    public static boolean samepwd(String var1, String var2) {
        return var1.equals(var2);
    }

    public static String updateisValid(String uname, String pwd1, String pwd2, String pwd3) {
        if (!checkempty(uname) || !checkempty(pwd1) || !checkempty(pwd2) || !checkempty(pwd3)) {
            return "empty";
        }
        if (!checkUsernameExists(uname)) {
            return "incorrect";
        }
        if (!validatePassword(uname, pwd1)) {
            return "incorrect";
        }
        if (pwd2.length() < 8 || pwd3.length() < 8) {
            return "length";
        }
        if (!samepwd(pwd2, pwd3)) {
            return "different";
        }
        return "valid";
    }

    public static String deleteisValid(String uname, String pwd) {
        if (!checkempty(uname) || !checkempty(pwd)) {
            return "empty";
        }
        if (!checkUsernameExists(uname)) {
            return "incorrect";
        }
        if (!validatePassword(uname, pwd)) {
            return "incorrect";
        }
        return "valid";
    }
}
