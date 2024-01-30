package decorator;

public class Armor extends PlayerDecorator {
    private static String fileName = "./decorator/txt/armor.txt";
    public Armor(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
