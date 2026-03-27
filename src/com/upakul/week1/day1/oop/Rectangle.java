package com.upakul.week1.day1.oop;

public class Rectangle extends Shape{

    private int length, breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of the Rectangle: " + area);
    }

    @Override
    void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
    }
}
