package headfirst._02observer.internal;

import headfirst._02observer.customize.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yingming006
 * Date: 2019/6/7
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.29f;
    private float lastPressure;

    public ForecastDisplay(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void display() {

    }

    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
