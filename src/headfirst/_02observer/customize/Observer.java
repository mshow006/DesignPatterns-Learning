package headfirst._02observer.customize;

/**
 * 观察者模式 - 观察者
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public interface Observer {
    // 温度，湿度，气压
    // 当状态改变时，主题会把这些状态值当作方法的参数，传递给观察者
    void update(float temp, float humidity, float pressure);
}
