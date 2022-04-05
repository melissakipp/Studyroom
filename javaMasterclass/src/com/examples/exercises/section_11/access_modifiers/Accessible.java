package com.examples.exercises.section_11.access_modifiers;

/* * Challenge:
* In the following interface declaration, what is the visibility of:
* 1. The Accessible interface?
* 2. The int variable SOME_CONSTANT?
* 3. methodA
* 4. methodB and methodC?
*
* Hint: think back to the lecture on interfaces before answering.
* */

interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
