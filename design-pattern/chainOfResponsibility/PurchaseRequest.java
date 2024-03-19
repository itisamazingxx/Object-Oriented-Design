public class PurchaseRequest {

    private int type = 0; // Request Type
    private float price = 0.0f; // Request Price
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return this.type;
    }

    public float getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }
    
}
