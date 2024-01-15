package strategy;

public class Defenceman extends Player{

    public Defenceman(String firstName, String lastName){
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenceBehavior(){
        switch (rand.nextInt(0, 10)) {
            case 0:
                this.offenceBehavior = new ShootBehavior();
                break;
            default:
                this.offenceBehavior = new PassBehavior();
                break;
        }
    }
    @Override
    public void setDefenceBehavior(){
        switch (rand.nextInt(0, 2)) {
            case 0:
                this.defenceBehavior = new ChasePuckBehavior();
                break;
        
            default:
                this.defenceBehavior = new BlockBehavior();
                break;
        }
    }

    public String toString(){
        return super.toString() + " plays the position: Defenceman";
    }
}
