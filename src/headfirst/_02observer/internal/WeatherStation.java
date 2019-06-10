package headfirst._02observer.internal;

/**
 * 测试类
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 实时状态
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        // 统计信息
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        // java.util.Observable 实现了自己的 notifyObservers()，通知观察者不同
        weatherData.setMeasurements(23, 65, 30.3f);
        weatherData.setMeasurements(19, 80, 29.0f);
        weatherData.setMeasurements(22, 70, 29.3f);
    }
}
