package com.examples.exercises.section_8;

import java.util.Scanner;

import static com.examples.exercises.section_8.Arrays.getAverage;
import static com.examples.exercises.section_8.Arrays.getIntegers;

public class Arrays {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        System.out.println("=========");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

}

class ArraysTestDrive {
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        System.out.println("=========");
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println("Index: " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("=========");
        System.out.println("The average is " + getAverage(myIntegers));
    }
}
