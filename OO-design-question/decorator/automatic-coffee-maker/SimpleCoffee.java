public class SimpleCoffee implements Coffee {

    private float price;
    private String ingredient;

    public SimpleCoffee() {
        this.price = 2f;
        this.ingredient = "Plain Coffee";
    }

    public float getPrice() {
        return this.price;
    }

    @Override
    public float getCost() {
        return getPrice();
    }

    @Override
    public String getIngredient() {
        return this.ingredient;
    }
}
