package headfirst._02observer.internal;

import java.util.Observable;

/**
 * java.util 中内置的 Observable
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        // 状态改变
        setChanged();
        // 通知观察者
        notifyObservers();
    }

    // 改变状态
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 观察者利用 get 方法获取当前对象状态

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
