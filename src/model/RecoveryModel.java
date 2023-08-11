package model;

import static DAO.uqueries.*;

public class RecoveryModel {

    private String username;
    private String q1;
    private String q2;
    private String q3;
    private String npwd;
    private String ncpwd;

    // Getter Setter
    public RecoveryModel(String uname, String cpwd, String pwd) {
        username = uname;
        ncpwd = cpwd;
        npwd=pwd;

    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
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

    public String getpwd() {
        return npwd;
    }

    public void setpwd(String pwd) {
        npwd = pwd;
    }

    public String getcpwd() {
        return ncpwd;
    }

    public void setncpwd(String cpwd) {
        ncpwd = cpwd;
    }

    public static boolean usernamevalidation(String var) {
        if (var.equals("") || (var.equals("    Username"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean pwdvalidation(String var) {
        if (var.equals("") || (var.equals("    New Password"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean cpwdvalidation(String var) {
        if (var.equals("") || (var.equals("    Confirm New Password"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean q1validation(String var) {
        if (var.equals("") || (var.equals("    What is your favourite food?"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean q2validation(String var) {
        if (var.equals("") || (var.equals("    What is your hobby?"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean q3validation(String var) {
        if (var.equals("") || (var.equals("    What is your favourite place?"))||var.matches("\\s*")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean samepwd(String var1, String var2) {
        if (var1.equals(var2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int enableq(String var) {
        if (usernamevalidation(var)) {
            if (checkUsernameExists(var)) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    public static int enablereset(String uname, String q1, String q2, String q3) {
        if (q1validation(q1) && q2validation(q2) && q3validation(q3)) {
            if (verifyanswers(uname, q1, q2, q3)) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    public static int reset(String uname, String pwd, String cpwd) {
        if (pwdvalidation(pwd) && cpwdvalidation(cpwd)) {
            if(pwd.length()>=8 && cpwd.length()>=8){
                if (samepwd(pwd, cpwd)) {
                    return 1;
                } else {
                    return -1;
                }
            }else
                return -2;
        } else {
            return 0;
        }
    }
}
