package com.upakul.week1.day1.examples;

public class Cat {
    void sound(){
        System.out.println("Cat meows.");   //overriding
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
    }
}
