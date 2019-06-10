package headfirst._02observer.internal;

import headfirst._02observer.customize.DisplayElement;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author yingming006
 * Date: 2019/6/7
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float averageTemp;
    private float minTemp;
    private float maxTemp;
    private ArrayList temperatures;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        temperatures = new ArrayList();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min : %.1f/%.1f/%.1f\n", averageTemp, maxTemp, minTemp);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperatures.add(weatherData.getTemperature());
            float sum = 0f;
            minTemp = (float) temperatures.get(0);
            maxTemp = (float) temperatures.get(0);
            for (Object temperature : temperatures) {
                float temp = (float) temperature;
                sum += temp;
                minTemp = Math.min(temp, minTemp);
                maxTemp = Math.max(temp, maxTemp);
            }
            averageTemp = sum / temperatures.size();
            display();
        }
    }
}
