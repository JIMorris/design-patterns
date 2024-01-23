package observer;

import java.util.ArrayList;

/**
 * A sighting of the subject (Heizenberg)
 * @author Isaac
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Creates a new Sighting with the provided location, details, and accomplices
     * @param location The location of the sighting
     * @param details Extra details about the sighting
     * @param accomplices Accomplices at the sighting
     */
    public Sighting(String location, String details, ArrayList<String> accomplices){
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Returns this Sightings location
     * @return String representation of the Sightings location
     */
    public String getLocation(){
        return location;
    }
    /**
     * Returns ths Sigthings details
     * @return String represntations of the Sightings details
     */
    public String getDetails(){
        return details;
    }
    /**
     * Returns this Sightings accomplices
     * @return String represntations of the Sightings accomplices
     */
    public String getAccomplices(){
        String accomplicesString = "";
        boolean first = true;
        for(String accomplice : accomplices){
            if(first)
                accomplicesString = accomplice;
            else
                accomplicesString += ", " + accomplice;
            first = false;
        }
        return accomplicesString;
    }
}
