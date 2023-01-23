package locations;

import based.Location;
import enums.Adjectives;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocatedInsideTest {

    @Test
    void getInstanceOfNowhere() {
        Assertions.assertEquals(Location.getInstanceOfNowhere(),
                Location.getInstanceOfNowhere());
    }

    @Test
    void getInstanceOfNoDesctiption() {
        assertEquals(Location.getInstanceOfNoDesctiption(),
                Location.getInstanceOfNoDesctiption());
    }

    @Test
    void getDescriptions() {
        Location loc = new Location("l", Adjectives.CRAZY) {
        };
        assertEquals(loc, loc);
    }
}