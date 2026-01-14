package theatre.show;

import theatre.staff.Director;
import theatre.staff.Person;

public class MusicalShow extends Show {
    private Person musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто:");
        System.out.println(getLibrettoText());
    }
}
