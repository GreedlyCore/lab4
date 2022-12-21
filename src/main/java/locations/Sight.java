package locations;

import based.Entity;
import based.Location;
import enums.Adjectives;
import helper.Printer;

public class Sight extends Location {

    private Entity object;

    public Sight(Adjectives... adjectives) {
        super("Sight", adjectives);
    }

    public Sight(Entity obj) {
        super("Sight");

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        super.getDescriptions().forEach((n) -> {
            Adjectives tmp = (Adjectives) n;
            sb.append(tmp.text());
        });

        return Printer.setSpaces(sb.toString(), this.getName());
    }


}
