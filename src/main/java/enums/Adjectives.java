package enums;

public enum Adjectives {
    ARTIFICIAL("artificial"),
    COLD("cold"),
    SCARY("scary"),
    CLEAR("clear"),
    ANCIENT("ancient"),
    OLD("old"),
    OBJECTIVE("objective"),
    INESCAPABLE("inescapable"),
    GIANT("giant"),
    DANGEROUS("dangerous"),
    STONE("stone"),
    NOTHING(""),
    AESTHETIC(" aesthetic"),
    ETERNAL("eternal"),
    DEMONIC("demonic"),
    FORMLESS("formless"),
    RANDOM("random"),
    MYSTERIOUS("mystery"),
    CRAZY("crazy");
    private final String name;

    Adjectives(String name) {
        this.name = name;
    }

    public static Adjectives getRandomItem() {
        int randInt = (int) (Math.random() * (Adjectives.values().length));
        return Adjectives.values()[randInt];
    }

    public String text() {
        return name;
    }


}