package com.examples.exercises.section_8;

import java.util.Scanner;

import static com.examples.exercises.section_8.CopyArray.*;

public class CopyArray {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    // I had this in the TestDrive but had to move it so that the 'baseData' would work.
    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers: ");
        getInput();
        printArray(baseData);
    }

    protected static void getInput() {
        for(int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    protected static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    protected static void resizeArray() {
        int[] original = baseData;
        baseData = new int[12];
        for(int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

}

class CopyArrayTestDrive {

}
