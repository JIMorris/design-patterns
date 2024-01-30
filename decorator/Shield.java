package decorator;

/**
 * Shield decorator for Player
 * @author Isaac Morris
 */
public class Shield extends PlayerDecorator {

    private static String fileName = "./decorator/txt/shield.txt";
    
    /**
     * Creates a Player by adding a shiled to the base Player
     * @param player Player to add a shield to
     */
    public Shield(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
