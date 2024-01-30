package decorator;

public class Warrior extends Player {
    private static String fileName = "./decorator/txt/warrior.txt";

    public Warrior(String name){
        super(FileReader.getLines(fileName), name);
    }
}
