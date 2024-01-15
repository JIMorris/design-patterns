package strategy;

public class Forward extends Player{
    public Forward(String firstName, String lastName){
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenceBehavior(){
        switch (rand.nextInt(0,2)) {
            case 0:
                this.offenceBehavior = new PassBehavior();
                break;    
            default:
                this.offenceBehavior = new ShootBehavior();
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
        return super.toString() + " plays the position: Forward";
    }
}
