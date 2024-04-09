import domain.House;

public class HouseService {

    private House[] houses;

    public HouseService(int size) {
        this.houses = new House[size];
        this.houses[0] = new House(1, "Green Cottage", "555-1234", "123 Green Lane", 1200, "Available");
    }

    public House[] list() {
        return this.houses;
    }
}