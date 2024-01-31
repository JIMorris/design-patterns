package state;

public class ThirdGradeState extends State {

    private static String fileName = "./state/txt/third.txt";

    public ThirdGradeState(SpellingList spellingList){
        super(spellingList);
        setWords(FileReader.getWords(fileName));
    }
    public void increaseGrade(){
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }
    public void decreaseGrade(){
        spellingList.setState(spellingList.getSecondGradeState());
        System.out.println("Moving to Second Grade...");
    }
}
