package strategy;

public class Goalie extends Player{
 
    public Goalie(String firstName, String lastName){
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenceBehavior(){
        this.offenceBehavior = new BlockGoalBehavior();
    }
    @Override
    public void setDefenceBehavior(){
        this.defenceBehavior = new BlockGoalBehavior();
    }

    public String toString(){
        return super.toString() + " plays the position: Goalie";
    }
}
