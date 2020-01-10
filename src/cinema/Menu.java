package cinema;

import java.time.LocalTime;

public abstract class Menu {

    static void addSeanceSchedule(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Schedule.addSeance(new Seance(new Movie("1",1), LocalTime.now()));
    }

    static void removeSeanceSchedule(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Schedule.removeSeance(new Seance(new Movie("1", 1), LocalTime.now()));
    }

    static void addMovie(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Cinema.addMovie(new Movie("1", 1), LocalTime.now());
    }

    static void addSeanceCinema(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Cinema.addSeance(new Seance(new Movie("1", 1), LocalTime.now()), "Friday");
    }

    static void removeMovie(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Cinema.removeMovie(new Movie("1", 1));
    }

    static void removeSeanceCinema(boolean language, Cinema cinema){
        System.out.println(UserInterface.ACTION_EMPTY.getText(language));
        //Cinema.removeSeance(new Seance(new Movie("1", 1), LocalTime.now()), "Friday");
    }

    static void printMenu(boolean language){
        System.out.print("\n" +
                         UserInterface.ADD_SEANCE_SCHEDULE.getText(language) + "\n" +
                         UserInterface.REMOVE_SEANCE_SCHEDULE.getText(language) + "\n" +
                         UserInterface.ADD_MOVIE.getText(language) + "\n" +
                         UserInterface.ADD_SEANCE_CINEMA.getText(language) + "\n" +
                         UserInterface.REMOWE_MOVIE.getText(language) + "\n" +
                         UserInterface.REMOVE_SEANCE_CINEMA.getText(language) + "\n" +
                         UserInterface.GO_BACK.getText(language) + "\n" +
                         UserInterface.INPUT.getText(language));
    }
}
