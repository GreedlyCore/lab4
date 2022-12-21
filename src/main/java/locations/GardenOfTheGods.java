package locations;

import based.Location;
import based.Thing;
import enums.Shape;
import helper.Printer;

import java.util.ArrayList;

public class GardenOfTheGods extends Location {

    private final Town nearTown;
    private ArrayList<Thing> stones;


    public GardenOfTheGods(String name, Town town) {
        super(name);
        this.nearTown = town;
    }


    public void generateStones() {
        for (int i = 0; i < 99; i++) {
            stones.add(new Thing("Stone", Shape.getRandomForm()));
        }
    }

    public String stoneShapes() {
        return Shape.values().toString();
    }

    @Override
    public String toString() {
        return Printer.setSpaces(getName(), "in", nearTown.toString());
    }
}
