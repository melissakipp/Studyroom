package com.examples.exercises.section_5;

import static com.examples.exercises.section_5.SwitchStatementsIntro.*;

public class SwitchStatementsIntro {

    public static void ifStatement(int value) {

        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

    }

    public static void switchStatement(int switchValue) {

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1.");
                break;

            case 2:
                System.out.println("Value was 2.");
                break;

            default:
                System.out.println("Was not 1 or 2.");
                break;
        }
    }

    /* Question:
    Can you use a switch statement to call certain functions?
    * */
    public static void experimentSwitchStatement(int value) {

        switch (value) {
            case 1:
                caseOne();
                break;
            case 2:
                caseTwo();
                break;
            default:
                caseDefault();
                break;
        }

    }

    public static void caseOne() {
        System.out.println("This is case one.");
    }

    public static void caseTwo() {
        System.out.println("This is case two.");
    }

    public static void caseDefault() {
        System.out.println("When all else fails.");
    }

    /* Challenge
    Create a new switch statement using char instead of int
    Create a new char variable
    Create a switch statement testing for
    A, B, C, D, or E
    Display a message if any of these are found and then break
    Add a default which displays a message saying not found.
    * */

//    public static void letters(char value) {
//
//        switch (value) {
//            case 'A':
//                System.out.println("A");
//                break;
//            case 'B':
//                System.out.println("B");
//                break;
//            case 'C':
//                System.out.println("C");
//                break;
//            case 'D':
//                System.out.println("D");
//                break;
//            default:
//                System.out.println("E");
//                break;
//        }
//
//    }
    public static void letters(char charValue) {


       switch (charValue) {
          case 'A':
              System.out.println("A was found.");
              break;
          case 'B':
              System.out.println("B was found.");
              break;
          case 'C': case 'D': case 'E':
               System.out.println(charValue + " was found.");
               break;
          default:
              System.out.println("Could not find A, B, C, D, or E.");
              break;
       }



    }
}

class SwitchStatementIntroTestDriver {

    public static void main(String[] args) {

        ifStatement(1);
        ifStatement(2);
        ifStatement(3);

        switchStatement(1);
        switchStatement(2);
        switchStatement(3);

        experimentSwitchStatement(1);
        experimentSwitchStatement(2);
        experimentSwitchStatement(3);

        letters('A');
        letters('B');
        letters('C');
        letters('D');
        letters('a');

    }

}
