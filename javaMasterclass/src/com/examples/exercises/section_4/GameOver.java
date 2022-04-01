package com.examples.exercises.section_4;

public class GameOver {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

        // Since these are in the same scope, the variables have to be different
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(gameOver) {
            // finalScore is does not need to be renamed because it is in a different scope than previous variable
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final second score was " + finalScore);
        }

        // If you didn't want to make new variable you can redefine the original value
        score = 10200;
        levelCompleted = 4;
        bonus = 200;

        if(gameOver) {
            // finalScore is does not need to be renamed because it is in a different scope than previous variable
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final third score was " + finalScore);
        }

        /* NOTE:
        * We make mistakes, we forget things. And it is very common in programming, particularly as the code you work
        * on gets more complicated. To forget, if you are duplicating a lot of code, where all that code is.
        * So you definitely don't want to get into that scenario of duplicating your code. And there are lots of ways
        * to help really reduce or eliminate the need pretty much for any duplicate code.
        * */
    }
}
