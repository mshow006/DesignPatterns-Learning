package headfirst._02observer.customize;

import java.util.ArrayList;

/**
 * @author yingming006
 * Date: 2019/6/7
 */
public class WeatherData implements Subject {

    // 通过 ArrayList 记录观察者
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当状态改变，通知观察者
    public void measurementsChanged() {
        notifyObserver();
    }

    // 改变状态
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // WeatherDate 的其他方法
}
