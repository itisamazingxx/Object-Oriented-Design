package observer;
import java.util.ArrayList;

/**
 * This class represents 天气预报feature的核心类
 * 管理所有observers
 * 当数据有更新时，通知所有的接入方
 */
public class WeatherData implements Subject{

    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    // Constructor
    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void dataChange() {
        notifyObserver();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    /**
     * Resgister a observer
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Removes a observer
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * iterate all observers and notifies each one of them
     */
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(this.temperature, this.pressure, this.humidity);
        }
    }
}
