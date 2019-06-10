package headfirst._02observer.customize;

import java.util.ArrayList;

/**
 * @author yingming006
 * Date: 2019/6/7
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float averageTemp;
    private float minTemp;
    private float maxTemp;
    private ArrayList temperatures;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        temperatures = new ArrayList();
    }

    @Override
    public void display() {
        System.out.printf("Avg/Max/Min : %.1f/%.1f/%.1f\n", averageTemp, maxTemp, minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        temperatures.add(temp);
        float sum = 0f;
        minTemp = (float) temperatures.get(0);
        maxTemp = (float) temperatures.get(0);
        for (Object temperature : temperatures) {
            float temp0 = (float) temperature;
            sum += temp0;
            minTemp = minTemp > temp0 ? temp0 : minTemp;
            maxTemp = maxTemp < temp0 ? temp0 : maxTemp;
        }
        averageTemp = sum / temperatures.size();
        display();
    }
}
