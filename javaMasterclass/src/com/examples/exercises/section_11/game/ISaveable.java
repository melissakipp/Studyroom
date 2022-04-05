package com.examples.exercises.section_11.game;

import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
