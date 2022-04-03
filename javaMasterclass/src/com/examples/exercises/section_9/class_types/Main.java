package com.examples.exercises.section_9.class_types;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    // Initialize Button object
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        // Local class that is defined within the method.
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached.");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked.");
//            }
//        }
//
//        // Attach the button field
//        btnPrint.setOnClickListener(new ClickListener());

        // New: Lambda function (Same functionality as the code below)
        // btnPrint.setOnClickListener(title -> System.out.println(title + " was clicked."));

        // Anonymous inner class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });

        listen();

    }

    /* Assuming that we're using some sort of graphic framework that will
    actually automatically respond when a button was clicked and that the
    on click method would actually be invoked for us. But because we're not
    using a graphics framework, we're going to simulate that listen method
    from the keyboard. */

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice ) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}
