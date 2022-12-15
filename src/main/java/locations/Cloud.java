package locations;

import based.Location;
import based.Thing;
import helper.Printer;

public class Cloud extends Location {

    private Thing composition;

    public Cloud(String name, Thing composition) {
        super(name);
        this.composition = composition;
    }

    public Thing getComposition() {
        return composition;
    }

    public void setComposition(Thing composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(composition.toString(), getName());
    }


}
