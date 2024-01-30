package decorator;

import java.util.ArrayList;

public abstract class PlayerDecorator extends Player {
    private Player player;

    public PlayerDecorator(Player player){
        super(player.lines, player.name);
        this.player = player;
    }

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

    private String addDecorLine(char[] playerLine, char[] decorLine){
        for(int i = 0; i < playerLine.length; i++){
            if(decorLine[i] != ' ')
                playerLine[i] = decorLine[i];
        }
        return new String(playerLine);
    }

    private String buffer(String line, int length){
        while(line.length() != length)
            line += " ";
        return line;
    }
}