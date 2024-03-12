package factory.simplefactory.order;
import factory.simplefactory.pizza.Pizza;
import factory.simplefactory.pizza.GreekPizza;
import factory.simplefactory.pizza.CheesePizza;

public class SimpleFactory {
    // When creating new type, increase order type
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        System.out.println("Simple Factory Pattern");

        if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("Greek Pizza");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("Cheese Pizza");
        }
        return pizza;
    }
}