package view.frames;

import Controller.LoginController;

public class LoginMain {
    public static void main(String[] args) {
        Login_Frame view= new Login_Frame();
        LoginController lcontroller= new LoginController(view);
        view.setVisible(true);
    }
}