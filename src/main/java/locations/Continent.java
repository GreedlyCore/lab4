package locations;

import based.Entity;
import based.Location;
import based.Thought;
import enums.Adjectives;
import enums.Climate;
import enums.Relations;
import helper.Printer;

import java.util.ArrayList;

public class Continent extends Location {

    private final Climate weather;

    public Continent(String name, Climate weather) {
        super(name);
        this.weather = weather;
    }


    public Climate getWeather() {
        return weather;
    }


    @Override
    public String toString() {
        return Printer.setSpaces(super.getName(), Relations.WITH.text(), weather.text());
    }

    public class Myths extends Entity {
        private ArrayList<Thought> myths;
        private ArrayList<Adjectives> desc;

        public Myths(String name, ArrayList<Adjectives> desc) {
            super(name);
        }

        public ArrayList<Thought> getMyths() {
            return myths;
        }

        public void setMyths(ArrayList<Thought> myths) {
            this.myths = myths;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            myths.forEach((n) -> sb.append(n + " "));
            return Printer.setSpaces(getName(), sb.toString());
        }
    }


}
