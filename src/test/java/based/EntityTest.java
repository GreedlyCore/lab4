package based;

import based.Entity;
import creatures.Human;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {

    @Test
    @DisplayName("getting sinlgeton")
    void getInstanceOfNullObject() {
        assertEquals(Entity.getInstanceOfNullObject(), Entity.getInstanceOfNullObject());
    }

    @Test
    @DisplayName("is hashcode correct?")
    void testHashCode() {
        assertAll(() -> assertEquals(new Entity("TestName") {}.hashCode(),
                        new Entity("TestName") {}.hashCode()),
                () -> assertEquals(new Entity("01234") {}.hashCode(),
                        new Entity("01234") {}.hashCode()),
                () -> assertEquals(new Entity("----") {}.hashCode(),
                        new Entity("----") {}.hashCode())
        );
    }


    @Test
    @DisplayName("is objs are the same?")
    void testEquals() {
        Human obj = new Human("TestName");
        Human obj2 = new Human("TestName"){};
        assertAll( () -> assertEquals(obj, obj),
                () -> assertEquals(obj2, obj2)
        );
    }

    @Test
    void getName() {
        assertAll(() -> assertNotEquals(new Entity("TestName123") {}.toString(),
                        new Entity("TestNasfdgsddfme12343545j") {}.toString()),
                () -> assertEquals(new Entity("01234") {}.toString(),
                        new Entity("01234") {}.toString())
        );
    }
}