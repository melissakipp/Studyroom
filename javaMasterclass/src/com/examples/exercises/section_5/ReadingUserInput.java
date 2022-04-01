package com.examples.exercises.section_5;

import java.time.LocalDate;
import java.util.Scanner;

import static com.examples.exercises.section_5.ReadingUserInput.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ReadingUserInput {

    public static void userInputIntro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // Handles next line character (Enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            LocalDate date = LocalDate.now();
            int currentYear = date.getYear();
            int age = currentYear - yearOfBirth;

            if(age >= 0 && age <= 150) {
                System.out.println("Hello " + name + ". In " + currentYear + " you will be " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }


        scanner.close();

    }

    public static void readingUserInputChallenge() {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number.");
            }
            sc.nextLine(); // Handles end of line (Enter key)
        }
        System.out.println("Sum = " + sum);
        sc.close();

    }

    public static void MinAndMaxInputChallenge() {

        int min = MAX_VALUE;
        int max = MIN_VALUE;
        boolean first = true;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Enter Number: ");
            boolean isAnInt = sc.hasNextInt();

            if(isAnInt) {
                int number = sc.nextInt();
                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
            sc.nextLine(); // Handles end of line (Enter key)
        }
        System.out.println("min = " + min + ", max = " + max);
        sc.close();

    }

}


class ReadingUserInputTestDriver {

    public static void main(String[] args) {

//    userInputIntro();
//    readingUserInputChallenge();
        MinAndMaxInputChallenge();

    }

}

/*
Part of the Challenge 1 (another solution):
 public static void readingUserInputChallenge() {

        Scanner sc = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if(isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                  break;
                }
            } else {
                System.out.println("Invalid number.");
            }
            sc.nextLine(); // Handles end of line (Enter key)
        }
        System.out.println("Sum = " + sum);
        sc.close();

    }
* */
