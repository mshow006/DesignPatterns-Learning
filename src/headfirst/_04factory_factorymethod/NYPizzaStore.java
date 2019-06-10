package headfirst._04factory_factorymethod;

/**
 * @author yingming006
 * Date: 2019/6/10
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            default:
                return null;
        }
    }
}
