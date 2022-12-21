package based;

import enums.Adjectives;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void getInstanceOfNowhere() {
        assertEquals(Location.getInstanceOfNowhere(),
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