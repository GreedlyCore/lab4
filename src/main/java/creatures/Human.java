package creatures;


import based.Entity;
import based.Location;
import based.Thought;
import based.Time;
import enums.Adjectives;
import enums.Climate;
import enums.Emotion;
import helper.Printer;
import helper.RandomGenerator;
import locations.Continent;

import java.util.ArrayList;


public class Human extends Monkey {
    private Thought thought;
    private boolean isDizzy;

    public Human(String name, Thought thought) {
        super(name);
        this.thought = thought;
        this.isDizzy = false;

    }


    public Human() {
        super("Human");
        this.thought = Thought.getInstanceOfNullThought();
        this.isDizzy = false;

    }

    public Human(String name) {
        super(name);
        this.isDizzy = false;
    }


    public void think(Thought thought) {
        Printer.print(this, thought);
    }

    public boolean isSimilarInSpecificWay(Entity creature, Location location) {
        Continent place = (Continent) location;
        return creature instanceof Monkey && place.getClass() == Continent.class && place.getWeather() == Climate.FOREVER_COLD;


    }

    public void scream(ArrayList<Emotion> types) {
        StringBuilder sb = new StringBuilder();
        types.forEach((n) -> sb.append(n.text() + " "));
        Printer.print(this, "screamed with", sb.toString());
    }

    public void remember(Thought thought) {
        Printer.print("we remember about", thought);
    }

    // confuse obj1 with obj1
    public void confuse(Entity obj1, Entity obj2) {
        Printer.print(this, "-confused ", obj1, "with-", obj2);
    }

    public void observe(Location place, Time time) {
        Printer.print("We saw...", place.toString(), time);
    }

    public void observe(Location place) {
        Printer.print("We saw...", place.toString());
    }


    public boolean isDizzy() {
        return isDizzy;
    }

    public void setDizzy(boolean dizzy, Thought from) {
        isDizzy = dizzy;
        this.thought = from;
        Printer.print(this, "is dizzy?..", dizzy, "from", from);
    }

    public Phrase say(String txt) {
        Phrase phrase = new Phrase();
        phrase.setPhraseText(txt);
        Printer.print(this, "said:", txt);
        return phrase;
    }

    //  Delirium - бред
    public class Phrase extends Entity {
        private final Adjectives type;
        private String phraseText;

        protected Phrase() {
            super("phrase");
            this.type = Adjectives.RANDOM;
        }

        public String getPhraseText() {
            return phraseText;
        }

        public void setPhraseText(String phraseText) {
            this.phraseText = phraseText;
        }

        public String addRandom(String txt) {
            String result = "";
            for (char ch : txt.toCharArray()) {
                if (RandomGenerator.generateInstance(0.12f).getResult()) {
                    result += RandomGenerator.generateRandomChar();
                } else {
                    result += ch;
                }

            }
            return result;
        }

        public Phrase sayDelirium() {

            this.setPhraseText(addRandom(this.getPhraseText()));
            Printer.print(Human.this, "said:", this.getPhraseText());
            return this;
        }

        //get dizzy in head
        @Override
        public String toString() {
            return Printer.setSpaces(type.text(), getName());
        }
    }

    public class Knowledge extends Entity {
        private final boolean isLimitingFeelings;

        public Knowledge(String name, boolean isLimitingFeelings) {
            super(name);
            this.isLimitingFeelings = isLimitingFeelings;
        }

        public boolean isLimitingFeelings() {
            return isLimitingFeelings;
        }
    }
}
/**
 *
 *  TYPE vs class difference
 *  runoutofmem
 *  Seri
 *  Autoclsoable
 */