package cinema;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
/**
        В Cinema:

        - поля:
        TreeMap<Days, Schedule> schedules,
        ArrayList<Movie> moviesLibrary = new ArrayList<>();
        Time open, Time close; - врахувати час відкриття і закриття при формуванні сеансів!

        - методи:
        addMovieInLibrary (Movie, Time...time) - додає фільм в фільмотеку moviesLibrary,
        addSeance (Seance, String) - додає сеанс фільму в розклад (schedules), в конкретний день, який задається параметром String
        removeMovie(Movie) - повністю видаляє фільм з фільмотеки і розкладу, якщо був запланований
        removeSeance (Seance, String) - видаляє конкретний сеанс фільму в конкретний день, який задається параметром String
*/
public class Cinema {


    private TreeMap<Days, Schedule> schedules;
    private TreeMap<Movie,TreeSet<LocalTime>> moviesLibrary;
    private LocalTime open;
    private LocalTime close;


    public Cinema(LocalTime open, LocalTime close) {
        this.schedules = new TreeMap<>();
        this.moviesLibrary = new TreeMap<>();
        this.open = open;
        this.close = close;
    }


    public TreeMap<Movie, TreeSet<LocalTime>> getMoviesLibrary() {
        return moviesLibrary;
    }

    public void setSchedules(TreeMap<Days, Schedule> schedules) {
        this.schedules = schedules;
    }

    public void addMovieInLibrary(Movie movie, TreeSet<LocalTime> localTimes){
        moviesLibrary.put(movie, localTimes);
    }

    public void addSeance(Seance seance, String day){}

    public boolean removeMovie(String movieName){
        Movie temp = finMovie(movieName);
        if (temp != null){
            moviesLibrary.remove(temp);
            return true;
        }else
            return false;
    }

    public void removeSeance(Seance seance, String day){}


    public Movie finMovie(String movieName){
        Movie temp = new Movie(movieName);
        if (moviesLibrary.containsKey(temp)){
            return temp;
        }else
            return null;
    }

}
