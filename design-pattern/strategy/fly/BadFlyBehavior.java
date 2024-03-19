package strategy.fly;

public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Bad at flying! Sad!");
    }
    
}
