package headfirst._03decorator.customize;

/**
 * Espresso : 浓咖啡
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class Espresso extends Beverage {
    public Espresso() {
        // 继承自 Beverage
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
