package cinema;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.TreeMap;
/**
        В Cinema:

        - поля:
        TreeMap<Days, Schedule> schedules,
        ArrayList<Movie> moviesLibrary = new ArrayList<>();
        Time open, Time close; - врахувати час відкриття і закриття при формуванні сеансів!

        - методи:
        addMovie (Movie, Time...time) - додає фільм в фільмотеку moviesLibrary,
        addSeance (Seance, String) - додає сеанс фільму в розклад (schedules), в конкретний день, який задається параметром String
        removeMovie(Movie) - повністю видаляє фільм з фільмотеки і розкладу, якщо був запланований
        removeSeance (Seance, String) - видаляє конкретний сеанс фільму в конкретний день, який задається параметром String
*/
public class Cinema {

    private TreeMap<Days, Schedule> schedules;
    private ArrayList<Movie> moviesLibrary;
    private LocalTime open;
    private LocalTime close;

    public Cinema(LocalTime open, LocalTime close) {
        this.schedules = new TreeMap<>();
        this.moviesLibrary = new ArrayList<>();
        this.open = open;
        this.close = close;
    }

    public static void addMovie(Movie movie, LocalTime localTime){}

    public static void addSeance(Seance seance, String day){}

    public static void removeMovie(Movie movie){}

    public static void removeSeance(Seance seance, String day){}
}
