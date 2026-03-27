package com.upakul.week1.day1.oop;

public class Main {
    public static void main(String[] args) {

        Shape myCircle = new Circle( 15);
        myCircle.calculateArea();
        myCircle.calculatePerimeter();

        Shape myRectangle = new Rectangle( 5, 6);
        myRectangle.calculatePerimeter();
        myRectangle.calculateArea();

        Shape myTriangle = new Triangle(5);
        myTriangle.calculateArea();
        myTriangle.calculatePerimeter();
    }
}
