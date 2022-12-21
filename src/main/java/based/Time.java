package based;

import exceptions.TimeInvalidFormatException;
import helper.Printer;

public final class Time extends Entity {

    private int count;
    private String unit;

    private final Entity object;

    public Time(int count, String unit, Entity object) throws TimeInvalidFormatException {
        super("time");
        if (count < 0) {
            throw new TimeInvalidFormatException("invalid time format while creating Time new instance");
        }
        this.count = count;
        this.unit = unit;
        this.object = object;

    }

    public Time(String name, Entity object) {
        super(name);
        this.object = object;
    }

    public Time(int count, String unit) {
        this();
        this.count = count;
        this.unit = unit;
    }

    public Time(String unit) {
        this();
        this.unit = unit;
    }

    public Time(Entity obj) {
        super("time:");
        this.object = obj;
    }

    public Time() {
        super("time:");
        this.object = getInstanceOfNullObject();

    }

    public Entity getObject() {
        return object;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        if (count != 0) {
            return Printer.setSpaces(super.getName(), String.valueOf(count), unit, object.toString());
        }
        return Printer.setSpaces(super.getName(), unit, object.toString());

    }


}
