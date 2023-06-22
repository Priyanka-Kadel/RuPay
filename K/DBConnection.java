/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.frames;


import java.sql.DriverManager;
import java.sql.Connection;


/**
 *
 * @author User
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection con=null;
        try {
            Class.forName("org.sqlite.JDBC");
             con = DriverManager.getConnection("jdbc:sqlite:E:\\RuPay\\RuPay\\src\\Controller\\rupaydb.db");
             
        } catch (Exception e) {
            e.printStackTrace();
        }
     return con;
    } 
}
