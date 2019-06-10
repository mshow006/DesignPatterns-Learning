package headfirst._02observer.customize;

/**
 * 显示当前状态的面板
 * 是一个观察者
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData; // 注册，删除

    // 构造器,注册
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : " + temperature
                + "℃ and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        // 更新，显示状态
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void remove() {
        weatherData.removeObserver(this);
    }

}
