package headfirst._03decorator.customize;

/**
 * House Blend CoffeeWithHook : 一种咖啡名
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend CoffeeWithHook";
    }

    @Override
    public double cost() {
        return .89;
    }
}
