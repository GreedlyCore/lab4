package locations;

import based.Location;
import based.Time;
import enums.Adjectives;
import enums.Relations;
import interfaces.TimeComparable;

public final class Town extends Location implements TimeComparable {
    public Town(String name, Adjectives... adjectives) {
        super(name, adjectives);
    }

    public Town(Adjectives... adjectives) {
        super("Town", adjectives);
    }

    @Override
    public boolean isSimilarSpecificTime(Time time) {
        return time.getName() != Relations.BEFORE.text();

    }


}
