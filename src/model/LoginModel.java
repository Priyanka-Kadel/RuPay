package model;

public class LoginModel { 
    private String username;
    private String pwd;
    
// Getter Setter    
    public LoginModel(String uname, String pwd){

    username=uname;
    this.pwd=pwd;

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

    public static boolean usernamevalidation(String var) {
        if (var.equals("") || (var.equals("    Username"))) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean pwdvalidation(String var) {
        if (var.equals("") || (var.equals("    Enter Password"))) {
            return false;
        } else {
            return true;
        }
    }
}
