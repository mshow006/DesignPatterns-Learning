package graphic._04factorymethod.idcard;

import graphic._04factorymethod.frameword.Product;

/**
 * @author Liu Yingming on 2019/6/3
 */
public class IDCard extends Product {
    private String owner;
    private int serial;

    // 必须通过 IDCardFactory 来创建 IDCard 实例
    IDCard(String owner) {
        System.out.println("制作 " + owner + "(" + serial + ")" + " 的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + "(" + serial + ")" + " 的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
