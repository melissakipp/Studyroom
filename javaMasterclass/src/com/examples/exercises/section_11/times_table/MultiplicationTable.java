package com.examples.exercises.section_11.times_table;

import java.util.Scanner;

public class MultiplicationTable {

    private int num;

    public MultiplicationTable(Scanner num) {

        System.out.print("Please enter a number: ");
        this.num = num.nextInt();

    }

    public void multiplierGenerator() {

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " times " + this.num + " equals " + i * this.num);
        }

    }

}

class MultiplicationTableTestDrive {
    public static void main(String[] args) {
        MultiplicationTable user = new MultiplicationTable(new Scanner(System.in));
        user.multiplierGenerator();
    }
}


/* Questions:
* 1) Naming conventions?
* 2) How would make this more visual appealing in the terminal?
* */