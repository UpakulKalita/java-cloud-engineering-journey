package com.upakul.week1.day1.examples;

public class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll no: " + rollNo);
    }

    public static void main(String[] args) {
        Student upakul = new Student("Upakul Kalita", 21);
        upakul.display();
    }
}
