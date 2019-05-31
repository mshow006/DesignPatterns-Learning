package cn.yingming006.iterator;

/**
 * 用于遍历集合中的元素
 * 作用相当于循环语句中的循环变量
 *
 * @author Liu Yingming on 2019/5/31
 */
public interface Iterator {
    boolean hasNext();

    Object next();
}
