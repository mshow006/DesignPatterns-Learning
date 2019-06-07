package headfirst._01strategy.duckbehavior;

/**
 * 野鸭类
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
