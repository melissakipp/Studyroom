package com.examples;

import com.examples.exercises.section_4.GameOverWithMethod;

/* ToDo:

Revisit:
* In coding package NumberOfDaysInMonth

* */

public class Main {

    public static void main(String[] args) {

        int highScorePosition =  GameOverWithMethod.calculateHighScorePosition(1000);
        GameOverWithMethod.displayHighScorePosition("Melissa", highScorePosition);

    }

}

