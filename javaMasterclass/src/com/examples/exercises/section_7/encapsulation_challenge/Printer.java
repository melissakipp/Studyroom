package com.examples.exercises.section_7.encapsulation_challenge;

/* Challenge
* Demonstrate proper encapsulation techniques
* Create a class will be called Printer.
* It will simulate a real computer printer.
* It should have fields for the toner level, number of pages printed, and
* also weather its a duplex printer (capable of printing on both sides of the paper).
* Add methods to fill up the toner (up to a maximum of 100%), another method to
* simulate printing a page (which should increase the number of pages printed).
* Decide on the scope, weather to use constructors, and anything else you think is needed.
* */

public class Printer {

    // Instance Variables
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {

        if(tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    // Retrieve the number of pages printed to check that the value was correct like so.
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

class PrinterTestDrive {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted() + ".");

        System.out.println("++++++++++");

        Printer printer2 = new Printer(50, true);
        System.out.println("Initial page count = " + printer2.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer2.getPagesPrinted() + ".");

        System.out.println("++++++++++");

        Printer printer3 = new Printer(65, true);
        System.out.println("Initial page count = " + printer3.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer3.getPagesPrinted() + ".");

    }

}
