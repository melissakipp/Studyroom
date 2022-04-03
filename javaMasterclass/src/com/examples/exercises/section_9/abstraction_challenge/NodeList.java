package com.examples.exercises.section_9.abstraction_challenge;

public interface NodeList {

    ListItem getRoot();
    boolean addItem(ListItem newItem);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);

}
