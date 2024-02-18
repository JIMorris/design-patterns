package iterator;

public class Ticket {
    private String name;
    private String teamMember;
    private int difficutly;

    public Ticket(String name, String teamMember, int diffcutly){
        this.name = name;
        this.teamMember = teamMember;
        this.difficutly = diffcutly;
    }

    public String getName(){
        return this.name;
    }
    public String toString(){
        return "- " + name + "(" + difficutly + ") - " + teamMember;
    }
}
