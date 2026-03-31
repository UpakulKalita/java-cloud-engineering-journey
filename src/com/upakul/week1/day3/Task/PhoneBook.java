package com.upakul.week1.day3.Task;

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
    public Optional<Contact> searchByName(String fullName){
        return Optional.ofNullable(byName.get(fullName));
    }

    //Search by Contact
    public Optional<Contact> searchByNumber(String number) {
        return Optional.ofNullable(byNumber.get(number));
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
        List<Contact> sorted = new ArrayList<>(contacts);
        sorted.sort(Comparator.comparing(Contact::getLastName).thenComparing(Contact::getFirstName)
        );
        System.out.println("\nContacts sorted by surname");
        for (Contact contact : sorted){
            System.out.println(contact);
        }
    }
}
