package state;

import java.util.ArrayList;
import java.util.Random;

public abstract class State {

    protected SpellingList spellingList;
    private ArrayList<String> words;
    private Random rand;

    public State(SpellingList spellingList){
        this.spellingList = spellingList;
        rand = new Random();
    }
    public String getNextWord(){
        return words.get(rand.nextInt(words.size()));
    }
    public abstract void increaseGrade();
    public abstract void decreaseGrade();

    protected void setWords(ArrayList<String> words){
        this.words = words;
    }
}