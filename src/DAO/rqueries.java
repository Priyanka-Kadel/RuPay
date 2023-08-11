package DAO;

import static DAO.cqueries.fillComboBox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class rqueries {

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

    public static int getReceiptNo() {
        int recieptNo = 0;
        String query = "select max(receipt_no) from records";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            if (rs.next() == true) {
                recieptNo = rs.getInt(1);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recieptNo + 1;
    }

    public static String insertData(String name, String mode, String ch_no, String bank, String total, String issue, String fee, String vat, String discount, String remark, String from, String to, String course) {
        String status = "";
        String query = ("INSERT INTO records(name,mode,ch_no,bank,total,issue_date,fee,vat,discount,remark,dfrom,dto,course) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, mode);
            stmt.setString(3, ch_no);
            stmt.setString(4, bank);
            stmt.setString(5, total);
            stmt.setString(6, issue);
            stmt.setString(7, fee);
            stmt.setString(8, vat);
            stmt.setString(9, discount);
            stmt.setString(10, remark);
            stmt.setString(11, from);
            stmt.setString(12, to);
            stmt.setString(13, course);

            int rowCount = stmt.executeUpdate();
            if (rowCount == 1) {
                status = "success";
            } else {
                status = "failed";
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            status = "exception";

        }
        return status;
    }

    public static String updateData(String rec, String name, String mode, String ch_no, String bank, String total, String issue, String fee, String vat, String discount, String remark, String from, String to, String course) {
        String status = "";
        String query = "UPDATE records SET name=?, mode=?, ch_no=?, bank=?, total=?, issue_date=?, fee=?, vat=?, discount=?, remark=?, dfrom=?, dto=?, course=? WHERE receipt_no=?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, mode);
            stmt.setString(3, ch_no);
            stmt.setString(4, bank);
            stmt.setString(5, total);
            stmt.setString(6, issue);
            stmt.setString(7, fee);
            stmt.setString(8, vat);
            stmt.setString(9, discount);
            stmt.setString(10, remark);
            stmt.setString(11, from);
            stmt.setString(12, to);
            stmt.setString(13, course);
            stmt.setInt(14, Integer.parseInt(rec));

            int rowCount = stmt.executeUpdate();
            if (rowCount == 1) {
                status = "success";
            } else {
                status = "failed";
            }
        } catch (Exception e) {
            e.printStackTrace();
            status = "exception";
        }
        return status;
    }

    public static String[] lastrecord() {
        String values[] = new String[14];
        String query = "SELECT * FROM records ORDER BY  receipt_no DESC LIMIT 1";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            ResultSet rs = stmt.executeQuery();
            rs.next();

            values[0] = rs.getString("receipt_no");
            values[1] = rs.getString("mode");
            if (values[1].equals("Cash") || values[1].equals("Online Payment")) {
                values[2] = "-";
                values[3] = "-";
            } else {
                values[2] = rs.getString("ch_no");
                values[3] = rs.getString("bank");
            }

            values[4] = rs.getString("name");
            values[5] = rs.getString("issue_date");

            values[6] = rs.getString("dfrom");
            values[7] = rs.getString("dto");
            values[8] = rs.getString("fee");
            values[9] = rs.getString("vat");
            values[10] = rs.getString("discount");
            values[11] = rs.getString("total");
            values[12] = rs.getString("remark");
            values[13] = rs.getString("course");

            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return values;
    }

    public static String lastID() {
        String val[] = lastrecord();
        return val[0];
    }

    public static List<String[]> fetchRecordData() {
        List<String[]> recordData = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement("SELECT receipt_no, name, course, mode, total, remark FROM records")) {
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getString(i + 1);
                }
                recordData.add(rowData);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recordData;
    }

    public static String convertDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    public static List<String[]> fetchRangeData(String from, String to, String course) {
        List<String[]> recordData = new ArrayList<>();
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement("SELECT receipt_no, name, course, mode, total, remark FROM records WHERE issue_date>=?  AND issue_date<=? AND course=?")) {
            statement.setString(1, from);
            statement.setString(2, to);
            statement.setString(3, course);
            ResultSet resultSet = statement.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (resultSet.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getString(i + 1);
                }
                recordData.add(rowData);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recordData;
    }

    public static int generateReport(String from, String to, String courseName) {
        int sum = 0;
        String query = "SELECT total FROM records WHERE issue_date>=?  AND issue_date<=? AND course = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, from);
            statement.setString(2, to);
            statement.setString(3, courseName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String totalAsString = resultSet.getString("total");
                int total = (int) Double.parseDouble(totalAsString);
                sum += total;
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sum;
    }
     public static Map<String, Integer> getGraphData(String from, String to) {
        Map<String, Integer> courseAmounts = new HashMap<>();
        ArrayList<String> courses = fillComboBox();

        for (String course : courses) {
            int totalAmount = generateReport(from, to, course);
            courseAmounts.put(course, totalAmount);
        }

        return courseAmounts;
    }


}
