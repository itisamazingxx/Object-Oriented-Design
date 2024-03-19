package decorator.topping;

import decorator.Drink;

public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDescription("Adding Milk");
        setPrice(0.75f);
    }
    
}
