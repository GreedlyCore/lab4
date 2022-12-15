package locations;

import based.Location;
import based.Time;
import enums.Adjectives;
import enums.Climate;
import helper.Printer;

public final class Plateau extends Location {

    private final String height;
    private final String unit;
    private Climate climate;

    private final Location innerPlace;
    private final Time fromTime;

    public Location getInnerPlace() {
        return innerPlace;
    }

    public String getHeight() {
        return height;
    }

    public String getUnit() {
        return unit;
    }

    public Time getFromTime() {
        return fromTime;
    }

    public Plateau(Adjectives[] descriptions, int height, String unit, Climate climate, Time fromTime, Location innerPlace) {
        super("Plateau", descriptions);

        this.height = String.valueOf(height);
        this.unit = unit;
        this.climate = climate;
        this.fromTime = fromTime;
        this.innerPlace = innerPlace;
    }

    private Plateau(PlateauBuilder plateauBuilder) {
        super("Plateau", plateauBuilder.descriptions);
        this.height = plateauBuilder.height;
        this.unit = plateauBuilder.unit;
        this.climate = plateauBuilder.climate;
        this.fromTime = plateauBuilder.fromTime;
        this.innerPlace = plateauBuilder.innerPlace;
    }

    public Climate climate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        StringBuilder descriptionStringBuilder = new StringBuilder();

        for (Adjectives adjective : descriptions) {
            descriptionStringBuilder.append(adjective.text() + " ");
        }
        return Printer.setSpaces(descriptionStringBuilder.toString(), this.getName(), climate.text(), height, unit, innerPlace.toString(), fromTime.toString());
    }

    public static class PlateauBuilder {

        private String height;
        private Adjectives[] descriptions;
        private String unit;
        private Climate climate;
        private Location innerPlace;
        private Time fromTime;

        public PlateauBuilder height(int height) {
            this.height = String.valueOf(height);
            return this;
        }

        public PlateauBuilder description(Adjectives... descriptions) {
            this.descriptions = descriptions;
            return this;
        }

        public PlateauBuilder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public PlateauBuilder climate(Climate climate) {
            this.climate = climate;
            return this;
        }

        public PlateauBuilder innerPlace(Location innerPlace) {
            this.innerPlace = innerPlace;
            return this;
        }

        public PlateauBuilder fromTime(Time fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        public Plateau build() {
            return new Plateau(this);
        }

    }

    public boolean hasInsideStoneJungles() {
        return innerPlace.getClass() == StoneJungles.class;
    }

}
