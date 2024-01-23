package observer;

import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * Creates a new Police that observes the specified Subject
     * @param cook Subject to observe
     * @author Isaac
     */
    public Police(Subject cook){
        this.cook = cook;
        this.cook.registerObserver(this);
        locations = new ArrayList<String>();
        notes = "Notes:";
        people = new ArrayList<String>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        boolean repeatLocation = false;
        for(String prevLocation : locations){
            if(prevLocation.equals(location))
                repeatLocation = true;
        }
        if(!repeatLocation)
            locations.add(location);

        for(String currAccomplice : accomplices){
            boolean repeatAccomplice = false;
            for(String prevAccomplice : people){
                if(prevAccomplice.equals(currAccomplice))
                    repeatAccomplice = true;
            }
            if(!repeatAccomplice)
                people.add(currAccomplice);
        }

        notes += "\n- " + description;
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public String getLog() {
        String log = "Locations:";
        for(String location : locations){
            log += "\n- " + location;
        }
        log += "\n\n" + notes + "\n\n" + "Accomplices:";
        for(String person : people){
            log += "\n" + person;
        }
        return log;
    }

    
}
