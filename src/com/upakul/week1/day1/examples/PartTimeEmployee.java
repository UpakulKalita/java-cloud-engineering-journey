package com.upakul.week1.day1.examples;

public class PartTimeEmployee extends Employee{

    int hoursWorked, ratePerHour;
    PartTimeEmployee(int salary, int hoursWorked, int ratePerHour){
        super(salary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    void calculateSalary(){
        salary = hoursWorked * ratePerHour;
        System.out.println("Part time salary : " + salary);
    }



}
