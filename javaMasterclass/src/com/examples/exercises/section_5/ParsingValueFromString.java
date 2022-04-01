package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.ParsingValueFromString.firstExample;

public class ParsingValueFromString {

    public static void firstExample() {

        String numberAsString = "2018";
        /* What if a user accidentally add a letter to the above example */
        /* Below code will through an error - this is not a valid number and/or this format is incorrect */
        // String numberAsString = "2018a";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        // String numberAsString2 = "2018"; // This worked as expected
        String numberAsString2 = "2018.125"; // This worked as expected
        double number2 = Double.parseDouble(numberAsString2);
        System.out.println("number = " + number2);

    }

}

class ParsingValueFromStringTestDrive {

    public static void main(String[] args) {

        firstExample();

    }

}
