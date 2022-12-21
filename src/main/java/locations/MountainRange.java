package locations;

import based.Location;
import based.Thing;
import creatures.Human;
import enums.Adjectives;

public class MountainRange extends Location {

    private Thing mirage;
    private Human snowman;

    public MountainRange(String name, Adjectives... adjectives) {
        super(name, adjectives);
    }

    public MountainRange(String name, Human snowman) {
        super(name);
        this.snowman = snowman;
    }

    public class Mirage extends Location {

        public Mirage(String name) {
            super(name);
        }

    }
}
