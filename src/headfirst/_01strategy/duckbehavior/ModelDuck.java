package headfirst._01strategy.duckbehavior;

/**
 * @author yingming006
 * Date: 2019/6/6
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        // 模型鸭不会飞
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("model duck");
    }
}
