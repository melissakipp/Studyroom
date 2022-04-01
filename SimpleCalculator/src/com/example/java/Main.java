package com.example.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String firstValue = getInput("Enter a numeric value: ");
        String secondValue = getInput("Enter a numeric value: ");
        String operation = getInput("Choose an operation (+ - * /):");

        double result = 0;

        try {
            switch (operation) {
                case "+":
                    result = addValues(firstValue, secondValue);
                    break;
                case "-":
                    result = subtractValues(firstValue, secondValue);
                    break;
                case "*":
                    result = multipleValues(firstValue, secondValue);
                    break;
                case "/":
                    result = divideValues(firstValue, secondValue);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
            }
            System.out.println("The answer is " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }
    private static double addValues(String firstValue, String secondValue) {
        double double1 = Double.parseDouble(firstValue);
        double double2 = Double.parseDouble(secondValue);
        return double1 + double2;
    }

    private static double subtractValues(String firstValue, String secondValue) {
        double double1 = Double.parseDouble(firstValue);
        double double2 = Double.parseDouble(secondValue);
        return double1 - double2;
    }

    private static double multipleValues(String firstValue, String secondValue) {
        double double1 = Double.parseDouble(firstValue);
        double double2 = Double.parseDouble(secondValue);
        return double1 * double2;
    }

    private static double divideValues(String firstValue, String secondValue) {
        double double1 = Double.parseDouble(firstValue);
        double double2 = Double.parseDouble(secondValue);
        return double1 / double2;
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}

// Original Code
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a numeric value: ");
//        Integer firstValue = sc.nextInt();
//
//        System.out.println("Enter a numeric value: ");
//        Integer secondValue = sc.nextInt();
//
//        int results = firstValue + secondValue;
//        System.out.println("The answer is " + results);
//
//        sc.close();
//    }