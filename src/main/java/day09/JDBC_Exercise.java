package day09;

import day08.JDBC.MySqlCommandLine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class JDBC_Exercise {
    private static final String URL = "jdbc:mysql:///";
    private static final String user = "root";
    private static final String password = "mysql";
    private static Connection conn = null;
    private static PreparedStatement pre = null;
    private static Scanner scanner;


    public JDBC_Exercise() {
        scanner = new Scanner(System.in);

    }


    public static void main(String[] args) {
        JDBC_Exercise jdbc_exercise = new JDBC_Exercise();
//        String sql = jdbc_exercise;
    }











}
