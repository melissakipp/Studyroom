package com.examples.exercises.section_4;

public class GameOverWithMethod {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 500);
        System.out.println("Your final score was " + highScore);

        // calculateScore(true, 10000, 8, 200);

        /* *
        * Challenge:
        * Create a method called displayHighScorePosition
        * create players name as a parameter, and a 2nd parameter as a position in the high score table
        * You should display the players name along with a message like " managed to get into position "
        * and the position they got and a further message " on the high score table."
        *
        * Create a 2nd method classed calculateHighScorePosition
        * It should be set one argument only, the player score.
        * It should return an int.
        * The return data should be.
        * 1. if the score is > 1000
        * 2. if the score is > 500 and < 1000
        * 3. if the score is > 100 and < 500
        * 4. in all other cases
        * Finally, call both methods and display the results of the following
        * a score of 1500, 900, 400, and 50.
        * */

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static void displayHighScorePosition(String playName, int highScorePosition) {
        System.out.println(playName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4; // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }

        return position;

    }

    // Create a custom method
    // A method that returns a value
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        // return 0;
        return -1;
        /* *
        * If you're wondering why we're returning negative one here in programming terms
        * negative one is conventionally used to indicate an error and in searching algorithms
        * negative 1 indicates an invalid value or a value not found so that's the reason  using negative
        * one here
        * */
    }
}
