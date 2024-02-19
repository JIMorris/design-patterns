package iterator;

/**
 * SCRUMBoard ticket
 * @author Isaac Morris
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficutly;

    /**
     * Creates a new Ticket
     * @param name Name of ticket
     * @param teamMember Team member assigned to ticket
     * @param diffcutly Difficulty of ticket
     */
    public Ticket(String name, String teamMember, int diffcutly){
        this.name = name;
        this.teamMember = teamMember;
        this.difficutly = diffcutly;
    }

    /**
     * Returns the name of the ticket
     * @return String of this tickets name
     */
    public String getName(){
        return this.name;
    }
        /**
     * Returns a String representation of this ticket with its name, team member,
     * and difficulty
     * @return String in the format:
     * - <name>(<diffciulty>) - <teamMember>
     */
    public String toString(){
        return "- " + name + "(" + difficutly + ") - " + teamMember;
    }
}
