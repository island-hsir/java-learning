package com.example.model;

public abstract class User{
    private String name;
    private String userId;

    public User (String name,String userId){
        this.name = name;
        this.userId = userId;
    }

    public String getName(){return name;}
    public String getuserId(){return userId;}

    public abstract void showRole();  //抽象方法子类必须实现    
}
