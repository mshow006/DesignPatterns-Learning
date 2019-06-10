package headfirst._03decorator.customize;

/**
 * Beverage: 饮料
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    // 计算价格
    public abstract double cost();
}
