package strategy;

public class BlockBehavior implements DefenceBehavior{
    public String play(){
        int randomNum = (int)(3*Math.random()) + 1;
        switch (randomNum) {
            case 1:
                return "blocks player from passing";
            case 2:
                return "blocks player from shooting";
            case 3:
                return "checks player with puck";
            default:
                return "err";
        }
    }
}
