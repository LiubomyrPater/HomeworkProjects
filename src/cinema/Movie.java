package cinema;

import java.util.Objects;

/**
    В Movie:
        -поля String title, Time duration;
 */
public class Movie implements Comparable<Movie>{

    private String title;
    private int durationMin;


    public Movie(String title) {
        this.title = title;
    }

    public Movie(String title, int durationMin) {
        this.title = title;
        this.durationMin = durationMin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getTitle().compareToIgnoreCase(o.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "{" + title + ", " + durationMin + " min}";
    }
}
