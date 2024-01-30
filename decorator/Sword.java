package decorator;

/**
 * Sword decorator for Player
 * @author Isaac Morris
 */
public class Sword extends PlayerDecorator {

    private static String fileName = "./decorator/txt/sword.txt";
    
    /**
     * Creates a Player by adding a sword to the base Player
     * @param player Player to add a sword to
     */
    public Sword(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
