package iterator;

/**
 * SCRUM Board
 * @author Isaac Morris
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * Creates a new SCRUMBoard with the given name
     * @param projectName Name of board
     */
    public SCRUMBoard(String projectName){
        this.projectName = projectName;
        todo = new TaskList("Todo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }

    /**
     * Creates a Ticket and adds it to the SCRUMBoard
     * @param name Name of ticket
     * @param teamMember Team member assigned to ticket
     * @param diffcutly Difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int diffcutly){
        todo.addTicket(new Ticket(name, teamMember, diffcutly));
    }
    /**
     * Starts a ticket and moves it to the Doing list
     * @param name Name of the ticket to start
     * @return Boolean representing whether the ticket was found
     */
    public boolean startTicket(String name){
        Ticket ticket = todo.getTicket(name);
        if(ticket == null)
            return false;
        doing.addTicket(ticket);
        return true;
    }
    /**
     * Finishes a ticket and moves it to the Done list
     * @param name Name of the ticket to finish
     * @return Boolean representing whether the ticket was found
     */
    public boolean finishTicket(String name){
        Ticket ticket = doing.getTicket(name);
        if(ticket == null)
            return false;
        done.addTicket(ticket);
        return true;
    }
    /**
     * Returns the SCRUMBoard, its lists, and its tickets as a String
     * @return String in the format:
     * ***** <projectName> *****
     * Todo
     * - <ticket>
     * - <ticket>
     * ...
     * 
     * Doing
     * - <ticket>
     * - <ticket>
     * ...
     * 
     * Done
     * - <ticket>
     * - <ticket>
     * ...
     */
    public String toString(){
        String string = "***** " + projectName + " *****\n"
            + todo.toString() + "\n\n"
            + doing.toString() + "\n\n"
            + done.toString();
        return string;
    }
}
