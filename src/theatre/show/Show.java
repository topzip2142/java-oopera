package theatre.show;

import theatre.staff.Actor;
import theatre.staff.Director;

import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;
    protected static final String ERROR_NO_ACTORS = "В спектакле никто не участвует!";

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println(ERROR_NO_ACTORS);
            return;
        }

        System.out.println("Список актёров, участвующих в спектакле '" + title + "':");

        for (Actor actor : listOfActors) {
            System.out.println(" " + actor);
        }
    }
    
    public void addActor(Actor newActor) {
        if (!listOfActors.isEmpty()) {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    System.out.println(actor + " уже участвует в спектакле '" + title + "'!");
                    return;
                }
            }
        }
            
        listOfActors.add(newActor);
        System.out.println(newActor + " теперь участвует в спектакле '" + title + "'");
    }
    
    public void changeActor(Actor newActor, String surnameToChange) {
        if (listOfActors.isEmpty()) {
            System.out.println(ERROR_NO_ACTORS);
            return;
        }


        for (int actorIndex = 0; actorIndex < listOfActors.size(); actorIndex++) {
            Actor actor = listOfActors.get(actorIndex);
            if (actor.getSurname().equals(surnameToChange)) {
                listOfActors.set(actorIndex, newActor);

                System.out.println(actor + " заменён на " + newActor + " в спектакле '" + title + "'");
                return;
            }
        }

        System.out.println("Актёра с фамилией '" + surnameToChange + "' нет в спектакле '" + title + "'");
    }
}
