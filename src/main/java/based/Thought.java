package based;

import enums.Relations;
import helper.Printer;

public class Thought extends Entity {
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

    public boolean isAllowed() {
        return isAllowed;
    }

    public void setAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public void getInformation() {
        subject.toString();
    }

    public void setDoubts(boolean doubts) {
        this.doubts = doubts;
    }

    public boolean isDoubts() {
        return doubts;
    }

    @Override
    public String toString() {
        return Printer.setSpaces("Thought", Relations.OF.text(), subject.toString());
    }

}
