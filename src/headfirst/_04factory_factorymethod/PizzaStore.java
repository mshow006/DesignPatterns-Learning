package headfirst._04factory_factorymethod;

/**
 * @author yingming006
 * Date: 2019/6/10
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 工厂方法
    protected abstract Pizza createPizza(String type);
}
