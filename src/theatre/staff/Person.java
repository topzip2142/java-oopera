package theatre.staff;

public class Person {
    protected String name;
    protected String surname;
    protected Gender gender;
    protected static final int HASH_SIMPLE_NUMBER_ONE = 17;
    protected static final int HASH_SIMPLE_NUMBER_TWO = 31;

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
}
