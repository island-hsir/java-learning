package com.example.exception;

public class DuplicateCourseException extends Exception{
    public DuplicateCourseException(String msg){
        super(msg);
    }
}
