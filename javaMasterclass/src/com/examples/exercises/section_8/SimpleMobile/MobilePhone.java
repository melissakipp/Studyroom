package com.examples.exercises.section_8.SimpleMobile;

/* Challenge
* Create a program that implements a simple mobile phone with the following capabilities.
* Able to store, modify, remove and query contact names.
* You will want to create a separate class for Contacts (name and phone number).
* Create a master class (MobilePhone) that holds the ArrayList of Contacts
* The MobilePhone class has the functionality listed above.
* Add a menu of options that are available.
* Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
* and search/find contact.
* When adding or updating be sure to check if the contact already exists (use name)
* Be sure not to expose the inner workings of the Arraylist to MobilePhone
* e.g. no ints, no .get(i) etc.
* MobilePhone should do everything with Contact objects only.
* */

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private String myNumber;

    // Initializing new object from the Contact class
    private ArrayList<Contact> myContacts;

    // Constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // Create
    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    // Read
    // Only used within this class 'private'
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    // Overload
    private int findContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact conact = this.myContacts.get(i);
            if(conact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // Method that is allowed access to data in the private methods
    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    // Update
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists. Update was not successful.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    // Delete
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    // Overriding
    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}

class MobilePhoneTestDrive {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("602 672 0225");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("Enter option: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    public static void printActions() {
        System.out.println("\n Available actions: \nPress");
        System.out.println("0 - To shutdown\n" +
                            "1 - To print contacts\n" +
                            "2 - To add a new contact\n" +
                            "3 - To update an exiting contact\n" +
                            "4 - To remove an existing contact" +
                            "5 - query if an existing contact exists\n" +
                            "6 - To print a list of available actions\n");
        System.out.println("Choose your action: ");
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }
}