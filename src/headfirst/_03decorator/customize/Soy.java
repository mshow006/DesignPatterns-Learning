package headfirst._03decorator.customize;

/**
 * Soy : 豆浆
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
