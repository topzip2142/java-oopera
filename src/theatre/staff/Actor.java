package theatre.staff;

import java.util.Objects;

public class Actor extends Person {
    private final int height;
    private static final int HASH_SIMPLE_NUMBER_ONE = 17;
    private static final int HASH_SIMPLE_NUMBER_TWO = 31;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public int hashCode() {

        int hash = HASH_SIMPLE_NUMBER_ONE;

        hash = hash + name.hashCode();
        hash = hash * HASH_SIMPLE_NUMBER_TWO;
        hash = hash + surname.hashCode();
        hash = hash * HASH_SIMPLE_NUMBER_TWO;
        hash = hash + gender.hashCode();
        hash = hash * HASH_SIMPLE_NUMBER_TWO;
        hash = hash + height;

        return hash;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor anotherActor = (Actor) obj;

        return  Objects.equals(name, anotherActor.name) &&
                Objects.equals(surname, anotherActor.surname) &&
                Objects.equals(gender, anotherActor.gender) &&
                Objects.equals(height, anotherActor.height);
    }

    @Override
    public String toString() {
        return name + " " + surname + "(" + height + " см)";
    }
}
