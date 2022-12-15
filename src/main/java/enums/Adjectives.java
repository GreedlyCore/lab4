package enums;

public enum Adjectives {
    ARTIFICAL("artificial"),
    COLD("cold"),
    COMMON("common"),
    SCARY("scary"),
    CLEAR("clear"),
    BROKEN("broken"),
    ANCIENT("ancient"),
    UNUSABLE("unusable"),
    DOUBTFUL("doubtful"),
    OLD("old"),
    OBJECTIVE("objective"),
    INESCAPABLE("inescapable"),
    PHYSICAL("physical"),
    GIANT("giant"),
    MULTI("multi"),
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