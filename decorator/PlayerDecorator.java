package decorator;

import java.util.ArrayList;

/**
 * Accessory for the Player
 * @author Isaac Morris
 */
public abstract class PlayerDecorator extends Player {

    private Player player;

    /**
     * Creates a new PlayerDecorator with the provided base Player
     * @param player Player to be decorated
     */
    public PlayerDecorator(Player player){
        super(player.lines, player.name);
        this.player = player;
    }
    /**
     * Adds the decor to the base Player
     * @param decor Accessory to be added to the Player
     */
    protected void integrateDecor(ArrayList<String> decor){
        for(int i = 0; i < lines.size(); i++){
            String playerLine = player.lines.get(i);
            String decorLine = decor.get(i);
            if(decorLine.length() < playerLine.length())
                decorLine = buffer(decorLine, playerLine.length());
            else if(decorLine.length() > playerLine.length())
                playerLine = buffer(playerLine, decorLine.length());
            String newLine = addDecorLine(playerLine.toCharArray(), 
                                                decorLine.toCharArray());
            this.lines.set(i, newLine);
        }
    }

    /**
     * Adds ASCII art from decorLine over ASCII art in playerLine
     * @param playerLine Base line to be edited
     * @param decorLine Line to add to playerLine
     * @return The combined lines as a String
     */
    private String addDecorLine(char[] playerLine, char[] decorLine){
        for(int i = 0; i < playerLine.length; i++){
            if(decorLine[i] != ' ')
                playerLine[i] = decorLine[i];
        }
        return new String(playerLine);
    }
    /**
     * Adds space to the end of a String to make it a given lenth
     * @param line String to add space to
     * @param length Length to make the String
     * @return The original String with the additional space added
     */
    private String buffer(String line, int length){
        while(line.length() < length)
            line += " ";
        return line;
    }
}