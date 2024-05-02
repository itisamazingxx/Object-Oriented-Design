public class Client {

    public static void main(String[] args) {
        SimpleCoffee simpleCoffee = new SimpleCoffee();
        System.out.println("Current base price:" + simpleCoffee.getCost());
        WithMilk withMilk = new WithMilk(simpleCoffee);
        System.out.println("After adding... current price: " + withMilk.getCost());
    }
    
}
