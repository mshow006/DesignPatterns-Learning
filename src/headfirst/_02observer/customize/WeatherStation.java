package headfirst._02observer.customize;

/**
 * 测试类
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(24, 65, 30.3f);
        weatherData.setMeasurements(19, 80, 29.0f);
        currentDisplay.remove();
        weatherData.setMeasurements(22, 70, 29.3f);
    }
}
