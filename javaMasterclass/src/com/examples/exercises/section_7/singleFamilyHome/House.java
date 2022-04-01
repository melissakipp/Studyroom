package com.examples.exercises.section_7.singleFamilyHome;

/* Challenge
* Create a single room of a house using composition.
* Think about the things that should be included in the room.
* Maybe physical parts of the house but furniture as well
* Add at least one method to access an object via a getter and
* then that objects public method as you saw in previous video
* but to access the object used in composition within the main class
* like you saw in this video.
* */

public class House {
}

class HouseTestDrive {

    public static void main(String[] args) {

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(22,55);

        Bed bed = new Bed("Modern", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tim", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();

    }

}
