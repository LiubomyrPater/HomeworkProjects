package cinema;

import java.util.Set;
import java.util.TreeSet;

public final class Schedule {
    /**
     В Schedule:
     - поле Set<Seance> seances = new TreeSet<>();
     - методи: addSeance (Seance), removeSeance (Seance);
     */
    private static Set<Seance> seances = new TreeSet<>();


    public static Set<Seance> getSeances(){
        return seances;
    }

    public static void addSeance(Seance seance){
        seances.add(seance);
    }

    public static void removeSeance(Seance seance){
        seances.remove(seance);
    }
}
