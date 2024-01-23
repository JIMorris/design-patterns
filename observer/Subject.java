package observer;

import java.util.ArrayList;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String lovation, String description, ArrayList<String> accomplices);
}
