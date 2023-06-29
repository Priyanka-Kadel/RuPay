package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class queries {

    private static Connection getConnection() {
        Connection connection = null;
        try {
            String url = "jdbc:sqlite:rupaydb.db";
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
        return connection;
    }

    public static boolean checkUsernameExists(String uname) {
        String query = "SELECT COUNT(*) FROM signup WHERE uname = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, uname);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checkContactNoExists(String cont_no) {
        String query = "SELECT COUNT(*) FROM signup WHERE cont_no = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cont_no);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean saveToDatabase(String fullname, String username, String pwd, String dob, String contact, String q1, String q2, String q3) {
        try (Connection conn = getConnection()) {
            String insertquery = "INSERT INTO signup (fname, uname, pwd, dob, cont_no, q1, q2, q3) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insertquery);
            stmt.setString(1, fullname);
            stmt.setString(2, username);
            stmt.setString(3, pwd);
            stmt.setString(4, dob);
            stmt.setString(5, contact);
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
    public static boolean verifyLogin(String username, String password) {
        String query = "SELECT COUNT(*) FROM signup WHERE uname = ? AND pwd = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            statement.setString(2, password);
            
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error verifying login: " + e.getMessage());
        }
        
        return false;
    }

    public static boolean verifyanswers(String username, String q1, String q2, String q3) {
        try {

            Connection connection = getConnection();
            String query = "SELECT q1, q2, q3 FROM signup WHERE uname = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                String dbQ1 = resultSet.getString("q1");
                String dbQ2 = resultSet.getString("q2");
                String dbQ3 = resultSet.getString("q3");
                
                boolean match = q1.equals(dbQ1) && q2.equals(dbQ2) && q3.equals(dbQ3);
                
                resultSet.close();
                statement.close();
                connection.close();
                return match;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
    public static boolean updatePassword(String uname, String newPassword) {
    try (Connection connection = getConnection()) {
        String updateQuery = "UPDATE signup SET pwd = ? WHERE uname = ?";
        PreparedStatement statement = connection.prepareStatement(updateQuery);
        statement.setString(1, newPassword);
        statement.setString(2, uname);
        int rowsUpdated = statement.executeUpdate();

        return rowsUpdated > 0;
    } catch (SQLException e) {
        System.out.println("Error updating password: " + e.getMessage());
        return false;
    }
    }
}