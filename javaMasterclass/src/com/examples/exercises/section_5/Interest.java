package com.examples.exercises.section_5;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

import static com.examples.exercises.section_5.Interest.userInputCalculator;

public class Interest {

    private static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));

    }

   public static void userInputCalculator() {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Loan Amount: ");
            while (sc.hasNextDouble()) {
                double amount = sc.nextDouble();
                if (amount > 0) {
                    Locale usa = new Locale("en", "US");
                    Currency dollars = Currency.getInstance(usa);
                    NumberFormat formatDollars = NumberFormat.getCurrencyInstance(usa);
                    String amountPrint;
                    amountPrint = formatDollars.format(amount);

                    for (double interestRate = 2.0; interestRate <= 8.0; interestRate++) {
                        System.out.println(dollars.getDisplayName() + ": " + amountPrint + " at " + interestRate + "% = " + String.format("%.2f", calculateInterest(amount, interestRate)));
                    }
                    System.out.println("==== Going Backwards ====");
                    for (double interestRate = 8.0; interestRate >= 2.0; interestRate--) {
                        System.out.println(dollars.getDisplayName() + ": " + amountPrint + " at " + interestRate + "% = " + String.format("%.2f", calculateInterest(amount, interestRate)));

                    }
                } else {

                    System.out.println("You have entered an invalid amount. Please enter a dollar amount of one dollar or greater.");
                    System.out.println(amount);
                    System.out.println("Please enter a valid dollar amount: ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
   /* I don't know where to put the close() for the scanner
   * In varieties locations I get either it stays open (I have to enter 'stop' to
   * close the scanner with a 0 or I press stop in Intellij and get a exit code 1),
   * in other places I get a runtime error after executing steps and in some places
   * the program exit with an error immediately. Is it the try catch approach?
   * */

class InterestTestDriver {

    public static void main(String[] args) {

        userInputCalculator();

    }

}

    /*Challenge
     * Using the for statement, call the calculateInterest method with
     * the amount of 10,000 with an interestRate of 2,3,4,,5,6,7, and 8
     * and print the results to the console window.


    public static void forLoopPrintOut() {

        double amount = 10000.00;
        for(double interestRate = 2.0; interestRate <= 8.0; interestRate++) {
            System.out.println(amount + " at " + interestRate + " interest = " + String.format("%.2f", calculateInterest(amount, interestRate)));
        }

    }
    * */