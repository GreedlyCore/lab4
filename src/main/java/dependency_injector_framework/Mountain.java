package dependency_injector_framework;

@Location(name="Mountain")
public class Mountain {

    Plateau plateau;
    Forest forest;

    @Override
    public String toString() {
        return plateau.toString() + " " + forest.toString();
    }
}
