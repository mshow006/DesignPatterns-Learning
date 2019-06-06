package headfirst_design_pattern.demo01.duckbehavior;

/**
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

    public void swim() {
        // 所有鸭子都可以浮在水上，甚至是诱饵鸭（木头制作）
        System.out.println("All ducks float, even decoys.");
    }
}
