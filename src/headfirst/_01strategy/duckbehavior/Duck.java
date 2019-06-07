package headfirst._01strategy.duckbehavior;

/**
 * 策略模式（Strategy Pattern）
 * 策略模式定义了算法族（行为实现类），分别封装起来，让他们之间可以互相替换
 * 此模式让算法的变化独立于使用算法的客户。
 * <p>
 * Duck 抽象类
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public abstract class Duck {
    // 整合 Duck 行为
    // 两个接口类型的实例变量
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    // 委托给行为类
    // 委托给 flyBehavior 引用的对象
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    // 动态的添加行为
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        // 所有鸭子都可以浮在水上，甚至是诱饵鸭（木头制作）
        System.out.println("All ducks float, even decoys.");
    }
}
