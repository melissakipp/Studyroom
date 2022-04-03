package com.examples.exercises.section_9.abstraction_demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {

    public static void main(String[] args) {
        Princess melissa = new Princess("Melissa", 10, 15);
        System.out.println(melissa);
        saveObject(melissa);

        System.out.println("+++++++++++++++");

        melissa.setHitPoints(8);
        System.out.println(melissa);
        melissa.setWeapon("Stormbringer");
        saveObject(melissa);
//        loadObject(tim);
        System.out.println(melissa);

        System.out.println("+++++++++++++++");

        ISave werewolf = new Villian("Werewolf", 20,40);
        System.out.println(werewolf);
        saveObject(werewolf);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISave objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISave objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
