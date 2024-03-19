package strategy.duck;

import strategy.fly.GoodFlyBehavior;

public class WildDuck extends Duck {

    public WildDuck() {
        this.flyBehavior = new GoodFlyBehavior();
        
    }

    @Override
    public void display() {
        System.out.println("Awesome! This is a wild duck!");
    }
    
}
