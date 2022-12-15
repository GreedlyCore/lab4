package locations;


import based.Location;
import based.Nature;
import enums.Adjectives;
import enums.Relations;
import helper.Printer;

public class MedievalBuildings extends Location {

    private Nature notCreator;


    public MedievalBuildings(String name, Nature notCreator, Adjectives[] description) {
        this(name, notCreator);
        super.descriptions = description;
    }

    public MedievalBuildings(String name, Nature notCreator) {
        super(name);
        this.notCreator = notCreator;
    }


    @Override
    public String toString() {
        return Printer.setSpaces(notCreator.toString(), Relations.OF.text(), this.getName());
    }

}
