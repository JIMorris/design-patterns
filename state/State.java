package state;

import java.util.ArrayList;
import java.util.Random;

/**
 * Abstract Spelling List State
 * @author Isaac Morris
 */
public abstract class State {

    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * Creates a new State for the given spellingList
     * @param spellingList spellingList this State is for
     */
    public State(SpellingList spellingList){
        this.spellingList = spellingList;
        rand = new Random();
    }
    /**
     * Get the next random word from the words list
     * @return next random word
     */
    public String getNextWord(){
        return words.get(rand.nextInt(words.size()));
    }
    /**
     * Increase the grade of this state
     */
    public abstract void increaseGrade();
    /**
     * Decrease the grade of this state
     */
    public abstract void decreaseGrade();
}
