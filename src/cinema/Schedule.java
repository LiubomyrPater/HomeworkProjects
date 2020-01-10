package cinema;

import java.util.Set;
import java.util.TreeSet;
/**
    В Schedule:
        - поле Set<Seance> seances = new TreeSet<>();
        - методи: addSeance (Seance), removeSeance (Seance);
*/
public class Schedule {

    private static Set<Seance> seances = new TreeSet<>();

    public static void addSeance(Seance seance){
        seances.add(seance);
    }

    public static void removeSeance(Seance seance){
        seances.remove(seance);
    }
}
