package based;

import enums.Relations;
import helper.Printer;

public class Thought extends Entity {
    private static Thought nullThought;
    boolean isAllowed;
    boolean doubts;
    Entity subject;

    // about what?
    public Thought(Entity subject) {
        super("Thought");
        this.subject = subject;
    }
    public Thought(String name, Entity subject) {
        super(name);
        this.subject = subject;
    }


    public static Thought getInstanceOfNullThought() {
        if (nullThought == null) {
            nullThought = new Thought("nullThought", Entity.getInstanceOfNullObject());
        }
        return nullThought;
    }

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public String getInformation() {
        return subject.toString();
    }

    public boolean isDoubts() {
        return doubts;
    }

    public void setDoubts(boolean doubts) {
        this.doubts = doubts;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(getName(), Relations.OF.text(), subject.toString());
    }

}
