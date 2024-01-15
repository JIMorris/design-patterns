package strategy;

import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand = new Random();

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();
    
    public String play(boolean possession){
        if(possession){
            return offenceBehavior.play();
        }
        return defenceBehavior.play();
    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

}
