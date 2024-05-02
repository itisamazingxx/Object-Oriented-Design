import factory.simplefactory.pizza.Pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("Beijing cheese pizza");
        System.out.println("preparing for Beijing cheese pizza");
    }
}
