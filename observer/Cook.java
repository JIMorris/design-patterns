package observer;

import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates new Cook(Subject) with specified name
     * @param name String representation of the Cooks name
     * @author Isaac
     */
    public Cook(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers){
            observer.update(location, description, accomplices);
        }
    }

    /**
     * Adds a sighting of this Cook and notifies all observers of the sighting
     * @param location The location of the sighting
     * @param details Extra details about the sighting
     * @param accomplices Accomplices at the sighting
     */
    public void enterSighting(String location, String description, String accomplices){
        ArrayList<String> accompliceList = new ArrayList<String>();
        String[] accompliceArry = accomplices.split(", ");
        for(String accomplice : accompliceArry){
            accompliceList.add(accomplice);
        }
        notifyObservers(location, description, accompliceList);
    }

    /**
     * Returns the name of this Cook
     * @return String representation of this Cooks name
     */
    public String getName(){
        return name;
    }
}
