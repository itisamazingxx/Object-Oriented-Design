package strategy.duck;

import strategy.fly.FlyBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public abstract void display();

    public void fly() {
        if (this.flyBehavior != null) {
            this.flyBehavior.fly();
        }
    }
    
}
