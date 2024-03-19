package decorator;

import decorator.coffee.Americano;
import decorator.topping.Milk;

public class CoffeeBar {
    public static void main(String[] args) {
        // Order Americano
        Drink order = new Americano();
        System.out.println("Current base beverage price: " + order.cost());

        // Adding Milk into Americano
        order = new Milk(order); // 让Milk装饰原本的订单
        System.out.println("After Topping adding: " + order.cost());
        System.err.println(order.getDescription());
    }
}
