package state;

/**
 * First Grade Spelling List State
 * @author Isaac Morris
 */
public class FirstGradeState extends State {

    private static String fileName = "./state/txt/first.txt";

    /**
     * Creates a new FirstGradeState for the given spellingList
     * @param spellingList spellingList this State is for 
     */
    public FirstGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords(fileName);
    }
    public void increaseGrade(){
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }
    public void decreaseGrade(){
        System.out.println("You can't go below First Grade...");
    }
}
