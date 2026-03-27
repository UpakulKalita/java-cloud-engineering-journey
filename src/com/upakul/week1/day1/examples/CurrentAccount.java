package com.upakul.week1.day1.examples;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, int balance) {
        super(accountNumber, balance);
    }

    //Withdraw money from bank
    void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn : " + amount);
        }else {
            System.out.println("Insufficient Balance");
        }
        checkBalance();
    }

    public static void main(String[] args) {
        CurrentAccount ca = new CurrentAccount(936506, 96000);
        ca.withdraw(6000);
        ca.withdraw(10000000);
    }
}
