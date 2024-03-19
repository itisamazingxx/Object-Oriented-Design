package strategy.fly;

public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Cannot Fly!");;
    }
    
}
