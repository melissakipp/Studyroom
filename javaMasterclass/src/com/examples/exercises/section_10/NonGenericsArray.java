package com.examples.exercises.section_10;

import java.util.ArrayList;

public class NonGenericsArray {
    public static void main(String[] args) {
        // This ArrayList is a raw type
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        // Add: This cause a problem with the compiler's type checking
        items.add("tim");
        items.add(4);
        items.add(5);
        printDoubled(items);

        // Java 1.5 Generics was introduced
    }

    private static void printDoubled(ArrayList n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}

