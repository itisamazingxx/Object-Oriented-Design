package observer;

public class Client {
    public static void main(String[] args) {
        // Creates 气象站
        WeatherData weatherData = new WeatherData();
        Condition condition = new Condition();
        
        // register observer
        weatherData.registerObserver(condition);

        System.out.println("Notify all observer newly information");
        weatherData.setData(30f, 75.6f, 87.2f);
    }
}
