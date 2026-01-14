package theatre.show;

import theatre.staff.Actor;
import theatre.staff.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    protected static final String ERROR_NO_ACTORS = "В данном спектакле никто не участвует!";

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println(ERROR_NO_ACTORS);
            return;
        }

        System.out.println("Список актёров, участвующих в спектакле:");

        for (Actor actor : listOfActors) {
            System.out.println(" " + actor);
        }
    }
    
    public void addActor(Actor newActor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(newActor);
        } else {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println("Такой актёр уже участвует в спектакле!");
                    return;
                }
            }
            
            listOfActors.add(newActor);
            System.out.println(newActor + " теперь участвует в спектакле");
        }
    }
    
    public void changeActor(Actor newActor, String surnameToChange) {
        if (listOfActors.isEmpty()) {
            System.out.println(ERROR_NO_ACTORS);
            return;
        }


        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surnameToChange)) {
                Actor oldActor = actor;
                listOfActors.remove(i);
                listOfActors.add(newActor);

                System.out.println(oldActor + "заменён на " + newActor);
                return;
            }
        }

        System.out.println("Актёра с фамилией '" + surnameToChange + "' нет в данном спектакле");
    }
}
