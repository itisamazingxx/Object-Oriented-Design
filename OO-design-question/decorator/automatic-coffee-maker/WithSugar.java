public class WithSugar extends CoffeeDecorator {

    public WithSugar(SimpleCoffee simpleCoffee) {
        super(simpleCoffee);
        this.price = 0.5f;
        this.ingredient = "Adds Sugar";
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