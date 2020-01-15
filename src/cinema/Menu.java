package cinema;

import service.Input;

import java.time.LocalTime;
import java.util.TreeSet;

public abstract class Menu {

    static void addSeanceSchedule(boolean language, Cinema cinema){

    }

    static void removeSeanceSchedule(boolean language, Cinema cinema){

    }

    static void addMovie(boolean language, Cinema cinema){
        String movieName;
        while (true){
            System.out.print(UserInterface.INPUT_MOVIE_NAME.getText(language));
            movieName = Input.getString().trim();
            if (movieName.isEmpty())
                System.out.println(UserInterface.NAME_IS_EMPTY.getText(language));
            else break;
        }

        int duration;
        while (true){
            System.out.print(UserInterface.INPUT_MOVIE_DURATION.getText(language));
            duration = Input.getInt();
            if (duration <= 0)
                System.out.println(UserInterface.DURATION_IS_EMPTY.getText(language));
            else break;
        }

        TreeSet<LocalTime> localTimes = Service.parsingTimes(language);

        cinema.addMovieInLibrary(new Movie(movieName, duration), localTimes);
    }

    static void addSeanceCinema(boolean language, Cinema cinema){

    }

    static void removeMovie(boolean language, Cinema cinema){
        String movieName;
        System.out.print(UserInterface.INPUT_MOVIE_NAME.getText(language));
        movieName = Input.getString().trim();

        if (!cinema.removeMovie(movieName))
            System.out.println("\n" + UserInterface.MOVIE_NOT_FOUND.getText(language));
        else
            System.out.println("\n" + UserInterface.MOVIE_DELETED.getText(language));

    }

    static void removeSeanceCinema(boolean language, Cinema cinema){

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
