package strategy.duck;

import strategy.fly.NoFlyBehavior;

public class ToyDuck extends Duck {

    public ToyDuck() {
        this.flyBehavior = new NoFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("This is a toy duck!");
    }
    
}
