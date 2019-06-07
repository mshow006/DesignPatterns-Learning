package headfirst._01strategy.duckbehavior;

/**
 * @author yingming006
 * Date: 2019/6/6
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with rocket");
    }
}
