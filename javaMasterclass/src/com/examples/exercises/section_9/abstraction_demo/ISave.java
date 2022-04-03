package com.examples.exercises.section_9.abstraction_demo;

import java.util.List;

public interface ISave {
    List<String> write();
    void read(List<String> savedItems);

}
