package com.example.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9,6,3};
        // Checking the array once
        int arrSize = ints.length;
        Arrays.sort(ints);
        for (int i = 0; i < arrSize; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color : strings) {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        int arrLen = sized.length;
        for (int i = 0; i < arrLen; i++) {
            sized[i] = i * 100;
        }
        for (int value : sized) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        // Reuse the 'value' variable because it is scope within each for loops
        for (int value : copied) {
            System.out.println(value);
        }
    }

}
