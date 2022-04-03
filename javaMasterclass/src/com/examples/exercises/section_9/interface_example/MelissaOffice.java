package com.examples.exercises.section_9.interface_example;

// Main class with main()

public class MelissaOffice {

    public static void main(String[] args) {

        // Having this set as the ITelephone, you can then set two different phones.
        ITelephone melissaPhone;
        melissaPhone = new DeskPhone(4371656);
        melissaPhone.powerOn();
        melissaPhone.callPhone(4371656);
        melissaPhone.answer();

        System.out.println("=================");

        melissaPhone = new MobilePhone(6720225);
        melissaPhone.powerOn();
        melissaPhone.callPhone(6720225);
        melissaPhone.answer();

    }

}
