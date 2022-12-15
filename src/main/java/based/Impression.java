package based;

import helper.Printer;
import locations.Sight;


public final class Impression extends Entity {

    private boolean isDescribed;
    private final Sight fromSight;

    public Impression(Sight sight) {
        super("Impression");
        this.isDescribed = true;
        this.fromSight = sight;
    }

    public boolean isDescribed() {
        return isDescribed;
    }

    public void setDescribed(boolean described) {
        isDescribed = described;
    }

    @Override
    public String toString() {
        if (!isDescribed) {
            return Printer.setSpaces("cant be described", this.getName(), fromSight.toString());
        }
        return Printer.setSpaces("can be described", this.getName(), fromSight.toString());

    }

}
