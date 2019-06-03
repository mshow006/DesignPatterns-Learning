package _06prototype.framework;

/**
 * 复制功能
 *
 * @author Liu Yingming on 2019/6/3
 */
public interface Product extends Cloneable {
    void use(String s);

    // 复制实例
    Product createClone();
}
