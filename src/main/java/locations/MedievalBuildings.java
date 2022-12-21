package locations;


import based.Location;
import based.Nature;
import enums.Relations;
import helper.Printer;

public class MedievalBuildings extends Location {

    private Nature notCreator;
    private boolean isDensityHigh; /// density ~ плотность


    public MedievalBuildings(String name, Nature notCreator) {
        super(name);
        this.notCreator = notCreator;
    }

    public MedievalBuildings(String name, boolean density) {
        super(name);
        this.isDensityHigh = density;

    }

    public boolean isDensityHigh() {
        return isDensityHigh;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(notCreator.toString(), Relations.OF.text(), this.getName());
    }

}
