package headfirst._03decorator.customize;

/**
 * Whip : 奶泡
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
