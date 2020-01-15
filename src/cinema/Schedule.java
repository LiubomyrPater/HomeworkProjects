package cinema;

import java.util.Set;
import java.util.TreeSet;

public final class Schedule {
    /**
     В Schedule:
     - поле Set<Seance> seances = new TreeSet<>();
     - методи: addSeance (Seance), removeSeance (Seance);
     */
    private  Set<Seance> seances = new TreeSet<>();


    public  Set<Seance> getSeances(){
        return seances;
    }

    public void addSeance(Seance seance){
        this.seances.add(seance);
    }

    public void removeSeance(Seance seance){
        this.seances.remove(seance);
    }
}
