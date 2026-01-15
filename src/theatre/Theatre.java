package theatre;

import theatre.staff.*;
import theatre.show.*;

public class Theatre {

    public static void main(String[] args) {
        Actor actorPetrov = new Actor("Александр", "Петров", Gender.MALE, 178);
        Actor actorHodchenkova = new Actor("Светлана", "Ходченкова", Gender.FEMALE, 179);
        Actor actorRedcliff = new Actor("Даниэль", "Рэдклифф", Gender.MALE, 165);

        Director directorTuminas = new Director("Римас", "Туминас", Gender.MALE, 30);
        Director directorChusova = new Director("Нина", "Чусова", Gender.FEMALE, 40);

        Person musicAuthorZimmer = new Person("Ханс", "Циммер", Gender.MALE);
        Person choreographerGrigorovich = new Person("Юрий", "Григорович", Gender.MALE);

        String librettoOfBallet = "Она ищет себя в мире теней и воспоминаний; Он воплощает неумолимое время; "
                                + "их дуэты — борьба и притяжение, а финальный танец с «серебряной нитью» "
                                + "символизирует примирение души со временем и принятие прошлого.";
        String librettoOfOpera = "Лия мечтает о сцене, но её голос тонет в шуме «голосов»"
                                     + "соцсетей; с помощью друга Макса и через противостояние"
                                     + " мистическому Эхо она находит силу в собственной искренности, "
                                     + " завершая шоу манифестом: «Мой голос — мой выбор», — при поддержке всех "
                                     + "персонажей и зрителей.";

        Show show = new Show("Часы без стрелок", 105, directorTuminas);

        Ballet ballet = new Ballet("Серебряная нить", 90,
                                    directorChusova, musicAuthorZimmer,
                                    librettoOfBallet, choreographerGrigorovich);

        Opera opera = new Opera("Громче, чем эхо!", 120,
                                directorChusova, musicAuthorZimmer,
                                librettoOfOpera, 25);

        show.addActor(actorPetrov);
        show.addActor(actorPetrov);
        show.addActor(actorRedcliff);

        ballet.addActor(actorPetrov);
        ballet.addActor(actorHodchenkova);

        opera.addActor(actorPetrov);
        opera.addActor(actorHodchenkova);
        opera.addActor(actorRedcliff);

        show.printActors();
        ballet.printActors();
        opera.printActors();

        show.changeActor(actorHodchenkova, "Рэдклифф");
        show.printActors();

        opera.changeActor(actorPetrov, "Грин");

        ballet.printLibrettoText();
        opera.printLibrettoText();

    }
}
