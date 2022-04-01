package com.examples.exercises.section_9.InterfaceExample;

public interface ITelephone {
    // Creating signatures
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
