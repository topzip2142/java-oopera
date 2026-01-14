package theatre.show;

import theatre.staff.Director;
import theatre.staff.Person;

public class MusicalShow extends Show {
    protected final Person musicAuthor;
    protected final String librettoText;

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println(title + ". Либретто:");
        System.out.println(getLibrettoText());
    }
}
