package locations;

import based.Location;
import based.Thing;
import enums.Adjectives;
import helper.Printer;

public class Desert extends Location {
    Thing ruinOfTornados;
    Maze ruinOfMaze;

    public Desert(String name, Adjectives... adjectives) {
        super(name, adjectives);
    }

    public Desert(String name, Maze maze, Adjectives... adjectives) {
        super(name, adjectives);
        this.ruinOfMaze = maze;
        this.ruinOfTornados = new Thing<>("tornado",
                Adjectives.DANGEROUS);
    }

    @Override
    public String toString() {
        return Printer.setSpaces(super.toString(), ruinOfMaze.toString(), ruinOfTornados.toString());
    }

    public class Cliff extends Location {
        private final Thing wasMadeBy;
        private final Thing special;

        public Cliff(String name, Thing t, Thing ability) {
            super(name);
            wasMadeBy = t;
            special = ability;
        }


        @Override
        public String toString() {
            return Printer.setSpaces(getName(), "was made by",
                    wasMadeBy.toString()//,special.toString()
            );
        }
    }
}
