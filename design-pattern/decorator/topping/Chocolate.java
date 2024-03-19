package decorator.topping;

import decorator.Drink;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDescription("Adding Chocolate");
        setPrice(1.25f);
    }
    
}