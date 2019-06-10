package headfirst._03decorator.customize;

/**
 * House Blend Coffee : 一种咖啡名
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
