package decorator;

public abstract class Drink {

    public String description;
    private float price = 0.0f;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract float cost();
}
