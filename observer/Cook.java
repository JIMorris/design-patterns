package observer;

import java.util.ArrayList;

public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    public Cook(String name){
        observers = new ArrayList<Observer>();
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for(Observer observer : observers){
            observer.update(location, description, accomplices);
        }
    }

    public void enterSighting(String location, String description, String accomplices){
        ArrayList<String> accompliceList = new ArrayList<String>();
        String[] accompliceArry = accomplices.split(", ");
        for(String accomplice : accompliceArry){
            accompliceList.add(accomplice);
        }
        notifyObservers(location, description, accompliceList);
    }

    public String getName(){
        return name;
    }
}
