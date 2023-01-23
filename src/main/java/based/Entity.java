package based;

import annotations.MarkerAnnottation;
import exceptions.UnnamedEntityInstanceException;

@MarkerAnnottation
public abstract class Entity {
    private static Entity noneObject;
    private final String name;

    protected Entity(String name) {
        if (name.equals("")) {
            throw new UnnamedEntityInstanceException("can't create Instance of Entity with blank name. name it!!!!");
        } else {
            this.name = name;
        }


    }
    public static Entity getInstanceOfNullObject() {
        if (noneObject == null) {
            noneObject = new Entity("NothingObject") {
                @Override
                public String toString() {
                    return "";
                }
            };
        }
        return noneObject;
    }
    public int hashCode() {
        int result = 0;
        for (char chr : name.toCharArray()) {
            result += 965 * Character.getNumericValue(chr) - 9;
        }
        return result;
//        long unixTime = Instant.now().getEpochSecond();
//        if (Integer.MAX_VALUE < unixTime) {
//            return (int) unixTime;
//        }
//        return (int) unixTime % 1000000000;

    }
    @Override
    public String toString() {
        return name;

    }
    @Override
    public boolean equals(Object obj) {
        Entity object = (Entity) obj;
        return obj.hashCode() == this.hashCode()
                && obj.getClass() == this.getClass() &&
                name.equals(object.getName());
    }

    public String getName() {
        return name;
    }
}
