package headfirst._04factory_factorymethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yingming006
 * Date: 2019/6/10
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        List<Integer> list = new ArrayList<>();
        ((ArrayList) list).trimToSize();
        ((ArrayList) list).trimToSize();
    }
}
