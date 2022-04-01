package com.examples.exercises.section_8;

import java.util.ArrayList;

import static com.examples.exercises.section_8.LinkedList.*;

public class LinkedList<S> {

    public static void firstLinkedListEX() {
        // Create/initialize
        Customer customer = new Customer("Tim", 54.96);
        // Create another customer
        Customer anotherCustomer;
        // Assigned first customer to second customer
        anotherCustomer = customer;
        // Changed the second balance which will change the first customer.
        // Reference Type
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        // output "Balance for customer Tim is 12.18"
    }

    public static void arrayOfNumbers() {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("===========");

        intList.add(1,2);
        for(int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }

}

class LinkedListTestDrive {
    public static void main(String[] args) {
        firstLinkedListEX();
        System.out.println("+++++++++++");
        arrayOfNumbers();
    }

}

