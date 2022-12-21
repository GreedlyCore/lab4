package based;


import enums.Adjectives;
import helper.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Location<T> extends Entity {

    private static Location<?> nowhere;
    private static ArrayList<Adjectives> noDescription;
    protected ArrayList<?> descriptions;

    public Location(String name, T... adjectives) {
        super(name);
        this.descriptions = new ArrayList<T>(Arrays.asList(adjectives));

    }

    public Location(String name) {
        super(name);
        this.descriptions = getInstanceOfNoDesctiption();

    }

    public static Location<?> getInstanceOfNowhere() {
        if (nowhere == null) {
            nowhere = new Location<>("nowhere", new ArrayList<Adjectives>(List.of(Adjectives.NOTHING))) {
            };
        }
        return nowhere;
    }

    public static ArrayList<Adjectives> getInstanceOfNoDesctiption() {

        if (noDescription == null) {
            noDescription = new ArrayList<>(List.of(Adjectives.NOTHING));
        }
        return noDescription;

    }

    public ArrayList<?> getDescriptions() {
        return descriptions;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        if (descriptions != getInstanceOfNoDesctiption()) {
            getDescriptions().forEach((n) -> {
                Adjectives tmp = (Adjectives) n;
                sb.append(tmp.text()).append(" ");
            });

        }
        return Printer.setSpaces(sb.toString(), super.getName());
    }
}
