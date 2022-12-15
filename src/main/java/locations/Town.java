package locations;

import based.Location;
import based.Time;
import enums.Adjectives;
import enums.Relations;
import helper.Printer;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (descriptions != null) {
            for (Adjectives elem : descriptions) {
                builder.append(elem.text() + " ");
            }


        }
        return Printer.setSpaces(builder.toString(), super.getName());
    }
}
