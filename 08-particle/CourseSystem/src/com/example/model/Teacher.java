package com.example.model;

public class Teacher extends User{
    public Teacher(String name,String TeacherId){
        super(name,TeacherId);
    }

    public void teachCourse(Course course){
        System.out.println(getName() + "正在教授：" + course.getcourseName());
    }



    @Override
    public void showRole(){
        System.out.println("我是教师:" + getName());
    }

}