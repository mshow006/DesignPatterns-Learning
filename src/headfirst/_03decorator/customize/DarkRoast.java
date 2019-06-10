package headfirst._03decorator.customize;

/**
 * Dark Roast : 深度烘焙
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
