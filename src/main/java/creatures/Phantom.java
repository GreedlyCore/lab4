package creatures;

import based.Entity;
import based.Thing;
import enums.Adjectives;

public class Phantom extends Entity {

    private Thing[] distortions; // искажения
    private Thing[] exaggerations; // преувеличения

    public Phantom(String name) {
        super(name);
    }


    public void generateDistortions() {
        Thing[] distortions = new Thing[50];
        for (int i = 0; i < 49; i++) {
            distortions[i] = new Thing("distortion", Adjectives.getRandomItem());
        }
        this.setDistortions(distortions);


    }

    public void generateExaggerations() {
        Thing[] exaggerations = new Thing[50];
        for (int i = 0; i < 49; i++) {
            exaggerations[i] = new Thing("exaggerations", Adjectives.getRandomItem());
        }

        this.setExaggerations(exaggerations);
    }

    public Thing[] getDistortions() {
        return distortions;
    }

    public void setDistortions(Thing[] distortions) {
        this.distortions = distortions;
    }

    public Thing[] getExaggerations() {
        return exaggerations;
    }

    public void setExaggerations(Thing[] exaggerations) {
        this.exaggerations = exaggerations;
    }
}
