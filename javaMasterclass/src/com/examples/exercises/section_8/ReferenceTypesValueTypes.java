package com.examples.exercises.section_8;

import java.util.Arrays;

import static com.examples.exercises.section_8.ReferenceTypesValueTypes.modifyArray;

public class ReferenceTypesValueTypes {

    /* Instructor had the method 'private'
    *  IntelliJ warnings and suggestions where to:
    *   - Change the package to a private-package
    *   - Change 'private' to protected method
    */
    protected static void modifyArray(int[] array) {
        array[0] = 2;
        // This does not change the parameter array. Below is a new array.
        array = new int[] {1,2,3,4,5};
    }

}

class ReferenceTypesValueTypesTestDrive {
    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("myIntArray = " + Arrays.toString(anotherArray));

        System.out.println("============");
        // Creating a new object in memory
        anotherArray = new int[] {4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("Modified: myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Modified: myIntArray = " + Arrays.toString(anotherArray));

    }
}