import theatre.Director;
import theatre.Gender;

public class Theatre {

    public static void main(String[] args) {
        Director director = new Director("Иван", "Иванов", Gender.MALE, 3);
        System.out.println(director.toString());
    }
}
