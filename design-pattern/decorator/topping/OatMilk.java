package decorator.topping;

import decorator.Drink;

public class OatMilk extends Decorator {

    public OatMilk(Drink drink) {
        super(drink);
        setDescription("Oat Milk");
        setPrice(1f);
    }
    
}
