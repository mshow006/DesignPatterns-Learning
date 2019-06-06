package graphic_design_pattern._04factorymethod;

import graphic_design_pattern._04factorymethod.frameword.Factory;
import graphic_design_pattern._04factorymethod.frameword.Product;
import graphic_design_pattern._04factorymethod.idcard.IDCardFactory;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Tom");
        Product card2 = factory.create("Jack");
        Product card3 = factory.create("Faker");
        card1.use();
        card2.use();
        card3.use();
    }
}
