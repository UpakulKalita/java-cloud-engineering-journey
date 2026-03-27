package com.upakul.week1.day1.examples;

public class BankAccount {
    int accountNumber;
    int balance;

    BankAccount(int accountNumber, int balance){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    //Deposit money to bank
    void deposit(int amount){
        balance += amount;
        System.out.println("Deposited amount : " + amount);
    }

    //Check Balance
    void checkBalance(){
        System.out.println("Current Balance : " + balance);
    }

    // Display Details
    void displayDetails() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

    }
}
