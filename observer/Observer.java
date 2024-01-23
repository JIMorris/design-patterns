package observer;
import java.util.ArrayList;

/**
 * An observer of the subject
 * @author Isaac
 */
public interface Observer {
    /**
     * Updates the observer based on the variables of the subject
     * @param location String representations of Subjects location
     * @param description String representations of Subjects description
     * @param accomplices ArrayList of Strings representations of Subjects 
     * accomplices
     */
    public void update(String location, String description, ArrayList<String> accomplices);
    /**
     * Returns the logs the Observer has on the Subject
     * @return a String represnetations of the location, description, and
     * accomplices log
     */
    public String getLog();
}
