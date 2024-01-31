package state;

/**
 * Third Grade Spelling List State
 * @author Isaac Morris
 */
public class ThirdGradeState extends State {

    private static String fileName = "./state/txt/third.txt";

    /**
     * Creates a new ThirdGradeState for the given spellingList
     * @param spellingList spellingList this State is for 
     */
    public ThirdGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords(fileName);
    }
    public void increaseGrade(){
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }
    public void decreaseGrade(){
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }
}
