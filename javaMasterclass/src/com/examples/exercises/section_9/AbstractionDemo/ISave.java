package com.examples.exercises.section_9.AbstractionDemo;

import java.util.List;

public interface ISave {
    List<String> write();
    void read(List<String> savedItems);

}
