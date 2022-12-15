package locations;

import based.Location;
import based.Nature;
import based.Thing;
import enums.Adjectives;
import enums.Climate;
import enums.Relations;
import enums.Shape;
import helper.Printer;

public class Maze extends Location {



    private Thing[] materials;
    private Nature nature;

    public Maze(String name, Nature nature, Adjectives... descriptions) {
        super(name, descriptions);
        this.nature = nature;
        generate();


    }

    public void generate() {
        Thing[] stones = new Thing[500];
        for (int i = 0; i <= 499; i++) {
            Thing stone = new Thing("Stone" + i, Shape.getRandomForm());
            stones[i] = stone;
        }
        this.materials = stones;
    }

    public String giveOpinion() {
        return Printer.setSpaces(Adjectives.CLEAR.text(), "opinion about", nature.toString());
    }

    public Thing[] getMaterials() {
        return materials;
    }

    @Override
    public String toString() {
        StringBuilder builder1 = new StringBuilder();
        if (descriptions != null) {
            for (Adjectives elem : descriptions) {
                builder1.append(elem.text() + " ");
            }
        }
        StringBuilder builder2 = new StringBuilder();
        if (descriptions != null) {
            for (Shape elem : Shape.values()) {
                builder2.append(elem.text() + " ");
            }
        }


        return Printer.setSpaces(builder1.toString(), super.getName(), Relations.WITH.text(),
                builder2.toString(), "stones");
    }

}
