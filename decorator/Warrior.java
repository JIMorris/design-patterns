package decorator;

/**
 * A Wairror Player
 * @author Isaac Morris
 */
public class Warrior extends Player {
    
    private static String fileName = "./decorator/txt/warrior.txt";

    /**
     * Creates a new blank Warrior Player
     * @param name Name of Player
     */
    public Warrior(String name){
        super(FileReader.getLines(fileName), name);
    }
}
