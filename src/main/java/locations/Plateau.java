package locations;

import based.Location;
import based.Time;
import enums.Adjectives;
import enums.Climate;
import enums.Relations;
import helper.Printer;

public class Plateau extends Location {

    private String height;
    private String unit;
    private Climate climate;

    private Location innerPlace;
    private Time fromTime;

    public Plateau(Adjectives[] descriptions, int height, String unit, Climate climate, Time fromTime, Location innerPlace) {
        super("Plateau", descriptions);

        this.height = String.valueOf(height);
        this.unit = unit;
        this.climate = climate;
        this.fromTime = fromTime;
        this.innerPlace = innerPlace;
    }

    public Plateau(String name, Adjectives description) {
        super(name, description);

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
        return Printer.setSpaces(super.toString(), this.getName(), height, unit,
                Relations.WITH.text(), climate.text());
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

}
