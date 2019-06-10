package headfirst._02observer.customize;

/**
 * 观察者模式 - 主题
 *
 * @author yingming006
 * Date: 2019/6/7
 */
public interface Subject {
    // 注册，删除观察者
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    // 当主题状态改变，通知所有观察者
    void notifyObserver();
}
