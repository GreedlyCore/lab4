package locations;

import based.Entity;
import based.Location;
import based.Nature;
import based.Thing;
import enums.Adjectives;
import enums.Relations;
import enums.Shape;
import helper.Printer;

import java.util.ArrayList;

public class Maze<T> extends Location {


    private Thing<?>[] materials;
    private Nature nature;
    private Rhythmicity rhythmicity;
    private Peak peak;
    private Snow snow;
    public Maze(String name, Nature nature, Adjectives... descriptions) {
        super(name, descriptions);
        this.nature = nature;
        generate();

    }

    public Maze(String name, Adjectives... descriptions) {
        super(name, descriptions);
        generate();


    }


    private void generate() {
        Thing[] stones = new Thing[500];
        for (int i = 0; i <= 499; i++) {
            Thing stone = new Thing("Stone" + i, Shape.getRandomForm());
            stones[i] = stone;
        }
        this.materials = stones;
        /**
         * together!
         */
        this.rhythmicity = new Rhythmicity("rhythmicity");
    }

    public String giveOpinion() {
        return Printer.setSpaces(Adjectives.CLEAR.text(), "opinion about", nature.toString());
    }

    public Thing[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        if (descriptions != getInstanceOfNoDesctiption()) {
            getDescriptions().forEach((n) -> {
                Adjectives tmp = (Adjectives) n;
                sb1.append(tmp.text() + " ");
            });
        }
        StringBuilder sb2 = new StringBuilder();
        for (Shape elem : Shape.values()) {
            sb2.append(elem.text() + " ");
        }


        return Printer.setSpaces(sb1.toString(), super.getName(), Relations.WITH.text(),
                sb2.toString(), "stones");
    }

    static class Rhythmicity extends Entity {

        protected Rhythmicity(String name) {
            super(name);
        }
    }

    public class Peak extends Entity {

        ArrayList<Thing> cracks; // трещины
        ArrayList<Thing> cavities; // впадины

        public Peak(String name) {
            super(name);
            this.cavities = new ArrayList<>();
            this.cracks = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                cavities.add(new Thing("cavity"));
                cavities.add(new Thing("crack"));
            }

        }
    }

    public class Snow extends Entity {
        private final String height;
        private final String unit;
        private final Adjectives adjective;

        public Snow(String name, String height, String unit, Adjectives adjective) {
            super(name);
            this.adjective = adjective;
            this.height = height;
            this.unit = unit;
        }

        @Override
        public String toString() {
            return Printer.setSpaces(adjective.text(), getName(), height, unit);
        }
    }

}
