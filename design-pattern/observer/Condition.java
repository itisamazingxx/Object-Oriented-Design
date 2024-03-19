package observer;

public class Condition implements Observer{

    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Current temperature: " + this.temperature);
        System.out.println("Current pressure: " + this.pressure);
        System.out.println("Current humidity: " + this.humidity);
    }
}

