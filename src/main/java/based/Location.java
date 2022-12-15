package based;


import enums.Adjectives;

public abstract class Location extends Entity {

    protected Adjectives[] descriptions;


    public Location(String name, Adjectives... adjectives) {
        super(name);
        this.descriptions = adjectives;

    }

    public Location(String name) {
        super(name);
        this.descriptions = null;

    }

    public Adjectives[] getDescriptions() {
        return descriptions;
    }



}
