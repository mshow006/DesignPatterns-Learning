package headfirst._07adapter;

/**
 * @author yingming006
 * Date: 2019/6/11
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
