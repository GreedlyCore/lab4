package enums;

public enum Shape {
    ROUNDED("rounded"), // round
    SQUARED("squared"), // square
    RECTANGLED("rectangled"), // rectangle
    STRANGE("strange"); // for lab4 only

    private final String form;

    Shape(String form) {
        this.form = form;
    }

    /**
     * method for lab3 only
     *
     * @return
     */
    public static Shape getRandomForm() {
        int randInt = (int) (Math.random() * 3);
        return Shape.values()[randInt];

    }

    public String text() {
        return form;
    }

}