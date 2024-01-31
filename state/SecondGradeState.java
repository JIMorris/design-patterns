package state;

/**
 * Second Grade Spelling List State
 * @author Isaac Morris
 */
public class SecondGradeState extends State {

    private static String fileName = "./state/txt/second.txt";

    /**
     * Creates a new SecondGradeState for the given spellingList
     * @param spellingList spellingList this State is for 
     */
    public SecondGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords(fileName);
    }
    public void increaseGrade(){
        spellingList.setState(spellingList.getThirdGradeState());
        System.out.println("Moving to Third Grade...");
    }
    public void decreaseGrade(){
        spellingList.setState(spellingList.getFirstGradeState());
        System.out.println("Moving to First Grade...");
    }
}
