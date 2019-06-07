package headfirst._01strategy.duckbehavior;

/**
 * 测试类
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        // 调用 MallardDuck 继承来的 performQuack()
        // 委托给该对象的 QuackBehavior 对象处理
        // 也就是调用继承来的quackBehavior引用对象的quack()
        mallard.performQuack();
        mallard.performFly();

        // 模型鸭一开始不会飞，添加行为为会飞了
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
