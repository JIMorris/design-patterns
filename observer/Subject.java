package observer;

import java.util.ArrayList;

/**
 * A Subject to be observed
 * @author Isaac
 */
public interface Subject {
    /**
     * Adds an Observer to the Subjects ArrayList of Observers
     * @param observer Observer to be added to the ArrayList
     */
    public void registerObserver(Observer observer);
    /**
     * Remoces an Observer from the Subjects ArrayList of Observers
     * @param observer Observer to be removed from the ArrayList
     */
    public void removeObserver(Observer observer);
    /**
     * Notifies(updates) all Observers in the ArrayList of the Subjects new
     * location, description, and accomplices
     * @param location String representations of Subjects location
     * @param description String representations of Subjects description
     * @param accomplices ArrayList of Strings representations of Subjects 
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
