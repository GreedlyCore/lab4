package based;


import creatures.Human;
import creatures.Monkey;
import enums.Climate;
import interfaces.TimeComparable;
import locations.Continent;

public final class Humanity extends Entity implements TimeComparable {

    private final Human[] humans;
    private Thought thought;
    private boolean isAppeared;


    private Humanity(Thought thought, int countOfHuman) {
        this(countOfHuman);
        this.thought = thought;
        isAppeared = false;
    }

    public Humanity(int countOfHuman) {
        super("Humanity");
        humans = new Human[countOfHuman];
        for (int i = 0; i < countOfHuman; i++) {
            this.humans[i] = new Human();
        }

    }


    public void think(Time time) {
        if (time.getUnit() != "before") {

            thought.getInformation();
        } else {
            thought.setAllowed(false);
        }

    }

    public boolean isSimilarSpecificTime(Time time) {
        Continent location = (Continent) time.getObject();

        //take 10 humans and compare it to monkey
        for (int i = 0; i < 10; i++) {

            int randInt = (int) (Math.random() * ((humans.length) + 1));
            Human human = humans[i];
            return (!(human instanceof Monkey
                    && location.getClass() == Continent.class
                    && location.getWeather() == Climate.FOREVER_COLD));


        }
        return true;
    }

    public boolean isAppeared() {
        return isAppeared;
    }

    public void setAppeared(boolean isAppeared) {
        this.isAppeared = isAppeared;
    }

    public Thought getThought() {
        return thought;
    }

    public void setThought(Thought thought) {
        this.thought = thought;
    }


}
