package headfirst_design_pattern.demo01.duckbehavior;

/**
 * 鸭子飞实现类
 * 会飞
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Flying");
    }
}
