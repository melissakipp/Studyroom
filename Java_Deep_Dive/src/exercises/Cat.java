/* https://github.com/joonspoon/madecraft-oop/blob/master/2.%20Inside%20Classes/exercises/Cat.java */

package exercises;

public class Cat {

    private final String name;
    private static int lives = 9;

    Cat(String name) {
        this.name = name;
    }

    void meow() {
        System.out.println("meeeeeooooooooooowwwwwwwww!!");
    }

    public void printName() {
        if (name == null)
            System.out.println("I don't know my own name!");
        else
            System.out.println("My name is " + name + ".");
    }

    static int kill() {
        lives--;
        if (lives > 0)
            System.out.println("nice try, but I still have " + lives + " lives left");
        else if (lives < 0)
            System.out.println("that's overkill yo!");
        else
            System.out.println("DEAD CAT :(");
        return 0;
    }

    public static void main(String[] args) {
        /* Do the following things without changing the Cat class */

        // 1. Make the Cat meow
        Cat elisa = new Cat("Elisa");
        // 2. Get the Cat to print its name
        elisa.printName();
        elisa.meow();
        // 3. Kill the Cat!
        while (true) {
            if (lives > 0) {
                Cat.kill();
            } else {
                return;
            }
        }
    }
}

