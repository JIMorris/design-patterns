package decorator;

public class Sword extends PlayerDecorator {
    private static String fileName = "./decorator/txt/sword.txt";
    public Sword(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
