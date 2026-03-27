package com.upakul.week1.day1.oop;

public class Triangle  extends Shape{
    int side;
    int perimeter;

    Triangle(int side){
        this.side = side;
//        this.perimeter = perimeter;
    }

    @Override
    void calculateArea() {
        double area = (Math.sqrt(3) / 4) * side * side;
        System.out.println("Area of the triangle: " + area);
    }

    @Override
    void calculatePerimeter() {
        perimeter = side + side + side;
        System.out.println("Perimeter of the tringle: " + perimeter);
    }
}
