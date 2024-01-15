package strategy;

public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
    public String play(){
        int randomNum = (int)(4*Math.random()) + 1;
        switch (randomNum) {
            case 1:
                return "hand blocks the puck";
            case 2:
                return "catches the puck";
            case 3:
                return "blocks puck with knee pads";
            case 4:
                return "blocks puck with stick";
            default:
                return "err";
        }
    }
}
