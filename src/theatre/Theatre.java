package theatre;

import theatre.staff.Director;
import theatre.staff.Gender;

public class Theatre {

    public static void main(String[] args) {
        Director director = new Director("Иван", "Иванов", Gender.MALE, 3);
        System.out.println(director);
    }
}
