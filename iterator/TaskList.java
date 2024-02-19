package iterator;

import java.util.Iterator;

/**
 * A list of Tickets
 * @author Isaac Morris
 */
public class TaskList {
    private final static int SIZE = 100;
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * Creates a new task list
     * @param name Name of list
     */
    public TaskList(String name){
        this.name = name;
        tickets = new Ticket[SIZE];
        count = 0;
    }

    /**
     * Creates a Ticket and adds it to the list
     * @param name Name of ticket
     * @param teamMember Team member assigned to ticket
     * @param diffcutly Difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty){
        tickets[count++] = new Ticket(name, teamMember, difficulty);
    }
    /**
     * Adds a ticket it to the list
     * @param ticket Ticket to add to the list
     */
    public void addTicket(Ticket ticket){
        tickets[count++] = ticket;
    }
    /**
     * Finds a ticket based on the given name, removes it from the list, and
     * returns it. If the ticket cannot be found, null is returned.
     * @param name Name of ticket it to return
     * @return Ticket with the provided name
     */
    public Ticket getTicket(String name){
        Iterator<Ticket> list = createIterator();
        Ticket ticket = null;
        int listPosition = -1;
        while(list.hasNext()){
            Ticket tempTicket = list.next();
            if(ticket != null)
                tickets[listPosition] = tempTicket;
            if(tempTicket.getName().toLowerCase().equals(name.toLowerCase())){
                ticket = tempTicket;
                count--;
            }
            listPosition++;
            if(listPosition == count && count < SIZE)
                tickets[listPosition] = null;
        }
        return ticket;
    }
    /**
     * Creates a new TaskListIterator with the current list of tickets
     * @return the created TaskListIterator
     */
    public TaskListIterator createIterator(){
        return new TaskListIterator(tickets);
    }
    /**
     * Returns a String representation of this list with its name and tickets
     * @return String in the format:
     * <name>:
     * - <ticket>
     * - <ticket>
     * ...
     */
    public String toString(){
        TaskListIterator list = createIterator();
        String string = name + ":";
        while(list.hasNext()){
            string +=  "\n" + list.next().toString();
        }
        return string;
    }
}