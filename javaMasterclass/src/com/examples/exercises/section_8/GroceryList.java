package com.examples.exercises.section_8;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    // Initializing new object
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Getter


    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // Method for adding new items
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // Method for printing list
    public void printGroceryList() {
        // .size returns the items that are stored in the ArrayList
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1 ) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // Method for modifying (update) an item on the ArrayList
    private void modifyGroceryItem(int position, String updateItem) {
        groceryList.set(position, updateItem);
        System.out.println("Grocery item " + (position + 1) + " has been updated.");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    // Method to remove an item from the ArrayList
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }

    // Method to find an item
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

}

class GroceryListTestDrive {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Current item number: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list.");
        } else {
            System.out.println(searchItem + " is not in the shopping list.");
        }
    }

    // Another ways to copy an array list to another array list
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        // Same as the two lines above
        // ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList());
        // Another way
        // String[] myArray = new String[groceryList.getGroceryList().size()];
        // myArray = groceryList.getGroceryList().toArray(myArray);
    }
}