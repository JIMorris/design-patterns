package state;

public class FirstGradeState extends State {

    private static String fileName = "./state/txt/first.txt";

    public FirstGradeState(SpellingList spellingList){
        super(spellingList);
        setWords(FileReader.getWords(fileName));
    }
    public void increaseGrade(){
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }
    public void decreaseGrade(){
        System.out.println("You can't go below First Grade...");
    }
}
