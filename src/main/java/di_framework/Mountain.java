package di_framework;

import java.util.Arrays;
@Component
public class Mountain {

    Plateau plateau;
    Tree tree;

    @Override
    public String toString() {
        return plateau.toString() + " " + tree.toString();
    }
}
