package headfirst._03decorator.customize;

/**
 * Mocha : 摩卡
 * 装饰者
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
