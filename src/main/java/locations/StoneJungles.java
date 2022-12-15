package locations;

import based.Location;
import enums.Adjectives;
import helper.Printer;


public final class StoneJungles extends Location {

    public StoneJungles(Adjectives... adjectives) {

        super("Stone Jungles", adjectives);

    }
    public StoneJungles(String name, Adjectives... adjectives) {

        super(name, adjectives);

    }

    public StoneJungles() {

        super("Stone Jungles", null);

    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (Adjectives adjective : super.getDescriptions()) {
            stringBuilder.append(adjective.text());
        }
        return Printer.setSpaces(this.getName(), stringBuilder.toString());

    }


}