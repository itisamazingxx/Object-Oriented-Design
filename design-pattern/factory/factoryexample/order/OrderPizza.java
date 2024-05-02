package factory.factoryexample.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.factoryexample.pizza.Pizza;

public abstract class OrderPizza {

    public OrderPizza() {
        do {
            String orderType = getType();
            Pizza pizza = new Pizza();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    public abstract Pizza createPizza(String orderType);

    /**
     * Get user input
     * @return required pizza type as a String
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Pizza Type: ");
            String str = strin.readLine(); // Read user inputs
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
