package iterator;

import java.util.Iterator;

public class TaskList {
    private final static int SIZE = 100;
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name){
        this.name = name;
        tickets = new Ticket[SIZE];
        count = 0;
    }

    public void addTicket(String name, String teamMember, int difficulty){
        tickets[count++] = new Ticket(name, teamMember, difficulty);
    }
    public void addTicket(Ticket ticket){
        tickets[count++] = ticket;
    }
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
    public TaskListIterator createIterator(){
        return new TaskListIterator(tickets);
    }
    public String toString(){
        TaskListIterator list = createIterator();
        String string = name + ":";
        while(list.hasNext()){
            string +=  "\n" + list.next().toString();
        }
        return string;
    }
}