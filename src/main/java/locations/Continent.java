package locations;

import based.Location;
import enums.Climate;
import enums.Relations;
import helper.Printer;

public final class Continent extends Location {

    private Climate weather;

    public Continent(String name, Climate weather) {
        super(name);
        this.weather = weather;
    }

    public Continent() {
        super("Continent");
        this.weather = weather;

    }

    public Climate getWeather() {
        return weather;
    }

    @Override
    public String toString() {
        return Printer.setSpaces(super.getName(), Relations.WITH.text(), weather.text());
    }


}
