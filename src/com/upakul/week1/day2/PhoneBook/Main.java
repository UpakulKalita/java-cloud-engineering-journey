package com.upakul.week1.day2.PhoneBook;

public class Main {
    public static void main(String[] args) {
        PhoneBook myNumber = new PhoneBook();

        //Adding
        myNumber.addContact("Upakul", "Kalita", "9365063804");
        myNumber.addContact("Babli", "Dihingia", "123456789");
        myNumber.addContact("Hina", "Dihingia", "9957012889");
        myNumber.addContact("Raj", "Sharma", "7788991234");

        //Searching by Name
        myNumber.searchByName("Upakul Kalita");
        myNumber.searchByNumber("HDFC");

        //Search by Number
        myNumber.searchByNumber("123456789");
        myNumber.searchByNumber("998764123");

        //List all
        myNumber.listSortedBySurname();

        //delete
        myNumber.deleteContact("Upakul Kalita");

        //List all
        myNumber.listSortedBySurname();
    }
}
