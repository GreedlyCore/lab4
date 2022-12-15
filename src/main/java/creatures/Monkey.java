package creatures;

import based.Entity;

public abstract class Monkey extends Entity {
    public Monkey(String name) {
        super(name);

    }

    public Monkey() {
        super("Monkey");

    }

    public boolean checkExistance() {

        return false;
    }
}
