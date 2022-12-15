package creatures;

import based.Entity;
import based.Nature;
import helper.Printer;

public final class Devil extends Entity {

    Nature natureLaws;

    public Devil(Nature natureLaws) {
        super("Devil");
        this.natureLaws = natureLaws;
    }

    public void destroyLaws() {
        this.natureLaws.setLawsIsBroken(true);
    }

    @Override
    public String toString() {

        return Printer.setSpaces(this.getName(), natureLaws.toString());
    }

}
