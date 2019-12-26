package cinema;

import java.time.LocalTime;
import java.util.Objects;

/**
    В Seance:
        - поля Movie movie, Time startTime, Time endTime;
        - в конструктор має надходити параметрами значення для перших двох полів,
          третє поле повинне обчислюватись (startTime + movie.duration);
 */
public class Seance implements Comparable<Movie>{

    private Movie movie;
    private LocalTime startTime;
    private LocalTime endTime;

    public Seance(Movie movie, LocalTime startTime) {
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = startTime.plusMinutes(movie.getDurationMin());
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public int compareTo(Movie o) {
        return this.movie.getTitle().compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(movie, startTime);
    }

    @Override
    public String toString() {
        return "{" + movie + ", start: " + startTime + ", end: " + endTime + '}';
    }
}
