package enums;

public enum Adjectives {
    ARTIFICAL("artificial"),
    COLD("cold"),
    SCARY("scary"),
    CLEAR("clear"),
    ANCIENT("ancient"),
    OLD("old"),
    OBJECTIVE("objective"),
    INESCAPABLE("inescapable"),
    GIANT("giant"),
    DANGEROUS("dangerous"),
    STONE("stone");


    private final String name;

    Adjectives(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }

    public static Adjectives getRandomItem() {
        int randInt = (int) (Math.random() * (Adjectives.values().length));
        return Adjectives.values()[randInt];
    }


}