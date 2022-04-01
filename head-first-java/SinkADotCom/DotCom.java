package SinkADotCom;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<>();
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }

    public String checkYourself(String userInput)
    {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index != -1) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You killed " + name + "!");
            }
            else
            {
                result = "hit";
            }
        }
        return result;
    }
}
