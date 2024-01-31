package state;

public class SpellingList {

    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * Creates new SpellingList in the First Grade State
     */
    public SpellingList(){
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        state = firstGradeState;
    }
    /**
     * Gets the next word from the words list of the current State
     * @return next random word in the words list
     */
    public String getNextWord(){
        return state.getNextWord();
    }
    /**
     * Increase the grade of the spellingList's state
     */
    public void increaseGrade(){
        state.increaseGrade();
    }
    /**
     * Decreases the grade of the spellingList's state
     */
    public void decreaseGrade(){
        state.decreaseGrade();
    }
    /**
     * Returns this spelingList's FirstGradeState
     * @return firstGradeState
     */
    public State getFirstGradeState(){
        return firstGradeState;
    }
    /**
     * Returns this spelingList's SecondGradeState
     * @return secondGradeState
     */
    public State getSecondGradeState(){
        return secondGradeState;
    }
    /**
     * Returns this spelingList's ThirdGradeState
     * @return thirdGradeState
     */
    public State getThirdGradeState(){
        return thirdGradeState;
    }
    /**
     * Sets this spellingList's state to the given State
     * @param state State to set this spellingList's state to
     */
    public void setState(State state){
        this.state = state;
    }
}
