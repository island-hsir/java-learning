package com.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";
        String user = "COURSE_SYSTEM";
        String password = "123456";

        //建立连接
        try (Connection conn = DriverManager.getConnection(url,user,password)){
            //写入SQL语句，用?作为占位符
            String sql = "INSERT INTO STUDENTS (STUDENT_ID,NAME) VALUES(?,?)";


            //创建 PreparedStatement 并设置参数
            try (PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1,"00100");
                ps.setString(2,"陈华");


            //执行更新，返回受影响行数

            int rows = ps.executeUpdate();
            System.out.println("插入了" +  rows +"行");
            }
            }catch(SQLException e){
                e.printStackTrace();
        }
    }
}
