package creatures;


import based.Entity;
import based.Location;
import based.Thought;
import enums.Climate;
import locations.Continent;


public class Human extends Monkey {
    private final Thought thought;

    public Human(String name, Thought thought) {
        super(name);

        this.thought = thought;

    }

    public Human(Thought thought) {
        super("Human");
        this.thought = thought;

    }

    public Human() {
        super("Human");

        this.thought = null;

    }

    public void think(Thought thought) {
        thought.getInformation();
    }

    public boolean isSimilarInSpecificWay(Entity creature, Location location) {
        Continent place = (Continent) location;
        return creature instanceof Monkey && place.getClass() == Continent.class && place.getWeather() == Climate.FOREVER_COLD;


    }

    @Override
    public boolean checkExistance() {
        return thought != null;
    }
}
