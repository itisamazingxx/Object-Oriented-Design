package strategy.duck;

import strategy.fly.BadFlyBehavior;

public class PekingDuck extends Duck {

    public PekingDuck() {
        this.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("This is a Peking Duck");
    }
    
}
