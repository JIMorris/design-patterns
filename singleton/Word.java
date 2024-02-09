
/**
 * A word with info about the word
 * @author Isaac Morris
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructs a new word with the given arguments
     * @param word String representation of the word
     * @param type Part of speech of the word
     * @param definition Definition of the word
     * @param sentence The word used in a sentence
     */
    public Word(String word, String type, String definition, String sentence){
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
    /**
     * Returns the String version of this word
     * @return This word as a String
     */
    public String getWord(){
        return word;
    }
    /**
     * Returns the part of speech and definition of this word, as well as it
     * used in a sentence
     * @return The description of this word with the form:
     * Part of Speech: <type>
     * Definition: <definition>
     * <sentence>
     */
    public String getDescription(){
        String description = "";
        description += "Part of Speech: " + type + "\n";
        description += "Definition: " + definition + "\n";
        description += sentence;
        return description;
    }
}
