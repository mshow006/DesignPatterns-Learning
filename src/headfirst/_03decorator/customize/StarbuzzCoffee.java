package headfirst._03decorator.customize;

/**
 * 测试
 *
 * @author yingming006
 * Date: 2019/6/10
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        // 订购一杯 Espresso
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        // 订购一杯 两份 Mocha + Whip 的 DarkRoast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2); // 用 Mocha 装饰
        beverage2 = new Mocha(beverage2); // 用第二个 Mocha 装饰
        beverage2 = new Whip(beverage2); // 用 Whip 装饰
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        // 订购一杯 Soy + Mocha + Whip 的 HouseBlend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
    }
}
