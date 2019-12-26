package cinema;

import java.util.Set;
import java.util.TreeSet;
/**
    В Schedule:
        - поле Set<Seance> seances = new TreeSet<>();
        - методи: addSeance (Seance), removeSeance (Seance);
*/
public class Schedule {

    private Set<Seance> seances = new TreeSet<>();

    public void addSeance(Seance seance){
        seances.add(seance);
    }

    public void removeSeance(Seance seance){
        seances.remove(seance);
    }
}
