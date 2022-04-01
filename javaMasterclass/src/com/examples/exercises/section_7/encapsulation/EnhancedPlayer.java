package com.examples.exercises.section_7.encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health = 100; // default
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        // Set a parameter for health
        if(health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    // Method
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return health;
    }
}

class EnhancedPlayerTestDrive {
    public static void main(String[] args) {
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        // Using the getter to access/manipulate the data
        System.out.println("Initial health is " + player.getHealth());
    }
}