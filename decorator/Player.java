package decorator;

import java.util.ArrayList;

/**
 * Video Game Player
 * @author Isaac Morris
 */
public abstract class Player {
    
    protected String name;
    protected ArrayList<String> lines;

    /**
     * Creates a new Player with the given parameters
     * @param lines An ArrayList of Strings of ASCII art of the Player
     * @param name Name of the Player
     */
    public Player(ArrayList<String> lines, String name){
        this.lines = lines;
        this.name = name;
    }
    /**
     * Returns the name of the Player
     * @return Name of the Player as a String
     */
    public String getName(){
        return name;
    }
    /**
     * Returns the Name and ASCII art of the Player
     * @return Name and ASCII art of the Player as a String
     */
    public String toString(){
        String ret = "##### " + name + " #####";
        for(String line : lines)
                ret += "\n" + line;
        return ret;
    }
}
