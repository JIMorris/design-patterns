package observer;

import java.util.ArrayList;

public class Police implements Observer {
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    public Police(Subject cook){
        this.cook = cook;
        this.cook.registerObserver(this);
        locations = new ArrayList<String>();
        notes = "Notes:";
        people = new ArrayList<String>();
    }

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
