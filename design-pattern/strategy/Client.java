package strategy;

import strategy.duck.PekingDuck;
import strategy.duck.ToyDuck;
import strategy.duck.WildDuck;

public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.fly();
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.fly();
    }
    
}
