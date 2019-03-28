package day08.JDBC;

import java.sql.*;

public class JDBC_03 {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private static final String user = "root";
    private static final String password = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null ;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection to database...");

            conn = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection databsae successful....");
            stmt = conn.createStatement();

            String sql = "insert into students.class values (null,?,?)";
            PreparedStatement pre = conn.prepareStatement(sql);
            pre.setString(1,"Class1");
            pre.setString(2,"TOM");
            pre.executeUpdate();
            pre.close();
            conn.close();
            stmt.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
