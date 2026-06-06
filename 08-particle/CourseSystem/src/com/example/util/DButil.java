package com.example.util;
import java.sql.*;

public class DButil {
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
    private static final String USER = "COURSE_SYSTEM";
    private static final String PASSWPRD = "123456";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWPRD);
    }
}
