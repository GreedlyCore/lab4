package locations;

import based.Location;
import based.Thing;
import enums.Adjectives;
import helper.Printer;
import interfaces.ThingComparable;

public class Dream extends Location implements ThingComparable {

    public Dream(String name) {
        super(name);

    }

    @Override
    public String checkDifferenceSpecificThing(Thing thing) {
        if (thing.getName() == "Reality") {
            return Printer.setSpaces(Adjectives.SCARY.text(), Adjectives.DANGEROUS.text());
        }
        return "none";
    }
}
