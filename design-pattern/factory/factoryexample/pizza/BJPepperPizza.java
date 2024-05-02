import factory.simplefactory.pizza.Pizza;

public class BJPepperPizza extends Pizza {
    
    @Override
    public void prepare() {
        super.setName("London pepper pizza");
        System.out.println("preparing for Beijing pepper pizza");
    }
    
}
