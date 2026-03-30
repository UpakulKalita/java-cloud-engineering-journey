package com.upakul.week1.day2.PhoneBook;

import java.util.*;

public class PhoneBook {

    //Insertion order
    private List<Contact> contacts = new ArrayList<>();

    //Instant lookup by full name
    private Map<String, Contact> byName = new HashMap<>();

    //Instant lookup by phone number
    private Map<String, Contact> byNumber = new HashMap<>();

    //ADD
    public void addContact(String firstName, String lastName, String number){
        Contact contact = new Contact(firstName, lastName, number);
        contacts.add(contact);
        byName.put(firstName + " " + lastName, contact);
        byNumber.put(number, contact);
        System.out.println("Added: " + contact);
    }

    //Search by name
    public void searchByName(String fullName){
        Contact found = byName.get(fullName);
        if(found != null){
            System.out.println("Found : " + found);
        }else {
            System.out.println("No contact found for "+ fullName);
        }
    }

    //Search by Contact
    public void searchByNumber(String number){
        Contact found = byNumber.get(number);
        if (found != null){
            System.out.println("Found : " + found);
        }else {
            System.out.println("No Person found for - " + number);
        }
    }

    //Delete Contact
    public void deleteContact(String fullName){
        Contact contact = byName.get(fullName);
         if (contact != null) {
            contacts.remove(contact);
            byName.remove(fullName);
            byNumber.remove(contact.getPhoneNumber());
             System.out.println("Deleted " + contact);
         }else {
             System.out.println("No Contact found for " + fullName);
         }
    }

    // List Sorted by Order
    public void listSortedBySurname() {
        TreeMap<String, Contact> sorted = new TreeMap<>();
        for (Contact contact : contacts) {
            sorted.put(contact.getLastName() + contact.getFirstName(), contact);
        }
        System.out.println("\n--- Contacts sorted by surname ---");
        for (Map.Entry<String, Contact> entry : sorted.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
