package com.examples.exercises.section_8.SimpleMobile;

public class Contact {

    // Instance variables
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters


    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /*
    We want to expose a public static method, so that we can create a new contact record.
    Static is the important thing here, because that means that we don't have to create
    a new object instance for this contact class.
    */
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}
