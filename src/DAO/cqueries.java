package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSetMetaData;

public class cqueries {

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

    public static void resetAutoIncrement(String tableName) {
        try (Connection conn = getConnection(); PreparedStatement pstmtMax = conn.prepareStatement("SELECT MAX(id) FROM " + tableName); PreparedStatement pstmtUpdate = conn.prepareStatement("UPDATE SQLITE_SEQUENCE SET seq = ? WHERE name = ?")) {

            int maxId = 0;
            try (ResultSet rs = pstmtMax.executeQuery()) {
                if (rs.next()) {
                    maxId = rs.getInt(1);
                }
            }

            pstmtUpdate.setInt(1, maxId);
            pstmtUpdate.setString(2, tableName);
            pstmtUpdate.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error resetting auto-increment: " + e.getMessage());
        }
    }

    public static ArrayList fillComboBox() {
        ArrayList<String> courses = new ArrayList<>();
        String query = "select course from course";
        try (Connection connection = getConnection(); PreparedStatement pst = connection.prepareStatement(query)) {
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                courses.add(rs.getString("course"));
            }

            pst.close();
            return courses;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<String[]> fetchCourseData() {
        resetAutoIncrement("course");
        List<String[]> courseData = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement("SELECT * FROM course")) {
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getString(i + 1);
                }
                courseData.add(rowData);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return courseData;
    }

    public static int getCost(String courseName) {
        int cost = 0;
        String query = "SELECT Amount FROM course WHERE course = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, courseName);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                cost = resultSet.getInt("Amount");
            }
            resultSet.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cost;
    }

    public static void addCourse(String courseName, String courseAmt) {
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement("INSERT INTO course (course, Amount) VALUES (?, ?)")) {
            statement.setString(1, courseName);
            statement.setString(2, courseAmt);
            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resetAutoIncrement("course");
    }

    public static void removeCourse(String courseid) {
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement("DELETE FROM course WHERE id=?")) {
            statement.setString(1, courseid);
            statement.executeUpdate();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resetAutoIncrement("course");
    }

    public static void updateCourse(int courseId, String courseName, String courseAmt) {
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(
                "UPDATE course SET course = ?, Amount = ?  WHERE id = ?")) {
            statement.setString(1, courseName);
            statement.setString(2, courseAmt);
            statement.setInt(3, courseId);
            statement.executeUpdate();

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkCourseExists(String var) {
        String query = "SELECT COUNT(*) FROM course WHERE course = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, var);
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
}
