package com.upakul.week1.day1.examples;

public class SavingsAccount extends BankAccount {

        SavingsAccount(int accountNumber, int balance){
                super(accountNumber, balance);
        }

        void addInterest(int amount){
                int interest = balance * amount / 100;
                balance += interest;
                System.out.println("Interest added: " + interest);
        }

}
