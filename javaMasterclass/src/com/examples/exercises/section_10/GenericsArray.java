package com.examples.exercises.section_10;

/* Compare this code with NonGenericsArray */

import java.util.ArrayList;

public class GenericsArray {
    public static void main(String[] args) {
        // Adding a type to the ArrayList
        /* <> (Type Inference): Diamond notation, Java 1.7 Type inference is a Java compiler's ability to look at each
        method invocation and corresponding declaration to determine the type argument (or arguments) that make the
        invocation applicable.
         */
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        // Now the editor shows proper error
        // items.add("tim");
        items.add(4);
        items.add(5);
        printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> n) {
        // Integer could also be changed to 'int'
        for (Integer i : n) {
            System.out.println(i * 2);
        }
    }
}
