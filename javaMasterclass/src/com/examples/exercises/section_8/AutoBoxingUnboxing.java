package com.examples.exercises.section_8;

import java.util.ArrayList;

import static com.examples.exercises.section_8.AutoBoxingUnboxing.*;

public class AutoBoxingUnboxing {

    public static void longWay_AutoBoxing() {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i = 0; i <=10; i++) {
            intArrayList.add(i);
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i));
        }
    }

    public static void shortWay_AutoBoxing() {
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }
        for(int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i);
            System.out.println(i + " --> " + value);
        }
    }

    

}

class AutoBoxingUnboxingTestDrive {
    public static void main(String[] args) {
        // longWay_AutoBoxing();
        shortWay_AutoBoxing();
    }

}
