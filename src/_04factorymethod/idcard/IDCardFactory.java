package _04factorymethod.idcard;

import _04factorymethod.frameword.Factory;
import _04factorymethod.frameword.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
