package creatures;

import based.Entity;
import based.Location;
import based.Time;
import enums.Adjectives;
import helper.Printer;
import locations.MountainRange;

public class Monster extends Entity {

    private final Adjectives[] description;


    public Monster(String name, Adjectives... adjective) {
        super(name);
        this.description = adjective;
    }

    public Monster beNoticedInSpesificPlace(Location place) {
        if (place.getClass() == MountainRange.class) {
            return this;
        }
        return null;
    }

    public void sleep(Location place, Time time) {
        Printer.print(this, "sleeped in ", place, "for", time);
    }

    public String reflectFrom(Location place) {
        return Printer.setSpaces("Reflected from", place.toString());
    }


}
