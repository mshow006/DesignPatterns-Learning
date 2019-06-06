package headfirst_design_pattern.demo01.duckbehavior;

/**
 * 鸭子飞实现类
 * 不会飞
 * @author yingming006
 * Date: 2019/6/6
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
