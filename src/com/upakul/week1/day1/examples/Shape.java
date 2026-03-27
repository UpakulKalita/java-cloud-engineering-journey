package com.upakul.week1.day1.examples;

public class Shape {
    void draw(){
        System.out.println("Can be drawn using pen/pencil");
    }

    class Circle extends Shape{

        @Override
        void draw() {
            System.out.println("Has radius");
        }
    }

    static class Rectangle extends Shape{

        void draw(){
            System.out.println("Has 4 equal sides");
        }
    }

    public static void main(String[] args) {
        Rectangle newShape = new Rectangle();
        newShape.draw();
    }
}
