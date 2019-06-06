package headfirst_design_pattern.demo01.duckbehavior;

/**
 * 鸭子叫声实现类
 * 嘎嘎叫
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
