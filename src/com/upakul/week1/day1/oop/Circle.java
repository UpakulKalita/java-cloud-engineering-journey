package com.upakul.week1.day1.oop;

public class Circle extends Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area  = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void calculatePerimeter() {
        double perimeter =  2 * Math.PI * radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}
