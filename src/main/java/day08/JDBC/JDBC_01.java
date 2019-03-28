package day08.JDBC;



import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_01 {
        private static final String URL="jdbc:mysql://127.0.0.1:3306";
        private static final String user="root";
        private static final String password="mysql";

    public static void main(String[] args)throws Exception {
        new Driver();

        Connection connection = DriverManager.getConnection(URL,user,password);

        String sql = "insert into test.test value (null, ?, md5(?))";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Jerry");
        preparedStatement.setString(2, "456");
        // 4.1 p.executeUpdate(); // DML
        preparedStatement.executeUpdate();
        // 4.2 p.executeQuery(); // DQL
        // 5. *.close();
        preparedStatement.close();
        connection.close();
        System.out.println("done.");
    }
    }