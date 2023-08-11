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
        return !(var.equals("") || (var.equals("    Username"))||var.matches("\\s*"));
    }

    public static boolean pwdvalidation(String var) {
        return !(var.equals("") || (var.equals("    Enter Password"))||var.matches("\\s*"));
    }
}
