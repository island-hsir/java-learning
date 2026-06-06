package com.example.dao;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.example.model.Student;
import com.example.util.DButil;


public class StudentDao {
    public void addStudent(Student s) throws SQLException{
        String sql = "INSERT INTO STUDENTS(STUDENT_ID,NAME) VALUES(?,?)";
        try (Connection conn = DButil.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1,s.getuserId());
                ps.setString(2,s.getName());
                ps.executeUpdate();
            }
    }
    
    public void deleteAll() throws SQLException{
        String sql = "DELETE FROM STUDENTS";
        try (Connection conn = DButil.getConnection();
             Statement stmt = conn.createStatement()){
            stmt.executeUpdate(sql);
        }
    }

    public List<Student> findAll() throws SQLException{
        List<Student> list = new ArrayList<>();
        String sql = "SELECT STUDENT_ID,NAME FROM STUDENTS";
        try (Connection conn = DButil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)){
                while(rs.next()){
                    String id = rs.getString("STUDENT_ID");
                    String name = rs.getString("NAME");
                    list.add(new Student(name, id));
                }
             }
             return list;
    }
}
