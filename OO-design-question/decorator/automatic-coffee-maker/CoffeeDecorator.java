public abstract class CoffeeDecorator implements Coffee {

    protected SimpleCoffee simpleCoffee;
    protected float price;
    protected String ingredient;

    public CoffeeDecorator(SimpleCoffee simpleCoffee) {
        this.simpleCoffee = simpleCoffee;
    }

    @Override
    public abstract float getCost();
    @Override
    public abstract String getIngredient();
    
}
