package based;

import helper.Printer;

public final class Time extends Entity {

    private int count;
    private String unit;

    private Entity object;

    public Time(int count, String unit, Entity object) {
        super("time");
        this.count = count;
        this.unit = unit;
        this.object = object;

    }

    public Time(String name, Entity object) {
        super(name);
        this.object = object;
    }

    public Time(int count, String unit) {
        super("time");
        this.count = count;
        this.unit = unit;
    }

    public Time(String unit) {
        super("time");
        this.unit = unit;
    }

    public Time(Entity obj) {
        super("time");
        this.object = obj;
    }

    public Entity getObject() {
        return object;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(super.getName(), String.valueOf(count), unit, object.toString());
    }


}
