package com.examples.exercises.section_7.polymorphism;

/* Base Class that other classes will inherit from */

import static com.examples.exercises.section_7.polymorphism.Movie.getGenerator;

public class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();

        }
        return null;
    }

    public static void getGenerator() {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

}

class MovieTestDrive {
    public static void main(String[] args) {
        getGenerator();
    }
}
