package strategy.fly;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Expert at flying! Awesome!");
    }

}
