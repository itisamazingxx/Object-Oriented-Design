import factory.simplefactory.pizza.Pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("London pepper pizza");
        System.out.println("preparing for London pepper pizza");
    }
}
