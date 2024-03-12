package factory.simplefactory.order;
import factory.simplefactory.pizza.Pizza;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OrderPizza {
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // Constructor
    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = ""; // User input
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("Order Failed!");
                break;
            }
        } while (true);
    }

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

