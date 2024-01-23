package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
    private Subject cook;
    private ArrayList<Sighting> sightings;

    public Cartel(Subject cook){
        this.cook = cook;
        this.cook.registerObserver(this);
        sightings = new ArrayList<Sighting>();
    }

    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        sightings.add(new Sighting(location, description, accomplices));
    }

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
