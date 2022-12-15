package enums;

public enum Climate {

    FOREVER_COLD("cold"),
    NOT_FOR_LIVE("not for living here");
    private final String name;

    Climate(String name) {
        this.name = name;
    }

    public String text() {
        return name;
    }

}