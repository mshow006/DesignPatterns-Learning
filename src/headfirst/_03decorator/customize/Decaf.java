package headfirst._03decorator.customize;

/**
 * Decaf : 低咖啡因
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
