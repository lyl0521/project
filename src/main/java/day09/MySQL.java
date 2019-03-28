package day09;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class MySQL {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306";
    private static final String user = "root";
    private static final String password = "mysql";
    private Connection conn = null;
    private PreparedStatement prst = null;
    private static Scanner scanner;
    private ResultSet rs;
    private static SimpleDateFormat simpleDateFormate;


    public MySQL() {
        scanner = new Scanner(System.in);
        getconn();
        simpleDateFormate = new SimpleDateFormat("[YYYY-MM-dd HH:mm:ss] ");
    }

    public Connection getconn() {
        if (conn == null) {
            try {
                new Driver();
                conn = DriverManager.getConnection(URL, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public void update(String sql) {
        try {
            long start = System.currentTimeMillis();
            prst = conn.prepareStatement(sql);
            int rowAffecttd = prst.executeUpdate();
            long end = System.currentTimeMillis();

            System.out.print(simpleDateFormate.format(end));
            System.out.println(rowAffecttd + " row affected in" + (end - start) + "ms");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void query(String sql) throws SQLException {
        try {
            prst = conn.prepareStatement(sql);
            rs = prst.executeQuery();
            ResultSetMetaData resultSetMetaData = rs.getMetaData(); // 元数据
//                System.out.println(resultSetMetaData.getColumnCount());            // 3
//                System.out.println(resultSetMetaData.getColumnClassName(1));       // java.lang.Integer
//                System.out.println(resultSetMetaData.getColumnDisplaySize(1));     // 11
//                System.out.println(resultSetMetaData.getColumnLabel(1));           // id
//                System.out.println(resultSetMetaData.getColumnName(1));            // id
//                System.out.println(resultSetMetaData.getColumnType(1));            // 4
//                System.out.println(resultSetMetaData.getColumnTypeName(1));        // INT
            int columnCount = resultSetMetaData.getColumnCount();
            for (int i = 0; i < columnCount; i++) {
                System.out.print(resultSetMetaData.getColumnLabel(i + 1) + " ");
            }
            System.out.println("\n----------------------");
            while (rs.next()) {
                // TODO: 2019/3/27
//               getColumnCount()方法 索引从1开始    如果循环从1开始会跳过第一个值    从第二列开始
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    System.out.print(rs.getString(i + 1) + " ");    // i 从0开始，如果不加1少最后一列
                }
                System.out.println();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }finally {
            prst.close();

        }
    }
//
//    public void insert(String sql) {
//        try {
//            long start = System.currentTimeMillis();
//
//            prst = conn.prepareStatement(sql);
////            prst.addBatch(sql);
//            prst.executeUpdate(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }


    public void dispatch(String sql) throws SQLException {
        if (sql.toLowerCase().trim().startsWith("select")) {
            query(sql);
        }
        else {
            update(sql);
        }
    }

    public String getSQL() {
        System.out.print("mysql> ");
    String line = scanner.nextLine();
    StringBuilder sql = new StringBuilder(line);
        while (!line.endsWith(";")) {
        System.out.print("    -> ");
        line = scanner.nextLine();
        sql.append(line);
    }
        return sql.toString();
}

    public static void main(String[] args) throws SQLException {
        MySQL mySqlCommandLine = new MySQL();
        String sql = mySqlCommandLine.getSQL();
        while (!sql.equalsIgnoreCase("quit")) {
            mySqlCommandLine.dispatch(sql);
            sql = mySqlCommandLine.getSQL();
        }
    }
}
