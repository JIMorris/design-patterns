package state;

public class SecondGradeState extends State {

    private static String fileName = "./state/txt/second.txt";

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
