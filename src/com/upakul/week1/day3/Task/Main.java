package com.upakul.week1.day3.Task;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        PhoneBook myNumber = new PhoneBook();

        //Adding
        myNumber.addContact("Upakul", "Kalita", "9365063804");
        myNumber.addContact("Babli", "Dihingia", "123456789");
        myNumber.addContact("Hina", "Dihingia", "9957012889");
        myNumber.addContact("Raj", "Sharma", "7788991234");

        //Searching by Name
        System.out.println("\nSearch by name");
        myNumber.searchByName("Upakul Kalita")
                .ifPresentOrElse(
                        contact -> System.out.println("Found : " + contact),
                        () -> System.out.println("No contacts found for : Upakul Kalita")
        );
        myNumber.searchByName("Naba Sonowal")
                .ifPresentOrElse(
                        contact -> System.out.println("Found: " + contact),
                        () -> System.out.println("No contact found for: Naba Sonowal")
                );

        //Search by Number
        System.out.println("\nSearch by Contact");
        myNumber.searchByNumber("123456789")
                .ifPresentOrElse(
                        contact -> System.out.println("Found: " + contact),
                        () -> System.out.println("No contact found for: 123456789")
                );

        myNumber.searchByNumber("0000000000")
                .ifPresentOrElse(
                        contact -> System.out.println("Found: " + contact),
                        () -> System.out.println("No contact found for: 0000000000")
                );

        //Just Phone Number
        System.out.println("\nGet phone number only");
        String phone = myNumber.searchByName("Raj Sharma")
                .map(contact -> contact.getPhoneNumber())
                .orElse("Number not found");
        System.out.println("Raj's number: " + phone);

        //List sorted
        myNumber.listSortedBySurname();
    }
}
