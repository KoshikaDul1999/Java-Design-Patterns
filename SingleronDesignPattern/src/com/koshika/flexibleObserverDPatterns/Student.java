package com.koshika.flexibleObserverDPatterns;

public class Student implements StudentObserver{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("I.m " + this.name + " I got the message " + message);
    }
}
