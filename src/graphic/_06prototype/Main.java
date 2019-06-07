package graphic._06prototype;

import graphic._06prototype.framework.Manager;
import graphic._06prototype.framework.Product;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        Product product1 = manager.create("strong message");
        product1.use("Hello, world");
        Product product2 = manager.create("warning box");
        product2.use("Hello, world");
        Product product3 = manager.create("slash box");
        product3.use("Hello, world");

    }
}
