package com.examples.exercises.section_7.encapsulation;

// Example of not using encapsulation

public class Player {
    // IntelliJ wanted to make it a static instance variable...
    public static String name;
    public int health;
    public String weapon;

    // using the default constructor

    // Method
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}

class PlayerTestDrive {
    public static void main(String[] args) {
        Player player = new Player();
        Player.name = "Tim";
        player.health = 30;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 21;
        // Your able to control the health (where in the real world you wouldn't want to give players the ability to do this).
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
    // Removing above code so that we can access the data properly with encapsulation
    // New class called EnhancedPlayer
}