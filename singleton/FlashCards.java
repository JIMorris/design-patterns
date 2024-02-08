import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    private FlashCards(){
        this.rand = new Random();
        this.words = FileReader.getWords();
        this.currentWord = this.words.get(rand.nextInt(words.size()));
    }

    public static FlashCards getInstance(){
        if(flashCards == null){
            flashCards = new FlashCards();
        }
        return flashCards;
    }

    public Word getWord(){
        Word word;
        do{
            word = words.get(rand.nextInt(words.size()));
        } while(word == currentWord);
        currentWord = word;
        return currentWord;
    }
}
