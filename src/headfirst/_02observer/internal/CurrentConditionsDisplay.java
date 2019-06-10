package headfirst._02observer.internal;


import headfirst._02observer.customize.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * 显示面板
 * 是一个观察者
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    // private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        // this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature
                + "℃ and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
