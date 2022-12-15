package creatures;

import based.Entity;
import based.Location;
import enums.Adjectives;
import helper.Printer;
import locations.MountainRange;

public class Monster extends Entity {

    private Adjectives[] description;


    public Monster beNoticedInSpesificPlace(Location place) {
        if (place.getClass() == MountainRange.class) {
            return this;
        }
        return null;
    }

    public Monster(String name, Adjectives... adjective) {
        super(name);
        this.description = adjective;
    }

    public String reflectFrom(Location place) {
        return Printer.setSpaces("Reflected from", place.toString());
    }


}
