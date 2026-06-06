package com.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
        String user = "COURSE_SYSTEM";
        String password = "123456";
        Class.forName("oracle.jdbc.OracleDriver");
        try (Connection conn = DriverManager.getConnection(url,user,password)){
                System.out.println("连接成功！");
        }catch(SQLException e){
            System.out.println("连接失败！" + e.getMessage());
        }
    }
}
