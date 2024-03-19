package decorator.coffee;

import decorator.Drink;

public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
    
}
