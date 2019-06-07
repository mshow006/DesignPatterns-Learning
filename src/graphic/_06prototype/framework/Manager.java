package graphic._06prototype.framework;

import java.util.HashMap;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
