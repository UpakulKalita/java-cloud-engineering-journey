package com.upakul.week1.day1.examples;

public class FullTimeEmployee extends Employee{
    //Fixed monthly salary

    int monthlySalary;

    FullTimeEmployee(int salary, int monthlySalary){
        super(salary);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary(){
        System.out.println("Full time salary : " + monthlySalary);
    }

}
