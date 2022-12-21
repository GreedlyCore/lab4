package based;

import creatures.Human;
import enums.Adjectives;
import enums.Shape;
import helper.Printer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thing<T> extends Entity {

    private static Thing<?> noneThing;
    private ArrayList<T> descriptions;
    private Shape forms;
    private Human creator;

    public Thing(String name, T... descriptions) {
        this(name);
        this.descriptions = new ArrayList<T>(Arrays.asList(descriptions));
    }


    public Thing(String name) {
        super(name);

    }

    public Thing(String name, Shape form) {
        super(name);
        this.forms = form;
        //this.descriptions = new Adjectives[]{Adjectives.COMMON};

    }

    public static Thing<?> getInstanceOfNoneThing() {
        if (noneThing == null) {
            noneThing = new Thing<>("noneThing", new ArrayList<Adjectives>(List.of(Adjectives.NOTHING)));
        }
        return noneThing;
    }

    @Override
    public String toString() {


        StringBuilder builder = new StringBuilder();
        if (descriptions != null) {
            getDescriptions().forEach((n) -> {
                //-----костыль с lowercase из-за приведения данных----///
                builder.append(n.toString().toLowerCase()).append(" ");
            });
        }
        if (forms != null) {
            builder.append(forms.text()).append(" ");
        }


        return Printer.setSpaces(super.getName(), builder.toString());
    }

    public Human getCreator() {
        return creator;
    }

    public void setCreator(Human creator) {
        this.creator = creator;
    }

    public ArrayList<T> getDescriptions() {
        return descriptions;
    }


}
