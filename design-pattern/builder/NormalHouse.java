package builder;

public class NormalHouse extends AbstractHouse{

    @Override
    public void buildBasic() {
        System.out.println("Normal House building basic...");
    }

    @Override
    public void buildWall() {
        System.out.println("Normal House building walls...");
    }

    @Override
    public void roofed() {
        System.out.println("Normal House building roof...");
    }
    
}
