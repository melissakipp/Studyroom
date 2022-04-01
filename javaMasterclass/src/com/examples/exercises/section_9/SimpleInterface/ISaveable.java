package com.examples.exercises.section_9.SimpleInterface;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
