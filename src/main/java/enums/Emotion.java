package enums;

public enum Emotion {
    WONDER("wonder"),
    MISTRUST("mistrust"),
    DELIGHT("delight"),
    HORROR("horror");
    private final String name;

    Emotion(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }
}
