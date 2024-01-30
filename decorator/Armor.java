package decorator;

/**
 * Armor decorator for Player
 * @author Isaac Morris
 */
public class Armor extends PlayerDecorator {

    private static String fileName = "./decorator/txt/armor.txt";
    
    /**
     * Creates a Player by adding armor to the base Player
     * @param player Player to add armor to
     */
    public Armor(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
