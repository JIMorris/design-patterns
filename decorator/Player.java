package decorator;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    public Player(ArrayList<String> lines, String name){
        this.lines = lines;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String ret = "";
        boolean firstLoop = true;
        for(String line : lines){
            if(firstLoop)
                ret += line;
            else
                ret += "\n" + line;
            firstLoop = false;
        }
        return ret;
    }
}
