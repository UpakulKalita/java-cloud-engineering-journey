package com.upakul.week1.day1.examples;

public class Car extends Vehicle{
    Car(String brand, int speed){
        super(brand, speed);
    }

    void displayDetails(){
        System.out.println("Brand : " + brand);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Upakul", 120);
        myCar.displayDetails();
    }
}
