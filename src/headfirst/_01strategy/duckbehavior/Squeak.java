package headfirst._01strategy.duckbehavior;

/**
 * 鸭子叫声实现类
 * 吱吱叫
 *
 * @author yingming006
 * Date: 2019/6/6
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
