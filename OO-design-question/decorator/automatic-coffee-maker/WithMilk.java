public class WithMilk extends CoffeeDecorator {

    public WithMilk(SimpleCoffee simpleCoffee) {
        super(simpleCoffee);
        this.price = 0.5f;
        this.ingredient = "Adds Milk";
    }

    @Override
    public float getCost() {
        return simpleCoffee.getCost() + this.price;
    }

    @Override
    public String getIngredient() {
        return simpleCoffee.getIngredient() + ", " + this.ingredient;
    }

    
}
