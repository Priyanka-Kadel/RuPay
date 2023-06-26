/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class UserModel {
    

    private String fname;
    private String uname;
    private String pwd;
    private String cpwd;
    private String dob;
    private String cont_no;
    private String q1;
    private String q2;
    private String q3;

    public UserModel(String fname, String uname, String pwd,String cpwd, String dob, String cont_no, String q1, String q2, String q3) {
        this.fname = fname;
        this.uname = uname;
        this.pwd = pwd;
        this.cpwd=cpwd;
        this.dob = dob;
        this.cont_no = cont_no;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
    }

    public boolean validateInput() {
        if (fname.isEmpty() || uname.isEmpty() || pwd.isEmpty() || cpwd.isEmpty() || dob.isEmpty() ||
                cont_no.isEmpty() || q1.isEmpty() || q2.isEmpty() || q3.isEmpty()) {
            return false;
        } else if (!pwd.equals(cpwd)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean saveToDatabase() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\RuPay\\src\\Controller\\rupaydb.db");
            String sql = "INSERT INTO signup(fname, uname, pwd, dob, cont_no, q1, q2, q3) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, fname);
            stmt.setString(2, uname);
            stmt.setString(3, pwd);
            stmt.setString(4, dob);
            stmt.setString(5, cont_no);
            stmt.setString(6, q1);
            stmt.setString(7, q2);
            stmt.setString(8, q3);

            int rowsInserted = stmt.executeUpdate();

            stmt.close();
            conn.close();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clearFields() {
        fname = "";
        uname = "";
        pwd = "";
        dob = "";
        cont_no = "";
        q1 = "";
        q2 = "";
        q3 = "";
    }

    // Getters and setters

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCont_no() {
        return cont_no;
    }

    public void setCont_no(String cont_no) {
        this.cont_no = cont_no;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }
    
}
