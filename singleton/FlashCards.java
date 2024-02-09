import java.util.ArrayList;
import java.util.Random;

/**
 * A singleton collection of flash cards
 * @author Isaac Morris
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * Creates a FlashCards instance (once)
     */
    private FlashCards(){
        this.rand = new Random();
        this.words = FileReader.getWords();
        this.currentWord = this.words.get(rand.nextInt(words.size()));
    }

    /**
     * Returns this instance of FlashCards, creating the instance if not 
     * constructed yet
     * @return this FlashCards
     */
    public static FlashCards getInstance(){
        if(flashCards == null){
            flashCards = new FlashCards();
        }
        return flashCards;
    }
    /**
     * Returns a new random word from the words list
     * @return a random word
     */
    public Word getWord(){
        Word word;
        do{
            word = words.get(rand.nextInt(words.size()));
        } while(word == currentWord);
        currentWord = word;
        return currentWord;
    }
}
