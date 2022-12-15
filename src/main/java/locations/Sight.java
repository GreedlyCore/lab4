package locations;

import based.Location;
import enums.Adjectives;
import helper.Printer;

public class Sight extends Location {

    public Sight(Adjectives... adjectives) {

        super("Sight", adjectives);


    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Adjectives adjective : super.getDescriptions()) {
            stringBuilder.append(adjective);
        }
        return Printer.setSpaces(stringBuilder.toString(), this.getName());
    }


}
