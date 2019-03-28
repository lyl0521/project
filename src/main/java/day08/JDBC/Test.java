package day08.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    // JDBC driver name and database URL
    static final String URL = "jdbc:mysql://127.0.0.1:3306/";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating database...");
            stmt = conn.createStatement();

            String sql = "CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);

            System.out.println("Database created ...");
        } catch(Exception se){
            //Handle errors for JDBC
            se.printStackTrace();
        }//Handle errors for Class.forName
        finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try

//      create table
//        try {
//            stmt.getConnection();
//            System.out.println("Create table....");
//            String sql = "create table students.class(cno int auto_increment primary key ,cname varchar(20),leader varchar(20))";
//            stmt.executeUpdate(sql);
//            System.out.println("table created...");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
