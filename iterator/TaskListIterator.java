package iterator;

import java.util.Iterator;

/**
 * Iterator for TaskList
 * @author Isaac Morris
 */
public class TaskListIterator implements Iterator<Ticket>{
    private Ticket[] tickets;
    private int position;
    /**
     * Creates a new TaskListIterator with the given list of Tickets
     * @param tickets List to iterate
     */
    public TaskListIterator(Ticket[] tickets){
        this.tickets = tickets;
        position = 0;
    }
    /**
     * Returns true if the list has more elements
     * @return true if the list has more elements
     */
    public boolean hasNext(){
        return position < tickets.length && tickets[position] != null;
    }
    public Ticket next(){
        if(!hasNext())
            return null;
        return tickets[position++];
    }
}
