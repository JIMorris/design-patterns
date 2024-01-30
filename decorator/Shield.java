package decorator;

public class Shield extends PlayerDecorator {
    private static String fileName = "./decorator/txt/shield.txt";
    public Shield(Player player){
        super(player);
        this.integrateDecor(FileReader.getLines(fileName));
    }
}
