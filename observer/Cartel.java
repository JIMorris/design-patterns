package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * Creates a new Cartel that observes the specified Subject
     * @param cook Subject to observe
     * @author Isaac
     */
    public Cartel(Subject cook){
        this.cook = cook;
        this.cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        sightings.add(new Sighting(location, description, accomplices));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLog() {
        String log = "";
        boolean first = true;
        for(Sighting sighting : sightings){
            if(!first)
                log += "\n";
            log += sighting.getLocation() + " (" + sighting.getDetails()
                    + "), with " + sighting.getAccomplices();
            first = false;
        }
        return log;
    }
    
}
